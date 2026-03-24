package com.epm.autores.service;

import com.epm.autores.model.AutorModel;
import com.epm.autores.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public AutorModel criarAutor(AutorModel autorModel){
        return autorRepository.save(autorModel);
    }

    public List<AutorModel> findAll(){
        return autorRepository.findAll();
    }

    public Optional<AutorModel> buscarAutor(Long id){
        return autorRepository.findById(id);
    }

    public void deletarAutor(Long id){
        autorRepository.deleteById(id);
    }

}
