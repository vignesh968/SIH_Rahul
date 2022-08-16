package com.example.hackragul.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.hackragul.R;

public class agum extends AppCompatActivity {


    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agum);
        web=findViewById(R.id.webView);
        WebSettings webSettings =web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        web.setWebViewClient(new agum.callback());
        web.loadUrl("https://sihack1.glitch.me/");

    }

    private class callback extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            return false;
        }



    }
}