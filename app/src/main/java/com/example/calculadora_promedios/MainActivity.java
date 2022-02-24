package com.example.calculadora_promedios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_promedio1;
    private Button btn_promedio2;
    private Button btn_promedio3;
    private Button btn_promediofinal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_promedio1 = (Button) findViewById(R.id.btn_parcial1);
        btn_promedio1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                activitieParcial1();

            }
        });

        btn_promedio2 = (Button) findViewById(R.id.btn_promedio2);
        btn_promedio2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                activitieParcial2();

            }
        });

        btn_promedio3 = (Button) findViewById(R.id.btn_promedio3);
        btn_promedio3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                activitieParcial3();

            }
        });

        btn_promediofinal = (Button) findViewById(R.id.btn_promedioFinal);
        btn_promediofinal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                activitieParcialFinal();

            }
        });

    }

    public void activitieParcial1(){

        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }

    public void activitieParcial2(){

        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);

    }

    public void activitieParcial3(){

        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);

    }

    public void activitieParcialFinal(){

        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);

    }


}