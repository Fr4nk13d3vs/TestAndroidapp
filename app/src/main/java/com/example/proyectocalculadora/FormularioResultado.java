package com.example.proyectocalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FormularioResultado extends AppCompatActivity {
    private TextView Nombres, Apellidos, Correo, genero, Oferta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_resultado);
        Nombres = findViewById(R.id.lblNombreForm);
        Apellidos = findViewById(R.id.lblApellidosForm);
        Correo = findViewById(R.id.lblCorreoForm);
        genero = findViewById(R.id.lblGGeneroForm);
        Oferta = findViewById(R.id.lblOfertaForm);
        MostrarDatos();
    }

    private void MostrarDatos(){
        Bundle Datos = this.getIntent().getExtras();
        Nombres.setText(Datos.getString("Nombres"));
        Apellidos.setText(Datos.getString("Apellidos"));
        Correo.setText(Datos.getString("Correo"));
        genero.setText(Datos.getString("Genero"));
        Oferta.setText(Datos.getString("Oferta"));
        //Este es un comentario
    }
}