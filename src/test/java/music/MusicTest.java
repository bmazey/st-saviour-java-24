package music;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import oop.music.Pop;

public class MusicTest {

    @Test
    public void testPop() {
        Pop WeFoundLove = new Pop("We Found Love", 3);

        assertEquals("Raina listens to We Found Love for 3 minutes.", WeFoundLove.listen("Raina"));
    }
    
}
