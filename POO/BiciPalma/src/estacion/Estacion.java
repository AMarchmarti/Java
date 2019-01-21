

package estacion;

import bicicleta.Bicicleta;
import tarjetaUsuario.TarjetaUsuario;

import java.util.concurrent.ThreadLocalRandom;

public class Estacion {

        private int id = 0;
        private String direccion = null;
        private int numeroAnclajes = 0;
        private Bicicleta [] anclajes = null;


        public Estacion (int id, String direccion, int numeroAnclajes){

                this.id = id;
                this.direccion = direccion;
                this.numeroAnclajes = numeroAnclajes;
                this.anclajes = new Bicicleta[numeroAnclajes];

        }


        public int getId(){
                return this.id;
        }


        public String getDireccion(){
                return this.direccion;
        }


        public int getNumeroAnclajes(){
                return this.numeroAnclajes;
        }


        public void consultarEstacion(){
                System.out.println("id: " + getId());
                System.out.println("Direccion: " + getDireccion());
                System.out.println("Numero de anclajes: " + getNumeroAnclajes());
        }


        public int anclajesLibres(){
            int anclajesLibres = 0;
            for (Bicicleta anclajes : this.anclajes){
                    if (anclajes == null){
                        anclajesLibres ++;
                    }
            }
            return anclajesLibres;
        }


        public void consultarAnclajes(){
                int posicion = 0;
                int numeroAnclaje = 1;
                for (Bicicleta anclaje : this.anclajes){
                        if (anclaje != null) {
                                System.out.println("Este anclaje " + numeroAnclaje + " esta ocupsdo por " + this.anclajes[posicion].getId());

                        }else{
                                System.out.println("Este anclaje " + numeroAnclaje + " esta libre.");

                        }
                        numeroAnclaje ++;
                        posicion ++;
                }
        }


        public void anclarBicicleta(Bicicleta bici){
                int posicion = 0;
                int numeroAnclaje = 1;
                for (Bicicleta anclaje : this.anclajes){
                        if (anclaje != null){
                                posicion ++;
                                numeroAnclaje ++;
                        }else{
                                this.anclajes[posicion] = bici;
                                mostrarAnclaje(bici, numeroAnclaje);
                                break;
                        }
                }
        }


        public void mostrarAnclaje(Bicicleta bici, int numeroAnclaje){
                System.out.println("La bicicleta " + bici.getId() + " esta anclada en " + numeroAnclaje);
        }


        public void mostrarBicicleta(Bicicleta bici, int numeroAnclaje){
                System.out.println("La bicicleta " + bici.getId() + " estaba anclada en " + numeroAnclaje);
        }


        public Boolean leerTajetaUsuario(TarjetaUsuario tarjetaUsuario){
                return tarjetaUsuario.getActivada();
        }


        public void retirarBicicleta(TarjetaUsuario tarjetaUsuario){

                if (leerTajetaUsuario(tarjetaUsuario)){
                        Boolean sitioOcupado = true;
                        while (sitioOcupado){

                        }

                }
        }


        public int generarAnclaje(){
                int posicionAzar = ThreadLocalRandom.current().nextInt(0, this.anclajes.length);
                return posicionAzar;
        }





}
