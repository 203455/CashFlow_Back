package com.example.CashFlowBack.repository;

import com.example.CashFlowBack.model.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {

    Usuario findUsuarioByCorreo(String correo);

    Usuario save(Usuario usuario);

}
