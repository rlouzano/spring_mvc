package com.rlouzano.cursomc.services;

import com.rlouzano.cursomc.domain.Categoria;
import com.rlouzano.cursomc.domain.Cliente;
import com.rlouzano.cursomc.repositories.CategoriaRepository;
import com.rlouzano.cursomc.repositories.ClienteRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public Cliente find(Integer id){
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não entrado! Id: " + id + "Objeto não entrado! Id: " ,Cliente.class.getName()));
        }
}