// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: factor/factor.proto

package com.proto.factor;

public final class Factor {
  private Factor() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_factor_FactorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_factor_FactorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_factor_FactorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_factor_FactorResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023factor/factor.proto\022\006factor\"\037\n\rFactorR" +
      "equest\022\016\n\006number\030\001 \001(\005\" \n\016FactorResponse" +
      "\022\016\n\006result\030\001 \001(\0052L\n\rFactorService\022;\n\006Fac" +
      "tor\022\025.factor.FactorRequest\032\026.factor.Fact" +
      "orResponse\"\0000\001B\024\n\020com.proto.factorP\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_factor_FactorRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_factor_FactorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_factor_FactorRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_factor_FactorResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_factor_FactorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_factor_FactorResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
