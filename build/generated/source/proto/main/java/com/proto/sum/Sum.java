// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Sum/sum.proto

package com.proto.sum;

public final class Sum {
  private Sum() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sum_SumValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sum_SumValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sum_SumRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sum_SumRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sum_SumResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sum_SumResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sum_PrimeDecompositionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sum_PrimeDecompositionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sum_PrimeDecompositionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sum_PrimeDecompositionResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rSum/sum.proto\022\003sum\"5\n\010SumValue\022\023\n\013firs" +
      "t_value\030\001 \001(\005\022\024\n\014second_value\030\002 \001(\005\".\n\nS" +
      "umRequest\022 \n\tsum_value\030\001 \001(\0132\r.sum.SumVa" +
      "lue\"\035\n\013SumResponse\022\016\n\006result\030\001 \001(\005\"+\n\031Pr" +
      "imeDecompositionRequest\022\016\n\006number\030\001 \001(\003\"" +
      "2\n\032PrimeDecompositionResponse\022\024\n\014prime_f" +
      "actor\030\001 \001(\0032\223\001\n\nSumService\022*\n\003Sum\022\017.sum." +
      "SumRequest\032\020.sum.SumResponse\"\000\022Y\n\022PrimeD" +
      "ecomposition\022\036.sum.PrimeDecompositionReq" +
      "uest\032\037.sum.PrimeDecompositionResponse\"\0000" +
      "\001B\021\n\rcom.proto.sumP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_sum_SumValue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sum_SumValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sum_SumValue_descriptor,
        new java.lang.String[] { "FirstValue", "SecondValue", });
    internal_static_sum_SumRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sum_SumRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sum_SumRequest_descriptor,
        new java.lang.String[] { "SumValue", });
    internal_static_sum_SumResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_sum_SumResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sum_SumResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_sum_PrimeDecompositionRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_sum_PrimeDecompositionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sum_PrimeDecompositionRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_sum_PrimeDecompositionResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_sum_PrimeDecompositionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sum_PrimeDecompositionResponse_descriptor,
        new java.lang.String[] { "PrimeFactor", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
