package ro.fasttrackit.mvnbase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    //scriem setupul la inceptul si cu adontarea @BeforeEach il va lua inainte de fiecare test
    //nu trebuie scris la fiecare metoda
    Factorial factorial;
    @BeforeEach
   void setup(){
        factorial = new Factorial();
    }
    @Test
    @DisplayName("factorial de 1")
   void test1(){
        assertThat(factorial.factorial(1)).isEqualTo(1);
    }
    @Test
    @DisplayName("suma a doua numere a si b ")
        void sumaADouaNmere(){
            assertThat(factorial.suma(3,15)).isEqualTo(18);
        }


}