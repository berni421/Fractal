package com.elbourn.android.fractal.webview

import android.content.Context
import android.util.Log
import android.webkit.WebViewClient

class MyWebViewClient(context: Context) : WebViewClient() {
    var TAG = javaClass.simpleName
    var context: Context

    init {
        Log.i(TAG, "start MyWebViewClient")
        this.context = context
    }
}