// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.akkaserverless

object AnnotationsProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    com.akkaserverless.ComponentProto,
    com.akkaserverless.EventingProto,
    com.akkaserverless.JwtProto,
    com.akkaserverless.ViewsProto,
    com.google.protobuf.descriptor.DescriptorProtoCompanion
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      com.akkaserverless.FieldOptions,
      com.akkaserverless.FileOptions,
      com.akkaserverless.MethodOptions,
      com.akkaserverless.ServiceOptions,
      com.akkaserverless.CodegenOptions
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """CiBha2thc2VydmVybGVzcy9hbm5vdGF0aW9ucy5wcm90bxIOYWtrYXNlcnZlcmxlc3MaHmFra2FzZXJ2ZXJsZXNzL2NvbXBvb
  mVudC5wcm90bxodYWtrYXNlcnZlcmxlc3MvZXZlbnRpbmcucHJvdG8aGGFra2FzZXJ2ZXJsZXNzL2p3dC5wcm90bxoaYWtrYXNlc
  nZlcmxlc3Mvdmlld3MucHJvdG8aIGdvb2dsZS9wcm90b2J1Zi9kZXNjcmlwdG9yLnByb3RvInoKDEZpZWxkT3B0aW9ucxItCgplb
  nRpdHlfa2V5GAEgASgIQg7iPwsSCWVudGl0eUtleVIJZW50aXR5S2V5EjsKA2p3dBgCIAEoCzIfLmFra2FzZXJ2ZXJsZXNzLkp3d
  EZpZWxkT3B0aW9uc0II4j8FEgNqd3RSA2p3dCK0AgoLRmlsZU9wdGlvbnMSbQoUZXZlbnRfc291cmNlZF9lbnRpdHkYASABKAsyI
  i5ha2thc2VydmVybGVzcy5FdmVudFNvdXJjZWRFbnRpdHlCF+I/FBISZXZlbnRTb3VyY2VkRW50aXR5UhJldmVudFNvdXJjZWRFb
  nRpdHkSUAoMdmFsdWVfZW50aXR5GAIgASgLMhsuYWtrYXNlcnZlcmxlc3MuVmFsdWVFbnRpdHlCEOI/DRILdmFsdWVFbnRpdHlSC
  3ZhbHVlRW50aXR5EmQKEXJlcGxpY2F0ZWRfZW50aXR5GAMgASgLMiAuYWtrYXNlcnZlcmxlc3MuUmVwbGljYXRlZEVudGl0eUIV4
  j8SEhByZXBsaWNhdGVkRW50aXR5UhByZXBsaWNhdGVkRW50aXR5IscBCg1NZXRob2RPcHRpb25zEkMKCGV2ZW50aW5nGAEgASgLM
  hguYWtrYXNlcnZlcmxlc3MuRXZlbnRpbmdCDeI/ChIIZXZlbnRpbmdSCGV2ZW50aW5nEjMKBHZpZXcYAiABKAsyFC5ha2thc2Vyd
  mVybGVzcy5WaWV3QgniPwYSBHZpZXdSBHZpZXcSPAoDand0GAMgASgLMiAuYWtrYXNlcnZlcmxlc3MuSnd0TWV0aG9kT3B0aW9uc
  0II4j8FEgNqd3RSA2p3dCLrAgoOU2VydmljZU9wdGlvbnMSSQoEdHlwZRgBIAEoDjIqLmFra2FzZXJ2ZXJsZXNzLlNlcnZpY2VPc
  HRpb25zLlNlcnZpY2VUeXBlQgniPwYSBHR5cGVSBHR5cGUSLAoJY29tcG9uZW50GAIgASgJQg7iPwsSCWNvbXBvbmVudFIJY29tc
  G9uZW50It8BCgtTZXJ2aWNlVHlwZRI7ChhTRVJWSUNFX1RZUEVfVU5TUEVDSUZJRUQQABod4j8aEhhTRVJWSUNFX1RZUEVfVU5TU
  EVDSUZJRUQSMQoTU0VSVklDRV9UWVBFX0FDVElPThABGhjiPxUSE1NFUlZJQ0VfVFlQRV9BQ1RJT04SMQoTU0VSVklDRV9UWVBFX
  0VOVElUWRACGhjiPxUSE1NFUlZJQ0VfVFlQRV9FTlRJVFkSLQoRU0VSVklDRV9UWVBFX1ZJRVcQAxoW4j8TEhFTRVJWSUNFX1RZU
  EVfVklFVyLNAwoOQ29kZWdlbk9wdGlvbnMScgoUZXZlbnRfc291cmNlZF9lbnRpdHkYASABKAsyJS5ha2thc2VydmVybGVzcy5Fd
  mVudFNvdXJjZWRFbnRpdHlEZWZCF+I/FBISZXZlbnRTb3VyY2VkRW50aXR5SABSEmV2ZW50U291cmNlZEVudGl0eRJVCgx2YWx1Z
  V9lbnRpdHkYAiABKAsyHi5ha2thc2VydmVybGVzcy5WYWx1ZUVudGl0eURlZkIQ4j8NEgt2YWx1ZUVudGl0eUgAUgt2YWx1ZUVud
  Gl0eRJpChFyZXBsaWNhdGVkX2VudGl0eRgDIAEoCzIjLmFra2FzZXJ2ZXJsZXNzLlJlcGxpY2F0ZWRFbnRpdHlEZWZCFeI/EhIQc
  mVwbGljYXRlZEVudGl0eUgAUhByZXBsaWNhdGVkRW50aXR5EkAKBmFjdGlvbhgEIAEoCzIZLmFra2FzZXJ2ZXJsZXNzLkFjdGlvb
  kRlZkIL4j8IEgZhY3Rpb25IAFIGYWN0aW9uEjgKBHZpZXcYBSABKAsyFy5ha2thc2VydmVybGVzcy5WaWV3RGVmQgniPwYSBHZpZ
  XdIAFIEdmlld0IJCgdjb2RlZ2VuOlIKBWZpZWxkEh0uZ29vZ2xlLnByb3RvYnVmLkZpZWxkT3B0aW9ucxi4CCABKAsyHC5ha2thc
  2VydmVybGVzcy5GaWVsZE9wdGlvbnNSBWZpZWxkOk4KBGZpbGUSHC5nb29nbGUucHJvdG9idWYuRmlsZU9wdGlvbnMYuAggASgLM
  hsuYWtrYXNlcnZlcmxlc3MuRmlsZU9wdGlvbnNSBGZpbGU6VgoGbWV0aG9kEh4uZ29vZ2xlLnByb3RvYnVmLk1ldGhvZE9wdGlvb
  nMYuAggASgLMh0uYWtrYXNlcnZlcmxlc3MuTWV0aG9kT3B0aW9uc1IGbWV0aG9kOloKB3NlcnZpY2USHy5nb29nbGUucHJvdG9id
  WYuU2VydmljZU9wdGlvbnMYuAggASgLMh4uYWtrYXNlcnZlcmxlc3MuU2VydmljZU9wdGlvbnNSB3NlcnZpY2U6WgoHY29kZWdlb
  hIfLmdvb2dsZS5wcm90b2J1Zi5TZXJ2aWNlT3B0aW9ucxi5CCABKAsyHi5ha2thc2VydmVybGVzcy5Db2RlZ2VuT3B0aW9uc1IHY
  29kZWdlbkJgChJjb20uYWtrYXNlcnZlcmxlc3NQAVpIZ2l0aHViLmNvbS9saWdodGJlbmQvYWtrYXNlcnZlcmxlc3MtZ28tc2RrL
  2Fra2FzZXJ2ZXJsZXNzO2Fra2FzZXJ2ZXJsZXNzYgZwcm90bzM="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, _root_.scala.Array(
      com.akkaserverless.ComponentProto.javaDescriptor,
      com.akkaserverless.EventingProto.javaDescriptor,
      com.akkaserverless.JwtProto.javaDescriptor,
      com.akkaserverless.ViewsProto.javaDescriptor,
      com.google.protobuf.descriptor.DescriptorProtoCompanion.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
  val field: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.FieldOptions, _root_.scala.Option[com.akkaserverless.FieldOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1080, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(com.akkaserverless.FieldOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val file: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.FileOptions, _root_.scala.Option[com.akkaserverless.FileOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1080, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(com.akkaserverless.FileOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val method: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.MethodOptions, _root_.scala.Option[com.akkaserverless.MethodOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1080, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(com.akkaserverless.MethodOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val service: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.ServiceOptions, _root_.scala.Option[com.akkaserverless.ServiceOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1080, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(com.akkaserverless.ServiceOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val codegen: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.ServiceOptions, _root_.scala.Option[com.akkaserverless.CodegenOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1081, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(com.akkaserverless.CodegenOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
}