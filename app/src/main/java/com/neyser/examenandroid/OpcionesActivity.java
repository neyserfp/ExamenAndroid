package com.neyser.examenandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class OpcionesActivity extends AppCompatActivity {
    private Button btnHistoria, btnGrupo, btnDiscos;
    private Spinner spOpciones;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);

        spOpciones = findViewById(R.id.spOpciones);

        String[] operaciones = {"Historia", "Grupo", "Discos"};

        ArrayAdapter<String> adaptador1 =new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,operaciones);
        spOpciones.setAdapter(adaptador1);
    }

    public void ingresarSpinner(View view){

        String valor = spOpciones.getSelectedItem().toString();

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


    public void ingresarHistoria(View view){
        btnHistoria = findViewById(R.id.btnHistoria);
        Intent intent=new Intent(this,HistoriaActivity.class);
        startActivity(intent);
    }

    public void ingresarGrupo(View view){
        btnGrupo = findViewById(R.id.btnGrupo);
        Intent intent=new Intent(this,GrupoActivity.class);
        startActivity(intent);
    }

    public void ingresarDiscos(View view){
        btnDiscos = findViewById(R.id.btnDiscos);
        Intent intent=new Intent(this,DiscosActivity.class);
        startActivity(intent);
    }


}