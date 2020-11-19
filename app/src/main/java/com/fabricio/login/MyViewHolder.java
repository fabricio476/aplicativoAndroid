package com.fabricio.login;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    final TextView nome;
    final TextView produto;
    final TextView codigo;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        nome = (TextView) itemView.findViewById(R.id.id_item_nome);
        produto = (TextView) itemView.findViewById((R.id.id_item_produto));
        codigo = (TextView) itemView.findViewById(R.id.id_item_codigo);

    }
}
