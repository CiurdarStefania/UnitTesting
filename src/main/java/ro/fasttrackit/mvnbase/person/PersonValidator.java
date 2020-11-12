package ro.fasttrackit.mvnbase.person;

public class PersonValidator {
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

    public void verify(String name, int age) {
        verifyAge(age);
        verifyName(name);
    }
}
