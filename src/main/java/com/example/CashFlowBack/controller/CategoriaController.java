package com.example.CashFlowBack.controller;

import com.example.CashFlowBack.model.Categoria;
import com.example.CashFlowBack.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.lang.Boolean;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:3000")
public class CategoriaController {
    @Autowired
    CategoriaRepository categoriaRepository;

    @GetMapping(value = "/listaCategorias")
    public List<Categoria> getListaCategorias(){
        return categoriaRepository.findAll();
    }

    @GetMapping(value = "/categoria/{id}")
    public Categoria getCategoria(@PathVariable("id") int id ){
        return categoriaRepository.findByIdCategoria(id);
    }

    @PostMapping(value ="/categoria/add")
    public Categoria addCategoria(@RequestBody Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    @PutMapping(path = "/categoria/update/{id}", consumes = {
            MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE
    },
            produces = {
                    MediaType.APPLICATION_XML_VALUE,
                    MediaType.APPLICATION_JSON_VALUE
            })
    public boolean updateCategoria(@PathVariable int id, @RequestBody Categoria categoria){
        Categoria c = categoriaRepository.findByIdCategoria(id);
        if(c != null){

            c.setSubCategoria(categoria.getSubCategoria());
            categoriaRepository.save(c);
            return  true;
        }else{
            return  false;
        }
    }
}