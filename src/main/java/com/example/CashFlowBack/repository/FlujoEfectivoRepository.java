package com.example.CashFlowBack.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.CashFlowBack.model.FlujoEfectivo;

import java.util.List;

public interface FlujoEfectivoRepository extends CrudRepository<FlujoEfectivo,String>{
    List<FlujoEfectivo> findAll();

    List<FlujoEfectivo> findAllByMes(String mes);

    FlujoEfectivo findByIdFlujo(int idFlujo);

    FlujoEfectivo save(FlujoEfectivo flujoEfectivo);
}
