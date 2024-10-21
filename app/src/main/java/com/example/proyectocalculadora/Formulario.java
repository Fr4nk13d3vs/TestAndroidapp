package com.example.proyectocalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class Formulario extends AppCompatActivity {
    private EditText Nombres, Apellidos, Correo;
    private RadioButton Masculino, Femenino, NR;
    private CheckBox Oferta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        Nombres = findViewById(R.id.txtNombres);
        Apellidos = findViewById(R.id.txtApellidos);
        Correo = findViewById(R.id.txtCorreo);
        Masculino = findViewById(R.id.rbMasculino);
        Femenino = findViewById(R.id.rbFemenino);
        NR = findViewById(R.id.rbNR);
        Oferta = findViewById(R.id.cbOferta);
    }

    public void MostrarDatos(View view){
        String Nombre = Nombres.getText().toString();
        String Apellido = Apellidos.getText().toString();
        String Correo2 = Correo.getText().toString();
        String Genero = "";
        String Ofertas = "";
        if(Masculino.isChecked() == true ){
            Genero = "Masculino";
        } else if (Femenino.isChecked() == true ) {
            Genero = "Femenino";
        } else if (NR.isChecked() == true ) {
            Genero = "Prefiere no responder";
        }
        if(Oferta.isChecked() == true){
            Ofertas = "Si desea recibir publicidad.";
        } else {
            Ofertas = "No desea recibir publicidad.";
        }
        Intent AbrirFormResultado = new Intent(this, FormularioResultado.class);
        AbrirFormResultado.putExtra("Nombres", Nombre);
        AbrirFormResultado.putExtra("Apellidos", Apellido);
        AbrirFormResultado.putExtra("Correo", Correo2);
        AbrirFormResultado.putExtra("Genero", Genero);
        AbrirFormResultado.putExtra("Oferta", Ofertas);
        startActivity(AbrirFormResultado);
    }
}