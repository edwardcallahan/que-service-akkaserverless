// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api

/** Message that represents an arbitrary HTTP body. It should only be used for
  * payload formats that can't be represented as JSON, such as raw binary or
  * an HTML page.
  *
  *
  * This message can be used both in streaming and non-streaming API methods in
  * the request as well as the response.
  *
  * It can be used as a top-level request field, which is convenient if one
  * wants to extract parameters from either the URL or HTTP template into the
  * request fields and also want access to the raw HTTP body.
  *
  * Example:
  *
  *     message GetResourceRequest {
  *       // A unique request id.
  *       string request_id = 1;
  *
  *       // The raw HTTP body is bound to this field.
  *       google.api.HttpBody http_body = 2;
  *     }
  *
  *     service ResourceService {
  *       rpc GetResource(GetResourceRequest) returns (google.api.HttpBody);
  *       rpc UpdateResource(google.api.HttpBody) returns
  *       (google.protobuf.Empty);
  *     }
  *
  * Example with streaming methods:
  *
  *     service CaldavService {
  *       rpc GetCalendar(stream google.api.HttpBody)
  *         returns (stream google.api.HttpBody);
  *       rpc UpdateCalendar(stream google.api.HttpBody)
  *         returns (stream google.api.HttpBody);
  *     }
  *
  * Use of this type only changes how the request and response bodies are
  * handled, all other features will continue to work unchanged.
  *
  * @param contentType
  *   The HTTP Content-Type header value specifying the content type of the body.
  * @param data
  *   The HTTP request/response body as raw binary.
  * @param extensions
  *   Application specific response metadata. Must be set in the first response
  *   for streaming APIs.
  */
@SerialVersionUID(0L)
final case class HttpBody(
    contentType: _root_.scala.Predef.String = "",
    data: _root_.com.google.protobuf.ByteString = _root_.com.google.protobuf.ByteString.EMPTY,
    extensions: _root_.scala.Seq[com.google.protobuf.any.Any] = _root_.scala.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[HttpBody] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = contentType
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = data
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBytesSize(2, __value)
        }
      };
      extensions.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
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
        val __v = contentType
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = data
        if (!__v.isEmpty) {
          _output__.writeBytes(2, __v)
        }
      };
      extensions.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def withContentType(__v: _root_.scala.Predef.String): HttpBody = copy(contentType = __v)
    def withData(__v: _root_.com.google.protobuf.ByteString): HttpBody = copy(data = __v)
    def clearExtensions = copy(extensions = _root_.scala.Seq.empty)
    def addExtensions(__vs: com.google.protobuf.any.Any *): HttpBody = addAllExtensions(__vs)
    def addAllExtensions(__vs: Iterable[com.google.protobuf.any.Any]): HttpBody = copy(extensions = extensions ++ __vs)
    def withExtensions(__v: _root_.scala.Seq[com.google.protobuf.any.Any]): HttpBody = copy(extensions = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = contentType
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = data
          if (__t != _root_.com.google.protobuf.ByteString.EMPTY) __t else null
        }
        case 3 => extensions
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(contentType)
        case 2 => _root_.scalapb.descriptors.PByteString(data)
        case 3 => _root_.scalapb.descriptors.PRepeated(extensions.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: com.google.api.HttpBody.type = com.google.api.HttpBody
    // @@protoc_insertion_point(GeneratedMessage[google.api.HttpBody])
}

object HttpBody extends scalapb.GeneratedMessageCompanion[com.google.api.HttpBody] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.api.HttpBody] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.api.HttpBody = {
    var __contentType: _root_.scala.Predef.String = ""
    var __data: _root_.com.google.protobuf.ByteString = _root_.com.google.protobuf.ByteString.EMPTY
    val __extensions: _root_.scala.collection.immutable.VectorBuilder[com.google.protobuf.any.Any] = new _root_.scala.collection.immutable.VectorBuilder[com.google.protobuf.any.Any]
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __contentType = _input__.readStringRequireUtf8()
        case 18 =>
          __data = _input__.readBytes()
        case 26 =>
          __extensions += _root_.scalapb.LiteParser.readMessage[com.google.protobuf.any.Any](_input__)
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    com.google.api.HttpBody(
        contentType = __contentType,
        data = __data,
        extensions = __extensions.result(),
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.api.HttpBody] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.api.HttpBody(
        contentType = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        data = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.com.google.protobuf.ByteString]).getOrElse(_root_.com.google.protobuf.ByteString.EMPTY),
        extensions = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Seq[com.google.protobuf.any.Any]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = HttpbodyProto.javaDescriptor.getMessageTypes().get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = HttpbodyProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 3 => __out = com.google.protobuf.any.Any
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.api.HttpBody(
    contentType = "",
    data = _root_.com.google.protobuf.ByteString.EMPTY,
    extensions = _root_.scala.Seq.empty
  )
  implicit class HttpBodyLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.HttpBody]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.api.HttpBody](_l) {
    def contentType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.contentType)((c_, f_) => c_.copy(contentType = f_))
    def data: _root_.scalapb.lenses.Lens[UpperPB, _root_.com.google.protobuf.ByteString] = field(_.data)((c_, f_) => c_.copy(data = f_))
    def extensions: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.protobuf.any.Any]] = field(_.extensions)((c_, f_) => c_.copy(extensions = f_))
  }
  final val CONTENT_TYPE_FIELD_NUMBER = 1
  final val DATA_FIELD_NUMBER = 2
  final val EXTENSIONS_FIELD_NUMBER = 3
  def of(
    contentType: _root_.scala.Predef.String,
    data: _root_.com.google.protobuf.ByteString,
    extensions: _root_.scala.Seq[com.google.protobuf.any.Any]
  ): _root_.com.google.api.HttpBody = _root_.com.google.api.HttpBody(
    contentType,
    data,
    extensions
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[google.api.HttpBody])
}
