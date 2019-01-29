

import org.junit.Test;
import static org.junit.Assert.*;


public class ScoreCardTest {
    ScoreCard card = new ScoreCard();

    @Test
    public void bowlsTest(){

        Character x = 'X';
        Character spare = '/';
        Character script = '-';
        Character num = '6';
        assertEquals(10, card.getStrike('X'));
        assertEquals(10, card.getSpare('/'));
        assertEquals(0, card.getBowl('-'));
        assertEquals(6, card.getBowl('6'));

    }

    @Test
    public void scoreNormalRolTest (){

        String punts = "12345123451234512345";
        int total = 0;
        assertEquals(60, card.scoreNormalRol(punts, total));
    }
}
