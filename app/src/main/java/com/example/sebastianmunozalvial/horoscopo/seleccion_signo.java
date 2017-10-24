package com.example.sebastianmunozalvial.horoscopo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class seleccion_signo extends AppCompatActivity {
    Button btnAcuario;
    Button btnAries;
    Button btnCancer;
    Button btnCapricornio;
    Button btnEscorpio;
    Button btnGeminis;
    Button btnLeo;
    Button btnLibra;
    Button btnPiscis;
    Button btnSagitario;
    Button btnTauro;
    Button btnVirgo;

    TextView lblNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        btnAcuario = (Button)findViewById(R.id.btnAcuario);
        btnAries = (Button)findViewById(R.id.btnAries);
        btnCancer = (Button)findViewById(R.id.btnCancer);
        btnCapricornio = (Button)findViewById(R.id.btnCapricornio);
        btnEscorpio = (Button)findViewById(R.id.btnEscorpio);
        btnGeminis = (Button)findViewById(R.id.btnGeminis);
        btnLeo = (Button)findViewById(R.id.btnLeo);
        btnLibra = (Button)findViewById(R.id.btnLibra);
        btnPiscis = (Button)findViewById(R.id.btnPiscis);
        btnSagitario = (Button)findViewById(R.id.btnSagitario);
        btnTauro = (Button)findViewById(R.id.btnTauro);
        btnVirgo = (Button)findViewById(R.id.btnVirgo);

        lblNombre=(TextView)findViewById(R.id.lblNombreUsuario);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_zodiaco);

        usuario Nombre=getIntent().getParcelableExtra("Nombre");
        lblNombre.setText(Nombre.getNombre().toString());

        btnAcuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(seleccion_signo.this,mostrar_acuario.class);
                startActivity(i);


            }
        });

        btnAries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(seleccion_signo.this,mostrar_aries.class);
                startActivity(i);

            }
        });


        btnCancer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(seleccion_signo.this,mostrar_cancer.class);
                startActivity(i);


            }
        });


        btnCapricornio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(seleccion_signo.this,mostrar_capricornio.class);
                startActivity(i);


            }
        });


        btnEscorpio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(seleccion_signo.this,mostrar_escorpio.class);
                startActivity(i);


            }
        });


        btnGeminis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(seleccion_signo.this,mostrar_geminis.class);
                startActivity(i);


            }
        });


        btnLeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(seleccion_signo.this,mostrar_leo.class);
                startActivity(i);


            }
        });


        btnLibra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(seleccion_signo.this,mostrar_libra.class);
                startActivity(i);


            }
        });


        btnPiscis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(seleccion_signo.this,mostrar_piscis.class);
                startActivity(i);


            }
        });


        btnSagitario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(seleccion_signo.this,mostrar_sagitario.class);
                startActivity(i);


            }
        });


        btnTauro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(seleccion_signo.this,mostrar_tauro.class);
                startActivity(i);


            }
        });

        btnVirgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(seleccion_signo.this,mostrar_virg.class);
                startActivity(i);



            }
        });


    }


}
