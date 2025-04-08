package com.reto.apiretofranquicia.Domain.Ports.input;

import com.reto.apiretofranquicia.Domain.Model.Franquicia;

import java.util.List;

public interface FranquiciaService {
    Franquicia crearFranquicia(Franquicia franquicia);
    List<Franquicia> getAllFranquicias();
}
