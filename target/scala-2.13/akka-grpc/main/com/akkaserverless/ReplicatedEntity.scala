// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.akkaserverless

/** Options to describe replicated entities
  *
  * @param name
  *   A mandatory name for the entity - used for code generation
  * @param entityType
  *   The entity type name used when replicating this entity
  */
@SerialVersionUID(0L)
final case class ReplicatedEntity(
    name: _root_.scala.Predef.String = "",
    entityType: _root_.scala.Predef.String = "",
    replicatedData: com.akkaserverless.ReplicatedEntity.ReplicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.Empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[ReplicatedEntity] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = name
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = entityType
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      if (replicatedData.replicatedCounter.isDefined) {
        val __value = replicatedData.replicatedCounter.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (replicatedData.replicatedRegister.isDefined) {
        val __value = replicatedData.replicatedRegister.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (replicatedData.replicatedSet.isDefined) {
        val __value = replicatedData.replicatedSet.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (replicatedData.replicatedMap.isDefined) {
        val __value = replicatedData.replicatedMap.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (replicatedData.replicatedCounterMap.isDefined) {
        val __value = replicatedData.replicatedCounterMap.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (replicatedData.replicatedRegisterMap.isDefined) {
        val __value = replicatedData.replicatedRegisterMap.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (replicatedData.replicatedMultiMap.isDefined) {
        val __value = replicatedData.replicatedMultiMap.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (replicatedData.replicatedVote.isDefined) {
        val __value = replicatedData.replicatedVote.get
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
      {
        val __v = name
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = entityType
        if (!__v.isEmpty) {
          _output__.writeString(2, __v)
        }
      };
      replicatedData.replicatedCounter.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      replicatedData.replicatedRegister.foreach { __v =>
        val __m = __v
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      replicatedData.replicatedSet.foreach { __v =>
        val __m = __v
        _output__.writeTag(5, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      replicatedData.replicatedMap.foreach { __v =>
        val __m = __v
        _output__.writeTag(6, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      replicatedData.replicatedCounterMap.foreach { __v =>
        val __m = __v
        _output__.writeTag(7, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      replicatedData.replicatedRegisterMap.foreach { __v =>
        val __m = __v
        _output__.writeTag(8, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      replicatedData.replicatedMultiMap.foreach { __v =>
        val __m = __v
        _output__.writeTag(9, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      replicatedData.replicatedVote.foreach { __v =>
        val __m = __v
        _output__.writeTag(10, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def withName(__v: _root_.scala.Predef.String): ReplicatedEntity = copy(name = __v)
    def withEntityType(__v: _root_.scala.Predef.String): ReplicatedEntity = copy(entityType = __v)
    def getReplicatedCounter: com.akkaserverless.ReplicatedCounter = replicatedData.replicatedCounter.getOrElse(com.akkaserverless.ReplicatedCounter.defaultInstance)
    def withReplicatedCounter(__v: com.akkaserverless.ReplicatedCounter): ReplicatedEntity = copy(replicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedCounter(__v))
    def getReplicatedRegister: com.akkaserverless.ReplicatedRegister = replicatedData.replicatedRegister.getOrElse(com.akkaserverless.ReplicatedRegister.defaultInstance)
    def withReplicatedRegister(__v: com.akkaserverless.ReplicatedRegister): ReplicatedEntity = copy(replicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedRegister(__v))
    def getReplicatedSet: com.akkaserverless.ReplicatedSet = replicatedData.replicatedSet.getOrElse(com.akkaserverless.ReplicatedSet.defaultInstance)
    def withReplicatedSet(__v: com.akkaserverless.ReplicatedSet): ReplicatedEntity = copy(replicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedSet(__v))
    def getReplicatedMap: com.akkaserverless.ReplicatedMap = replicatedData.replicatedMap.getOrElse(com.akkaserverless.ReplicatedMap.defaultInstance)
    def withReplicatedMap(__v: com.akkaserverless.ReplicatedMap): ReplicatedEntity = copy(replicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedMap(__v))
    def getReplicatedCounterMap: com.akkaserverless.ReplicatedCounterMap = replicatedData.replicatedCounterMap.getOrElse(com.akkaserverless.ReplicatedCounterMap.defaultInstance)
    def withReplicatedCounterMap(__v: com.akkaserverless.ReplicatedCounterMap): ReplicatedEntity = copy(replicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedCounterMap(__v))
    def getReplicatedRegisterMap: com.akkaserverless.ReplicatedRegisterMap = replicatedData.replicatedRegisterMap.getOrElse(com.akkaserverless.ReplicatedRegisterMap.defaultInstance)
    def withReplicatedRegisterMap(__v: com.akkaserverless.ReplicatedRegisterMap): ReplicatedEntity = copy(replicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedRegisterMap(__v))
    def getReplicatedMultiMap: com.akkaserverless.ReplicatedMultiMap = replicatedData.replicatedMultiMap.getOrElse(com.akkaserverless.ReplicatedMultiMap.defaultInstance)
    def withReplicatedMultiMap(__v: com.akkaserverless.ReplicatedMultiMap): ReplicatedEntity = copy(replicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedMultiMap(__v))
    def getReplicatedVote: com.akkaserverless.ReplicatedVote = replicatedData.replicatedVote.getOrElse(com.akkaserverless.ReplicatedVote.defaultInstance)
    def withReplicatedVote(__v: com.akkaserverless.ReplicatedVote): ReplicatedEntity = copy(replicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedVote(__v))
    def clearReplicatedData: ReplicatedEntity = copy(replicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.Empty)
    def withReplicatedData(__v: com.akkaserverless.ReplicatedEntity.ReplicatedData): ReplicatedEntity = copy(replicatedData = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = entityType
          if (__t != "") __t else null
        }
        case 3 => replicatedData.replicatedCounter.orNull
        case 4 => replicatedData.replicatedRegister.orNull
        case 5 => replicatedData.replicatedSet.orNull
        case 6 => replicatedData.replicatedMap.orNull
        case 7 => replicatedData.replicatedCounterMap.orNull
        case 8 => replicatedData.replicatedRegisterMap.orNull
        case 9 => replicatedData.replicatedMultiMap.orNull
        case 10 => replicatedData.replicatedVote.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(name)
        case 2 => _root_.scalapb.descriptors.PString(entityType)
        case 3 => replicatedData.replicatedCounter.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 4 => replicatedData.replicatedRegister.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 5 => replicatedData.replicatedSet.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 6 => replicatedData.replicatedMap.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 7 => replicatedData.replicatedCounterMap.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 8 => replicatedData.replicatedRegisterMap.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 9 => replicatedData.replicatedMultiMap.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 10 => replicatedData.replicatedVote.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: com.akkaserverless.ReplicatedEntity.type = com.akkaserverless.ReplicatedEntity
    // @@protoc_insertion_point(GeneratedMessage[akkaserverless.ReplicatedEntity])
}

object ReplicatedEntity extends scalapb.GeneratedMessageCompanion[com.akkaserverless.ReplicatedEntity] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.akkaserverless.ReplicatedEntity] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.akkaserverless.ReplicatedEntity = {
    var __name: _root_.scala.Predef.String = ""
    var __entityType: _root_.scala.Predef.String = ""
    var __replicatedData: com.akkaserverless.ReplicatedEntity.ReplicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.Empty
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __name = _input__.readStringRequireUtf8()
        case 18 =>
          __entityType = _input__.readStringRequireUtf8()
        case 26 =>
          __replicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedCounter(__replicatedData.replicatedCounter.fold(_root_.scalapb.LiteParser.readMessage[com.akkaserverless.ReplicatedCounter](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case 34 =>
          __replicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedRegister(__replicatedData.replicatedRegister.fold(_root_.scalapb.LiteParser.readMessage[com.akkaserverless.ReplicatedRegister](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case 42 =>
          __replicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedSet(__replicatedData.replicatedSet.fold(_root_.scalapb.LiteParser.readMessage[com.akkaserverless.ReplicatedSet](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case 50 =>
          __replicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedMap(__replicatedData.replicatedMap.fold(_root_.scalapb.LiteParser.readMessage[com.akkaserverless.ReplicatedMap](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case 58 =>
          __replicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedCounterMap(__replicatedData.replicatedCounterMap.fold(_root_.scalapb.LiteParser.readMessage[com.akkaserverless.ReplicatedCounterMap](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case 66 =>
          __replicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedRegisterMap(__replicatedData.replicatedRegisterMap.fold(_root_.scalapb.LiteParser.readMessage[com.akkaserverless.ReplicatedRegisterMap](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case 74 =>
          __replicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedMultiMap(__replicatedData.replicatedMultiMap.fold(_root_.scalapb.LiteParser.readMessage[com.akkaserverless.ReplicatedMultiMap](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case 82 =>
          __replicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedVote(__replicatedData.replicatedVote.fold(_root_.scalapb.LiteParser.readMessage[com.akkaserverless.ReplicatedVote](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    com.akkaserverless.ReplicatedEntity(
        name = __name,
        entityType = __entityType,
        replicatedData = __replicatedData,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.akkaserverless.ReplicatedEntity] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      com.akkaserverless.ReplicatedEntity(
        name = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        entityType = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        replicatedData = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[com.akkaserverless.ReplicatedCounter]]).map(com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedCounter(_))
            .orElse[com.akkaserverless.ReplicatedEntity.ReplicatedData](__fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[_root_.scala.Option[com.akkaserverless.ReplicatedRegister]]).map(com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedRegister(_)))
            .orElse[com.akkaserverless.ReplicatedEntity.ReplicatedData](__fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).flatMap(_.as[_root_.scala.Option[com.akkaserverless.ReplicatedSet]]).map(com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedSet(_)))
            .orElse[com.akkaserverless.ReplicatedEntity.ReplicatedData](__fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).flatMap(_.as[_root_.scala.Option[com.akkaserverless.ReplicatedMap]]).map(com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedMap(_)))
            .orElse[com.akkaserverless.ReplicatedEntity.ReplicatedData](__fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).flatMap(_.as[_root_.scala.Option[com.akkaserverless.ReplicatedCounterMap]]).map(com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedCounterMap(_)))
            .orElse[com.akkaserverless.ReplicatedEntity.ReplicatedData](__fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).flatMap(_.as[_root_.scala.Option[com.akkaserverless.ReplicatedRegisterMap]]).map(com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedRegisterMap(_)))
            .orElse[com.akkaserverless.ReplicatedEntity.ReplicatedData](__fieldsMap.get(scalaDescriptor.findFieldByNumber(9).get).flatMap(_.as[_root_.scala.Option[com.akkaserverless.ReplicatedMultiMap]]).map(com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedMultiMap(_)))
            .orElse[com.akkaserverless.ReplicatedEntity.ReplicatedData](__fieldsMap.get(scalaDescriptor.findFieldByNumber(10).get).flatMap(_.as[_root_.scala.Option[com.akkaserverless.ReplicatedVote]]).map(com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedVote(_)))
            .getOrElse(com.akkaserverless.ReplicatedEntity.ReplicatedData.Empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ComponentProto.javaDescriptor.getMessageTypes().get(15)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ComponentProto.scalaDescriptor.messages(15)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 3 => __out = com.akkaserverless.ReplicatedCounter
      case 4 => __out = com.akkaserverless.ReplicatedRegister
      case 5 => __out = com.akkaserverless.ReplicatedSet
      case 6 => __out = com.akkaserverless.ReplicatedMap
      case 7 => __out = com.akkaserverless.ReplicatedCounterMap
      case 8 => __out = com.akkaserverless.ReplicatedRegisterMap
      case 9 => __out = com.akkaserverless.ReplicatedMultiMap
      case 10 => __out = com.akkaserverless.ReplicatedVote
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.akkaserverless.ReplicatedEntity(
    name = "",
    entityType = "",
    replicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.Empty
  )
  sealed trait ReplicatedData extends _root_.scalapb.GeneratedOneof {
    def isEmpty: _root_.scala.Boolean = false
    def isDefined: _root_.scala.Boolean = true
    def isReplicatedCounter: _root_.scala.Boolean = false
    def isReplicatedRegister: _root_.scala.Boolean = false
    def isReplicatedSet: _root_.scala.Boolean = false
    def isReplicatedMap: _root_.scala.Boolean = false
    def isReplicatedCounterMap: _root_.scala.Boolean = false
    def isReplicatedRegisterMap: _root_.scala.Boolean = false
    def isReplicatedMultiMap: _root_.scala.Boolean = false
    def isReplicatedVote: _root_.scala.Boolean = false
    def replicatedCounter: _root_.scala.Option[com.akkaserverless.ReplicatedCounter] = _root_.scala.None
    def replicatedRegister: _root_.scala.Option[com.akkaserverless.ReplicatedRegister] = _root_.scala.None
    def replicatedSet: _root_.scala.Option[com.akkaserverless.ReplicatedSet] = _root_.scala.None
    def replicatedMap: _root_.scala.Option[com.akkaserverless.ReplicatedMap] = _root_.scala.None
    def replicatedCounterMap: _root_.scala.Option[com.akkaserverless.ReplicatedCounterMap] = _root_.scala.None
    def replicatedRegisterMap: _root_.scala.Option[com.akkaserverless.ReplicatedRegisterMap] = _root_.scala.None
    def replicatedMultiMap: _root_.scala.Option[com.akkaserverless.ReplicatedMultiMap] = _root_.scala.None
    def replicatedVote: _root_.scala.Option[com.akkaserverless.ReplicatedVote] = _root_.scala.None
  }
  object ReplicatedData {
    @SerialVersionUID(0L)
    case object Empty extends com.akkaserverless.ReplicatedEntity.ReplicatedData {
      type ValueType = _root_.scala.Nothing
      override def isEmpty: _root_.scala.Boolean = true
      override def isDefined: _root_.scala.Boolean = false
      override def number: _root_.scala.Int = 0
      override def value: _root_.scala.Nothing = throw new java.util.NoSuchElementException("Empty.value")
    }
  
    @SerialVersionUID(0L)
    final case class ReplicatedCounter(value: com.akkaserverless.ReplicatedCounter) extends com.akkaserverless.ReplicatedEntity.ReplicatedData {
      type ValueType = com.akkaserverless.ReplicatedCounter
      override def isReplicatedCounter: _root_.scala.Boolean = true
      override def replicatedCounter: _root_.scala.Option[com.akkaserverless.ReplicatedCounter] = Some(value)
      override def number: _root_.scala.Int = 3
    }
    @SerialVersionUID(0L)
    final case class ReplicatedRegister(value: com.akkaserverless.ReplicatedRegister) extends com.akkaserverless.ReplicatedEntity.ReplicatedData {
      type ValueType = com.akkaserverless.ReplicatedRegister
      override def isReplicatedRegister: _root_.scala.Boolean = true
      override def replicatedRegister: _root_.scala.Option[com.akkaserverless.ReplicatedRegister] = Some(value)
      override def number: _root_.scala.Int = 4
    }
    @SerialVersionUID(0L)
    final case class ReplicatedSet(value: com.akkaserverless.ReplicatedSet) extends com.akkaserverless.ReplicatedEntity.ReplicatedData {
      type ValueType = com.akkaserverless.ReplicatedSet
      override def isReplicatedSet: _root_.scala.Boolean = true
      override def replicatedSet: _root_.scala.Option[com.akkaserverless.ReplicatedSet] = Some(value)
      override def number: _root_.scala.Int = 5
    }
    @SerialVersionUID(0L)
    final case class ReplicatedMap(value: com.akkaserverless.ReplicatedMap) extends com.akkaserverless.ReplicatedEntity.ReplicatedData {
      type ValueType = com.akkaserverless.ReplicatedMap
      override def isReplicatedMap: _root_.scala.Boolean = true
      override def replicatedMap: _root_.scala.Option[com.akkaserverless.ReplicatedMap] = Some(value)
      override def number: _root_.scala.Int = 6
    }
    @SerialVersionUID(0L)
    final case class ReplicatedCounterMap(value: com.akkaserverless.ReplicatedCounterMap) extends com.akkaserverless.ReplicatedEntity.ReplicatedData {
      type ValueType = com.akkaserverless.ReplicatedCounterMap
      override def isReplicatedCounterMap: _root_.scala.Boolean = true
      override def replicatedCounterMap: _root_.scala.Option[com.akkaserverless.ReplicatedCounterMap] = Some(value)
      override def number: _root_.scala.Int = 7
    }
    @SerialVersionUID(0L)
    final case class ReplicatedRegisterMap(value: com.akkaserverless.ReplicatedRegisterMap) extends com.akkaserverless.ReplicatedEntity.ReplicatedData {
      type ValueType = com.akkaserverless.ReplicatedRegisterMap
      override def isReplicatedRegisterMap: _root_.scala.Boolean = true
      override def replicatedRegisterMap: _root_.scala.Option[com.akkaserverless.ReplicatedRegisterMap] = Some(value)
      override def number: _root_.scala.Int = 8
    }
    @SerialVersionUID(0L)
    final case class ReplicatedMultiMap(value: com.akkaserverless.ReplicatedMultiMap) extends com.akkaserverless.ReplicatedEntity.ReplicatedData {
      type ValueType = com.akkaserverless.ReplicatedMultiMap
      override def isReplicatedMultiMap: _root_.scala.Boolean = true
      override def replicatedMultiMap: _root_.scala.Option[com.akkaserverless.ReplicatedMultiMap] = Some(value)
      override def number: _root_.scala.Int = 9
    }
    @SerialVersionUID(0L)
    final case class ReplicatedVote(value: com.akkaserverless.ReplicatedVote) extends com.akkaserverless.ReplicatedEntity.ReplicatedData {
      type ValueType = com.akkaserverless.ReplicatedVote
      override def isReplicatedVote: _root_.scala.Boolean = true
      override def replicatedVote: _root_.scala.Option[com.akkaserverless.ReplicatedVote] = Some(value)
      override def number: _root_.scala.Int = 10
    }
  }
  implicit class ReplicatedEntityLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.akkaserverless.ReplicatedEntity]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.akkaserverless.ReplicatedEntity](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def entityType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.entityType)((c_, f_) => c_.copy(entityType = f_))
    def replicatedCounter: _root_.scalapb.lenses.Lens[UpperPB, com.akkaserverless.ReplicatedCounter] = field(_.getReplicatedCounter)((c_, f_) => c_.copy(replicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedCounter(f_)))
    def replicatedRegister: _root_.scalapb.lenses.Lens[UpperPB, com.akkaserverless.ReplicatedRegister] = field(_.getReplicatedRegister)((c_, f_) => c_.copy(replicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedRegister(f_)))
    def replicatedSet: _root_.scalapb.lenses.Lens[UpperPB, com.akkaserverless.ReplicatedSet] = field(_.getReplicatedSet)((c_, f_) => c_.copy(replicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedSet(f_)))
    def replicatedMap: _root_.scalapb.lenses.Lens[UpperPB, com.akkaserverless.ReplicatedMap] = field(_.getReplicatedMap)((c_, f_) => c_.copy(replicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedMap(f_)))
    def replicatedCounterMap: _root_.scalapb.lenses.Lens[UpperPB, com.akkaserverless.ReplicatedCounterMap] = field(_.getReplicatedCounterMap)((c_, f_) => c_.copy(replicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedCounterMap(f_)))
    def replicatedRegisterMap: _root_.scalapb.lenses.Lens[UpperPB, com.akkaserverless.ReplicatedRegisterMap] = field(_.getReplicatedRegisterMap)((c_, f_) => c_.copy(replicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedRegisterMap(f_)))
    def replicatedMultiMap: _root_.scalapb.lenses.Lens[UpperPB, com.akkaserverless.ReplicatedMultiMap] = field(_.getReplicatedMultiMap)((c_, f_) => c_.copy(replicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedMultiMap(f_)))
    def replicatedVote: _root_.scalapb.lenses.Lens[UpperPB, com.akkaserverless.ReplicatedVote] = field(_.getReplicatedVote)((c_, f_) => c_.copy(replicatedData = com.akkaserverless.ReplicatedEntity.ReplicatedData.ReplicatedVote(f_)))
    def replicatedData: _root_.scalapb.lenses.Lens[UpperPB, com.akkaserverless.ReplicatedEntity.ReplicatedData] = field(_.replicatedData)((c_, f_) => c_.copy(replicatedData = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val ENTITY_TYPE_FIELD_NUMBER = 2
  final val REPLICATED_COUNTER_FIELD_NUMBER = 3
  final val REPLICATED_REGISTER_FIELD_NUMBER = 4
  final val REPLICATED_SET_FIELD_NUMBER = 5
  final val REPLICATED_MAP_FIELD_NUMBER = 6
  final val REPLICATED_COUNTER_MAP_FIELD_NUMBER = 7
  final val REPLICATED_REGISTER_MAP_FIELD_NUMBER = 8
  final val REPLICATED_MULTI_MAP_FIELD_NUMBER = 9
  final val REPLICATED_VOTE_FIELD_NUMBER = 10
  def of(
    name: _root_.scala.Predef.String,
    entityType: _root_.scala.Predef.String,
    replicatedData: com.akkaserverless.ReplicatedEntity.ReplicatedData
  ): _root_.com.akkaserverless.ReplicatedEntity = _root_.com.akkaserverless.ReplicatedEntity(
    name,
    entityType,
    replicatedData
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[akkaserverless.ReplicatedEntity])
}
