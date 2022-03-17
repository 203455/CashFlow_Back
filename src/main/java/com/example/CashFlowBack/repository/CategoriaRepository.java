package com.example.CashFlowBack.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.CashFlowBack.model.Categoria;

import java.util.List;

public interface CategoriaRepository extends CrudRepository<Categoria,String> {
    List<Categoria> findAll();

    Categoria findByIdcategoria(int idcategoria);

    Categoria save(Categoria categoria);

}