// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.akkaserverless

/** @param eventSourcedEntity
  *   Event sourced entity configuration.
  * @param valueEntity
  *   Value entity configuration.
  * @param replicatedEntity
  *   Replicated entity configuration.
  */
@SerialVersionUID(0L)
final case class FileOptions(
    eventSourcedEntity: _root_.scala.Option[com.akkaserverless.EventSourcedEntity] = _root_.scala.None,
    valueEntity: _root_.scala.Option[com.akkaserverless.ValueEntity] = _root_.scala.None,
    replicatedEntity: _root_.scala.Option[com.akkaserverless.ReplicatedEntity] = _root_.scala.None,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[FileOptions] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      if (eventSourcedEntity.isDefined) {
        val __value = eventSourcedEntity.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (valueEntity.isDefined) {
        val __value = valueEntity.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (replicatedEntity.isDefined) {
        val __value = replicatedEntity.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
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
      eventSourcedEntity.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      valueEntity.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      replicatedEntity.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def getEventSourcedEntity: com.akkaserverless.EventSourcedEntity = eventSourcedEntity.getOrElse(com.akkaserverless.EventSourcedEntity.defaultInstance)
    def clearEventSourcedEntity: FileOptions = copy(eventSourcedEntity = _root_.scala.None)
    def withEventSourcedEntity(__v: com.akkaserverless.EventSourcedEntity): FileOptions = copy(eventSourcedEntity = Option(__v))
    def getValueEntity: com.akkaserverless.ValueEntity = valueEntity.getOrElse(com.akkaserverless.ValueEntity.defaultInstance)
    def clearValueEntity: FileOptions = copy(valueEntity = _root_.scala.None)
    def withValueEntity(__v: com.akkaserverless.ValueEntity): FileOptions = copy(valueEntity = Option(__v))
    def getReplicatedEntity: com.akkaserverless.ReplicatedEntity = replicatedEntity.getOrElse(com.akkaserverless.ReplicatedEntity.defaultInstance)
    def clearReplicatedEntity: FileOptions = copy(replicatedEntity = _root_.scala.None)
    def withReplicatedEntity(__v: com.akkaserverless.ReplicatedEntity): FileOptions = copy(replicatedEntity = Option(__v))
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => eventSourcedEntity.orNull
        case 2 => valueEntity.orNull
        case 3 => replicatedEntity.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => eventSourcedEntity.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => valueEntity.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => replicatedEntity.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: com.akkaserverless.FileOptions.type = com.akkaserverless.FileOptions
    // @@protoc_insertion_point(GeneratedMessage[akkaserverless.FileOptions])
}

object FileOptions extends scalapb.GeneratedMessageCompanion[com.akkaserverless.FileOptions] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.akkaserverless.FileOptions] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.akkaserverless.FileOptions = {
    var __eventSourcedEntity: _root_.scala.Option[com.akkaserverless.EventSourcedEntity] = _root_.scala.None
    var __valueEntity: _root_.scala.Option[com.akkaserverless.ValueEntity] = _root_.scala.None
    var __replicatedEntity: _root_.scala.Option[com.akkaserverless.ReplicatedEntity] = _root_.scala.None
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __eventSourcedEntity = Option(__eventSourcedEntity.fold(_root_.scalapb.LiteParser.readMessage[com.akkaserverless.EventSourcedEntity](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case 18 =>
          __valueEntity = Option(__valueEntity.fold(_root_.scalapb.LiteParser.readMessage[com.akkaserverless.ValueEntity](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case 26 =>
          __replicatedEntity = Option(__replicatedEntity.fold(_root_.scalapb.LiteParser.readMessage[com.akkaserverless.ReplicatedEntity](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    com.akkaserverless.FileOptions(
        eventSourcedEntity = __eventSourcedEntity,
        valueEntity = __valueEntity,
        replicatedEntity = __replicatedEntity,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.akkaserverless.FileOptions] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      com.akkaserverless.FileOptions(
        eventSourcedEntity = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[com.akkaserverless.EventSourcedEntity]]),
        valueEntity = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[com.akkaserverless.ValueEntity]]),
        replicatedEntity = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[com.akkaserverless.ReplicatedEntity]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = AnnotationsProto.javaDescriptor.getMessageTypes().get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = AnnotationsProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.akkaserverless.EventSourcedEntity
      case 2 => __out = com.akkaserverless.ValueEntity
      case 3 => __out = com.akkaserverless.ReplicatedEntity
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.akkaserverless.FileOptions(
    eventSourcedEntity = _root_.scala.None,
    valueEntity = _root_.scala.None,
    replicatedEntity = _root_.scala.None
  )
  implicit class FileOptionsLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.akkaserverless.FileOptions]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.akkaserverless.FileOptions](_l) {
    def eventSourcedEntity: _root_.scalapb.lenses.Lens[UpperPB, com.akkaserverless.EventSourcedEntity] = field(_.getEventSourcedEntity)((c_, f_) => c_.copy(eventSourcedEntity = Option(f_)))
    def optionalEventSourcedEntity: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.akkaserverless.EventSourcedEntity]] = field(_.eventSourcedEntity)((c_, f_) => c_.copy(eventSourcedEntity = f_))
    def valueEntity: _root_.scalapb.lenses.Lens[UpperPB, com.akkaserverless.ValueEntity] = field(_.getValueEntity)((c_, f_) => c_.copy(valueEntity = Option(f_)))
    def optionalValueEntity: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.akkaserverless.ValueEntity]] = field(_.valueEntity)((c_, f_) => c_.copy(valueEntity = f_))
    def replicatedEntity: _root_.scalapb.lenses.Lens[UpperPB, com.akkaserverless.ReplicatedEntity] = field(_.getReplicatedEntity)((c_, f_) => c_.copy(replicatedEntity = Option(f_)))
    def optionalReplicatedEntity: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.akkaserverless.ReplicatedEntity]] = field(_.replicatedEntity)((c_, f_) => c_.copy(replicatedEntity = f_))
  }
  final val EVENT_SOURCED_ENTITY_FIELD_NUMBER = 1
  final val VALUE_ENTITY_FIELD_NUMBER = 2
  final val REPLICATED_ENTITY_FIELD_NUMBER = 3
  def of(
    eventSourcedEntity: _root_.scala.Option[com.akkaserverless.EventSourcedEntity],
    valueEntity: _root_.scala.Option[com.akkaserverless.ValueEntity],
    replicatedEntity: _root_.scala.Option[com.akkaserverless.ReplicatedEntity]
  ): _root_.com.akkaserverless.FileOptions = _root_.com.akkaserverless.FileOptions(
    eventSourcedEntity,
    valueEntity,
    replicatedEntity
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[akkaserverless.FileOptions])
}
