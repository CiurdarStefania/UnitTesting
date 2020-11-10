package ro.fasttrackit.mvnbase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


class SumTest {
   Sum sum;
   @BeforeEach
     void setup(){
       sum = new Sum();
   }
   @Test
    @DisplayName("sum(1) = 1")
    void sum1(){
       assertThat(sum.sum(1)).isEqualTo(1);
   }
   @Test
    @DisplayName("sum(2)= 3")
    void sum2(){
       assertThat(sum.sum(2)).isEqualTo(3);
   }
}