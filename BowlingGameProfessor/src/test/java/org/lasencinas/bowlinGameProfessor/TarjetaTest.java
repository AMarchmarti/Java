package org.lasencinas.bowlinGameProfessor;

import org.junit.*;

public class TarjetaTest {

    private Tarjeta tarjeta = null;

    @Before
    public void init() {
        tarjeta = new Tarjeta();
    }


    @Test
    public void computarStrikeTest() {

        Assert.assertEquals(tarjeta.getStrike(), tarjeta.computarStrike('X'));
        Assert.assertEquals(0, tarjeta.computarStrike('9'));
    }


    @Test
    public void computePinTest() {
        String pines = "-123456789";

        for (int i = 0; i < pines.length(); i++) {
            Assert.assertEquals(i, tarjeta.computarPines(pines.charAt(i)));
        }

    }


    @Test
    public void computarTarjetaVeinteBolasTest() {
        String puntuacion = "11111111111111111111";
        tarjeta = new Tarjeta(puntuacion);
        Assert.assertEquals(20, tarjeta.computarTarjeta(puntuacion));
        String pins = "12345123451234512345";
        tarjeta = new Tarjeta(pins);
        Assert.assertEquals(60, tarjeta.computarTarjeta(pins));
        String pinsTwo = "9-9-9-9-9-9-9-9-9-9-";
        tarjeta = new Tarjeta(pinsTwo);
        Assert.assertEquals(90, tarjeta.computarTarjeta(pinsTwo));
        //Vamos a comprobar los casos con strike//
        String strikes = "X9-9-9-9-9-9-9-9-9-";
        tarjeta = new Tarjeta(strikes);
        Assert.assertEquals(100, tarjeta.computarTarjeta(strikes));
        String strikePins = "XXX9-9-9-9-9-9-9-";
        tarjeta = new Tarjeta(strikePins);
        Assert.assertEquals(141, tarjeta.computarTarjeta(strikePins));
        // Vamos a compr

    }





    @Test
    public void computarSpareTest() {

        Assert.assertEquals(10, tarjeta.computarSpare("5/"));
        Assert.assertEquals(0, tarjeta.computarSpare("9X"));

        // comprobar que antes se ha lanzado una bola y no es un Strike.
    }

}