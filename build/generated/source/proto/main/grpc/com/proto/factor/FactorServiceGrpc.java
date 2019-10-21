package com.proto.factor;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: factor/factor.proto")
public final class FactorServiceGrpc {

  private FactorServiceGrpc() {}

  public static final String SERVICE_NAME = "factor.FactorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.factor.FactorRequest,
      com.proto.factor.FactorResponse> getFactorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Factor",
      requestType = com.proto.factor.FactorRequest.class,
      responseType = com.proto.factor.FactorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.factor.FactorRequest,
      com.proto.factor.FactorResponse> getFactorMethod() {
    io.grpc.MethodDescriptor<com.proto.factor.FactorRequest, com.proto.factor.FactorResponse> getFactorMethod;
    if ((getFactorMethod = FactorServiceGrpc.getFactorMethod) == null) {
      synchronized (FactorServiceGrpc.class) {
        if ((getFactorMethod = FactorServiceGrpc.getFactorMethod) == null) {
          FactorServiceGrpc.getFactorMethod = getFactorMethod =
              io.grpc.MethodDescriptor.<com.proto.factor.FactorRequest, com.proto.factor.FactorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Factor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.factor.FactorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.factor.FactorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FactorServiceMethodDescriptorSupplier("Factor"))
              .build();
        }
      }
    }
    return getFactorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FactorServiceStub newStub(io.grpc.Channel channel) {
    return new FactorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FactorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FactorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FactorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FactorServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class FactorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void factor(com.proto.factor.FactorRequest request,
        io.grpc.stub.StreamObserver<com.proto.factor.FactorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFactorMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFactorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.factor.FactorRequest,
                com.proto.factor.FactorResponse>(
                  this, METHODID_FACTOR)))
          .build();
    }
  }

  /**
   */
  public static final class FactorServiceStub extends io.grpc.stub.AbstractStub<FactorServiceStub> {
    private FactorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FactorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FactorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FactorServiceStub(channel, callOptions);
    }

    /**
     */
    public void factor(com.proto.factor.FactorRequest request,
        io.grpc.stub.StreamObserver<com.proto.factor.FactorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFactorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FactorServiceBlockingStub extends io.grpc.stub.AbstractStub<FactorServiceBlockingStub> {
    private FactorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FactorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FactorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FactorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.factor.FactorResponse factor(com.proto.factor.FactorRequest request) {
      return blockingUnaryCall(
          getChannel(), getFactorMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FactorServiceFutureStub extends io.grpc.stub.AbstractStub<FactorServiceFutureStub> {
    private FactorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FactorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FactorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FactorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.factor.FactorResponse> factor(
        com.proto.factor.FactorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFactorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FACTOR = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FactorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FactorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FACTOR:
          serviceImpl.factor((com.proto.factor.FactorRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.factor.FactorResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FactorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FactorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.factor.Factor.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FactorService");
    }
  }

  private static final class FactorServiceFileDescriptorSupplier
      extends FactorServiceBaseDescriptorSupplier {
    FactorServiceFileDescriptorSupplier() {}
  }

  private static final class FactorServiceMethodDescriptorSupplier
      extends FactorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FactorServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FactorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FactorServiceFileDescriptorSupplier())
              .addMethod(getFactorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
