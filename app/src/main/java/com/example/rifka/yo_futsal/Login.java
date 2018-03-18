package com.example.rifka.yo_futsal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mikepenz.iconics.context.IconicsLayoutInflater2;

/**
 * Created by Rifka on 28/01/2018.
 */

public class Login extends AppCompatActivity implements View.OnClickListener{

    TextView signup;
    Button blogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LayoutInflaterCompat.setFactory2(getLayoutInflater(), new IconicsLayoutInflater2(getDelegate()));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signup = (TextView)findViewById(R.id.tv_signup);
        blogin = (Button)findViewById(R.id.btn_login);

        signup.setOnClickListener(this);
        blogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.tv_signup :
                i = new Intent(Login.this, Signup.class);
                startActivity(i);
                break;
            case R.id.btn_login :
                i = new Intent(Login.this, Home.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }
}
