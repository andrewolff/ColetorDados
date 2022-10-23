package com.example.coletordados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fileira03 extends AppCompatActivity {

    Button botao_salvar_formulario_fileira03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fileira03);

        botao_salvar_formulario_fileira03=findViewById(R.id.botao_salvar_formulario_fileira03);
        botao_salvar_formulario_fileira03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Fileira04.class);
                startActivity(intent);
            }
        });
    }
}