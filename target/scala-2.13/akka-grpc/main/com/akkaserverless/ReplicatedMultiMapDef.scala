// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.akkaserverless

/** Options specific to replicated multi-maps
  *
  * @param key
  *   Mandatory key type for this replicated multi-map
  * @param value
  *   Mandatory value type for this replicated multi-map
  */
@SerialVersionUID(0L)
final case class ReplicatedMultiMapDef(
    key: _root_.scala.Predef.String = "",
    value: _root_.scala.Predef.String = "",
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[ReplicatedMultiMapDef] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = key
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = value
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var __size = __serializedSizeMemoized
      if (__size == 0) {
        __size = __computeSerializedSize() + 1
        __serializedSizeMemoized = __size
      }
      __size - 1
      
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = key
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = value
        if (!__v.isEmpty) {
          _output__.writeString(2, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withKey(__v: _root_.scala.Predef.String): ReplicatedMultiMapDef = copy(key = __v)
    def withValue(__v: _root_.scala.Predef.String): ReplicatedMultiMapDef = copy(value = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = key
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = value
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(key)
        case 2 => _root_.scalapb.descriptors.PString(value)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: com.akkaserverless.ReplicatedMultiMapDef.type = com.akkaserverless.ReplicatedMultiMapDef
    // @@protoc_insertion_point(GeneratedMessage[akkaserverless.ReplicatedMultiMapDef])
}

object ReplicatedMultiMapDef extends scalapb.GeneratedMessageCompanion[com.akkaserverless.ReplicatedMultiMapDef] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.akkaserverless.ReplicatedMultiMapDef] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.akkaserverless.ReplicatedMultiMapDef = {
    var __key: _root_.scala.Predef.String = ""
    var __value: _root_.scala.Predef.String = ""
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __key = _input__.readStringRequireUtf8()
        case 18 =>
          __value = _input__.readStringRequireUtf8()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    com.akkaserverless.ReplicatedMultiMapDef(
        key = __key,
        value = __value,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.akkaserverless.ReplicatedMultiMapDef] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      com.akkaserverless.ReplicatedMultiMapDef(
        key = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        value = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ComponentProto.javaDescriptor.getMessageTypes().get(11)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ComponentProto.scalaDescriptor.messages(11)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.akkaserverless.ReplicatedMultiMapDef(
    key = "",
    value = ""
  )
  implicit class ReplicatedMultiMapDefLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.akkaserverless.ReplicatedMultiMapDef]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.akkaserverless.ReplicatedMultiMapDef](_l) {
    def key: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.key)((c_, f_) => c_.copy(key = f_))
    def value: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.value)((c_, f_) => c_.copy(value = f_))
  }
  final val KEY_FIELD_NUMBER = 1
  final val VALUE_FIELD_NUMBER = 2
  def of(
    key: _root_.scala.Predef.String,
    value: _root_.scala.Predef.String
  ): _root_.com.akkaserverless.ReplicatedMultiMapDef = _root_.com.akkaserverless.ReplicatedMultiMapDef(
    key,
    value
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[akkaserverless.ReplicatedMultiMapDef])
}
