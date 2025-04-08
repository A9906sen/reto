package com.reto.apiretofranquicia.Domain.Model;

import lombok.Builder;
import lombok.Singular;
import lombok.Value;

import java.util.List;

@Value
@Builder(toBuilder = true)
public class Sucursal {
    String nombre;
    @Singular
    List<Producto> productos;

    public Sucursal agregarProducto(Producto producto) {
        return this.toBuilder()
                .producto(producto)
                .build();
    }
}