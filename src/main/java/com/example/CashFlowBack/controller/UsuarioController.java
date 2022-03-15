package com.example.CashFlowBack.controller;

import com.example.CashFlowBack.model.Usuario;
import com.example.CashFlowBack.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping(value = "/usuario/{correo}")
    public Usuario getUsuario(@PathVariable("correo") String correo ){
        return usuarioRepository.findUsuarioByCorreo(correo);
    }

    @PostMapping(value = "/usuario/save")
    public  Usuario saveUsuario(@RequestBody Usuario usuario){
        return  usuarioRepository.save(usuario);
    }
}
