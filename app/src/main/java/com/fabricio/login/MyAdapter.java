package com.fabricio.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter{

    private List<Venda> vendas;
    private Context context;



    public MyAdapter(List<Venda> vendas,Context context ){
        this.vendas = vendas;
       this.context = context;
    }



    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_venda, parent, false);




        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {

        MyViewHolder holder = (MyViewHolder) viewHolder;

        Venda venda = vendas.get(position);

        holder.nome.setText(venda.getCliente());
        holder.produto.setText(venda.getProduto());
        holder.codigo.setText(venda.getCodigo());

    }

    @Override
    public int getItemCount() {
        return vendas.size();
    }
}
