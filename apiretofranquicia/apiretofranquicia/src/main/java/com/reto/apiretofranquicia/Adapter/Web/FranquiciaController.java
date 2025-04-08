package com.reto.apiretofranquicia.Adapter.Web;

import com.reto.apiretofranquicia.Domain.Model.Franquicia;
import com.reto.apiretofranquicia.Domain.Ports.input.FranquiciaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/franquicias")
@RequiredArgsConstructor
public class FranquiciaController {

    private final FranquiciaService franquiciaService;

    @PostMapping
    public ResponseEntity<Franquicia> crearFranquicia(@RequestBody Franquicia franquicia){
        Franquicia creada = franquiciaService.crearFranquicia(franquicia);
        return ResponseEntity.created(URI.create("/api/franquicias" + creada.getNombre()))
                .body(creada);
    }

    @GetMapping
    public ResponseEntity<List<Franquicia>>getAllFranquicias(){
        return ResponseEntity.ok(franquiciaService.getAllFranquicias());
    }

}
