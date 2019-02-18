public class ScoreCard {

    public ScoreCard(){};

    public int getStrike(Character strike){
        if (strike == 'X'){
            return 10;
        }else{
            return strike;
        }
    }


    public int getSpare(Character spare){
        if (spare == '/'){
            return 10;
        }else{
            return spare;
        }
    }

    public int getBowl (Character bowl){
        if (bowl == '-'){
            return 0;
        }else{
            int num = Character.getNumericValue(bowl);
            return num;
        }
    }

    public void scoreNormalRol (String card, int pos, int total){

        total += getBowl(card.charAt(pos));
    }

    public void scoreSpareRol (String card, int pos, int total){
        Character variable = card.charAt(pos);
        try{
            Character var = card.charAt(pos + 1);
            if (variable == '/'){
                total += getSpare(variable) + getBowl(var) - getBowl(card.charAt(pos - 1));

            }else{
                total += getBowl(variable);
            }}
        catch (StringIndexOutOfBoundsException var){
            if (variable == '/'){
                total += getSpare(variable);

            }else{
                total += 0;
            }
        }}


    public int scoreCard (String card, int pos, int total){
        Character var = card.charAt(pos);
        if (var == '/'){
            scoreSpareRol(card, pos, total);
        }else if(var == 'X')
    }
}
