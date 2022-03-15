package com.example.CashFlowBack.controller;

import  com.example.CashFlowBack.model.IndicadorEfectivo;
import com.example.CashFlowBack.model.Usuario;
import  com.example.CashFlowBack.repository.IndicadorEfectivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class IndicadorEfectivoController {
    @Autowired
    IndicadorEfectivoRepository indicadorEfectivoRepository;

    @GetMapping(value = "/indicador_efectivo/")
    public List<IndicadorEfectivo> getAll(){
        List<IndicadorEfectivo> response = indicadorEfectivoRepository.findAll();

        if(response!=null){
            return  response;
        }else {
            return null;
        }
    }

    @PostMapping(value = "/indicador_efectivo/save")
    public IndicadorEfectivo saveIndicador(@RequestBody IndicadorEfectivo indicadorEfectivo){
        return  indicadorEfectivoRepository.save(indicadorEfectivo);
    }
}
