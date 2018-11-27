package com.example.aluno.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class EstatisticaListActivity extends AppCompatActivity {
    private List<Goleiro> goleiros;
    private ListView lista;
    private AlertDialog alerta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estatistica_list);

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);

        lista = (ListView) findViewById(R.id.listView);

        atualizarLista();

        lista.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                final int i = position;

                builder.setTitle("Excluir Registro");
                builder.setMessage("Você quer excluir o " + goleiros.get(i).getNome()+"?");

                builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        goleiros.get(i).delete();

                        Toast.makeText(EstatisticaListActivity.this, "Excluindo: " + goleiros.get(i).getNome(), Toast.LENGTH_SHORT).show();

                        atualizarLista();


                    }
                });

                builder.setNegativeButton("Não", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(EstatisticaListActivity.this, "Cancelando a Ação", Toast.LENGTH_SHORT).show();
                    }
                });

                alerta= builder.create();
                alerta.show();

                return false;
            }
        });


    }

    public void atualizarLista(){
        goleiros = Goleiro.listAll(Goleiro.class);

        ArrayAdapter<Goleiro> adapter = new ArrayAdapter<Goleiro>(this,android.R.layout.simple_list_item_1, goleiros);
        lista.setAdapter(adapter);
    }
}
