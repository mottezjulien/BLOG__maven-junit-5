package fr.jmottez.lessons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Calcul_Test {

    private Calcul calcul = new Calcul();

    @Test
    public void test() {
        assertEquals(5, calcul.add(2, 3));
    }

}