package org.lasencinas;


public class ScoreCard {

    private int STRIKE = 10;
    private int SPARE = 10;
    private int ZERO = 0;
    private static String symbols = "-123456789X/";

    public ScoreCard() {
    }


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
                Character spare = card.charAt(i + 1);
                /*
                Character strike = card.charAt(i + 2);
                if (normal == 'X'){
                    if ((spare == 'X') && (strike == 'X')) {
                        total += calculateStrike(normal) + calculateStrike(spare) + calculateStrike(strike);
                    } else if ((spare == 'X') && (strike != 'X')) {
                        total += calculateStrike(normal) + calculateStrike(spare) + calculatePin(strike);
                    } else if ((spare != 'X') && (strike == '/')) {
                        total += calculateStrike(normal) + calculateSpare(strike);
                    } else {
                        total += calculateStrike(normal) + calculatePin(spare) + calculatePin(strike);
                    }
                    */
                if (normal == '/'){
                    if (spare != 'X') {
                        total += calculateSpare(normal) + calculatePin(spare) - calculatePin(card.charAt(i - 1));
                    } else if (spare == 'X') {
                        total += calculateSpare(normal) + calculateStrike(spare) - calculatePin(card.charAt(i - 1));
                    }
                } else {
                    total += calculatePin(normal);
                }
            } catch (StringIndexOutOfBoundsException spare) {
                if (normal == '/') {
                    total += calculateSpare(normal);
                } else if (normal == 'X') {
                    total += calculateStrike(normal);
                } else {
                    if (card.charAt(i - 1) != '/'){
                        total += calculatePin(normal);
                    }else{
                        return total;
                    }
                }
            }
        }
        return total;
    }
/*
    public void scoreStrike(Character normal, Character spare, Character strike, int total) {
        if ((spare == 'X') && (strike == 'X')) {
            total += calculateStrike(normal) + calculateStrike(spare) + calculateStrike(strike);
        } else if ((spare == 'X') && (strike != 'X')) {
            total += calculateStrike(normal) + calculateStrike(spare) + calculatePin(strike);
        } else if ((spare != 'X') && (strike == '/')) {
            total += calculateStrike(normal) + calculateSpare(strike);
        } else {
            total += calculateStrike(normal) + calculatePin(spare) + calculatePin(strike);
        }
    }

    public void scoreSpare(Character normal, Character spare, Character min, int total) {
        if (spare != 'X') {
            total += calculateSpare(normal) + calculatePin(spare) - calculatePin(min);
        } else if (spare == 'X') {
            total += calculateSpare(normal) + calculateStrike(spare) - calculatePin(min);
        }
    }
    */
}

