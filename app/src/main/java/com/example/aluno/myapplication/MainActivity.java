package com.example.aluno.myapplication;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    // Fazer para todos os botões
    private ImageButton botaoGolSD;
    private ImageButton botaoDefesaSD;
    private TextView porcentagemGolSD;
    private TextView porcentagemDefesaSD;


    // Criar uma variável int para cada botão
    private double golSD;
    private double defesaSD;

    // Somente para formatação de casas decimais
    private String formato;
    private DecimalFormat decimalFormat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Cria a formatação para 2 casas decimais
        formato = "##.#";
        decimalFormat = new DecimalFormat(formato);

        // Zerar a contagem das variáveis int
        golSD = 0;
        defesaSD = 0;

        // Ligação da variável com o botão
        botaoGolSD = (ImageButton) findViewById(R.id.imageButtonGolSD);
        botaoDefesaSD = (ImageButton) findViewById(R.id.imageButtonDefesaSD);
        porcentagemGolSD = (TextView) findViewById(R.id.textViewGolSD);
        porcentagemDefesaSD = (TextView) findViewById(R.id.textViewDefesaSD);

        // Fazer o evento de clique no botão
        botaoGolSD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atualizarCantoSD("gol");
            }
        });

        botaoDefesaSD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atualizarCantoSD("defesa");
            }
        });

    }

    // Atualizar a estatística do canto superior direito
    private void atualizarCantoSD(String tipo){

        // Não precisa de chave porque é uma instrução só
        if(tipo.equals("gol"))
            golSD++;
        else
            defesaSD++;

        // Serve para exibir uma mensagem
        Toast.makeText(getApplicationContext(), "+1 " + tipo + " canto superior direito.", Toast.LENGTH_SHORT).show();

        // Calcula a % dos gols
        porcentagemGolSD.setText( (int) golSD + " (" + (decimalFormat.format((golSD/(golSD+defesaSD))*100))+ "%)" );

        // Calcular a % das defesas e mudar no textView
        porcentagemDefesaSD.setText( (int) defesaSD + " (" + ( decimalFormat.format(((defesaSD/(golSD+defesaSD))*100)) ) + "%)" );
    }
}
