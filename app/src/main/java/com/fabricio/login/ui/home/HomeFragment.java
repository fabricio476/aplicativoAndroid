package com.fabricio.login.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.fabricio.login.CadastrarVendas;
import com.fabricio.login.MyAdapter;
import com.fabricio.login.R;
import com.fabricio.login.Venda;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;
                                        //extends AppCompatActivity
public class HomeFragment extends Fragment  {

    private HomeViewModel homeViewModel;
    FloatingActionButton floatingbutton;
    RecyclerView recyclerView;

    Venda venda;
    Venda venda1 = new Venda();
    Venda venda2  = new Venda();
    Venda venda3 = new Venda();
    List<Venda> vendas = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        floatingbutton = root.findViewById(R.id.id_floatingByn);
        recyclerView = root.findViewById(R.id.id_recycler);

        vendas.add(venda1);
        vendas.add(venda3);
        vendas.add(venda2);
        carregarLista();

        floatingbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(getActivity(), CadastrarVendas.class);
                startActivity(in);

               // Intent intentList = new Intent(HomeFragment.this,CadastrarVendas.class);
               // startActivity(intentList);

            }
        });

        recyclerView.setAdapter(new MyAdapter(vendas,getActivity()));

        RecyclerView.LayoutManager layout = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layout);

        return root;
    }



    public void carregarLista(){

        String nome="1111",produto="2222",codigo="3333";
        int id =0;
        for (int i=0;i<=10;i++){

            venda = new Venda();

            vendas.add(venda);

        }
    }





}