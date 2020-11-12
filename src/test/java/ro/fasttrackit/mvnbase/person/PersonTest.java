package ro.fasttrackit.mvnbase.person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    @DisplayName("when a simple person is created Then no exception are thrown")
    void simplePerson() {
        Person person = new Person(133, "Mihai", 30);
        assertThat(person.getId()).isEqualTo(133);
        assertThat(person.getName()).isEqualTo("Mihai");
        assertThat(person.getAge()).isEqualTo(30);
    }

    @Test
    @DisplayName("when name is a null then IllegalArgumentException is thrown")
    void nullNamePerosn() {
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> new Person(1, null, 33));
        assertThat(exception.getMessage()).isEqualTo("Invalid name: null is not allowed");
    }

    @Test
    @DisplayName("when name contains numbers then IllegalArgumentException is thrown")
    void numbersInName() {
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> new Person(1, "PopescuNr1", 33));
        assertThat(exception.getMessage()).isEqualTo("Invalid name");
    }

    @Test
    @DisplayName("when name contains illegal chars then IllegalArgumentException is thrown")
    void spacialCharName() {
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> new Person(1, "#Emma", 33));
        assertThat(exception.getMessage()).isEqualTo("Invalid name");
    }

    @Test
    @DisplayName("when name contains 'or - then it is accepted")
    void spacialName() {
        var response = new Person(1, "Maria-Ana B'", 33);
        assertThat(response)
                .extracting("name", "age")
                .containsExactly("Maria-Ana B'", 33);
    }

    @Test
    @DisplayName("when age is less then 0 or greater then 120 then IllegalArgumentException is thrown")
    void invalidAge() {
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> new Person(1, "Mihai", -1));

        assertThat(exception.getMessage()).isEqualTo("Invalid age: 0 -> 120");

    }

}