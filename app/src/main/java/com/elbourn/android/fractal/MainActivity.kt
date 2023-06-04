package com.elbourn.android.fractal

import android.os.Bundle
import android.util.Log
import android.window.OnBackInvokedDispatcher

import com.elbourn.android.fractal.fragments.IntroFragment




class MainActivity : OptionsMenu() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
//        super.onBackPressed()
        Log.i(TAG, "start onBackPressed")
        finishAffinity()
        Log.i(TAG, "end onBackPressed")
    }

//    override fun onResumeFragments() {
//        super.onResumeFragments()
//        if (sketchVisible) sketch.onResume()
//    }

    companion object {
        const val BF = "file:///android_asset/website_barnsley-fern-camera/index.html"
        const val MANDELBROTSET = "file:///android_asset/website_mandelbrot-set-camera/index.html"
        const val JULIASET = "file:///android_asset/website_julia-set-camera/index.html"
        var fractalChoice = JULIASET
    }
}