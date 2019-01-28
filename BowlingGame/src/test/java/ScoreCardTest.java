package org.lasencinas.BowlingGame;

import org.junit.Test;
import static org.junit.Assert.*;

public class ScoreCardTest {

    @Test
    private void ScoresTest(){
        String puntuation = "1234512345";
        ScoreCard card = new ScoreCard();
        assertEquals(30, card.getScore(puntuation));

    }
}
