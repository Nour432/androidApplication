package com.example.your_smart_guide_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity14 extends AppCompatActivity {
    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        web=findViewById(R.id.webview);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("https://science.asu.edu.eg/ar/announcements");
    }
}