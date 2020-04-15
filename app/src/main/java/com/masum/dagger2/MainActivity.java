package com.masum.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    @Inject
    NetworkAPi networkAPi;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boolean isInjected = networkAPi == null ? false : true;


        Toast.makeText(getApplicationContext(), "injection worked " + isInjected, Toast.LENGTH_LONG).show();

    }


}
