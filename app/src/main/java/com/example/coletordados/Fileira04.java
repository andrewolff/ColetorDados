package com.example.coletordados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Fileira04 extends AppCompatActivity {
    Preferencia pref;
    BancoDados db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fileira04);
        pref = new Preferencia(this);
        db = new BancoDados(this);

        EditText editF4Cap1 = findViewById(R.id.editF4Cap1);
        EditText editF4Alt1 = findViewById(R.id.editF4Alt1);
        EditText editF4Cod1 = findViewById(R.id.editF4Cod1);
        EditText editF4Cap2 = findViewById(R.id.editF4Cap2);
        EditText editF4Alt2 = findViewById(R.id.editF4Alt2);
        EditText editF4Cod2 = findViewById(R.id.editF4Cod2);
        EditText editF4Cap3 = findViewById(R.id.editF4Cap3);
        EditText editF4Alt3 = findViewById(R.id.editF4Alt3);
        EditText editF4Cod3 = findViewById(R.id.editF4Cod3);
        EditText editF4Cap4 = findViewById(R.id.editF4Cap4);
        EditText editF4Alt4 = findViewById(R.id.editF4Alt4);
        EditText editF4Cod4 = findViewById(R.id.editF4Cod4);
        EditText editF4Cap5 = findViewById(R.id.editF4Cap5);
        EditText editF4Alt5 = findViewById(R.id.editF4Alt5);
        EditText editF4Cod5 = findViewById(R.id.editF4Cod5);
        EditText editF4Cap6 = findViewById(R.id.editF4Cap6);
        EditText editF4Alt6 = findViewById(R.id.editF4Alt6);
        EditText editF4Cod6 = findViewById(R.id.editF4Cod6);
        EditText editF4Cap7 = findViewById(R.id.editF4Cap7);
        EditText editF4Alt7 = findViewById(R.id.editF4Alt7);
        EditText editF4Cod7 = findViewById(R.id.editF4Cod7);

        Button btSalvar = findViewById(R.id.btSalvar);

        btSalvar.setOnClickListener(view -> {
            Dado dado = new Dado();
            // BASE
            dado.setFazenda(pref.read(Constants.FAZENDA));
            dado.setProjeto(pref.read(Constants.PROJETO));
            dado.setAno(pref.read(Constants.ANO));
            dado.setAmostra(pref.read(Constants.AMOSTRA));
            dado.setNumeroTalhao(pref.read(Constants.NUMEROTALHAO));
            dado.setExtrato(pref.read(Constants.EXTRATO));
            dado.setArea(pref.read(Constants.AREA));
            dado.setData(pref.read(Constants.DATA));
            // F1
            dado.setF1Cap1(pref.read(Constants.F1_CAP1));
            dado.setF1Alt1(pref.read(Constants.F1_ALT1));
            dado.setF1Cod1(pref.read(Constants.F1_COD1));
            dado.setF1Cap2(pref.read(Constants.F1_CAP2));
            dado.setF1Alt2(pref.read(Constants.F1_ALT2));
            dado.setF1Cod2(pref.read(Constants.F1_COD2));
            dado.setF1Cap3(pref.read(Constants.F1_CAP3));
            dado.setF1Alt3(pref.read(Constants.F1_ALT3));
            dado.setF1Cod3(pref.read(Constants.F1_COD3));
            dado.setF1Cap4(pref.read(Constants.F1_CAP4));
            dado.setF1Alt4(pref.read(Constants.F1_ALT4));
            dado.setF1Cod4(pref.read(Constants.F1_COD4));
            dado.setF1Cap5(pref.read(Constants.F1_CAP5));
            dado.setF1Alt5(pref.read(Constants.F1_ALT5));
            dado.setF1Cod5(pref.read(Constants.F1_COD5));
            dado.setF1Cap6(pref.read(Constants.F1_CAP6));
            dado.setF1Alt6(pref.read(Constants.F1_ALT6));
            dado.setF1Cod6(pref.read(Constants.F1_COD6));
            dado.setF1Cap7(pref.read(Constants.F1_CAP7));
            dado.setF1Alt7(pref.read(Constants.F1_ALT7));
            dado.setF1Cod7(pref.read(Constants.F1_COD7));
            // F2
            dado.setF2Cap1(pref.read(Constants.F2_CAP1));
            dado.setF2Alt1(pref.read(Constants.F2_ALT1));
            dado.setF2Cod1(pref.read(Constants.F2_COD1));
            dado.setF2Cap2(pref.read(Constants.F2_CAP2));
            dado.setF2Alt2(pref.read(Constants.F2_ALT2));
            dado.setF2Cod2(pref.read(Constants.F2_COD2));
            dado.setF2Cap3(pref.read(Constants.F2_CAP3));
            dado.setF2Alt3(pref.read(Constants.F2_ALT3));
            dado.setF2Cod3(pref.read(Constants.F2_COD3));
            dado.setF2Cap4(pref.read(Constants.F2_CAP4));
            dado.setF2Alt4(pref.read(Constants.F2_ALT4));
            dado.setF2Cod4(pref.read(Constants.F2_COD4));
            dado.setF2Cap5(pref.read(Constants.F2_CAP5));
            dado.setF2Alt5(pref.read(Constants.F2_ALT5));
            dado.setF2Cod5(pref.read(Constants.F2_COD5));
            dado.setF2Cap6(pref.read(Constants.F2_CAP6));
            dado.setF2Alt6(pref.read(Constants.F2_ALT6));
            dado.setF2Cod6(pref.read(Constants.F2_COD6));
            dado.setF2Cap7(pref.read(Constants.F2_CAP7));
            dado.setF2Alt7(pref.read(Constants.F2_ALT7));
            dado.setF2Cod7(pref.read(Constants.F2_COD7));
            // F3
            dado.setF3Cap1(pref.read(Constants.F3_CAP1));
            dado.setF3Alt1(pref.read(Constants.F3_ALT1));
            dado.setF3Cod1(pref.read(Constants.F3_COD1));
            dado.setF3Cap2(pref.read(Constants.F3_CAP2));
            dado.setF3Alt2(pref.read(Constants.F3_ALT2));
            dado.setF3Cod2(pref.read(Constants.F3_COD2));
            dado.setF3Cap3(pref.read(Constants.F3_CAP3));
            dado.setF3Alt3(pref.read(Constants.F3_ALT3));
            dado.setF3Cod3(pref.read(Constants.F3_COD3));
            dado.setF3Cap4(pref.read(Constants.F3_CAP4));
            dado.setF3Alt4(pref.read(Constants.F3_ALT4));
            dado.setF3Cod4(pref.read(Constants.F3_COD4));
            dado.setF3Cap5(pref.read(Constants.F3_CAP5));
            dado.setF3Alt5(pref.read(Constants.F3_ALT5));
            dado.setF3Cod5(pref.read(Constants.F3_COD5));
            dado.setF3Cap6(pref.read(Constants.F3_CAP6));
            dado.setF3Alt6(pref.read(Constants.F3_ALT6));
            dado.setF3Cod6(pref.read(Constants.F3_COD6));
            dado.setF3Cap7(pref.read(Constants.F3_CAP7));
            dado.setF3Alt7(pref.read(Constants.F3_ALT7));
            dado.setF3Cod7(pref.read(Constants.F3_COD7));
            // F4
            dado.setF4Cap1(editF4Cap1.getText().toString());
            dado.setF4Alt1(editF4Alt1.getText().toString());
            dado.setF4Cod1(editF4Cod1.getText().toString());
            dado.setF4Cap2(editF4Cap2.getText().toString());
            dado.setF4Alt2(editF4Alt2.getText().toString());
            dado.setF4Cod2(editF4Cod2.getText().toString());
            dado.setF4Cap3(editF4Cap3.getText().toString());
            dado.setF4Alt3(editF4Alt3.getText().toString());
            dado.setF4Cod3(editF4Cod3.getText().toString());
            dado.setF4Cap4(editF4Cap4.getText().toString());
            dado.setF4Alt4(editF4Alt4.getText().toString());
            dado.setF4Cod4(editF4Cod4.getText().toString());
            dado.setF4Cap5(editF4Cap5.getText().toString());
            dado.setF4Alt5(editF4Alt5.getText().toString());
            dado.setF4Cod5(editF4Cod5.getText().toString());
            dado.setF4Cap6(editF4Cap6.getText().toString());
            dado.setF4Alt6(editF4Alt6.getText().toString());
            dado.setF4Cod6(editF4Cod6.getText().toString());
            dado.setF4Cap7(editF4Cap7.getText().toString());
            dado.setF4Alt7(editF4Alt7.getText().toString());
            dado.setF4Cod7(editF4Cod7.getText().toString());

            db.insert(dado);

            Toast.makeText(getApplicationContext(), "Salvo com sucesso", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}
