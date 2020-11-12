package ro.fasttrackit.mvnbase.person;

import java.util.Objects;

public class Person {
    private final int id;
    private final String name;
    private final int age;


    public Person(int id, String name, int age) {
        verifyName(name);
        verifyAge(age);
        this.id = id;
        this.name = name;
        this.age = age;
    }

    private void verifyAge(final int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid age: 0 -> 120");
        }
    }

    private void verifyName(final String name) {
        if (name == null) {
            throw new IllegalArgumentException("Invalid name: null is not allowed");
        }
        for (char letter : name.toCharArray()) {
            if (!Character.isAlphabetic(letter) && !Character.isWhitespace(letter) && letter != '-' && letter != '\'') {
                throw new IllegalArgumentException("Invalid name");
            }
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
