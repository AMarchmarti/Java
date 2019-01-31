package org.lasencinas.bowlinGameProfessor;

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



    public void computarStrike(int bola, String tarjeta) {
        /*
        for (int next = 1; next <=2; next++){
            if (tarjeta.charAt(bola + next) == 'X'){
                this.puntuacionTotal += this.STRIKE;
            }else if (tarjeta.charAt(bola + next) == '/'){
                this.puntuacionTotal += this.STRIKE + this.SPARE;
            }else{
                this.puntuacionTotal += this.STRIKE + this.computarPines(tarjeta.charAt(bola + next));
            }
        }}*/

        if ((tarjeta.charAt(bola + 1) == 'X') && (tarjeta.charAt(bola + 2) == 'X')) {
            this.puntuacionTotal += this.STRIKE * 3;
        } else if ((tarjeta.charAt(bola + 1) == 'X') && (tarjeta.charAt(bola + 2) != 'X')) {
            this.puntuacionTotal += this.STRIKE * 2 + this.computarPines(tarjeta.charAt(bola + 2));
        } else if ((tarjeta.charAt(bola + 1) != 'X') && (tarjeta.charAt(bola + 2)) == '/') {
            this.puntuacionTotal += this.STRIKE * 2;
        } else
            this.puntuacionTotal += this.STRIKE + computarPines(tarjeta.charAt(bola + 1)) + this.computarPines(tarjeta.charAt(bola + 2));
    }




    public void computarSpare(int pos, String tarjeta) {

        try {
            Character a = tarjeta.charAt(pos + 1);
            this.puntuacionTotal -= this.computarPines(tarjeta.charAt(pos - 1));
            if (a == 'X') {
                this.puntuacionTotal += this.SPARE + this.STRIKE;
            } else {
                this.puntuacionTotal += this.SPARE + this.computarPines(a);
            }
        } catch (StringIndexOutOfBoundsException a) {
            this.puntuacionTotal += this.SPARE;
        }

    }

    public Boolean extraFrame (String tarjeta){
        if
    }


    public int computarPines(char pins) {
        return this.pines.indexOf(pins);
    }


    public int computarTarjeta(String tarjeta) {

        // if X => strike. if numero, if spare...    esStrike.
        Character specialFrame = tarjeta.charAt(tarjeta.length() - 3);
        Character special = tarjeta.charAt(tarjeta.length() - 2);
        for (int bola = 0; bola < tarjeta.length(); bola++) {
            Character actual = tarjeta.charAt(bola);
            if ((specialFrame == 'X') && (bola == tarjeta.length() - 3 )){
                computarStrike(bola, tarjeta);
                return this.puntuacionTotal;
            }else if ((special == '/') && (bola == tarjeta.length() - 2)){
                computarSpare(bola,tarjeta);
                return this.puntuacionTotal;
            }else{
                 if (actual == 'X') {
                    computarStrike(bola, tarjeta);
                } else if (actual == '/') {
                    computarSpare(bola, tarjeta);
                } else {
                    this.puntuacionTotal += this.computarPines(actual);
                }}}

            return this.puntuacionTotal;
        }
    }

