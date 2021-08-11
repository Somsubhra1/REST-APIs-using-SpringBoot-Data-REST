package com.somsubhra.springdatarest;

import com.somsubhra.springdatarest.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//"_links": {
//        "self": {
//        "href": "http://localhost:8080/api/users"
//        },
//        "users": {  <-- collectionResourceRel
//        "href": "http://localhost:8080/api/users"
//        }
//        }

@RepositoryRestResource(collectionResourceRel = "aliens", path = "aliens") // automatically creates the api paths
public interface AlienRepo extends JpaRepository<Alien, Integer> {
}
