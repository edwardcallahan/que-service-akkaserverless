package com.calncalncal

import com.akkaserverless.scalasdk.Context
import com.akkaserverless.scalasdk.DeferredCall
import com.akkaserverless.scalasdk.Metadata
import com.akkaserverless.scalasdk.impl.InternalContext
import com.akkaserverless.scalasdk.impl.ScalaDeferredCallAdapter


// This code is managed by Akka Serverless tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

/**
 * Not intended for direct instantiation, called by generated code, use Action.components() to access
 */
final class ComponentsImpl(context: InternalContext) extends Components {

  def this(context: Context) =
    this(context.asInstanceOf[InternalContext])

  private def getGrpcClient[T](serviceClass: Class[T]): T =
    context.getComponentGrpcClient(serviceClass)

 @Override
 override def counter: Components.CounterCalls =
   new CounterCallsImpl();


 private final class CounterCallsImpl extends Components.CounterCalls {
   override def increase(command: _root_.com.calncalncal.IncreaseValue): DeferredCall[_root_.com.calncalncal.IncreaseValue, _root_.com.google.protobuf.empty.Empty] =
     ScalaDeferredCallAdapter(
       command,
       Metadata.empty,
       "com.calncalncal.CounterService",
       "Increase",
       () => getGrpcClient(classOf[_root_.com.calncalncal.CounterService]).increase(command)
     )
   override def decrease(command: _root_.com.calncalncal.DecreaseValue): DeferredCall[_root_.com.calncalncal.DecreaseValue, _root_.com.google.protobuf.empty.Empty] =
     ScalaDeferredCallAdapter(
       command,
       Metadata.empty,
       "com.calncalncal.CounterService",
       "Decrease",
       () => getGrpcClient(classOf[_root_.com.calncalncal.CounterService]).decrease(command)
     )
   override def reset(command: _root_.com.calncalncal.ResetValue): DeferredCall[_root_.com.calncalncal.ResetValue, _root_.com.google.protobuf.empty.Empty] =
     ScalaDeferredCallAdapter(
       command,
       Metadata.empty,
       "com.calncalncal.CounterService",
       "Reset",
       () => getGrpcClient(classOf[_root_.com.calncalncal.CounterService]).reset(command)
     )
   override def getCurrentCounter(command: _root_.com.calncalncal.GetCounter): DeferredCall[_root_.com.calncalncal.GetCounter, _root_.com.calncalncal.CurrentCounter] =
     ScalaDeferredCallAdapter(
       command,
       Metadata.empty,
       "com.calncalncal.CounterService",
       "GetCurrentCounter",
       () => getGrpcClient(classOf[_root_.com.calncalncal.CounterService]).getCurrentCounter(command)
     )
 }

}
