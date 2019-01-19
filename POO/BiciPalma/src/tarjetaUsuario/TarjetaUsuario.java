package tarjetaUsuario;

public class TarjetaUsuario {

        private String id = null;
        private Boolean activada = false;

        public TarjetaUsuario(String id, Boolean valor) {
                this.id = id;
                this.activada = valor;

        }


        public String getTarjetaId(){
                return this.id;
        }


        public void setActivada(Boolean valor){
                this.activada = valor;
        }


        public Boolean getActivada(){
                return this.activada;
        }
}
