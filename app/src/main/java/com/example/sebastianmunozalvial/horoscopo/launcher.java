package com.example.sebastianmunozalvial.horoscopo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class launcher extends AppCompatActivity {

    Button btnLogin;
    Button btnRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        btnLogin =(Button)findViewById(R.id.btnLogin);
        btnRegistro = (Button)findViewById(R.id.btnRegistrar);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(launcher.this,login.class);
                startActivity(i);

            }
        });

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(launcher.this,registro.class);
                startActivity(i);

            }
        });

    }
}
