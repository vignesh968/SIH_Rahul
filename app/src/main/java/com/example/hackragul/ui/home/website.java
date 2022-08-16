package com.example.hackragul.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.hackragul.R;

public class website extends AppCompatActivity {

    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);
        web=findViewById(R.id.webView);
        WebSettings webSettings =web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        web.setWebViewClient(new website.callback());
        web.loadUrl("https://nmba.dosje.gov.in/");

    }

    class callback extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            return false;
        }

    }
}