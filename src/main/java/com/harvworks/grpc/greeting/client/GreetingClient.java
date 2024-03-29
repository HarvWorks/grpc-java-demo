package com.harvworks.grpc.greeting.client;

import com.proto.dummy.DummyServiceGrpc;
import com.proto.greet.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GreetingClient {
    public static void main(String[] args) {
        System.out.println("Hello I am grpc client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        System.out.println("Creating Stub");

        // Old Dummy
        // DummyServiceGrpc.DummyServiceBlockingStub syncClient  = DummyServiceGrpc.newBlockingStub(channel);
        // async client
        // DummyServiceGrpc.DummyServiceFutureStub asyncClient = DummyServiceGrpc.newFutureStub(channel);


        // Created greet client service (Sync)
        GreetServiceGrpc.GreetServiceBlockingStub greetSyncClient = GreetServiceGrpc.newBlockingStub(channel);

        // Uniary
//        // Created a protocol buffer greeting message
//        Greeting greeting = Greeting.newBuilder()
//                .setFirstName("Hi")
//                .setLastName("Bellow")
//                .build();
//
//        // Do the same for greetResponse
//        GreetRequest greetRequest = GreetRequest.newBuilder()
//                .setGreeting(greeting)
//                .build();
//
//        // call the RPC and get a greetResponse
//        GreetResponse greetResponse =  greetSyncClient.greet(greetRequest);
//
//        System.out.println(greetResponse.getResult());

        // Serving Streaming
        GreetManyTimesRequest request = GreetManyTimesRequest.newBuilder()
                .setGreeting(Greeting.newBuilder().setFirstName("Harvey"))
                .build();

        // Stream Response in blocking manner
        greetSyncClient.greetManyTimes(request)
                .forEachRemaining(greetManyTimesResponse -> {
                    System.out.println(greetManyTimesResponse.getResult());
                });


        System.out.println("Shutting down channel");
        channel.shutdown();
    }
}
