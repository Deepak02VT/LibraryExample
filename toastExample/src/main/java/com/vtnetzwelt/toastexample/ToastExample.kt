package com.vtnetzwelt.toastexample

import android.content.Context
import android.widget.Toast
class ToastExample {
    fun show(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}