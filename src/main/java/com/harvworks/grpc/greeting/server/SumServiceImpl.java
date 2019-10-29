package com.harvworks.grpc.greeting.server;

import com.proto.sum.*;
import io.grpc.stub.StreamObserver;

public class SumServiceImpl extends SumServiceGrpc.SumServiceImplBase {
    @Override
    public void sum(SumRequest request, StreamObserver<SumResponse> responseObserver) {
        SumValue sumValue = request.getSumValue();
        int result = sumValue.getFirstValue() + sumValue.getSecondValue();

        // create response
        SumResponse response = SumResponse.newBuilder()
                .setResult(result)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void primeDecomposition(PrimeDecompositionRequest request, StreamObserver<PrimeDecompositionResponse> responseObserver) {
        long number = request.getNumber();

        try {
            long factor = 2L;
            while (number > 1) {
                if (number % factor == 0) {
                    number /= factor;
                    responseObserver.onNext(PrimeDecompositionResponse.newBuilder()
                                    .setPrimeFactor(factor)
                                    .build());
                    Thread.sleep(500);
                } else {
                    factor ++;
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Complete the RPC call
            responseObserver.onCompleted();
        }
    }
}
