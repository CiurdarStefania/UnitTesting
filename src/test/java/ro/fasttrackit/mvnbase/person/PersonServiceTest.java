package ro.fasttrackit.mvnbase.person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {
    PersonService personService;
    @BeforeEach
    void setup(){
        personService = new PersonService();
    }

    @Test
    @DisplayName("When creating a PersonService then it will have empty person list")
    void emptyPerosnService(){
        assertThat(personService.getAllPerson()).isEmpty();
    }
    @Test
    @DisplayName("when a person is added then the size is increased and ID is set")
    void addPerson(){

    }
    @Test
    @DisplayName("when name contains numbers then IleggalArgumentException is thrown")
    void numbersInName(){
        var exception = Assertions.assertThrows(IllegalArgumentException.class, ()->new Person(1,"Popescu", 33));
        assertThat(exception.getMessage()).isEqualTo("Invalid name: null is not allowed");
    }

}