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

    private ImageButton botaoGolID;
    private ImageButton botaoDefesaID;
    private TextView porcentagemGolID;
    private TextView porcentagemDefesaID;

    private ImageButton botaoGolSE;
    private ImageButton botaoDefesaSE;
    private TextView porcentagemGolSE;
    private TextView porcentagemDefesaSE;

    private ImageButton botaoGolIE;
    private ImageButton botaoDefesaIE;
    private TextView porcentagemGolIE;
    private TextView porcentagemDefesaIE;

    private ImageButton botaoGolCM;
    private ImageButton botaoDefesaCM;
    private TextView porcentagemGolCM;
    private TextView porcentagemDefesaCM;

    private ImageButton botaoCancelar;



    // Criar uma variável int para cada botão
    private double golSD;
    private double defesaSD;

    private double golID;
    private double defesaID;

    private double golSE;
    private double defesaSE;

    private double golIE;
    private double defesaIE;

    private double golCM;
    private double defesaCM;




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

        golID = 0;
        defesaID = 0;

        golSE = 0;
        defesaSE = 0;

        golIE = 0;
        defesaIE = 0;

        golCM = 0;
        defesaCM = 0;



        // Ligação da variável com o botão
        botaoGolSD = (ImageButton) findViewById(R.id.imageButtonGolSD);
        botaoDefesaSD = (ImageButton) findViewById(R.id.imageButtonDefesaSD);
        porcentagemGolSD = (TextView) findViewById(R.id.textViewGolSD);
        porcentagemDefesaSD = (TextView) findViewById(R.id.textViewDefesaSD);

        botaoGolID = (ImageButton) findViewById(R.id.imageButtonGolID);
        botaoDefesaID = (ImageButton) findViewById(R.id.imageButtonDefesaID);
        porcentagemGolID = (TextView) findViewById(R.id.textViewGolID);
        porcentagemDefesaID = (TextView) findViewById(R.id.textViewDefesaID);

        botaoGolSE = (ImageButton) findViewById(R.id.imageButtonGolSE);
        botaoDefesaSE = (ImageButton) findViewById(R.id.imageButtonDefesaSE);
        porcentagemGolSE = (TextView) findViewById(R.id.textViewGolSE);
        porcentagemDefesaSE = (TextView) findViewById(R.id.textViewDefesaSE);

        botaoGolIE = (ImageButton) findViewById(R.id.imageButtonGolIE);
        botaoDefesaIE = (ImageButton) findViewById(R.id.imageButtonDefesaIE);
        porcentagemGolIE = (TextView) findViewById(R.id.textViewGolIE);
        porcentagemDefesaIE = (TextView) findViewById(R.id.textViewDefesaIE);

        botaoGolCM = (ImageButton) findViewById(R.id.imageButtonGolCM);
        botaoDefesaCM = (ImageButton) findViewById(R.id.imageButtonDefesaCM);
        porcentagemGolCM = (TextView) findViewById(R.id.textViewGolCM);
        porcentagemDefesaCM = (TextView) findViewById(R.id.textViewDefesaCM);

        botaoCancelar = (ImageButton) findViewById(R.id.imageButtonCancelar);


        // Fazer o evento de clique no botão
        botaoGolSD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atualizarCantoSD("gol");
            }
        });
        botaoGolID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atualizarCantoID("gol");
            }
        });

        botaoGolSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atualizarCantoSE("gol");


            }
        });

        botaoGolIE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atualizarCantoIE("gol");

            }
        });

        botaoGolCM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atualizarCantoCM("gol");
            }
        });


        botaoDefesaSD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atualizarCantoSD("defesa");
            }
        });
        botaoDefesaID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atualizarCantoID("defesa");
            }
        });

        botaoDefesaSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atualizarCantoSE("defesa");
            }
        });

        botaoDefesaIE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atualizarCantoIE("defesa");
            }
        });

        botaoDefesaCM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atualizarCantoCM("defesa");
            }
        });

         botaoCancelar.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 botaoZerarInformacoes();
             }
         });




    }

    // Atualizar a estatística do canto superior direito
    private void atualizarCantoSD(String tipo) {

        // Não precisa de chave porque é uma instrução só
        if (tipo.equals("gol"))
            golSD++;
        else
            defesaSD++;

        // Serve para exibir uma mensagem
        Toast.makeText(getApplicationContext(), "+1 " + tipo + " canto superior direito.", Toast.LENGTH_SHORT).show();

        // Calcula a % dos gols
        porcentagemGolSD.setText((int) golSD + " (" + (decimalFormat.format((golSD / (golSD + defesaSD)) * 100)) + "%)");

        // Calcular a % das defesas e mudar no textView
        porcentagemDefesaSD.setText((int) defesaSD + " (" + (decimalFormat.format(((defesaSD / (golSD + defesaSD)) * 100))) + "%)");
    }

    private void atualizarCantoID(String tipo) {

        if (tipo.equals("gol"))
            golID++;
        else
            defesaID++;


        Toast.makeText(getApplicationContext(), "+1 " + tipo + " canto superior direito.", Toast.LENGTH_SHORT).show();

        // Calcula a % dos gols
        porcentagemGolID.setText((int) golID + " (" + (decimalFormat.format((golID / (golID + defesaID)) * 100)) + "%)");

        // Calcular a % das defesas e mudar no textView
        porcentagemDefesaID.setText((int) defesaID + " (" + (decimalFormat.format(((defesaID / (golID + defesaID)) * 100))) + "%)");

    }

    private void atualizarCantoSE(String tipo) {

        if (tipo.equals("gol"))
            golSE++;
        else
            defesaSE++;


        Toast.makeText(getApplicationContext(), "+1 " + tipo + " canto superior direito.", Toast.LENGTH_SHORT).show();

        // Calcula a % dos gols
        porcentagemGolSE.setText((int) golSE + " (" + (decimalFormat.format((golSE / (golSE + defesaSE)) * 100)) + "%)");

        // Calcular a % das defesas e mudar no textView
        porcentagemDefesaSE.setText((int) defesaSE + " (" + (decimalFormat.format(((defesaSE / (golSE + defesaSE)) * 100))) + "%)");

    }
    private void atualizarCantoIE(String tipo) {

        if (tipo.equals("gol"))
            golIE++;
        else
            defesaIE++;


        Toast.makeText(getApplicationContext(), "+1 " + tipo + " canto superior direito.", Toast.LENGTH_SHORT).show();

        // Calcula a % dos gols
        porcentagemGolIE.setText((int) golIE + " (" + (decimalFormat.format((golIE / (golIE + defesaIE)) * 100)) + "%)");

        // Calcular a % das defesas e mudar no textView
        porcentagemDefesaIE.setText((int) defesaIE + " (" + (decimalFormat.format(((defesaIE / (golIE + defesaIE)) * 100))) + "%)");

    }
    private void atualizarCantoCM(String tipo) {

        if (tipo.equals("gol"))
            golCM++;
        else
            defesaCM++;


        Toast.makeText(getApplicationContext(), "+1 " + tipo + " canto superior direito.", Toast.LENGTH_SHORT).show();

        // Calcula a % dos gols
        porcentagemGolCM.setText((int) golCM + " (" + (decimalFormat.format((golCM / (golCM + defesaCM)) * 100)) + "%)");

        // Calcular a % das defesas e mudar no textView
        porcentagemDefesaCM.setText((int) defesaCM + " (" + (decimalFormat.format(((defesaCM / (golCM + defesaCM)) * 100))) + "%)");

    }

    private void botaoZerarInformacoes(){
        porcentagemGolSD.setText("0");
        porcentagemDefesaSD.setText("0");
        porcentagemGolSE.setText("0");
        porcentagemDefesaSE.setText("0");
        porcentagemGolID.setText("0");
        porcentagemDefesaID.setText("0");
        porcentagemGolIE.setText("0");
        porcentagemDefesaIE.setText("0");
        porcentagemGolCM.setText("0");
        porcentagemDefesaCM.setText("0");
    }

}

