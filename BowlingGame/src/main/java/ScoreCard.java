public class ScoreCard {

    public ScoreCard(){};

    public int getStrike(Character strike){
        if (strike == 'X'){
            return 10;
        }else{
            return 0;
        }
    }


    public int getSpare(Character spare){
        if (spare == '/'){
            return 10;
        }else{
            return 0;
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
}
