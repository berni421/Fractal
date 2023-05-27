package com.elbourn.android.fractal.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.elbourn.android.fractal.R
import com.elbourn.android.fractal.webview.Webview


class WebviewFragment : Fragment() {

    val TAG:String = javaClass.simpleName

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_webview, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i(TAG, "start onViewCreated")
        wv = Webview(
            activity,
            context,
            view.findViewById(R.id.webview)
        )
        Log.i(TAG, "end onViewCreated")
    }

    companion object {
        var wv: Webview? = null;
    }
}