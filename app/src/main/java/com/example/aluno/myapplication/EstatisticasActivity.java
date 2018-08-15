package com.example.aluno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.orm.SchemaGenerator;
import com.orm.SugarContext;
import com.orm.SugarDb;

import java.util.ArrayList;
import java.util.List;

public class EstatisticasActivity extends AppCompatActivity {

    private List<Goleiro> goleiros;
    private TextView txtDdados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estatisticas);

//        SugarContext.init(getApplicationContext());
//        SchemaGenerator schemaGenerator = new SchemaGenerator(this);
//        schemaGenerator.createDatabase(new SugarDb(this).getDB());

        txtDdados = (TextView) findViewById(R.id.textDados);

        goleiros = Goleiro.listAll(Goleiro.class);

        String dadosAtuais, dadosNovos;

        for (Goleiro g : goleiros){

            dadosAtuais = txtDdados.getText().toString();

            dadosNovos = g.getNome() + "\n";

            dadosNovos += "Inferior dir: " + g.getDefesaCID() + "/" + g.getGolCID() + "\n";

            dadosNovos += "Inferior esq: " + g.getDefesaCIE() + "/" + g.getGolCIE() + "\n";

            dadosNovos += "Superior dir: " + g.getDefesaCSD() + "/" + g.getGolCSD() + "\n";
            dadosNovos += "Superior esq: " + g.getDefesaCSE() + "/" + g.getGolCSE() + "\n";

            dadosNovos += "Meio: " + g.getDefesaMeio() + "/" + g.getGolMeio() + "\n";

            txtDdados.setText(dadosAtuais + "\n\n" + dadosNovos);

        }

    }
}
