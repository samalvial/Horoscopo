package com.example.sebastianmunozalvial.horoscopo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class mostrar_acuario extends AppCompatActivity {

    TextView txtAcuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_acuario);

        txtAcuario=(TextView)findViewById(R.id.txt);
        txtAcuario.setText(R.string.txtcapricornio);
    }
}
