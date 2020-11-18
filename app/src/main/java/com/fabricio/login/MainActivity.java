package com.fabricio.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText textemail;
    private EditText textsenha;
    private Button btnEnter;
    private TextView textaccount;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textaccount = findViewById(R.id.id_textCadastar);
        btnEnter = findViewById(R.id.id_btnentrar);


        //ir para tela de cadastro
        textaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intenção entre as telas
                Intent intent = new Intent(MainActivity.this, CadastrarUser.class);
                //ação
                startActivity(intent);
            }
        });

        //ir para tela do usuario
        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentUser = new Intent(MainActivity.this, MenuUsuario.class);

                startActivity(intentUser);

            }
        });





    }
}