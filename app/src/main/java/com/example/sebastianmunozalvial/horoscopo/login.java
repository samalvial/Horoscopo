package com.example.sebastianmunozalvial.horoscopo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {


    Button btnIngresar;
    EditText nombre;
    EditText pass;
    usuario u = new usuario();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        btnIngresar=(Button)findViewById(R.id.btnIngresar);
        nombre=(EditText)findViewById(R.id.txtLoginNombre);
        pass=(EditText)findViewById(R.id.txtLoginPass);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            pass.getText().toString();
            nombre.getText().toString();

                if (nombre.equals(u.getNombre()) && pass.equals(u.getPass())){

                    Intent i = new Intent(login.this,seleccion_signo.class);
                    i.putExtra("Nombre",u.getNombre());
                    startActivity(i);

                }else{
                    Toast.makeText(getApplicationContext(),"Nombre de usuario y/o contraseña erróneos",Toast.LENGTH_SHORT).show();

                }



            }
        });

    }
}
