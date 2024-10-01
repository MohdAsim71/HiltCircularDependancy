package com.example.hiltcirculardependancy

// ClassA.kt

import android.util.Log
import dagger.Lazy
import javax.inject.Inject
import javax.inject.Provider

class ClassA @Inject constructor(
    private val classBProvider: Lazy<ClassB> // Using Provider to resolve circular dependency
) {
    fun doSomethingInA() {
        Log.e("doSomethingInA","ClassC is doing something.")
        classBProvider.get().doSomethingInB() // Accessing ClassB lazily
    }
}
