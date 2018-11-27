package com.example.aluno.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrincipalActivity extends AppCompatActivity {

    private Button inicio;
    private Button sobreApp;
    private Button sobreCriadores;
    private Button sobreHandebol;
    private Button buttonEst;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        inicio = (Button) findViewById(R.id.buttonInicio);
        sobreApp = (Button) findViewById(R.id.buttonSobreApp);
        sobreCriadores = (Button) findViewById(R.id.buttonCriadores);
        sobreHandebol = (Button) findViewById(R.id.buttonHandebol);

        buttonEst = (Button) findViewById(R.id.buttonEst);
        buttonEst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PrincipalActivity.this,EstatisticaListActivity.class));
            }
        });

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Para ao clicar direcionar para outra tela, a tela de onde voce ta e depois a tela que voce quer ir
           startActivity(new Intent(PrincipalActivity.this,MainActivity.class));
            }
        });

        sobreApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(PrincipalActivity.this,SobreActivity.class));

            }
        });

        sobreCriadores.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                startActivity(new Intent(PrincipalActivity.this,SobreCriadoresActivity.class));

            }
        });

        sobreHandebol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(PrincipalActivity.this,SobreHandebolActivity.class));

            }
        });
    }


}
