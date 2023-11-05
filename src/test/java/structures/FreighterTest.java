package structures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FreighterTest {
    
    @Test
    public void testFreighterStack() {
        // create a new Freighter Stack
        Freighter SSAnne = new Freighter();

        // add an item to the Containers stack
        SSAnne.push("Pokeball");

        // check that isEmpty() returns false
        assertEquals(false, SSAnne.isEmpty());

        // pop an item off the S.S. Anne's Containers list
        assertEquals("Pokeball", SSAnne.pop());

        // now check again to see if Containers is empty
        assertEquals(true, SSAnne.isEmpty());

        // now let's load and unload some containers
        SSAnne.push("Paralyze Heal");
        SSAnne.push("Repel");
        SSAnne.push("Super Potion");

        // check order of stack
        assertEquals("Super Potion", SSAnne.top());
        assertEquals("Paralyze Heal", SSAnne.bottom());

        // take an item off
        assertEquals("Super Potion", SSAnne.pop());

        // verify the new top item
        assertEquals("Repel", SSAnne.top());

        // take all items off
        assertEquals("Repel", SSAnne.pop());
        assertEquals("Paralyze Heal", SSAnne.pop());

        // finally, check emptiness
        assertEquals(true, SSAnne.isEmpty());
    }
}
