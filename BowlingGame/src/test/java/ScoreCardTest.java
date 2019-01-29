

import org.junit.Test;
import static org.junit.Assert.*;


public class ScoreCardTest {
    ScoreCard card = new ScoreCard();

    @Test
    public void bowlsTest(){
        String symbols = "-123456789X/";
        for (int index = 0; index < symbols.length(); index ++){
            if (symbols.charAt(index) == '/'){
                assertEquals(10, card.getSpare(symbols.charAt(index)));
            }else if (symbols.charAt(index) == 'X') {
                assertEquals(10, card.getStrike(symbols.charAt(index)));
            }else {
                assertEquals(index,card.getBowl(symbols.charAt(index)));
            }
        }
    }

    @Test
    public void scoreNormalRolTest (){

        String punts = "12345123451234512345";
        int total = 0;
        assertEquals(60, card.scoreNormalRol(punts, total));
    }

    @Test
    public void scoreSpareRolTest(){
        String pwSpare = "123456789/";
        String pwSpareTwo = "5/5/5/5/5/5/5/5/5/5/5";
        int total = 0;
        assertEquals(55, card.scoreSpareRol(pwSpare, total));
        assertEquals(150, card.scoreSpareRol(pwSpareTwo, total));
    }
}
