package com.neyser.examenandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class GrupoActivity extends AppCompatActivity {

    private Button btnGHistoria, btnGGrupo, btnGDiscos;
    private Spinner spGrupo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo);

        spGrupo = findViewById(R.id.spGrupo);

        String[] operaciones = {"Historia", "Grupo", "Discos"};

        ArrayAdapter<String> adaptador1 =new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,operaciones);
        spGrupo.setAdapter(adaptador1);
    }

    public void ingresarSpinner(View view){

        String valor = spGrupo.getSelectedItem().toString();

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
        btnGHistoria = findViewById(R.id.btnGHistoria);
        Intent intent=new Intent(this,HistoriaActivity.class);
        startActivity(intent);
    }

    public void ingresarGrupo(View view){
        btnGGrupo = findViewById(R.id.btnGGrupo);
        Intent intent=new Intent(this,GrupoActivity.class);
        startActivity(intent);
    }

    public void ingresarDiscos(View view){
        btnGDiscos = findViewById(R.id.btnGDiscos);
        Intent intent=new Intent(this,DiscosActivity.class);
        startActivity(intent);
    }

}