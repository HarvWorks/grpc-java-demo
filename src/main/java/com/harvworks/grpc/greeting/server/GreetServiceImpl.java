package com.harvworks.grpc.greeting.server;

import com.proto.greet.*;
import io.grpc.stub.StreamObserver;

public class GreetServiceImpl extends GreetServiceGrpc.GreetServiceImplBase {

    @Override
    public void greet(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {
        // Extract the code
        Greeting greeting = request.getGreeting();
        String firstName = greeting.getFirstName();

        String result = "Hello " + firstName;

        // Created Response
        GreetResponse response = GreetResponse.newBuilder()
                .setResult(result)
                .build();

        // Send response
        responseObserver.onNext(response);

        // Complete the RPC call
        responseObserver.onCompleted();
    }
}
