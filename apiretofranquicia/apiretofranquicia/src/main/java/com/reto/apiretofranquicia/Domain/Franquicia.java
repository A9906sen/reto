package com.reto.apiretofranquicia.Domain;

import lombok.Builder;
import lombok.Singular;
import lombok.Value;

import java.util.List;

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
}
