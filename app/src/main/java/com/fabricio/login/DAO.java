package com.fabricio.login;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DAO {


    //buscar todos os usuarios(esse é um metodo abstrato por isso que não tem{})
    @Query("SELECT * FROM Venda")
    List<Venda> getAll();
    @Query("SELECT * FROM Venda WHERE codigo like :codigoVenda limit 1")
    Venda findByCod(String codigoVenda);

    @Insert
    void insert(Venda venda);
    @Insert
    void insertAll(List<Venda> vendas);
    @Insert
    void update(Venda venda);
    @Insert
    void delete(Venda venda);



}
