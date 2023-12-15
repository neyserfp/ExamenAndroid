package com.neyser.examenandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ingresar(View view){
        btnEntrar = findViewById(R.id.btnEntrar);
        Intent intent=new Intent(this,OpcionesActivity.class);
        startActivity(intent);

    }
}