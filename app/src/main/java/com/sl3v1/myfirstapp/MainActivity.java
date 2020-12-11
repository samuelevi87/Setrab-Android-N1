package com.sl3v1.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1, num2;
    Button btSoma, btSub, btMult, btDiv;
    TextView mostraResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.edt_num1);
        num2 = findViewById(R.id.edt_num2);

        btSoma = findViewById(R.id.btSoma);
        btSub = findViewById(R.id.btSub);
        btMult = findViewById(R.id.btMult);
        btDiv = findViewById(R.id.btDiv);

        mostraResultado = findViewById(R.id.mostrarResultado);

        btSoma.setOnClickListener((this));
        btSub.setOnClickListener((this));
        btMult.setOnClickListener((this));
        btDiv.setOnClickListener((this));
    }

    @Override
    public void onClick(View v) {
//        Double mNum1 = Double.parseDouble(num1.getText().toString());
//        Double mNum2 = Double.parseDouble(num2.getText().toString());

        switch (v.getId()) {
            case R.id.btSoma:
                Double soma = (Double.parseDouble((num1.getText().toString()))) + (Double.parseDouble((num2.getText().toString())));
                mostraResultado.setText((String.valueOf(String.format("%.2f", soma))));
                break;
            case R.id.btSub:
                Double subtrair = (Double.parseDouble((num1.getText().toString()))) - (Double.parseDouble((num2.getText().toString())));
                mostraResultado.setText((String.valueOf(String.format("%.2f", subtrair))));
                break;
            case R.id.btMult:
                Double multiplicacao = (Double.parseDouble((num1.getText().toString()))) * (Double.parseDouble((num2.getText().toString())));
                mostraResultado.setText((String.valueOf(String.format("%.2f", multiplicacao))));
                break;
            case R.id.btDiv:
                Double divisao = (Double.parseDouble((num1.getText().toString()))) / (Double.parseDouble((num2.getText().toString())));
                mostraResultado.setText((String.valueOf(String.format("%.2f", divisao))));
        }
    }
}