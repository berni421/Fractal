package com.elbourn.android.fractal.webview

import android.content.Context
import android.util.Log
import android.webkit.WebView
import androidx.fragment.app.FragmentActivity
import com.elbourn.android.fractal.MainActivity

class Webview(
    activity: FragmentActivity?,
    context: Context?,
    webview: WebView?
) {
    var TAG = javaClass.simpleName
    var wv = webview

    init {
        Log.i(TAG, "start setupWebView")

        // Intercept web requests
        wv!!.setWebChromeClient(MyWebChromeClient(activity!!));
        wv!!.setWebViewClient(MyWebViewClient(context!!));
//
//        // For the web site
//        webview.getSettings().setAllowFileAccess(true);
//        webview.getSettings().setAllowFileAccessFromFileURLs(true);
//        webview.getSettings().setAllowUniversalAccessFromFileURLs(true);
//
//        // for camera
//        webview.getSettings().setAllowContentAccess(true);
//
//        // for audio
//        webview.getSettings().setMediaPlaybackRequiresUserGesture(false);
//
//        //for html5 app
//        webview.getSettings().setDomStorageEnabled(true);
//        webview.getSettings().setDatabaseEnabled(true);
//        webview.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
//
//        // for layout
//        webview.getSettings().setLoadWithOverviewMode(true);
//        webview.getSettings().setUseWideViewPort(true);
//        webview.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
//
//        // Zoom
//        webview.getSettings().setSupportZoom(true);
//        webview.getSettings().setBuiltInZoomControls(true);
//        webview.getSettings().setDisplayZoomControls(false);
//
//        // Javascript
        wv!!.getSettings().setJavaScriptEnabled(true);
//        webview.getSettings().setSaveFormData(true);
//        webview.getSettings().setLoadsImagesAutomatically(true);
//        webview.getSettings().setBlockNetworkImage(false);
//        webview.getSettings().setBlockNetworkLoads(false);
//        webview.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
//        webview.getSettings().setNeedInitialFocus(false);
//        webview.getSettings().setGeolocationEnabled(true);
//
//        // Scrollbar
//        webview.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
//        webview.setScrollbarFadingEnabled(true);
//
        wv!!.loadUrl(MainActivity.fractalChoice)

//        webview.getSettings().setUserAgentString(UA);
        Log.i(TAG, "end setupWebView")
    }

    fun reload() {
        wv!!.loadUrl(MainActivity.fractalChoice)
    }

}