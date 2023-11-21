package com.uth.g5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Opciones extends AppCompatActivity {

    ImageButton btn_add;
    ImageButton btn_list_contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);

        btn_add= findViewById(R.id.btnadd);
        btn_list_contacts= findViewById(R.id.btn_list);



        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ContactosActivity.class);
                startActivity(intent);
            }
        });


    }
}