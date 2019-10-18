package com.harvworks.grpc.greeting.client;

import com.proto.dummy.DummyServiceGrpc;
import com.proto.greet.GreetRequest;
import com.proto.greet.GreetResponse;
import com.proto.greet.GreetServiceGrpc;
import com.proto.greet.Greeting;
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

        // Created a protocol buffer greeting message
        Greeting greeting = Greeting.newBuilder()
                .setFirstName("Hi")
                .setLastName("Bellow")
                .build();

        // Do the same for greetResponse
        GreetRequest greetRequest = GreetRequest.newBuilder()
                .setGreeting(greeting)
                .build();

        // call the RPC and get a greetResponse
        GreetResponse greetResponse =  greetSyncClient.greet(greetRequest);

        System.out.println(greetResponse.getResult());

        System.out.println("Shutting down channel");
        channel.shutdown();
    }
}
