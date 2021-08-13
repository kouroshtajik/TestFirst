package com.example.testfirst;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class HtmlTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html_test);

        TextView txtHtml = findViewById(R.id.txtHtml);
        WebView webView = findViewById(R.id.webView);

        txtHtml.setText(HtmlCompat.fromHtml("<html><body><h1>My First Heading</h1><p>My first paragraph.</p></body></html>", HtmlCompat.FROM_HTML_MODE_COMPACT));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com/maps");
    }

}