package com.example.imc;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static java.lang.StrictMath.pow;

public class MainActivity extends AppCompatActivity {

    Button btnCalcular;
    EditText peso, altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // receber od IDs
        peso = findViewById(R.id.edtPeso);
        altura = findViewById(R.id.edtAltura);
    }

    public void calcular(View view) {
        // converter O que o usuário digitou
        float valor1 = Float.parseFloat(peso.getText().toString());
        float valor2 = Float.parseFloat(altura.getText().toString());
        float calculo = valor1 / (valor2 * valor2);
            if (calculo <= 18.5) {
                //trazer o resultado
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado: ");
                dialogo.setMessage("O calculo é " + calculo + " Abaixo do peso normal");
                dialogo.setNeutralButton("ok", null);
                dialogo.show();
            } else if (calculo <= 25) {
                //trazer o resultado
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado: ");
                dialogo.setMessage("O calculo é " + calculo + " Peso normal");
                dialogo.setNeutralButton("ok", null);
                dialogo.show();
            } else if (calculo <= 30) {
                //trazer o resultado
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado: ");
                dialogo.setMessage("O calculo é " + calculo + " Acima do peso normal");
                dialogo.setNeutralButton("ok", null);
                dialogo.show();
            } else if(calculo <= 34.5){
                //trazer o resultado
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado: ");
                dialogo.setMessage("O calculo é " + calculo + " Obesidade grau 1!");
                dialogo.setNeutralButton("ok", null);
                dialogo.show();
            } else if(calculo > 34.5){
                //trazer o resultado
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado: ");
                dialogo.setMessage("O calculo é " + calculo + " Obesidade severa grau 2!");
                dialogo.setNeutralButton("ok", null);
                dialogo.show();
            } else if(calculo > 39.9){
                //trazer o resultado
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado: ");
                dialogo.setMessage("O calculo é " + calculo + " Obesidade morbida grau 3!");
                dialogo.setNeutralButton("ok", null);
                dialogo.show();
            }

    }
}