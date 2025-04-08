package com.reto.apiretofranquicia.Adapter.Persistence.Mongodb;

import com.reto.apiretofranquicia.Domain.Model.Franquicia;
import com.reto.apiretofranquicia.Domain.Ports.output.FranquiciaRepository;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class MongoFranquiciaRepository implements FranquiciaRepository {

    private final MongoTemplate mongoTemplate;

    public MongoFranquiciaRepository(MongoTemplate mongoTemplate){
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public Franquicia guardar(Franquicia franquicia){
        return mongoTemplate.save(franquicia);
    }

    @Override
    public List<Franquicia> findAll(){
        return mongoTemplate.findAll(Franquicia.class);
    }

}
