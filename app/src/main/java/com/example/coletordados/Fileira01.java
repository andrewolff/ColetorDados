package com.example.coletordados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Fileira01 extends AppCompatActivity {
    Preferencia pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fileira01);
        pref = new Preferencia(this);

        EditText editF1Cap1 = findViewById(R.id.editF1Cap1);
        EditText editF1Alt1 = findViewById(R.id.editF1Alt1);
        EditText editF1Cod1 = findViewById(R.id.editF1Cod1);
        EditText editF1Cap2 = findViewById(R.id.editF1Cap2);
        EditText editF1Alt2 = findViewById(R.id.editF1Alt2);
        EditText editF1Cod2 = findViewById(R.id.editF1Cod2);
        EditText editF1Cap3 = findViewById(R.id.editF1Cap3);
        EditText editF1Alt3 = findViewById(R.id.editF1Alt3);
        EditText editF1Cod3 = findViewById(R.id.editF1Cod3);
        EditText editF1Cap4 = findViewById(R.id.editF1Cap4);
        EditText editF1Alt4 = findViewById(R.id.editF1Alt4);
        EditText editF1Cod4 = findViewById(R.id.editF1Cod4);
        EditText editF1Cap5 = findViewById(R.id.editF1Cap5);
        EditText editF1Alt5 = findViewById(R.id.editF1Alt5);
        EditText editF1Cod5 = findViewById(R.id.editF1Cod5);
        EditText editF1Cap6 = findViewById(R.id.editF1Cap6);
        EditText editF1Alt6 = findViewById(R.id.editF1Alt6);
        EditText editF1Cod6 = findViewById(R.id.editF1Cod6);
        EditText editF1Cap7 = findViewById(R.id.editF1Cap7);
        EditText editF1Alt7 = findViewById(R.id.editF1Alt7);
        EditText editF1Cod7 = findViewById(R.id.editF1Cod7);

        Button btProx1 = findViewById(R.id.btProx1);

        btProx1.setOnClickListener(view -> {
            pref.save(Constants.F1_CAP1, editF1Cap1.getText().toString());
            pref.save(Constants.F1_ALT1, editF1Alt1.getText().toString());
            pref.save(Constants.F1_COD1, editF1Cod1.getText().toString());
            pref.save(Constants.F1_CAP2, editF1Cap2.getText().toString());
            pref.save(Constants.F1_ALT2, editF1Alt2.getText().toString());
            pref.save(Constants.F1_COD2, editF1Cod2.getText().toString());
            pref.save(Constants.F1_CAP3, editF1Cap3.getText().toString());
            pref.save(Constants.F1_ALT3, editF1Alt3.getText().toString());
            pref.save(Constants.F1_COD3, editF1Cod3.getText().toString());
            pref.save(Constants.F1_CAP4, editF1Cap4.getText().toString());
            pref.save(Constants.F1_ALT4, editF1Alt4.getText().toString());
            pref.save(Constants.F1_COD4, editF1Cod4.getText().toString());
            pref.save(Constants.F1_CAP5, editF1Cap5.getText().toString());
            pref.save(Constants.F1_ALT5, editF1Alt5.getText().toString());
            pref.save(Constants.F1_COD5, editF1Cod5.getText().toString());
            pref.save(Constants.F1_CAP6, editF1Cap6.getText().toString());
            pref.save(Constants.F1_ALT6, editF1Alt6.getText().toString());
            pref.save(Constants.F1_COD6, editF1Cod6.getText().toString());
            pref.save(Constants.F1_CAP7, editF1Cap7.getText().toString());
            pref.save(Constants.F1_ALT7, editF1Alt7.getText().toString());
            pref.save(Constants.F1_COD7, editF1Cod7.getText().toString());

            Intent intent = new Intent(getApplicationContext(), Fileira02.class);
            startActivity(intent);
            finish();
        });
    }
}
