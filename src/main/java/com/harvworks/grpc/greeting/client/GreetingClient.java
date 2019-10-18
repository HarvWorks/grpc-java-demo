package com.harvworks.grpc.greeting.client;

import com.proto.dummy.DummyServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GreetingClient {
    public static void main(String[] args) {
        System.out.println("Hello I am grpc client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .build();

        System.out.println("Creating Stub");
        DummyServiceGrpc.DummyServiceBlockingStub syncClient  = DummyServiceGrpc.newBlockingStub(channel);

        // async client
        // DummyServiceGrpc.DummyServiceFutureStub asyncClient = DummyServiceGrpc.newFutureStub(channel);

        // do something here

        channel.shutdown();
    }
}
