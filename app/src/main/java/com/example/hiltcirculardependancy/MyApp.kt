package com.example.hiltcirculardependancy

// MyApp.kt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApp : Application()
