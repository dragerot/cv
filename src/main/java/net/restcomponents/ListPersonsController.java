package net.restcomponents;

import net.compontents.ListOfPersons;
import net.compontents.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//http://localhost:8080/toregard/persons
@RestController
@RequestMapping("toregard")
public class ListPersonsController {

    @Autowired
    ListOfPersons persons;

    @RequestMapping("/persons")
    public List<Person> getPersons() {
        return persons.getPersons();
    }

}
