package com.androidtutz.anushka.didemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

     @Inject              //this is field injection, it tell dagger to created depencdency smarphone and assign it to smartphone variable
     SmartPhone smartPhone;

    //if requried Battery object ie dependency

    @Inject
    Battery battery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        App.getMySmartPhoneComponent().inject(this);



       smartPhone.makeACall();


        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);

            }
        });





    }
}
