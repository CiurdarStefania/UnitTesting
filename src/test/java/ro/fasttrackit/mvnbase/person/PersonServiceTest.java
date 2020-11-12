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



}