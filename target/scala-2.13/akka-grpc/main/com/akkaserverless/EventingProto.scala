// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.akkaserverless

object EventingProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    com.google.protobuf.descriptor.DescriptorProtoCompanion
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      com.akkaserverless.Eventing,
      com.akkaserverless.EventSource,
      com.akkaserverless.EventDestination
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """Ch1ha2thc2VydmVybGVzcy9ldmVudGluZy5wcm90bxIOYWtrYXNlcnZlcmxlc3MaIGdvb2dsZS9wcm90b2J1Zi9kZXNjcmlwd
  G9yLnByb3RvIn4KCEV2ZW50aW5nEjQKAmluGAEgASgLMhsuYWtrYXNlcnZlcmxlc3MuRXZlbnRTb3VyY2VCB+I/BBICaW5SAmluE
  jwKA291dBgCIAEoCzIgLmFra2FzZXJ2ZXJsZXNzLkV2ZW50RGVzdGluYXRpb25CCOI/BRIDb3V0UgNvdXQi+gEKC0V2ZW50U291c
  mNlEjkKDmNvbnN1bWVyX2dyb3VwGAEgASgJQhLiPw8SDWNvbnN1bWVyR3JvdXBSDWNvbnN1bWVyR3JvdXASIgoFdG9waWMYAiABK
  AlCCuI/BxIFdG9waWNIAFIFdG9waWMSSwoUZXZlbnRfc291cmNlZF9lbnRpdHkYAyABKAlCF+I/FBISZXZlbnRTb3VyY2VkRW50a
  XR5SABSEmV2ZW50U291cmNlZEVudGl0eRI1Cgx2YWx1ZV9lbnRpdHkYBCABKAlCEOI/DRILdmFsdWVFbnRpdHlIAFILdmFsdWVFb
  nRpdHlCCAoGc291cmNlIkUKEEV2ZW50RGVzdGluYXRpb24SIgoFdG9waWMYASABKAlCCuI/BxIFdG9waWNIAFIFdG9waWNCDQoLZ
  GVzdGluYXRpb25CbQoSY29tLmFra2FzZXJ2ZXJsZXNzQgtFdmVudHNQcm90b1ABWkhnaXRodWIuY29tL2xpZ2h0YmVuZC9ha2thc
  2VydmVybGVzcy1nby1zZGsvYWtrYXNlcnZlcmxlc3M7YWtrYXNlcnZlcmxlc3NiBnByb3RvMw=="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, _root_.scala.Array(
      com.google.protobuf.descriptor.DescriptorProtoCompanion.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}