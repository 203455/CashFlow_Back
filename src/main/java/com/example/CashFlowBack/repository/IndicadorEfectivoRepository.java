package com.example.CashFlowBack.repository;

import com.example.CashFlowBack.model.IndicadorEfectivo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IndicadorEfectivoRepository extends CrudRepository<IndicadorEfectivo, String> {

    IndicadorEfectivo save(IndicadorEfectivo indicadorEfectivo);


    public List<IndicadorEfectivo> findAll();

    List<IndicadorEfectivo> findAllByMes(String mes);
}
