package com.sl3v1.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button botao;
    TextView mostraSoma, mostraSubtracao, mostraMultiplicacao, mostraDivisao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.edt_num1);
        num2 = findViewById(R.id.edt_num2);
        botao = findViewById(R.id.somar);
        mostraSoma = findViewById(R.id.mostrarSoma);
        mostraSubtracao = findViewById(R.id.mostrarSubtracao);
        mostraMultiplicacao = findViewById(R.id.mostrarMultiplicacao);
        mostraDivisao = findViewById(R.id.mostrarDivisao);
    }

    public void soma(View view) {
        Double soma = (Double.parseDouble((num1.getText().toString()))) + (Double.parseDouble((num2.getText().toString())));
        mostraSoma.setText((String.valueOf(String.format("%.2f", soma))));
    }
    public void subtracao(View view) {
        Double subtracao = (Double.parseDouble((num1.getText().toString()))) - (Double.parseDouble((num2.getText().toString())));
        mostraSubtracao.setText((String.valueOf(String.format("%.2f", subtracao))));
    }
    public void multiplicacao(View view) {
        Double multiplicacao = (Double.parseDouble((num1.getText().toString()))) * (Double.parseDouble((num2.getText().toString())));
        mostraMultiplicacao.setText((String.valueOf(String.format("%.2f", multiplicacao))));
    }
    public void divisao(View view) {
        Double divisao = (Double.parseDouble((num1.getText().toString()))) / (Double.parseDouble((num2.getText().toString())));
        mostraDivisao.setText((String.valueOf(String.format("%.2f", divisao))));
    }
}