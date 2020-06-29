package com.rlouzano.cursomc.services;

import com.rlouzano.cursomc.domain.Cliente;
import com.rlouzano.cursomc.domain.Pedido;
import com.rlouzano.cursomc.repositories.ClienteRepository;
import com.rlouzano.cursomc.repositories.PedidoRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido find(Integer id){
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não entrado! Id: " + id + "Objeto não entrado! Id: " ,Pedido.class.getName()));
        }
}