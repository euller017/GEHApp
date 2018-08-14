package com.example.aluno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class EstatisticasActivity extends AppCompatActivity {

    private List<Goleiro> goleiros;
    private TextView dados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estatisticas);

        dados = (TextView) findViewById(R.id.textDados);

        goleiros = Goleiro.listAll(Goleiro.class);

        String nome;

        for (Goleiro g : goleiros){

            nome = dados.getText().toString();
            dados.setText(nome + " - " + g.getDefesaCID());

        }

    }
}
