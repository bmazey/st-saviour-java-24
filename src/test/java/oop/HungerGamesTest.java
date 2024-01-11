package oop;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import oop.entertainment.Books;
import oop.entertainment.HungerGames;

public class HungerGamesTest {
    @Test
    public void testNewHungerGames() {
        HungerGames catching = new HungerGames("Catching Fire");
        
        // Checks that name is Catching Fire
        assertEquals("Catching Fire", catching.getTitle());

        // Assert that Catching Fire is physical
        assertEquals(true, catching.isPhysical());

        // Assert that Catching Fire is a book
        assert catching instanceof Books;
    }
}
