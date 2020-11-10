package ro.fasttrackit.mvnbase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AdunariTest {
    Adunari adunari;
    @BeforeEach
    void setup(){
        adunari= new Adunari();
    }
    @Test
    @DisplayName("Adunam 3 numere a, b,c")
    void adunam3Numere(){
        assertThat(adunari.add(12,34,26)).isEqualTo(72);    }

}