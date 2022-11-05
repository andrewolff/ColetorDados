package com.example.coletordados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Fileira03 extends AppCompatActivity {
    Preferencia pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fileira03);
        pref = new Preferencia(this);

        EditText editF3Cap1 = findViewById(R.id.editF3Cap1);
        EditText editF3Alt1 = findViewById(R.id.editF3Alt1);
        EditText editF3Cod1 = findViewById(R.id.editF3Cod1);
        EditText editF3Cap2 = findViewById(R.id.editF3Cap2);
        EditText editF3Alt2 = findViewById(R.id.editF3Alt2);
        EditText editF3Cod2 = findViewById(R.id.editF3Cod2);
        EditText editF3Cap3 = findViewById(R.id.editF3Cap3);
        EditText editF3Alt3 = findViewById(R.id.editF3Alt3);
        EditText editF3Cod3 = findViewById(R.id.editF3Cod3);
        EditText editF3Cap4 = findViewById(R.id.editF3Cap4);
        EditText editF3Alt4 = findViewById(R.id.editF3Alt4);
        EditText editF3Cod4 = findViewById(R.id.editF3Cod4);
        EditText editF3Cap5 = findViewById(R.id.editF3Cap5);
        EditText editF3Alt5 = findViewById(R.id.editF3Alt5);
        EditText editF3Cod5 = findViewById(R.id.editF3Cod5);
        EditText editF3Cap6 = findViewById(R.id.editF3Cap6);
        EditText editF3Alt6 = findViewById(R.id.editF3Alt6);
        EditText editF3Cod6 = findViewById(R.id.editF3Cod6);
        EditText editF3Cap7 = findViewById(R.id.editF3Cap7);
        EditText editF3Alt7 = findViewById(R.id.editF3Alt7);
        EditText editF3Cod7 = findViewById(R.id.editF3Cod7);

        Button btProx3 = findViewById(R.id.btProx3);

        btProx3.setOnClickListener(view -> {
            pref.save(Constants.F3_CAP1, editF3Cap1.getText().toString());
            pref.save(Constants.F3_ALT1, editF3Alt1.getText().toString());
            pref.save(Constants.F3_COD1, editF3Cod1.getText().toString());
            pref.save(Constants.F3_CAP2, editF3Cap2.getText().toString());
            pref.save(Constants.F3_ALT2, editF3Alt2.getText().toString());
            pref.save(Constants.F3_COD2, editF3Cod2.getText().toString());
            pref.save(Constants.F3_CAP3, editF3Cap3.getText().toString());
            pref.save(Constants.F3_ALT3, editF3Alt3.getText().toString());
            pref.save(Constants.F3_COD3, editF3Cod3.getText().toString());
            pref.save(Constants.F3_CAP4, editF3Cap4.getText().toString());
            pref.save(Constants.F3_ALT4, editF3Alt4.getText().toString());
            pref.save(Constants.F3_COD4, editF3Cod4.getText().toString());
            pref.save(Constants.F3_CAP5, editF3Cap5.getText().toString());
            pref.save(Constants.F3_ALT5, editF3Alt5.getText().toString());
            pref.save(Constants.F3_COD5, editF3Cod5.getText().toString());
            pref.save(Constants.F3_CAP6, editF3Cap6.getText().toString());
            pref.save(Constants.F3_ALT6, editF3Alt6.getText().toString());
            pref.save(Constants.F3_COD6, editF3Cod6.getText().toString());
            pref.save(Constants.F3_CAP7, editF3Cap7.getText().toString());
            pref.save(Constants.F3_ALT7, editF3Alt7.getText().toString());
            pref.save(Constants.F3_COD7, editF3Cod7.getText().toString());

            Intent intent = new Intent(getApplicationContext(), Fileira04.class);
            startActivity(intent);
            finish();
        });
    }
}