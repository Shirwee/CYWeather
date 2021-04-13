package com.cyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context


/**
 * 描述：todo
 * @author Admin
 */
class CYWeatherApplication : Application() {

    companion object{
        const val TOKEN = "TJlTGk7iaOGM8ouq" // 彩云申请的令牌值
        @SuppressLint("staticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}