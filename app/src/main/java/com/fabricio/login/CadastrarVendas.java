package com.fabricio.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastrarVendas extends AppCompatActivity {

    private MyDatabase db;
    private Button cadastrar;
    private EditText cliente;
    private EditText produto;
    private EditText codigo;
   // private Venda venda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_vendas);

        //aparecer a flecha de retornar(ten que informar no xml Manifest tambem)
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
          cliente = findViewById(R.id.id_Cadnomecliente);
          produto = findViewById(R.id.id_CadDataVenda);
          codigo = findViewById(R.id.id_CadNumeroVenda);
          cadastrar = findViewById(R.id.id_btnCadvenda);
        db = Room.databaseBuilder(getApplicationContext(),MyDatabase.class,"MeuDB").build();




        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                         final String txtnome = cliente.getText().toString();
                         final String txtproduto = produto.getText().toString();
                         final String txtcodigo = codigo.getText().toString();
                        final Venda venda = new Venda();

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                venda.setCliente(txtnome);
                                venda.setProduto(txtproduto);
                                venda.setCodigo(txtcodigo);
                                Toast.makeText(CadastrarVendas.this,"Cadastro com sucesso",Toast.LENGTH_SHORT).show();
                            }
                        });
                        db.vendasDao().insert(venda);
                    }
                }).start();

              // Log.i("teste",venda.getCliente());
               // Log.i("teste",venda.getProduto());
            }
        });




    }
}