package com.elbourn.android.fractal.webview

import android.app.Activity
import android.util.Log
import android.webkit.ConsoleMessage
import android.webkit.WebChromeClient


class MyWebChromeClient(activity: Activity) : WebChromeClient() {
    var TAG = javaClass.simpleName
    var activity: Activity

    init {
        Log.i(TAG, "start MyWebChromeClient")
        this.activity = activity
    }

    override fun onConsoleMessage(consoleMessage: ConsoleMessage): Boolean {
        Log.i(TAG, "WebView: " + consoleMessage.message())
        return true
    }
}