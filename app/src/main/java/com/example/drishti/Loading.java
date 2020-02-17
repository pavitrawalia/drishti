package com.example.drishti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class Loading extends AppCompatActivity {
    ProgressBar progressBar;
    int progress=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_loading);

        progressBar=(ProgressBar)findViewById(R.id.loading);
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                loadApp();
            }
        });
        thread.start();

    }
    public void loadApp(){
        for(progress=10;progress<=100;progress+=10){
            try {
                Thread.sleep(100);
                progressBar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(progress==100){
                Intent start=new Intent(Loading.this, MainActivity.class);
                startActivity(start);
                finish();
            }
        }
    }
}
