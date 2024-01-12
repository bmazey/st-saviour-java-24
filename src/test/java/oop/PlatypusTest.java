package oop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import oop.mammals.Mammal;
import oop.mammals.Platypus;

public class PlatypusTest {
    
    @Test
    public void testNewPlatypus() {
        Platypus perry = new Platypus("Perry");
        
        // First check name.
        assertEquals("Perry", perry.getName());

        // Check default size of nest.
        assertEquals(0, perry.getNest().size());

        // Assert that Perry is warm-blooded.
        assertEquals(true, perry.isWarmBlooded());

        // Assert that Perry is a Mammal
        assert perry instanceof Mammal ;
        
        // Feed Perry
        assertEquals("Perry eats ants! Om nom nom ...", perry.eat("ants"));
    }
}
