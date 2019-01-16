import java.util.Scanner;


public class VerifyDNI {

    public void verifyDni(){

        String readKeyboard = readKeyboard();
        verify(readKeyboard);


    }

    public String readKeyboard(){

        Scanner scanner = new Scanner(System.in);
        String read = scanner.nextLine();
        return read;
    }


    private boolean checkLength(String read){

        if (read.length() == 10) {
            return true;
        }
        else{
            return false;
        }
    }

    private boolean verify(String read){

        String dic = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        checkLength(read);
        try{
            Integer.read.substring(0,8);
            boolean dni = true;

        }catch (Exception e){
            return false;
        }
        if (dic.indexOf(read.substring(9)) != -1){

            return false
        }
        else{
            boolean letter = true;
        }
        if (dni && letter){
            return true;
        }
        return false;
    }




}
