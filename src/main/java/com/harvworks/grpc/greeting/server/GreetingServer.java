package com.harvworks.grpc.greeting.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GreetingServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hello I am the grpc server");

        Server server = ServerBuilder.forPort(50051)
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Received system shutdown");
            server.shutdown();
            System.out.println("Successfully shut down");
        }));

        server.awaitTermination();
    }
}
