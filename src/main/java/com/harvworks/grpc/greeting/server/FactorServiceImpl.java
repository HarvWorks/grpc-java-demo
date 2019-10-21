package com.harvworks.grpc.greeting.server;

import com.proto.factor.FactorRequest;
import com.proto.factor.FactorResponse;
import com.proto.factor.FactorServiceGrpc;
import io.grpc.stub.StreamObserver;

public class FactorServiceImpl extends FactorServiceGrpc.FactorServiceImplBase {
    @Override
    public void factor(FactorRequest request, StreamObserver<FactorResponse> responseObserver) {
        int number = request.getNumber();

        try {
            int factor = 2;
            while (number > 1) {
                if (number % factor == 0) {
                    FactorResponse response = FactorResponse.newBuilder()
                            .setResult(factor)
                            .build();
                } else {
                    factor ++;
                }
                Thread.sleep(500);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Complete the RPC call
            responseObserver.onCompleted();
        }
    }
}
