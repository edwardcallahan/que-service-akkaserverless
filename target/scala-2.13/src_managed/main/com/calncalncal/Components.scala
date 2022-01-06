package com.calncalncal

import com.akkaserverless.scalasdk.DeferredCall


// This code is managed by Akka Serverless tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

/**
 * Not intended for user extension, provided through generated implementation
 */
trait Components {
 import Components._

 def counter: CounterCalls

}

object Components{

 trait CounterCalls {
   def increase(command: _root_.com.calncalncal.IncreaseValue): DeferredCall[_root_.com.calncalncal.IncreaseValue, _root_.com.google.protobuf.empty.Empty]

   def decrease(command: _root_.com.calncalncal.DecreaseValue): DeferredCall[_root_.com.calncalncal.DecreaseValue, _root_.com.google.protobuf.empty.Empty]

   def reset(command: _root_.com.calncalncal.ResetValue): DeferredCall[_root_.com.calncalncal.ResetValue, _root_.com.google.protobuf.empty.Empty]

   def getCurrentCounter(command: _root_.com.calncalncal.GetCounter): DeferredCall[_root_.com.calncalncal.GetCounter, _root_.com.calncalncal.CurrentCounter]

 }

}
