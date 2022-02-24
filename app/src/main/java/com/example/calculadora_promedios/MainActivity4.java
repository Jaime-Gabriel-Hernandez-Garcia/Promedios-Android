package com.example.calculadora_promedios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    private EditText mat1_par3;
    private EditText mat2_par3;
    private EditText mat3_par3;
    private EditText mat4_par3;
    private EditText mat5_par3;
    private EditText mat6_par3;
    private EditText mat7_par3;
    private EditText mat8_par3;
    private EditText mat9_par3;
    private EditText mat10_par3;
    private Button btn_calcular1;
    private Button btn_menu_par3;
    public TextView txt1_par3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        mat1_par3 = (EditText) findViewById(R.id.mat1_par3);
        mat2_par3 = (EditText) findViewById(R.id.mat2_par3);
        mat3_par3 = (EditText) findViewById(R.id.mat3_par3);
        mat4_par3 = (EditText) findViewById(R.id.mat4_par3);
        mat5_par3 = (EditText) findViewById(R.id.mat5_par3);
        mat6_par3 = (EditText) findViewById(R.id.mat6_par3);
        mat7_par3 = (EditText) findViewById(R.id.mat7_par3);
        mat8_par3 = (EditText) findViewById(R.id.mat8_par3);
        mat9_par3 = (EditText) findViewById(R.id.mat9_par3);
        mat10_par3 = (EditText) findViewById(R.id.mat10_par3);
        btn_calcular1 = (Button) findViewById(R.id.btn_calcular1);
        btn_menu_par3 = (Button) findViewById(R.id.btn_volver);
        txt1_par3 = (TextView) findViewById(R.id.tv_promedio3);

        btn_menu_par3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                volverMenu();
            }
        });

    }

    public void promedioParcial3(View view){

        String materia1 = mat1_par3.getText().toString();
        String materia2 = mat2_par3.getText().toString();
        String materia3 = mat3_par3.getText().toString();
        String materia4 = mat4_par3.getText().toString();
        String materia5 = mat5_par3.getText().toString();
        String materia6 = mat6_par3.getText().toString();
        String materia7 = mat7_par3.getText().toString();
        String materia8 = mat8_par3.getText().toString();
        String materia9 = mat9_par3.getText().toString();
        String materia10 = mat10_par3.getText().toString();

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

        double promedioParcial3 = (mate1 +
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


        String result3 = String.valueOf(promedioParcial3);

        txt1_par3.setText(result3);

    }

    public void volverMenu(){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

}