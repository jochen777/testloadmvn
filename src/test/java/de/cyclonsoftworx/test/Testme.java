package de.cyclonsoftworx.test;

import de.cyclonsoftworx.testlib.Summe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Testme {
    @Test
    public void test() {
        Summe summe = new Summe();
        assertEquals(4, summe.summe(2,2));
    }

}
