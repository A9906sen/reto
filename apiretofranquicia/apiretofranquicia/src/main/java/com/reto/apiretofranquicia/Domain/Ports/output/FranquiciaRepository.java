package com.reto.apiretofranquicia.Domain.Ports.output;

import com.reto.apiretofranquicia.Domain.Model.Franquicia;

import java.util.List;


public interface FranquiciaRepository {
    Franquicia guardar (Franquicia franquicia);
    List<Franquicia> findAll();
}
