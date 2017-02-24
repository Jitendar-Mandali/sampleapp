package com.example.vinaykumarg.sampleapp;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("oncreate","called");
        Button btnA = (Button) findViewById(R.id.button1);
        Button btnB = (Button) findViewById(R.id.button2);
        btnA.setOnClickListener(this);
        btnB.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStart","called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume","called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause","called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("onStop","called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy","called");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                Fragment fragment1 = new FragmentA();
                FragmentManager fm1= getFragmentManager();
                FragmentTransaction fragmentTransaction1 = fm1.beginTransaction();
                fragmentTransaction1.replace(R.id.fragment, fragment1);
                fragmentTransaction1.commit();

                break;
            case R.id.button2:
                Fragment fragment2 = new FragmentB();
                FragmentManager fm2= getFragmentManager();
                FragmentTransaction fragmentTransaction2 = fm2.beginTransaction();
                fragmentTransaction2.replace(R.id.fragment, fragment2);
                fragmentTransaction2.commit();
                break;
        }

    }
}
