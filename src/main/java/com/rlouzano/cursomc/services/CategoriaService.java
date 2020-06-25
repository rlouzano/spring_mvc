package com.rlouzano.cursomc.services;

import com.rlouzano.cursomc.domain.Categoria;
import com.rlouzano.cursomc.repositories.CategoriaRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria find(Integer id){
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não entrado! Id: " + id + "Objeto não entrado! Id: " ,Categoria.class.getName()));
        }
}