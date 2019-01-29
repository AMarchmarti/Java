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

    public int scoreNormalRol (String card, int total){
        for (int pos = 0; pos < card.length(); pos++){
            total += getBowl(card.charAt(pos));
        }
        return total;
    }
    /*
    public int scoreStrikeRol (String card, int total){
        for (int pos = 0; pos < card.length(); pos++){
            Character variable = card.charAt(pos);
            if (variable == 'X') {
                try{
                    int num = getSpare(card.charAt(pos  + 1));
                    int numb = getSpare(card.charAt(pos + 2));
                    total += getStrike(variable) + num + numb;
                }catch (NumberFormatException num){


            }
    }
    */
    public int scoreSpareRol (String card, int total){
        for (int pos = 0; pos < card.length(); pos++){
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
                    return total;
                }
            }
        }
        return total;}
}
