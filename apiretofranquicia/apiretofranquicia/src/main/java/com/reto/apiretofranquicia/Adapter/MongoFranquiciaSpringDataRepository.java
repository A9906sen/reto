package com.reto.apiretofranquicia.Adapter;

import com.reto.apiretofranquicia.Domain.Franquicia;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MongoFranquiciaSpringDataRepository extends MongoRepository<Franquicia, String> {
    List<Franquicia> findByNombre(String nombre);
}
