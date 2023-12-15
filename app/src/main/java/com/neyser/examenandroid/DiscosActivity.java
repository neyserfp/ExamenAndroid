package com.neyser.examenandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class DiscosActivity extends AppCompatActivity {

    private Button btnDHistoria, btnDGrupo, btnDDiscos;
    private Spinner spDiscos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discos);

        spDiscos = findViewById(R.id.spDiscos);

        String[] operaciones = {"Historia", "Grupo", "Discos"};

        ArrayAdapter<String> adaptador1 =new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,operaciones);
        spDiscos.setAdapter(adaptador1);
    }

    public void ingresarSpinner(View view){

        String valor = spDiscos.getSelectedItem().toString();

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
        btnDHistoria = findViewById(R.id.btnDHistoria);
        Intent intent=new Intent(this,HistoriaActivity.class);
        startActivity(intent);
    }

    public void ingresarGrupo(View view){
        btnDGrupo = findViewById(R.id.btnDGrupo);
        Intent intent=new Intent(this,GrupoActivity.class);
        startActivity(intent);
    }

    public void ingresarDiscos(View view){
        btnDDiscos = findViewById(R.id.btnDDiscos);
        Intent intent=new Intent(this,DiscosActivity.class);
        startActivity(intent);
    }
}