package com.harvworks.grpc.greeting.client;

import com.proto.greet.GreetRequest;
import com.proto.greet.GreetResponse;
import com.proto.greet.GreetServiceGrpc;
import com.proto.greet.Greeting;
import com.proto.sum.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SumClient {
    public static void main(String[] args) {
        System.out.println("Hello I am grpc client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50054)
                .usePlaintext()
                .build();

        System.out.println("Sum Stub");

        // Created sum client service (Sync)
        SumServiceGrpc.SumServiceBlockingStub sumServiceClient = SumServiceGrpc.newBlockingStub(channel);

        // Uniary
//        // Created a protocol buffer for summing
//        SumValue sumValue = SumValue.newBuilder()
//                .setFirstValue(10)
//                .setSecondValue(5)
//                .build();
//
//        // Do the same for sumResponse
//        SumRequest sumRequest = SumRequest.newBuilder()
//                .setSumValue(sumValue)
//                .build();
//
//        // call the RPC and get a greetResponse
//        SumResponse sumResponse =  sumServiceClient.sum(sumRequest);
//
//        System.out.println(sumResponse.getResult());

        // Streaming

        Integer number = 567890;

        sumServiceClient.primeDecomposition(PrimeDecompositionRequest.newBuilder()
                .setNumber(number).build())
                .forEachRemaining(primeDecompositionResponse -> {
                    System.out.println(primeDecompositionResponse);
                });
        System.out.println("Shutting down channel");
        channel.shutdown();
    }
}
