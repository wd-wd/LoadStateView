package com.lanxiang.loadstateview;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private LoadStateLayout mLoadState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLoadState = (LoadStateLayout) findViewById(R.id.loadState);
        mLoadState.setLoadingView(R.layout.loading_state);
        mLoadState.setEmptyView(R.layout.empty_state);
        mLoadState.setErrorView(R.layout.error_state);
        mLoadState.setState(LoadStateLayout.STATE_LOADING);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mLoadState.setState(LoadStateLayout.STATE_ERROR);
            }
        },2000);
    }
}
