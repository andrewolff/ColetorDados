package com.example.coletordados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Formulario extends AppCompatActivity {
    Preferencia pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        pref = new Preferencia(this);

        EditText editFazenda = findViewById(R.id.editFazenda);
        EditText editProjeto = findViewById(R.id.editProjeto);
        EditText editAno = findViewById(R.id.editAno);
        EditText editAmostra = findViewById(R.id.editAmostra);
        EditText editNumTalhao = findViewById(R.id.editNumTalhao);
        EditText editExtrato = findViewById(R.id.editExtrato);
        EditText editArea = findViewById(R.id.editArea);
        EditText editData = findViewById(R.id.editData);
        Button btProx = findViewById(R.id.btProx);
        Button btSair = findViewById(R.id.btSair1);

        btSair.setOnClickListener(view -> {
            finish();
        });

        btProx.setOnClickListener(view -> {
            pref.save(Constants.FAZENDA, editFazenda.getText().toString());
            pref.save(Constants.PROJETO, editProjeto.getText().toString());
            pref.save(Constants.ANO, editAno.getText().toString());
            pref.save(Constants.AMOSTRA, editAmostra.getText().toString());
            pref.save(Constants.NUMEROTALHAO, editNumTalhao.getText().toString());
            pref.save(Constants.EXTRATO, editExtrato.getText().toString());
            pref.save(Constants.AREA, editArea.getText().toString());
            pref.save(Constants.DATA, editData.getText().toString());

            Intent intent = new Intent(getApplicationContext(), Fileira01.class);
            startActivity(intent);
            finish();
        });
    }
}
