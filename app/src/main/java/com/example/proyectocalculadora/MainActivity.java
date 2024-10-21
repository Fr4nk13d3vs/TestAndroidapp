package com.example.proyectocalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Num1, Num2;
    private TextView Resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Num1 = findViewById(R.id.txtNum1);
        Num2 = findViewById(R.id.txtNum2);
        Resultado = findViewById(R.id.lblResultado);
    }

    public void Sumar(View view){
        int operacion = Integer.parseInt(Num1.getText().toString()) + Integer.parseInt(Num2.getText().toString());
        Resultado.setText(operacion+"");
    }

    public void Restar(View view){
        int operacion = Integer.parseInt(Num1.getText().toString()) - Integer.parseInt(Num2.getText().toString());
        Resultado.setText(operacion+"");
    }

    public void Multiplicar(View view){
        int operacion = Integer.parseInt(Num1.getText().toString()) * Integer.parseInt(Num2.getText().toString());
        Resultado.setText(operacion+"");
    }

    public void Dividir(View view){
        int operacion = Integer.parseInt(Num1.getText().toString()) / Integer.parseInt(Num2.getText().toString());
        Resultado.setText(operacion+"");
    }

    public void Formulario(View view){
        Intent  AbrirForm = new Intent(this, Formulario.class);
        startActivity(AbrirForm);
    }
}