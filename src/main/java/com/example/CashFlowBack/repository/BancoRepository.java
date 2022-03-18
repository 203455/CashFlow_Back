package com.example.CashFlowBack.repository;

import com.example.CashFlowBack.model.Banco;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BancoRepository extends CrudRepository<Banco, String> {

    Banco save(Banco banco);

    public List<Banco> findAll();

    List<Banco> findAllByMes(String mes);
}
