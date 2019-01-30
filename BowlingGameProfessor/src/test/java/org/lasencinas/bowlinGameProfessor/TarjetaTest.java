package org.lasencinas.bowlinGame;

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

    }





    @Test
    public void computarSpareTest() {

        Assert.assertEquals(10, tarjeta.computarSpare("5/"));
        Assert.assertEquals(0, tarjeta.computarSpare("9X"));

        // comprobar que antes se ha lanzado una bola y no es un Strike.
    }

}