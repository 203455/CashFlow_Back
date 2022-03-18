package com.example.CashFlowBack.controller;

import com.example.CashFlowBack.model.FlujoEfectivo;
import com.example.CashFlowBack.repository.FlujoEfectivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class FlujoEfectivoController {

    @Autowired
    FlujoEfectivoRepository flujoEfectivoRepository;

    @GetMapping(value = "/listaFlujoEfectivo")
    public List<FlujoEfectivo> getlistaFlujoEfectivo(){
        return flujoEfectivoRepository.findAll();
    }

    @PostMapping(value ="/flujoEfectivo/add")
    public FlujoEfectivo addflujoEfectivo(@RequestBody FlujoEfectivo flujoEfectivo){
        return flujoEfectivoRepository.save(flujoEfectivo);
    }
}
