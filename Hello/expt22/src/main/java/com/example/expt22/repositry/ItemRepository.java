package com.example.expt22.repositry;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.expt22.model.Item;

public interface ItemRepository extends MongoRepository<Item, String> {

}
