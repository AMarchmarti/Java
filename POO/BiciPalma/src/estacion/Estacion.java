package estacion;

import bicicleta.Bicicleta;

public class Estacion {

        private int id = 0;
        private String direccion = null;
        private int numeroAnclajes = 0;
        private Bicicleta [] anclajes = null;


        public Estacion (int id, String direccion, int numeroAnclajes){

                this.id = id;
                this.direccion = direccion;
                this.numeroAnclajes = numeroAnclajes;
                this.anclajes = new Bicicleta[anclajes];
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



}
