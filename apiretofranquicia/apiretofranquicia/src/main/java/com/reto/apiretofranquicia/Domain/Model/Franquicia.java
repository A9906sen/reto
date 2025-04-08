package com.reto.apiretofranquicia.Domain.Model;

import lombok.Builder;
import lombok.Singular;
import lombok.Value;

import java.util.List;
import java.util.Optional;

@Value
@Builder(toBuilder = true)
public class Franquicia {
    String nombre;
    @Singular ("itemSucursal") List<Sucursal> sucursales;

    public Franquicia agregarSucursal(Sucursal sucursal) {
        return this.toBuilder()
                .itemSucursal(sucursal)
                .build();
    }

    public Optional<Sucursal> buscarSucursal(String nombreSucursal){
        return this.sucursales.stream()
                .filter((s->s.getNombre().equals(nombreSucursal)))
                .findFirst();
    }
}
