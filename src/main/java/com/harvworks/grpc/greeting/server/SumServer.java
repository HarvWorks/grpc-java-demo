package com.harvworks.grpc.greeting.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class SumServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hello I am the grpc server");

        Server server = ServerBuilder.forPort(50054)
                .addService(new SumServiceImpl())
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
