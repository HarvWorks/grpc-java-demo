package com.harvworks.grpc.greeting.client;

import com.proto.factor.FactorRequest;
import com.proto.factor.FactorServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class FactorClient {
    public static void main(String[] args) {
        System.out.println("This is a the factor client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50057)
                .usePlaintext()
                .build();

        System.out.println("Creating Stub");

        // Create sync FactorClient
        FactorServiceGrpc.FactorServiceBlockingStub factorSyncClient= FactorServiceGrpc.newBlockingStub(channel);

        FactorRequest request = FactorRequest.newBuilder()
                .setNumber(210)
                .build();

        factorSyncClient.factor(request)
                .forEachRemaining(factorResponse -> {
                    System.out.println(factorResponse.getResult());
                });

//        // Create async FactorClient
//        FactorServiceGrpc.FactorServiceFutureStub factorAsyncClient = FactorServiceGrpc.newFutureStub(channel);
//
//        FactorRequest request = FactorRequest.newBuilder()
//                .setNumber(210)
//                .build();
//
//        factorAsyncClient.
    }
}
