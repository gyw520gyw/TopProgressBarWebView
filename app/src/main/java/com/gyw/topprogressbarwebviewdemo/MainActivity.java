package com.gyw.topprogressbarwebviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        String url = "https://www.baidu.com/";
        String url2 = "http://blog.csdn.net/gyw520gyw";


        ProgressWebView mWebView = new ProgressWebView(this);
        mWebView.loadUrl(url);

        setContentView(mWebView);

    }
}
