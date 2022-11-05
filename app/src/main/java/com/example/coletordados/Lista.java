package com.example.coletordados;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Lista extends AppCompatActivity {
    private RecyclerView recyclerDados;
    private ListaAdapter listaAdapter;
    private BancoDados db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        db = new BancoDados(this);

        recyclerDados = findViewById(R.id.recyclerDados);

        setupRecycler();
    }

    private void setupRecycler() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerDados.setLayoutManager(layoutManager);

        listaAdapter = new ListaAdapter(this, db.getDados());
        recyclerDados.setAdapter(listaAdapter);

        recyclerDados.addItemDecoration(
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}
