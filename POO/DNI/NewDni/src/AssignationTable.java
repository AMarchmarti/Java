public class AssignationTable {

    char[] table = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
            'H', 'L', 'C', 'K', 'E'};

    public char getLetter (int posicion) {

        return this.table[posicion];
    }


    public int getTableLength (){

        return this.table.length;
    }


    public char findLetter (String Dni){

        int posicion = Integer.parseInt(Dni) % getTableLength();
        return getLetter(posicion);
    }

    /* Tests cases */
    public static void main(String[] args) {

        AssignationTable tabla = new AssignationTable();

        String Dni = "43180005";
        char letter = tabla.findLetter(Dni);
        char healthyletter = 'N';
        if (letter == healthyletter){
            System.out.println("Este DNI es correcto");
        }
    }

}
