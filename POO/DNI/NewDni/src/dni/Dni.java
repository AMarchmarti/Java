package dni;

public class Dni {

    private String dni = null;
    private Boolean numeroSano = false;
    private Boolean letraSana = false;
    private Boolean dniSano = false;
    private AssignationTable table = new AssignationTable();

    public Dni (String dni){
        this.dni = dni;
    }


    public void setDni(String cadena){
        this.dni = cadena;
    }


    public String getDni(){
        return this.dni;
    }


    private void setNumeroSano(Boolean valor){
        this.numeroSano = valor;
    }


    public Boolean getNumeroSano (){
        return this.numeroSano;
    }


    private void setLetraSana(Boolean valor){
        this.letraSana = valor;
    }


    public Boolean getLetraSana() {
        return this.letraSana;
    }


    public void setDniSano (Boolean valor){
        this.dniSano = valor;
    }


    public Boolean getDniSano (){
        return this.dniSano;
    }

    

}
