package com.reto.apiretofranquicia.Domain.Model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class Producto {
    String nombre;
    int stock;

    @java.beans.ConstructorProperties({"nombre", "stock"})
    Producto(String nombre, int stock) {
        if ((nombre == null || nombre.isBlank())) {
            throw new IllegalArgumentException("Nombre no puede estar vacio");
        }
        if (stock < 0) {
            throw new IllegalArgumentException("Stock no puede ser menor a cero");
        }
        this.nombre = nombre;
        this.stock = stock;
        }
    }

