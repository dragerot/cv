package net.compontents;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ListOfPersons {
    private List<Person> persons;

    public List<Person> getPersons(){
        if(persons!= null) return persons;
        else persons = getAllpersons();
        return persons;
    }

    private List<Person> getAllpersons(){
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Person("ssn1","p1"));
        persons.add(new Person("ssn2","p2"));
        persons.add(new Person("ssn3","p3"));
        persons.add(new Person("ssn4","p4"));
        persons.add(new Person("ssn5","p5"));

        return persons;
    }
}
