public class ScoreCard {

    private int STRIKE = 10;
    private int SPARE = 10;
    private int ZERO = 0;
    private static String symbols = "-123456789X/";

    public ScoreCard() {
    }

    ;

    public int getStrike() {
        return this.STRIKE;
    }


    public int getSpare() {
        return this.SPARE;
    }


    public int calculateStrike(Character strike) {
        if (strike == 'X') {
            return symbols.indexOf(strike);
        } else {
            return this.ZERO;
        }
    }


    public int calculateSpare(Character spare) {
        if (spare == '/') {
            return symbols.indexOf(spare) - 1;
        } else {
            return this.ZERO;
        }
    }

    public int calculatePin(Character bowl) {
        if (bowl == '-') {
            return symbols.indexOf(bowl);
        } else {
            int num = symbols.indexOf(bowl);
            return num;
        }
    }

    public int scoreCard(String card) {
        int total = 0;
        for (int i = 0; i < card.length(); i++) {
            Character normal = card.charAt(i);
            try {
                Character min = card.charAt(i - 1);
                Character spare = card.charAt(i + 1);
                Character strike = card.charAt(i + 2);
                if ((normal == 'X') && (spare == 'X') && (strike == 'X')) {
                    total += calculateStrike(normal) + calculateStrike(spare) + calculateStrike(strike);
                } else if ((normal == 'X') && (spare == 'X') && (strike != 'X')) {
                    total += calculateStrike(normal) + calculateStrike(spare) + calculatePin(strike);
                } else if ((normal == 'X') && (spare != 'X') && (strike == '/')) {
                    total += calculateStrike(normal) + calculateSpare(strike);
                } else if (normal == 'X') {
                    total += calculateStrike(normal) + calculatePin(spare) + calculatePin(strike);
                } else if ((normal == '/') && (spare != 'X')) {
                    total += calculateSpare(normal) + calculatePin(spare) - calculatePin(min);
                } else if ((normal == '/') && (spare == 'X')) {
                    total += calculateSpare(normal) + calculateStrike(spare) - calculatePin(min);
                } else {
                    total += calculatePin(normal);
                }

            } catch (StringIndexOutOfBoundsException spare) {
                if (normal == '/') {
                    total += calculateSpare(normal);
                } else if (normal == 'X') {
                    total += calculateStrike(normal);
                } else {
                    return total;
                }
            }
        }
        return total;
    }

}

