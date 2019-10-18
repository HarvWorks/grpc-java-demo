package com.harvworks.grpc.greeting.client;

import com.proto.greet.GreetRequest;
import com.proto.greet.GreetResponse;
import com.proto.greet.GreetServiceGrpc;
import com.proto.greet.Greeting;
import com.proto.sum.SumRequest;
import com.proto.sum.SumServiceGrpc;
import com.proto.sum.SumValue;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SumClient {
    public static void main(String[] args) {
        System.out.println("Hello I am grpc client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        System.out.println("Sum Stub");

        // Created sum client service (Sync)
        SumServiceGrpc.SumServiceBlockingStub sumServiceClient = SumServiceGrpc.newBlockingStub(channel);

        // Created a protocol buffer greeting message
        SumValue sumValue = SumValue.newBuilder()
                .setFirstValue(10)
                .build();

        // Do the same for greetResponse
        SumRequest sumRequest = SumRequest.newBuilder()
                .se(greeting)
                .build();

        // call the RPC and get a greetResponse
        GreetResponse greetResponse =  sumServiceClient.greet(greetRequest);

        System.out.println(greetResponse.getResult());

        System.out.println("Shutting down channel");
        channel.shutdown();
    }
}