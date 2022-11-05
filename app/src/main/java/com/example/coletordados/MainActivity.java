package com.example.coletordados;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.List;

import pub.devrel.easypermissions.AppSettingsDialog;
import pub.devrel.easypermissions.EasyPermissions;

public class MainActivity extends AppCompatActivity implements EasyPermissions.PermissionCallbacks {
    private static final int WRITE_STORAGE_PERMISSION_REQUEST = 100;
    BancoDados db;
    Button btListar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new BancoDados(this);

        Button btColetar = findViewById(R.id.btColetar);
        btListar = findViewById(R.id.btListar);
        Button btSair = findViewById(R.id.btSair);

        btColetar.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Formulario.class);
            startActivity(intent);
        });

        btListar.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Lista.class);
            startActivity(intent);
        });



        btSair.setOnClickListener(view -> {
            finish();
        });

        checkPermission();
    }

    private void checkPermission() {
        String permission = Manifest.permission.WRITE_EXTERNAL_STORAGE;

        if(!EasyPermissions.hasPermissions(this, permission)){
            EasyPermissions.requestPermissions(this, "Permissão necessária para exportar a coleta", WRITE_STORAGE_PERMISSION_REQUEST, permission);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        int totalColetas = db.total();
        btListar.setText("Listar Coletas (" + totalColetas + ")");
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
    }

    @Override
    public void onPermissionsGranted(int requestCode, @NonNull List<String> perms) {

    }

    @Override
    public void onPermissionsDenied(int requestCode, @NonNull List<String> perms) {
        if(EasyPermissions.somePermissionPermanentlyDenied(this, perms)){
            new AppSettingsDialog.Builder(this).build().show();
        }
    }
}
