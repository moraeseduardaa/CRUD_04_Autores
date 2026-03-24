package com.epm.autores.controller;

import com.epm.autores.model.AutorModel;
import com.epm.autores.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @PostMapping
    public AutorModel criarAutor(@RequestBody AutorModel autorModel){
        return autorService.criarAutor(autorModel);
    }

    @GetMapping
    public List<AutorModel> listarAutor(){
        return autorService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<AutorModel> buscarAutor(@PathVariable  Long id){
        return autorService.buscarAutor(id);
    }

    @DeleteMapping("/{id}")
    public void deletarAutor(@PathVariable Long id){
        autorService.deletarAutor(id);
    }

}
