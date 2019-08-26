package com.rance.chatui.ui.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.rance.chatui.R;

public class LoadingActivity extends AppCompatActivity {

    @SuppressLint("HandlerLeak")
    private Handler mHandler = new Handler() {

        @Override

        public void handleMessage(Message msg) {

            if(msg.what == 100){

                int progress = (Integer) msg.obj;

                mProgressBar.setProgress(progress);

                if (progress==100){
                    Intent intent = new Intent(LoadingActivity.this, IMActivity.class);
                    startActivity(intent);

                    finish();
                }

            }

        }

    };

    ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        mProgressBar = (ProgressBar) findViewById(R.id.progressBar);

        new Thread() {

            public void run() {

                while (mProgressBar.getProgress() < mProgressBar.getMax()) {

                    int current = mProgressBar.getProgress();

                    current += 10;


                    Message msg = new Message();

                    msg.what = 100;

                    msg.obj = current;

                    mHandler.sendMessage(msg);

                    try {

                        Thread.sleep(300);

                    } catch (InterruptedException e) {



                        e.printStackTrace();

                    }

                }

            }

        }.start();
    }



}
