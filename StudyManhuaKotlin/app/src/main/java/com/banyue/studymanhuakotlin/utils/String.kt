package com.banyue.studymanhuakotlin.utils

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.banyue.studymanhuakotlin.app.App

/**
 * Created by Administrator on 2017/7/31.
 */
fun String.toast() {
    Log.e("shen","sContent="+App.sApplication)
    Toast.makeText(App.sContent, this, Toast.LENGTH_SHORT).show()
}

fun String.toast(context: Context) {
    Toast.makeText(context, this, Toast.LENGTH_SHORT).show()
}