package com.fabricio.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CadastrarUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_user);

        //aparecer a flecha de retornar(ten que informar no xml Manifest tambem)
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}