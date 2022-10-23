package com.example.coletordados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fileira02 extends AppCompatActivity {

    Button botao_salvar_formulario_fileira02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fileira02);

        botao_salvar_formulario_fileira02=findViewById(R.id.botao_salvar_formulario_fileira02);
        botao_salvar_formulario_fileira02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Fileira03.class);
                startActivity(intent);
            }
        });
    }
}