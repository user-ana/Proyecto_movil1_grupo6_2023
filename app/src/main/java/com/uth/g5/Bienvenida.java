package com.uth.g5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class Bienvenida extends AppCompatActivity {

    private AppCompatButton entrarBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        entrarBtn=findViewById(R.id.btn_getIn);
        entrarBtn.setOnClickListener(v -> startActivity(new Intent(Bienvenida.this, Opciones.class)));
    }
}