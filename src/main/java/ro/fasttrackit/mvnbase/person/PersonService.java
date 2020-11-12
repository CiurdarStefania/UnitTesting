package ro.fasttrackit.mvnbase.person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PersonService {
    private List<Person> persons;
    private int idCounter = 0;


    public PersonService() {
        persons = new ArrayList<>();
    }

    public Person getPersonById(int id) {
        for (Person person : persons) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public Person getPerson(String name) {
        for (Person person : persons) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    public List<String> getAllPersonNames() {
        List<String> result = new ArrayList<>();
        for (Person person : persons) {
            result.add(person.getName());
        }
        return result;
    }

    public List<Person> getAllPerson() {
        return Collections.unmodifiableList(persons);
    }

    public Person addPerson(Person person) {
        var personToAdd = new Person(++idCounter, person.getName(), person.getAge());
        persons.add(personToAdd);
        return personToAdd;
    }

    public List<Person> getPersonsOlderThan(int age) {
        //creem o lista pentru ca ne cere persoanele peste varsta..
        //daca cere o persoana nu creeam o lista
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() >= age) {
                result.add(person);
            }
        }
        return result;
    }

}
