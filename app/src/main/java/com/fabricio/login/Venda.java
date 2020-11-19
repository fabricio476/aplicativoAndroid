package com.fabricio.login;

public class Venda {


    private int Id;

    private  String cliente;

    private String produto;

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
