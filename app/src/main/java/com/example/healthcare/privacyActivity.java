package com.example.healthcare;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class privacyActivity extends AppCompatActivity {
public WebView webView;
public String fileName="privacy.html";

    public privacyActivity(WebView webView) {
        this.webView = webView;
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy);
        //webView=findViewById(R.id.privacyid);
//        webView.getSettings().setJavaScriptEnabled(true);
//        webView.loadUrl("file:///android_assets/" + fileName);
    }
}