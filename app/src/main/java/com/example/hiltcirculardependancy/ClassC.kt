package com.example.hiltcirculardependancy

import android.util.Log
import javax.inject.Inject
import dagger.Lazy


class ClassC @Inject constructor(
    private val classA: Lazy<ClassA>
) {
    fun doSomethingInC() {
        Log.e("doSomethingInA","ClassC is doing something.")
        classA.get().doSomethingInA()
    }
}