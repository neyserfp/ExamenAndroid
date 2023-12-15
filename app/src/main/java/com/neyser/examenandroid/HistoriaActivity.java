package com.neyser.examenandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class HistoriaActivity extends AppCompatActivity {

    private Button btnHHistoria, btnHGrupo, btnHDiscos, bHistoria;
    private Spinner spHistoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia);

        spHistoria = findViewById(R.id.spHistoria);

        String[] operaciones = {"Historia", "Grupo", "Discos"};

        ArrayAdapter<String> adaptador1 =new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,operaciones);
        spHistoria.setAdapter(adaptador1);

    }

    public void ingresarSpinner(View view){
        bHistoria = findViewById(R.id.bHistoria);

        String valor = spHistoria.getSelectedItem().toString();

        if (valor=="Historia"){
            Intent intent=new Intent(this,HistoriaActivity.class);
            startActivity(intent);
        } else if (valor=="Grupo") {
            Intent intent=new Intent(this,GrupoActivity.class);
            startActivity(intent);
        } else if (valor=="Discos") {
            Intent intent=new Intent(this,DiscosActivity.class);
            startActivity(intent);
        }

    }

    public void inicio(View view){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }


    public void ingresarHistoria(View view){
        btnHHistoria = findViewById(R.id.btnHHistoria);
        Intent intent=new Intent(this,HistoriaActivity.class);
        startActivity(intent);
    }

    public void ingresarGrupo(View view){
        btnHGrupo = findViewById(R.id.btnHGrupo);
        Intent intent=new Intent(this,GrupoActivity.class);
        startActivity(intent);
    }

    public void ingresarDiscos(View view){
        btnHDiscos = findViewById(R.id.btnHDiscos);
        Intent intent=new Intent(this,DiscosActivity.class);
        startActivity(intent);
    }
}