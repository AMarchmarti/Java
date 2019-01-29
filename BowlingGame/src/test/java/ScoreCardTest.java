

import org.junit.Test;
import static org.junit.Assert.*;


public class ScoreCardTest {


    @Test
    public void ScoreTest(){
        ScoreCard card = new ScoreCard();
        String str = "-123456789X/";
        Character x = 'X';
        Character spare = '/';
        Character script = '-';
        Character num = '6';
        assertEquals(10, card.getStrike('X'));
        assertEquals(10, card.getSpare('/'));
        assertEquals(0, card.getBowl('-'));
        assertEquals(6, card.getBowl('6'));

    }
}
