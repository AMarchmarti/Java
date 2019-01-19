package dni;

import java.io.IOException;
import java.util.ArrayList;


public class MainDni {
    public static void main(String[] args){
        TestCasesDni tests = new TestCasesDni();
        ArrayList<String> casosTest = tests.getTest();
        for(String dni : casosTest){
            Dni objetoDniCif = new Dni(dni);
            System.out.print(objetoDniCif.getDni());

            if( objetoDniCif.checkDniCif()){
                System.out.println(" PASS");
            }
            else
                System.out.println(" FAIL");

            System.out.println("dni --> " + objetoDniCif.getNumeroSano());
            System.out.println("letra --> " + objetoDniCif.getLetraSana());
            try{
                System.out.println("La letra debería ser --> " + objetoDniCif.obtenerLetra());
            }
            catch(IOException ioexcepcion){
                System.out.println("La letra es --> " + objetoDniCif.getLetters());
            }
        }

    }
}
