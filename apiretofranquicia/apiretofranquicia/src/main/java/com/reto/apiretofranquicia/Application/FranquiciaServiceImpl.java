package com.reto.apiretofranquicia.Application;

import com.reto.apiretofranquicia.Domain.Model.Franquicia;
import com.reto.apiretofranquicia.Domain.Ports.input.FranquiciaService;
import com.reto.apiretofranquicia.Domain.Ports.output.FranquiciaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class FranquiciaServiceImpl implements FranquiciaService {

    private final FranquiciaRepository repository;

    @Override
    public Franquicia crearFranquicia(Franquicia franquicia){
        return repository.guardar(franquicia);
    }

    @Override
    public List<Franquicia> getAllFranquicias(){
        return repository.findAll();
    }

}
