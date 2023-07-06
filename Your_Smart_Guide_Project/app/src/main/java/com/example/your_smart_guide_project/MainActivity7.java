package com.example.your_smart_guide_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity7 extends AppCompatActivity {
 WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);


        web=findViewById(R.id.webview);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("https://science.asu.edu.eg/ar/news");

    }
}