package com.example.calculadora_promedios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    private EditText mat1_parcialfinal;
    private EditText mat2_parcialfinal;
    private EditText mat3_parcialfinal;
    private TextView tv_final;
    private TextView estatus;
    private Button btn_menu;
    private Button btn_final;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        mat1_parcialfinal = (EditText) findViewById(R.id.txt_parcial1);
        mat2_parcialfinal = (EditText) findViewById(R.id.txt_parcial2);
        mat3_parcialfinal = (EditText) findViewById(R.id.txt_parcial3);
        tv_final = (TextView) findViewById(R.id.tv_resultadofinal);
        estatus = (TextView) findViewById(R.id.tv_estatus);

        btn_menu = (Button) findViewById(R.id.btn_volver2);
        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                volverMenu();
            }
        });

        btn_final = (Button) findViewById(R.id.btn_calculadorfinal);
        btn_final.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                promedioFinal();
            }
        });

    }

    public void promedioFinal(){

        String materia1 = mat1_parcialfinal.getText().toString();
        String materia2 = mat2_parcialfinal.getText().toString();
        String materia3 = mat3_parcialfinal.getText().toString();

        double mate1 = Double.parseDouble(materia1);
        double mate2 = Double.parseDouble(materia2);
        double mate3 = Double.parseDouble(materia3);

        double promedioParcialFinal = (mate1 + mate2 + mate3) / 3;

        String resultFinal = String.valueOf(promedioParcialFinal);

        tv_final.setText(resultFinal);


        if (promedioParcialFinal <= 5){
            String extra = "Presentar Extraordianrio";
            estatus.setText(extra);
        }
        else{
            String noExtra = "No presentes extraordinario";
            estatus.setText(noExtra);
        }



    }

    public void volverMenu(){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}