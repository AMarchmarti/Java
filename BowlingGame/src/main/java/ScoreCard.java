package org.lasencinas.BowlingGame;

public class ScoreCard {

    private String card;

    private ScoreCard(){
    }

    public int getScore(String card){
        int total = 0;
        for (int pos = 0; pos < card.length(); pos ++){
            try{
                int number = card.indexOf((card.charAt(pos)));
                total += number;
            }catch (NumberFormatException number){
                char diff = card.charAt(pos);
                if (diff == '-'){
                    total += 0;
                }
                else if(diff == 'X'){
                    total += 10 + card.indexOf((card.charAt(pos + 1))) + card.indexOf((card.charAt(pos + 2)));
                }
                else if (diff == '/'){
                    total += 10 + card.indexOf((card.charAt(pos + 1)));
                }
            }
        }
        return total;
    }
}
