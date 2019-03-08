public class Carreras extends Caballo{
    protected int numberRaces;
    protected int numberWon;

    public Carreras(String nombre, String color, int numberRaces, int numberWon,int year, int month, int day){
        super(nombre, color, year, month, day);
        this.numberRaces= numberRaces;
        this.numberWon= numberWon;
    }
}