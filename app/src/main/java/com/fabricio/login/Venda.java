package com.fabricio.login;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Venda {

    @PrimaryKey(autoGenerate = true)
    private int Id;
    @ColumnInfo(name = "cliente")
    private  String cliente;
    @ColumnInfo(name = "produto")
    private String produto;
    @ColumnInfo(name = "codigo")
    private String codigo;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
