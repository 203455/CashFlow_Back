package com.example.CashFlowBack.controller;

import com.example.CashFlowBack.model.Banco;
import com.example.CashFlowBack.repository.BancoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class BancoController {
    @Autowired
    BancoRepository bancoRepository;

    @GetMapping(value = "/banco/")
    public List<Banco> getAll(){
        List<Banco> response = bancoRepository.findAll();

        if(response!=null){
            return  response;
        }else {
            return null;
        }
    }

    @GetMapping(value = "/banco/semana/{semana}")
    public List<Banco> getBySemana(@PathVariable("semana") Integer semana){
        return bancoRepository.findAllBySemana(semana);
    }

    @PostMapping(value = "/banco/save")
    public Banco saveIndicador(@RequestBody Banco banco){
        return  bancoRepository.save(banco);
    }

    @GetMapping(value = "/banco/{mes}")
    public List<Banco> getByMes(@PathVariable("mes") String mes){
        return bancoRepository.findAllByMes(mes);
    }
}
