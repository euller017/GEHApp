package com.example.aluno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Fazer para todos os botões
    private ImageButton botaoGolSD;
    private TextView porcentagemGolSD;
    private TextView porcentagemDefesaSD;


    // Criar uma variável int para cada botão
    private int golSD;
    private int defesaSD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Zerar a contagem das variáveis int
        golSD = 0;
        defesaSD = 5;

        // Ligação da variável com o botão
        botaoGolSD = (ImageButton) findViewById(R.id.imageButtonGolSD);
        porcentagemGolSD = (TextView) findViewById(R.id.textViewGolSD);
        porcentagemDefesaSD = (TextView) findViewById(R.id.textViewDefesaSD);

        // Fazer o evento de clique no botão
        botaoGolSD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Serve para exibir uma mensagem
                Toast.makeText(getApplicationContext(), "+1 gol canto superior direito.", Toast.LENGTH_SHORT).show();
                // Contabiliza +1 gol
                golSD++;

                // Calcula a % dos gols
                porcentagemGolSD.setText( (golSD) + " (" + (golSD/(golSD+defesaSD))*100 + "%)" );

                // Calcular a % das defesas e mudar no textView
                porcentagemDefesaSD.setText( (defesaSD) + " (" + (defesaSD/(golSD+defesaSD))*100 + "%)" );
            }
        });

    }
}
