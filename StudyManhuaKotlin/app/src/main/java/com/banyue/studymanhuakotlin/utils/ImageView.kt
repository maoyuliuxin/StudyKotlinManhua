package com.banyue.studymanhuakotlin.utils

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 * Created by Administrator on 2017/7/31.
 */
fun ImageView.setContent(url: String, context: Context) {
    Glide.with(context)
            .load(url)
            .into(this)
}