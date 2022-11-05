package com.example.coletordados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Fileira02 extends AppCompatActivity {
    Preferencia pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fileira02);
        pref = new Preferencia(this);

        EditText editF2Cap1 = findViewById(R.id.editF2Cap1);
        EditText editF2Alt1 = findViewById(R.id.editF2Alt1);
        EditText editF2Cod1 = findViewById(R.id.editF2Cod1);
        EditText editF2Cap2 = findViewById(R.id.editF2Cap2);
        EditText editF2Alt2 = findViewById(R.id.editF2Alt2);
        EditText editF2Cod2 = findViewById(R.id.editF2Cod2);
        EditText editF2Cap3 = findViewById(R.id.editF2Cap3);
        EditText editF2Alt3 = findViewById(R.id.editF2Alt3);
        EditText editF2Cod3 = findViewById(R.id.editF2Cod3);
        EditText editF2Cap4 = findViewById(R.id.editF2Cap4);
        EditText editF2Alt4 = findViewById(R.id.editF2Alt4);
        EditText editF2Cod4 = findViewById(R.id.editF2Cod4);
        EditText editF2Cap5 = findViewById(R.id.editF2Cap5);
        EditText editF2Alt5 = findViewById(R.id.editF2Alt5);
        EditText editF2Cod5 = findViewById(R.id.editF2Cod5);
        EditText editF2Cap6 = findViewById(R.id.editF2Cap6);
        EditText editF2Alt6 = findViewById(R.id.editF2Alt6);
        EditText editF2Cod6 = findViewById(R.id.editF2Cod6);
        EditText editF2Cap7 = findViewById(R.id.editF2Cap7);
        EditText editF2Alt7 = findViewById(R.id.editF2Alt7);
        EditText editF2Cod7 = findViewById(R.id.editF2Cod7);

        Button btProx2 = findViewById(R.id.btProx2);

        btProx2.setOnClickListener(view -> {
            pref.save(Constants.F2_CAP1, editF2Cap1.getText().toString());
            pref.save(Constants.F2_ALT1, editF2Alt1.getText().toString());
            pref.save(Constants.F2_COD1, editF2Cod1.getText().toString());
            pref.save(Constants.F2_CAP2, editF2Cap2.getText().toString());
            pref.save(Constants.F2_ALT2, editF2Alt2.getText().toString());
            pref.save(Constants.F2_COD2, editF2Cod2.getText().toString());
            pref.save(Constants.F2_CAP3, editF2Cap3.getText().toString());
            pref.save(Constants.F2_ALT3, editF2Alt3.getText().toString());
            pref.save(Constants.F2_COD3, editF2Cod3.getText().toString());
            pref.save(Constants.F2_CAP4, editF2Cap4.getText().toString());
            pref.save(Constants.F2_ALT4, editF2Alt4.getText().toString());
            pref.save(Constants.F2_COD4, editF2Cod4.getText().toString());
            pref.save(Constants.F2_CAP5, editF2Cap5.getText().toString());
            pref.save(Constants.F2_ALT5, editF2Alt5.getText().toString());
            pref.save(Constants.F2_COD5, editF2Cod5.getText().toString());
            pref.save(Constants.F2_CAP6, editF2Cap6.getText().toString());
            pref.save(Constants.F2_ALT6, editF2Alt6.getText().toString());
            pref.save(Constants.F2_COD6, editF2Cod6.getText().toString());
            pref.save(Constants.F2_CAP7, editF2Cap7.getText().toString());
            pref.save(Constants.F2_ALT7, editF2Alt7.getText().toString());
            pref.save(Constants.F2_COD7, editF2Cod7.getText().toString());

            Intent intent = new Intent(getApplicationContext(), Fileira03.class);
            startActivity(intent);
            finish();
        });
    }
}