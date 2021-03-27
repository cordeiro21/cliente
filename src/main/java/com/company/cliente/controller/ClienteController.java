package com.company.cliente.controller;

import com.company.cliente.model.Cliente;
import com.company.cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ClienteController {

    final
    ClienteService sevice;

    public ClienteController(ClienteService sevice) {
        this.sevice = sevice;
    }


    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente){
        return sevice.salvar(cliente);
    }

    @GetMapping
    public List<Cliente> lista(){
        return sevice.listar();
    }
}
