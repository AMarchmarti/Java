package org.lasencinas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class BowlingTest {
    ScoreCard card = new ScoreCard();

@Test
public void bowlsTest() {
    
    String symbols = "-123456789X/";
    for (int index = 0; index < symbols.length(); index++) {
        if (symbols.charAt(index) == '/') {
            assertEquals(10, card.calculateSpare(symbols.charAt(index)));
        } else if (symbols.charAt(index) == 'X') {
            assertEquals(10, card.calculateStrike(symbols.charAt(index)));
        } else {
            assertEquals(index, card.calculatePin(symbols.charAt(index)));
        }
    }
}

@Test
public void scoreCardTest(){
    String basic = "12345123451234512345";
    String spare = "5/5/5/5/5/5/5/5/5/5/5";
    String spareStrike = "123456789/X";
    String advanced = "XXXXXXXXXX5/";
    String advancedplus = "X12345/X9/87XX9/X";
    String fina = "XXXXXXXXXX";
    String strange = "XXXXXXXXXX9-";
    assertEquals(60, card.scoreCard(basic));
    assertEquals(150, card.scoreCard(spare));
    assertEquals(66, card.scoreCard(spareStrike));
    /*
    assertEquals(285, card.scoreCard(advanced));
    assertEquals(174, card.scoreCard(advancedplus));
    assertEquals(300, card.scoreCard(fina));
    assertEquals(29, card.scoreCard(strange));
    */
}
}
