package com.harvworks.grpc.greeting.server;

import com.proto.sum.PrimeDecompositionRequest;
import com.proto.sum.PrimeDecompositionResponse;
import com.proto.sum.SumServiceGrpc;
import io.grpc.stub.StreamObserver;

public class FactorServiceImpl extends SumServiceGrpc.SumServiceImplBase {
    @Override
    public void primeDecomposition(PrimeDecompositionRequest request, StreamObserver<PrimeDecompositionResponse> responseObserver) {

    }

}
