package com.example.viewpager_navigationfragment_tablayout

import android.app.Application
import android.content.Context

class AppRoot : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
        context = applicationContext
    }

    companion object {
        lateinit var instance: AppRoot
        private lateinit var context: Context
    }

    fun getContext() = context
}