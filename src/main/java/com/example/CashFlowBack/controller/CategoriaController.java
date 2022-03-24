package com.example.CashFlowBack.controller;

import com.example.CashFlowBack.model.Categoria;
import com.example.CashFlowBack.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CategoriaController {
    @Autowired
    CategoriaRepository categoriaRepository;

    @GetMapping(value = "/listaCategorias")
    public List<Categoria> getListaCategorias(){
        return categoriaRepository.findAll();
    }

    @GetMapping(value ="/categora/id")
    public Categoria getCategoria(@RequestBody Categoria categoria){
        return categoriaRepository.findByIdCategoria(categoria.getIdCategoria());
    }

    @PostMapping(value ="/categoria/add")
    public Categoria addCategoria(@RequestBody Categoria categoria){
        return categoriaRepository.save(categoria);
    }
}