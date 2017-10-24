package com.example.sebastianmunozalvial.horoscopo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class mostrar_capricornio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView txtCapricornio;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_capricornio);

        txtCapricornio=(TextView)findViewById(R.id.txtCapricornio);
        txtCapricornio.setText(R.string.txtcapricornio);
    }
}
