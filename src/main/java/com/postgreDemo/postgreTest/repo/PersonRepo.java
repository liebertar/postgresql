package com.postgreDemo.postgreTest.repo;

import com.postgreDemo.postgreTest.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface PersonRepo extends JpaRepository<Person, Long>{

}
