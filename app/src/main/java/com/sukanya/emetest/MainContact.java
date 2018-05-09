package com.sukanya.emetest;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.Manifest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainContact extends AppCompatActivity {

    Button btnCall;
    String sNum;
    EditText textView;

    // WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_contact);

        btnCall = (Button) findViewById(R.id.idbtnCall);
        textView = (EditText) findViewById(R.id.numTxt);
    }

    public void btnCall(View v) {
        Intent i = new Intent(Intent.ACTION_CALL);
        sNum = textView.getText().toString();
        if (sNum.trim().isEmpty()) {
            i.setData(Uri.parse("tel:01724183134"));
        } else {
            i.setData(Uri.parse("tel:" + sNum));
        }

        startActivity(i);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(this, "Permission", Toast.LENGTH_SHORT).show();
            requestPermission();
        }
    }

    private void requestPermission() {
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 1);


        //        webView=findViewById(R.id.webView);
//        webView.setWebViewClient(new WebViewClient());
//        WebSettings webSettings=webView.getSettings();
//        webSettings.setJavaScriptEnabled(true);=
//
//        webView.loadUrl("  http://www.emetechnologies.com/#contact");
//    }
//    @Override
//    public void onBackPressed() {
//        if (webView.canGoBack()) {
//            webView.goBack();
//        } else {
//            super.onBackPressed();
//        }


    }
}
