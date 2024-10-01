package com.example.hiltcirculardependancy

// ClassB.kt

import android.util.Log
import javax.inject.Inject
import javax.inject.Provider
import dagger.Lazy


class ClassB @Inject constructor(
    private val classCProvider: Lazy<ClassC> // Using Provider to resolve circular dependency
) {
    fun doSomethingInB() {
        Log.e("doSomethingInA","ClassC is doing something.")
        classCProvider.get().doSomethingInC() // Accessing ClassA lazily
    }
}
