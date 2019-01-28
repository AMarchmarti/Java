public class ScoreCard {

    private String card;

    private ScoreCard(){}

    public int getNull(String card){
        for (int pos = 0; pos < card.length(); pos ++){
            if (card.indexOf(pos) == '-'){
                return
            }
        }
    }
}
