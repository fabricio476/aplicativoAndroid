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
import androidx.room.Room;

import com.fabricio.login.CadastrarVendas;
import com.fabricio.login.MyAdapter;
import com.fabricio.login.MyDatabase;
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
    private MyDatabase db;
    Venda venda;

    List<Venda> vendas = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        db = Room.databaseBuilder(getActivity(), MyDatabase.class,"MeuDB").build();
        floatingbutton = root.findViewById(R.id.id_floatingByn);
        recyclerView = root.findViewById(R.id.id_recycler);


        carregarLista();

        floatingbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(getActivity(), CadastrarVendas.class);
                startActivity(in);

            }
        });

        recyclerView.setAdapter(new MyAdapter(vendas,getActivity()));

        RecyclerView.LayoutManager layout = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layout);

        return root;
    }


    public void carregarLista(){

        new Thread(new Runnable() {
            @Override
            public void run() {

                vendas.addAll(db.vendasDao().getAll());

            }
        }).start();

    }





}