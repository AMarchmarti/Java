package tarjetaUsuario;

public class MainTarjeta {

    public static void main(String[] args) {
            TarjetaUsuario Jhon = new TarjetaUsuario("45367221F", true);
            System.out.println(Jhon.getTarjetaId() + " " +  Jhon.getActivada());
    }
}
