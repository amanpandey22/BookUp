package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseLoginRegistration extends AppCompatActivity {
    private Button mLogin, mRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_login_registration);

        mLogin=(Button) findViewById(R.id.login);
        mRegister=(Button) findViewById(R.id.register);

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(ChooseLoginRegistration.this,Login.class);
                startActivity(intent);
                finish();
                return;

            }
        });

        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(ChooseLoginRegistration.this,Registration.class);
                startActivity(intent);
                finish();
                return;

            }
        });



    }
}
