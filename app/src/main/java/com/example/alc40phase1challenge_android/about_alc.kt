package com.example.alc40phase1challenge_android
import android.net.http.SslError;
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.SslErrorHandler;
import kotlinx.android.synthetic.main.activity_about_alc.*
import android.webkit.WebView
import android.webkit.WebViewClient


// A new webclient that ignore ssl errors
  private class IgnoreSslErrorWebViewClient : WebViewClient() {


    override fun onReceivedSslError(view: WebView, handler: SslErrorHandler, error: SslError) {
        handler.proceed() // When an error occurs, ignore
    }
}


class AboutAlc : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_alc)
        wvAbout_alc.getSettings().setJavaScriptEnabled(true);
        wvAbout_alc.setWebViewClient(IgnoreSslErrorWebViewClient())
        wvAbout_alc.getSettings().setBuiltInZoomControls(true);
        wvAbout_alc.getSettings().setLoadWithOverviewMode(true);
        wvAbout_alc.getSettings().setUseWideViewPort(true);
        wvAbout_alc.loadUrl("https://andela.com/alc/")

    }
}
