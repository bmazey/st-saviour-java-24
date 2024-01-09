package music;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import oop.music.Pop;
import oop.music.Rock;

public class MusicTest {

    @Test
    public void testPop() {
        Pop WeFoundLove = new Pop("We Found Love", 3);

        assertEquals("Raina listens to We Found Love for 3 minutes.", WeFoundLove.listen("Raina"));
    }
    public void testRock() {
        Rock SmellsLikeTeenSpirit = new Rock("Smells Like Teen Spirit", 4);

        assertEquals("Giovanna listens to Smells Like Teen Spirit for 4 minutes.", SmellsLikeTeenSpirit.listen("Giovanna"));
    }
    
}
