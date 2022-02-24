package com.example.calculadora_promedios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private EditText mat1;
    private EditText mat2;
    private EditText mat3;
    private EditText mat4;
    private EditText mat5;
    private EditText mat6;
    private EditText mat7;
    private EditText mat8;
    private EditText mat9;
    private EditText mat10;
    private Button btn_calcular1;
    private Button btn_menu;
    public TextView txt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mat1 = (EditText) findViewById(R.id.mat1_par3);
        mat2 = (EditText) findViewById(R.id.mat2_par3);
        mat3 = (EditText) findViewById(R.id.mat3_par3);
        mat4 = (EditText) findViewById(R.id.mat4_par3);
        mat5 = (EditText) findViewById(R.id.mat5_par3);
        mat6 = (EditText) findViewById(R.id.mat6_par3);
        mat7 = (EditText) findViewById(R.id.mat7_par3);
        mat8 = (EditText) findViewById(R.id.mat8_par3);
        mat9 = (EditText) findViewById(R.id.mat9_par3);
        mat10 = (EditText) findViewById(R.id.mat10_par3);
        btn_calcular1 = (Button) findViewById(R.id.btn_calcular1);
        btn_menu = (Button) findViewById(R.id.btn_volver);
        txt1 = (TextView) findViewById(R.id.tv_promedio3);

        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                volverMenu();
            }
        });


    }

    public void promedioParcial1(View view){

        String materia1 = mat1.getText().toString();
        String materia2 = mat2.getText().toString();
        String materia3 = mat3.getText().toString();
        String materia4 = mat4.getText().toString();
        String materia5 = mat5.getText().toString();
        String materia6 = mat6.getText().toString();
        String materia7 = mat7.getText().toString();
        String materia8 = mat8.getText().toString();
        String materia9 = mat9.getText().toString();
        String materia10 = mat10.getText().toString();

        double mate1 = Double.parseDouble(materia1);
        double mate2 = Double.parseDouble(materia2);
        double mate3 = Double.parseDouble(materia3);
        double mate4 = Double.parseDouble(materia4);
        double mate5 = Double.parseDouble(materia5);
        double mate6 = Double.parseDouble(materia6);
        double mate7 = Double.parseDouble(materia7);
        double mate8 = Double.parseDouble(materia8);
        double mate9 = Double.parseDouble(materia9);
        double mate10 = Double.parseDouble(materia10);

        double promedioParcial1 = (mate1 +
                                   mate2 +
                                   mate3 +
                                   mate4 +
                                   mate5 +
                                   mate6 +
                                   mate7 +
                                   mate8 +
                                   mate9 +
                                   mate10)
                                    / 10;


        String result1 = String.valueOf(promedioParcial1);

        txt1.setText(result1);

    }

    public void activitieResultadoParcial1(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    public void volverMenu(){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}