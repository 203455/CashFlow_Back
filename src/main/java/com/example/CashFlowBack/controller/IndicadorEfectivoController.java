package com.example.CashFlowBack.controller;

import  com.example.CashFlowBack.model.IndicadorEfectivo;
import com.example.CashFlowBack.model.Usuario;
import  com.example.CashFlowBack.repository.IndicadorEfectivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
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

    @GetMapping(value = "/indicador_efectivo/semana/{semana}")
    public List<IndicadorEfectivo> getBySemana(@PathVariable("semana") Integer semana){
        return indicadorEfectivoRepository.findAllBySemana(semana);
    }

    @PostMapping(value = "/indicador_efectivo/save")
    public IndicadorEfectivo saveIndicador(@RequestBody IndicadorEfectivo indicadorEfectivo){
        return  indicadorEfectivoRepository.save(indicadorEfectivo);
    }

    @GetMapping(value = "/indicador_efectivo/{mes}")
    public List<IndicadorEfectivo> getByMes(@PathVariable("mes") String mes){
        return indicadorEfectivoRepository.findAllByMes(mes);
    }
}

