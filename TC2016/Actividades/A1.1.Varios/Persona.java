public class Persona
{
    //Attributes
    private int age;
    private String name;
    private char gender;
    //identificador de acceso (público o privado)

    //public methods
    public String getName()
    // identificador tipo-de-retorno nombre*empiezaconverbo
    {
        return name;
    }

    public void setName(String name){
       this.name = name;
        //this hago referencia a la clase
        //scope más cercano
    }
}