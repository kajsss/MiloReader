package com.milo.miloreader.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebViewClient
import com.google.android.gms.vision.barcode.Barcode
import com.milo.miloreader.R
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val receiveIntent = getIntent()
        val receiveBarcode: Barcode = receiveIntent.getParcelableExtra<Barcode>(BarcodeCaptureActivity.BarcodeObject)

        val url = receiveBarcode.rawValue;

        webView.settings.javaScriptEnabled = true
        webView.loadUrl(url)
        webView.setWebViewClient(WebViewClient())

    }

}
