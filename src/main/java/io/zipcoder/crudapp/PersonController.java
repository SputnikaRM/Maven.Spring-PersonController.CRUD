package io.zipcoder.crudapp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {



    @PostMapping("/people")
    ResponseEntity<Person> createPerson(@RequestBody Person p){
      //  return new ResponseEntity<>("201", HttpStatus.CREATED);
        return null;
    }

    @GetMapping("/people/{id}")
    public Person getPerson(@PathVariable int id){return null;}

    @GetMapping("/people")
    public List<Person> getPersonList(){return null;}

    @PutMapping("/people/{id}")
    public Person updatePerson(@RequestBody Person p){return null;}

    @DeleteMapping("/people/{id}")
    public void deletePerson(@PathVariable int id){}
}
