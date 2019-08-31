package io.zipcoder.crudapp;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person,Integer> {

    List<Person> findAll();

    Person findOne(int id);

    Person save (Person p);

    Person delete (int id);
}
