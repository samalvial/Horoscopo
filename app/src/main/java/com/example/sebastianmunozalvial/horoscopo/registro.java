package com.example.sebastianmunozalvial.horoscopo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class registro extends AppCompatActivity {

    EditText txtNombre;
    EditText txtPass;
    EditText txtEmail;
    Button btnRegistro;
    ArrayList<usuario> usuarios= new ArrayList<usuario>();
    usuario c = new usuario();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        //usuario1
        c.setNombre("Sebastian Muñoz");
        c.setPass("sebita");
        //usuario2
        c.setNombre("Juan Perez");
        c.setPass("juanito");
        //usuario3
        c.setNombre("Pedro Alvial");
        c.setPass("pedrito");
        //usuario4
        c.setNombre("Yolanda Combo");
        c.setPass("yolandita");
        //usuario5
        c.setNombre("Jorge Saavedra");
        c.setPass("jorgito");

        usuarios.add(c);


        txtNombre=(EditText)findViewById(R.id.txtRegistroNombre);
        txtPass=(EditText)findViewById(R.id.txtRegistroPass);
        txtEmail=(EditText)findViewById(R.id.txtRegistroEmail);
        btnRegistro=(Button)findViewById(R.id.btnRegistrarU);

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Registrar();
                Toast.makeText(getApplicationContext(),"Registrado con éxito",Toast.LENGTH_SHORT).show();

                Intent i = new Intent(registro.this,seleccion_signo.class);
                i.putExtra("Nombre",usuarios);
                startActivity(i);

            }
        });
    }


    public void Registrar(){

        if (txtNombre != null){
            usuario c = new usuario(txtNombre.getText().toString(),
                    txtPass.getText().toString(),txtEmail.getText().toString());
            usuarios.add(c);

        }else{

            Toast.makeText(getApplicationContext(),"Hay campos vacios",Toast.LENGTH_SHORT).show();

        }


    }

    }

