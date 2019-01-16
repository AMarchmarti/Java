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

    private boolean dniNumbers (String read){

        String newread = read.substring(0,8);
        try{
            Integer.parseInt(newread);
        }catch (Exception e){
            return false;
        }
        return true;
    }


    private boolean dniLetters (String read){

        String dic = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (dic.indexOf(read.substring(9)) != -1){
            return false;
        }
        return true;
    }

    private boolean verify(String read){

        if(checkLength(read) && dniNumbers(read) && dniLetters(read)){
            return true;
        }
        return false;
    }




}
