package org.lasencinas.bowlinGame;

public class Tarjeta {

    /* Declaración variables */

    private String tarjetaPuntos = "";
    private int puntacionTotal = 0;
    String pines = "-123456789";
    private int puntuacionTotal;

    private int STRIKE = 10;
    private int SPARE = 10;
    private int CERO = 0;

    /* Constructores */

    public Tarjeta() {
        this.tarjetaPuntos = "";
    }


    public Tarjeta(String tarjetaPuntos) {
        this.tarjetaPuntos = tarjetaPuntos;
    }



    /* getters y setters */

    public int getStrike() {
        return this.STRIKE;
    }

    public int getSpare() { return this.SPARE; }

    public int getPuntacionTotal() {
        return this.puntacionTotal;
    }


    /* Parte privada */

    /* Interfaz Publica */



    public static int computarStrike(char strike) {
        if( strike == 'X' ) {
            return 10;
        } else {
            return 0;
        }

    }


    public int computarSpare(String frame) {

        try {
            if (frame.charAt(1) == '/') {
                return  this.SPARE;
            } else {
                return this.CERO;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return this.CERO;
        }

    }


    public int computarPines(char pins) {
        return this.pines.indexOf(pins);
    }


    public int computarTarjeta(String tarjeta) {

        // if X => strike. if numero, if spare...    esStrike.

        for(int bola = 0; bola < tarjeta.length(); bola++) {
            this.puntuacionTotal += this.computarPines(tarjeta.charAt(bola));
        }

        return this.puntuacionTotal;
    }

}
