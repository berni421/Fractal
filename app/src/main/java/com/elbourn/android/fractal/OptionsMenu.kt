package com.elbourn.android.fractal

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.elbourn.android.fractal.webview.Webview
import com.elbourn.android.fractal.fragments.IntroFragment
import com.elbourn.android.fractal.fragments.WebviewFragment

open class OptionsMenu : AppCompatActivity() {
    val TAG:String = javaClass.simpleName

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_options, menu)
        val context: Context = applicationContext
        val introCheckBox = menu.findItem(R.id.menuIntroOff)
        introCheckBox.isChecked = IntroFragment.getIntroCheckBox(context)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.menuBarnsleyFern -> {
                MainActivity.fractalChoice = MainActivity.BF;
                if (null != WebviewFragment.wv) WebviewFragment.wv!!.reload()
                true
            }
            R.id.menuMandelbrotSet -> {
                MainActivity.fractalChoice = MainActivity.MANDELBROTSET;
                if (null != WebviewFragment.wv) WebviewFragment.wv!!.reload()
                true
            }
            R.id.menuJuliaSet -> {
                MainActivity.fractalChoice = MainActivity.JULIASET;
                if (null != WebviewFragment.wv) WebviewFragment.wv!!.reload()
                true
            }
            R.id.menuIntroOff -> {
                setIntroductionOff(item)
                true
            }
            R.id.menuDonate -> {
                startDonationWebsite()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun startOver() {
    }

    fun setIntroductionOff(item: MenuItem) {
        val context: Context = getApplicationContext()
        val subscriptionsIntroOff = !item.isChecked
        item.isChecked = subscriptionsIntroOff
        IntroFragment.setIntroCheckBox(context, subscriptionsIntroOff)
        Log.i(TAG, "subscriptionsIntroOff: $subscriptionsIntroOff")
    }

    fun startDonationWebsite() {
        Log.i(TAG, "start startDonationWebsite")
        val context: Context = getApplicationContext()
        runOnUiThread(Runnable {
            val msg = "Starting browser to feed the cat ..."
            Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
        })
        val url = "https://www.elbourn.com/feed-the-cat/"
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(browserIntent)
        Log.i(TAG, "end startDonationWebsite")
    }
}