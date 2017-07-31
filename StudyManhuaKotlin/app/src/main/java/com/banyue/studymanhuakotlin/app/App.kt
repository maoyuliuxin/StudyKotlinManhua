package com.banyue.studymanhuakotlin.app

import android.app.Application

/**
 * Created by Administrator on 2017/7/31.
 */
class App : Application() {

    companion object {
        lateinit var sContent: App
        lateinit var sApplication: App
    }

    override fun onCreate() {
        super.onCreate()
        sContent = this
        sApplication = this
    }
}