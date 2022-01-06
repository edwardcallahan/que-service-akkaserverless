package com.calncalncal.domain

import com.akkaserverless.scalasdk.valueentity.ValueEntity
import com.calncalncal
import com.google.protobuf.empty.Empty

// This code is managed by Akka Serverless tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

/** A value entity. */
abstract class AbstractCounter extends ValueEntity[CounterState] {

  def components: calncalncal.Components =
    new calncalncal.ComponentsImpl(commandContext())

  /** Command handler for "Increase". */
  def increase(currentState: CounterState, increaseValue: calncalncal.IncreaseValue): ValueEntity.Effect[Empty]

  /** Command handler for "Decrease". */
  def decrease(currentState: CounterState, decreaseValue: calncalncal.DecreaseValue): ValueEntity.Effect[Empty]

  /** Command handler for "Reset". */
  def reset(currentState: CounterState, resetValue: calncalncal.ResetValue): ValueEntity.Effect[Empty]

  /** Command handler for "GetCurrentCounter". */
  def getCurrentCounter(currentState: CounterState, getCounter: calncalncal.GetCounter): ValueEntity.Effect[calncalncal.CurrentCounter]

}

