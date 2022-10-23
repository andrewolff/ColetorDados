package com.example.coletordados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button coletarDados,botaoSair;
    EditText editText_Id,editText_Fazenda,editText_Projeto,editText_AnoPlantio,editText_Amostra,
            editText_NumeroTalhao,editText_Extrato,editText_Area,editText_Data;

    BancoDados db = new BancoDados(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_Id = (EditText)findViewById(R.id.editText_Id);
        editText_Fazenda = (EditText)findViewById(R.id.editText_Fazenda);
        editText_Projeto = (EditText)findViewById(R.id.editText_Projeto);
        editText_AnoPlantio = (EditText)findViewById(R.id.editText_AnoPlantio);
        editText_Amostra = (EditText)findViewById(R.id.editText_Amostra);
        editText_NumeroTalhao = (EditText)findViewById(R.id.editText_NumeroTalhao);
        editText_Extrato = (EditText)findViewById(R.id.editText_Extrato);
        editText_Area = (EditText)findViewById(R.id.editText_Area);
        editText_Data = (EditText)findViewById(R.id.editText_Data);
        coletarDados=findViewById(R.id.coletarDados);
        botaoSair=findViewById(R.id.botaoSair);


        botaoSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        coletarDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Formulario.class);
                startActivity(intent);
            }
        });







    }




}
