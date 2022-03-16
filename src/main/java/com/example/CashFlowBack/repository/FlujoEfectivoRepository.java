package com.example.CashFlowBack.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.CashFlowBack.model.FlujoEfectivo;

import java.util.List;

public interface FlujoEfectivoRepository extends CrudRepository<FlujoEfectivo,String>{
    List<FlujoEfectivo> findAll();

    List<FlujoEfectivo> findAllByMes(String mes);

    FlujoEfectivo findByFlujoEfectivoId(int id_flujo);

    FlujoEfectivo save(FlujoEfectivo flujoEfectivo);
}
