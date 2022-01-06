// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.akkaserverless

object ComponentProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq.empty
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      com.akkaserverless.ActionDef,
      com.akkaserverless.ViewDef,
      com.akkaserverless.EventSourcedEntityDef,
      com.akkaserverless.ValueEntityDef,
      com.akkaserverless.ReplicatedEntityDef,
      com.akkaserverless.ReplicatedCounterDef,
      com.akkaserverless.ReplicatedRegisterDef,
      com.akkaserverless.ReplicatedSetDef,
      com.akkaserverless.ReplicatedMapDef,
      com.akkaserverless.ReplicatedCounterMapDef,
      com.akkaserverless.ReplicatedRegisterMapDef,
      com.akkaserverless.ReplicatedMultiMapDef,
      com.akkaserverless.ReplicatedVoteDef,
      com.akkaserverless.EventSourcedEntity,
      com.akkaserverless.ValueEntity,
      com.akkaserverless.ReplicatedEntity,
      com.akkaserverless.ReplicatedCounter,
      com.akkaserverless.ReplicatedRegister,
      com.akkaserverless.ReplicatedSet,
      com.akkaserverless.ReplicatedMap,
      com.akkaserverless.ReplicatedCounterMap,
      com.akkaserverless.ReplicatedRegisterMap,
      com.akkaserverless.ReplicatedMultiMap,
      com.akkaserverless.ReplicatedVote
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """Ch5ha2thc2VydmVybGVzcy9jb21wb25lbnQucHJvdG8SDmFra2FzZXJ2ZXJsZXNzIioKCUFjdGlvbkRlZhIdCgRuYW1lGAEgA
  SgJQgniPwYSBG5hbWVSBG5hbWUiKAoHVmlld0RlZhIdCgRuYW1lGAEgASgJQgniPwYSBG5hbWVSBG5hbWUirwEKFUV2ZW50U291c
  mNlZEVudGl0eURlZhIdCgRuYW1lGAEgASgJQgniPwYSBG5hbWVSBG5hbWUSMAoLZW50aXR5X3R5cGUYAiABKAlCD+I/DBIKZW50a
  XR5VHlwZVIKZW50aXR5VHlwZRIgCgVzdGF0ZRgDIAEoCUIK4j8HEgVzdGF0ZVIFc3RhdGUSIwoGZXZlbnRzGAQgAygJQgviPwgSB
  mV2ZW50c1IGZXZlbnRzIoMBCg5WYWx1ZUVudGl0eURlZhIdCgRuYW1lGAEgASgJQgniPwYSBG5hbWVSBG5hbWUSMAoLZW50aXR5X
  3R5cGUYAiABKAlCD+I/DBIKZW50aXR5VHlwZVIKZW50aXR5VHlwZRIgCgVzdGF0ZRgDIAEoCUIK4j8HEgVzdGF0ZVIFc3RhdGUi7
  AcKE1JlcGxpY2F0ZWRFbnRpdHlEZWYSHQoEbmFtZRgBIAEoCUIJ4j8GEgRuYW1lUgRuYW1lEjAKC2VudGl0eV90eXBlGAIgASgJQ
  g/iPwwSCmVudGl0eVR5cGVSCmVudGl0eVR5cGUSbQoScmVwbGljYXRlZF9jb3VudGVyGAMgASgLMiQuYWtrYXNlcnZlcmxlc3MuU
  mVwbGljYXRlZENvdW50ZXJEZWZCFuI/ExIRcmVwbGljYXRlZENvdW50ZXJIAFIRcmVwbGljYXRlZENvdW50ZXIScQoTcmVwbGljY
  XRlZF9yZWdpc3RlchgEIAEoCzIlLmFra2FzZXJ2ZXJsZXNzLlJlcGxpY2F0ZWRSZWdpc3RlckRlZkIX4j8UEhJyZXBsaWNhdGVkU
  mVnaXN0ZXJIAFIScmVwbGljYXRlZFJlZ2lzdGVyEl0KDnJlcGxpY2F0ZWRfc2V0GAUgASgLMiAuYWtrYXNlcnZlcmxlc3MuUmVwb
  GljYXRlZFNldERlZkIS4j8PEg1yZXBsaWNhdGVkU2V0SABSDXJlcGxpY2F0ZWRTZXQSXQoOcmVwbGljYXRlZF9tYXAYBiABKAsyI
  C5ha2thc2VydmVybGVzcy5SZXBsaWNhdGVkTWFwRGVmQhLiPw8SDXJlcGxpY2F0ZWRNYXBIAFINcmVwbGljYXRlZE1hcBJ6ChZyZ
  XBsaWNhdGVkX2NvdW50ZXJfbWFwGAcgASgLMicuYWtrYXNlcnZlcmxlc3MuUmVwbGljYXRlZENvdW50ZXJNYXBEZWZCGeI/FhIUc
  mVwbGljYXRlZENvdW50ZXJNYXBIAFIUcmVwbGljYXRlZENvdW50ZXJNYXASfgoXcmVwbGljYXRlZF9yZWdpc3Rlcl9tYXAYCCABK
  AsyKC5ha2thc2VydmVybGVzcy5SZXBsaWNhdGVkUmVnaXN0ZXJNYXBEZWZCGuI/FxIVcmVwbGljYXRlZFJlZ2lzdGVyTWFwSABSF
  XJlcGxpY2F0ZWRSZWdpc3Rlck1hcBJyChRyZXBsaWNhdGVkX211bHRpX21hcBgJIAEoCzIlLmFra2FzZXJ2ZXJsZXNzLlJlcGxpY
  2F0ZWRNdWx0aU1hcERlZkIX4j8UEhJyZXBsaWNhdGVkTXVsdGlNYXBIAFIScmVwbGljYXRlZE11bHRpTWFwEmEKD3JlcGxpY2F0Z
  WRfdm90ZRgKIAEoCzIhLmFra2FzZXJ2ZXJsZXNzLlJlcGxpY2F0ZWRWb3RlRGVmQhPiPxASDnJlcGxpY2F0ZWRWb3RlSABSDnJlc
  GxpY2F0ZWRWb3RlQhEKD3JlcGxpY2F0ZWRfZGF0YSIWChRSZXBsaWNhdGVkQ291bnRlckRlZiI5ChVSZXBsaWNhdGVkUmVnaXN0Z
  XJEZWYSIAoFdmFsdWUYASABKAlCCuI/BxIFdmFsdWVSBXZhbHVlIjoKEFJlcGxpY2F0ZWRTZXREZWYSJgoHZWxlbWVudBgBIAEoC
  UIM4j8JEgdlbGVtZW50UgdlbGVtZW50Ii4KEFJlcGxpY2F0ZWRNYXBEZWYSGgoDa2V5GAEgASgJQgjiPwUSA2tleVIDa2V5IjUKF
  1JlcGxpY2F0ZWRDb3VudGVyTWFwRGVmEhoKA2tleRgBIAEoCUII4j8FEgNrZXlSA2tleSJYChhSZXBsaWNhdGVkUmVnaXN0ZXJNY
  XBEZWYSGgoDa2V5GAEgASgJQgjiPwUSA2tleVIDa2V5EiAKBXZhbHVlGAIgASgJQgriPwcSBXZhbHVlUgV2YWx1ZSJVChVSZXBsa
  WNhdGVkTXVsdGlNYXBEZWYSGgoDa2V5GAEgASgJQgjiPwUSA2tleVIDa2V5EiAKBXZhbHVlGAIgASgJQgriPwcSBXZhbHVlUgV2Y
  Wx1ZSITChFSZXBsaWNhdGVkVm90ZURlZiKsAQoSRXZlbnRTb3VyY2VkRW50aXR5Eh0KBG5hbWUYASABKAlCCeI/BhIEbmFtZVIEb
  mFtZRIwCgtlbnRpdHlfdHlwZRgCIAEoCUIP4j8MEgplbnRpdHlUeXBlUgplbnRpdHlUeXBlEiAKBXN0YXRlGAMgASgJQgriPwcSB
  XN0YXRlUgVzdGF0ZRIjCgZldmVudHMYBCADKAlCC+I/CBIGZXZlbnRzUgZldmVudHMigAEKC1ZhbHVlRW50aXR5Eh0KBG5hbWUYA
  SABKAlCCeI/BhIEbmFtZVIEbmFtZRIwCgtlbnRpdHlfdHlwZRgCIAEoCUIP4j8MEgplbnRpdHlUeXBlUgplbnRpdHlUeXBlEiAKB
  XN0YXRlGAMgASgJQgriPwcSBXN0YXRlUgVzdGF0ZSLRBwoQUmVwbGljYXRlZEVudGl0eRIdCgRuYW1lGAEgASgJQgniPwYSBG5hb
  WVSBG5hbWUSMAoLZW50aXR5X3R5cGUYAiABKAlCD+I/DBIKZW50aXR5VHlwZVIKZW50aXR5VHlwZRJqChJyZXBsaWNhdGVkX2Nvd
  W50ZXIYAyABKAsyIS5ha2thc2VydmVybGVzcy5SZXBsaWNhdGVkQ291bnRlckIW4j8TEhFyZXBsaWNhdGVkQ291bnRlckgAUhFyZ
  XBsaWNhdGVkQ291bnRlchJuChNyZXBsaWNhdGVkX3JlZ2lzdGVyGAQgASgLMiIuYWtrYXNlcnZlcmxlc3MuUmVwbGljYXRlZFJlZ
  2lzdGVyQhfiPxQSEnJlcGxpY2F0ZWRSZWdpc3RlckgAUhJyZXBsaWNhdGVkUmVnaXN0ZXISWgoOcmVwbGljYXRlZF9zZXQYBSABK
  AsyHS5ha2thc2VydmVybGVzcy5SZXBsaWNhdGVkU2V0QhLiPw8SDXJlcGxpY2F0ZWRTZXRIAFINcmVwbGljYXRlZFNldBJaCg5yZ
  XBsaWNhdGVkX21hcBgGIAEoCzIdLmFra2FzZXJ2ZXJsZXNzLlJlcGxpY2F0ZWRNYXBCEuI/DxINcmVwbGljYXRlZE1hcEgAUg1yZ
  XBsaWNhdGVkTWFwEncKFnJlcGxpY2F0ZWRfY291bnRlcl9tYXAYByABKAsyJC5ha2thc2VydmVybGVzcy5SZXBsaWNhdGVkQ291b
  nRlck1hcEIZ4j8WEhRyZXBsaWNhdGVkQ291bnRlck1hcEgAUhRyZXBsaWNhdGVkQ291bnRlck1hcBJ7ChdyZXBsaWNhdGVkX3JlZ
  2lzdGVyX21hcBgIIAEoCzIlLmFra2FzZXJ2ZXJsZXNzLlJlcGxpY2F0ZWRSZWdpc3Rlck1hcEIa4j8XEhVyZXBsaWNhdGVkUmVna
  XN0ZXJNYXBIAFIVcmVwbGljYXRlZFJlZ2lzdGVyTWFwEm8KFHJlcGxpY2F0ZWRfbXVsdGlfbWFwGAkgASgLMiIuYWtrYXNlcnZlc
  mxlc3MuUmVwbGljYXRlZE11bHRpTWFwQhfiPxQSEnJlcGxpY2F0ZWRNdWx0aU1hcEgAUhJyZXBsaWNhdGVkTXVsdGlNYXASXgoPc
  mVwbGljYXRlZF92b3RlGAogASgLMh4uYWtrYXNlcnZlcmxlc3MuUmVwbGljYXRlZFZvdGVCE+I/EBIOcmVwbGljYXRlZFZvdGVIA
  FIOcmVwbGljYXRlZFZvdGVCEQoPcmVwbGljYXRlZF9kYXRhIhMKEVJlcGxpY2F0ZWRDb3VudGVyIjYKElJlcGxpY2F0ZWRSZWdpc
  3RlchIgCgV2YWx1ZRgBIAEoCUIK4j8HEgV2YWx1ZVIFdmFsdWUiNwoNUmVwbGljYXRlZFNldBImCgdlbGVtZW50GAEgASgJQgziP
  wkSB2VsZW1lbnRSB2VsZW1lbnQiKwoNUmVwbGljYXRlZE1hcBIaCgNrZXkYASABKAlCCOI/BRIDa2V5UgNrZXkiMgoUUmVwbGljY
  XRlZENvdW50ZXJNYXASGgoDa2V5GAEgASgJQgjiPwUSA2tleVIDa2V5IlUKFVJlcGxpY2F0ZWRSZWdpc3Rlck1hcBIaCgNrZXkYA
  SABKAlCCOI/BRIDa2V5UgNrZXkSIAoFdmFsdWUYAiABKAlCCuI/BxIFdmFsdWVSBXZhbHVlIlIKElJlcGxpY2F0ZWRNdWx0aU1hc
  BIaCgNrZXkYASABKAlCCOI/BRIDa2V5UgNrZXkSIAoFdmFsdWUYAiABKAlCCuI/BxIFdmFsdWVSBXZhbHVlIhAKDlJlcGxpY2F0Z
  WRWb3RlQnAKEmNvbS5ha2thc2VydmVybGVzc0IOQ29tcG9uZW50UHJvdG9QAVpIZ2l0aHViLmNvbS9saWdodGJlbmQvYWtrYXNlc
  nZlcmxlc3MtZ28tc2RrL2Fra2FzZXJ2ZXJsZXNzO2Fra2FzZXJ2ZXJsZXNzYgZwcm90bzM="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, _root_.scala.Array(
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}