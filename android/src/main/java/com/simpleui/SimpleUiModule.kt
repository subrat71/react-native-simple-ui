package com.simpleui

import com.facebook.react.bridge.ReactApplicationContext

class SimpleUiModule(reactContext: ReactApplicationContext) :
  NativeSimpleUiSpec(reactContext) {

  override fun multiply(a: Double, b: Double): Double {
    return a * b
  }

  companion object {
    const val NAME = NativeSimpleUiSpec.NAME
  }
}
