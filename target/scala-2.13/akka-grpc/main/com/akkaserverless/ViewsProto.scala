// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.akkaserverless

object ViewsProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    com.google.protobuf.descriptor.DescriptorProtoCompanion
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      com.akkaserverless.View
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """Chpha2thc2VydmVybGVzcy92aWV3cy5wcm90bxIOYWtrYXNlcnZlcmxlc3MaIGdvb2dsZS9wcm90b2J1Zi9kZXNjcmlwdG9yL
  nByb3RvIvwCCgRWaWV3EkIKBnVwZGF0ZRgBIAEoCzIbLmFra2FzZXJ2ZXJsZXNzLlZpZXcuVXBkYXRlQgviPwgSBnVwZGF0ZUgAU
  gZ1cGRhdGUSPgoFcXVlcnkYAiABKAsyGi5ha2thc2VydmVybGVzcy5WaWV3LlF1ZXJ5QgriPwcSBXF1ZXJ5SABSBXF1ZXJ5Gm4KB
  lVwZGF0ZRIgCgV0YWJsZRgBIAEoCUIK4j8HEgV0YWJsZVIFdGFibGUSQgoRdHJhbnNmb3JtX3VwZGF0ZXMYAiABKAhCFeI/EhIQd
  HJhbnNmb3JtVXBkYXRlc1IQdHJhbnNmb3JtVXBkYXRlcxptCgVRdWVyeRIgCgVxdWVyeRgDIAEoCUIK4j8HEgVxdWVyeVIFcXVlc
  nkSQgoRdHJhbnNmb3JtX3Jlc3VsdHMYBCABKAhCFeI/EhIQdHJhbnNmb3JtUmVzdWx0c1IQdHJhbnNmb3JtUmVzdWx0c0IRCg91c
  GRhdGVfb3JfcXVlcnlCbAoSY29tLmFra2FzZXJ2ZXJsZXNzQgpWaWV3c1Byb3RvUAFaSGdpdGh1Yi5jb20vbGlnaHRiZW5kL2Fra
  2FzZXJ2ZXJsZXNzLWdvLXNkay9ha2thc2VydmVybGVzcztha2thc2VydmVybGVzc2IGcHJvdG8z"""
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