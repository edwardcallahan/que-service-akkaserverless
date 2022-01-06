package com.calncalncal.domain

import com.akkaserverless.scalasdk.testkit.ValueEntityResult
import com.akkaserverless.scalasdk.valueentity.ValueEntity
import com.calncalncal
import com.google.protobuf.empty.Empty
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CounterSpec
    extends AnyWordSpec
    with Matchers {

  "Counter" must {

    "have example test that can be removed" in {
      val testKit = CounterTestKit(new Counter(_))
      // use the testkit to execute a command
      // and verify final updated state:
      // val result = testKit.someOperation(SomeRequest)
      // verify the response
      // val actualResponse = result.getReply()
      // actualResponse shouldBe expectedResponse
      // verify the final state after the command
      // testKit.currentState() shouldBe expectedState
    }

    "handle command Increase" in {
      val testKit = CounterTestKit(new Counter(_))
      // val result = testKit.increase(calncalncal.IncreaseValue(...))
    }

    "handle command Decrease" in {
      val testKit = CounterTestKit(new Counter(_))
      // val result = testKit.decrease(calncalncal.DecreaseValue(...))
    }

    "handle command Reset" in {
      val testKit = CounterTestKit(new Counter(_))
      // val result = testKit.reset(calncalncal.ResetValue(...))
    }

    "handle command GetCurrentCounter" in {
      val testKit = CounterTestKit(new Counter(_))
      // val result = testKit.getCurrentCounter(calncalncal.GetCounter(...))
    }

  }
}
