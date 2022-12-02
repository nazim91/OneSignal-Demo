package com.arox.onesignal

import android.app.Application
import com.onesignal.OneSignal

class App : Application() {

    companion object {
        const val ONESIGNAL_APP_ID = "60ebd3fb-905a-434a-ac27-e4e9b3825118"
    }

    override fun onCreate() {
        super.onCreate()

        // Logging set to help debug issues, remove before releasing your app.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)

        // OneSignal Initialization
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
    }
}