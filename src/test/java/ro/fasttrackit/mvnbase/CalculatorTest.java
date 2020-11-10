package ro.fasttrackit.mvnbase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
   @Test
    @DisplayName("Adunarea a doua numere")
   //va trebuii sa scriem setup pentru fiecare metoda
    public void adunare(){
       //SETUP
       Calculator calculator = new Calculator();
       //RUN
       int result =calculator.add(1,1);
       //ASSERT
       assertThat(result).isEqualTo(2);
   }

}