

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
    /*
    @Test
    public void scoreNormalRolTest (){

        String punts = "12345123451234512345";
        int total = 0;
        for (int pos = 0; pos < punts.length(); pos++){
            assertEquals(60, card.scoreNormalRol(punts, pos, total));
    }}*/
    /*
    @Test
    public void scoreSpareRolTest(){
        String pwSpare = "123456789/";
        String pwSpareTwo = "5/5/5/5/5/5/5/5/5/5/5";
        int total = 0;
        for (int pos = 0; pos < pwSpare.length(); pos++){
            assertEquals(55, card.scoreSpareRol(pwSpare, pos, total));}
        int all =0;
        for (int pos = 0; pos < pwSpareTwo.length(); pos++){
            assertEquals(150, card.scoreSpareRol(pwSpareTwo, pos, all));}
    }*/

    @Test
    public void scoreCardTest(){
        String all = "XXX12345/X5/9-X5/";
        int total = 0;
        for (int pos = 0; pos < all.length(); pos ++){
            assertEquals(177, card.scoreCard(all, pos, total));}
    }

}
