package com.example.project

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.LinearLayout
import androidx.annotation.RequiresApi
import java.sql.Connection

class MainActivity : AppCompatActivity() {
    var myUrl = "https://www.pinterest.com/"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setWebView()
    }

        @SuppressLint("SetJavaScriptEnabled")
        private fun setWebView() {
            val wb_webView = findViewById<WebView>(R.id.wb_webview)
            wb_webView?.apply {
                settings.javaScriptEnabled = true
                webViewClient = WebViewClient()
                loadUrl(myUrl)

            }
        }
    }