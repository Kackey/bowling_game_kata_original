package com.kackey.bgk;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {
    @Test
    public void testGutterGame() throws Exception {
        Game g = new Game();
        for (int i=0; i<20; i++)
            g.roll(0);
    }
}
