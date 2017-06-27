package com.milo.miloreader.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.milo.miloreader.R

class MainActivity : AppCompatActivity() {

    private val RC_BARCODE_CAPTURE = 9001
    private var statusMessage: TextView? = null
    private var barcodeValue: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = moveToBarcodeCaptureAcitivity()
        startActivity(intent)
    }

    private fun moveToBarcodeCaptureAcitivity(): Intent {
        val intent = Intent(this, BarcodeCaptureActivity::class.java)
        intent.putExtra(BarcodeCaptureActivity.AutoFocus, true)
        intent.putExtra(BarcodeCaptureActivity.UseFlash, false)
        return intent
    }

}
