public class Labio{
    private int grosor;
    private String type;

    // Constructores
    public Labio(){
        type = "Normal";
        grosor = 3;
    }
    public Labio(int grosor, String type){
        this.grosor = grosor;
        this.type = type;
    }

    // Getters Setters
    public int getGrosor(){
        return grosor;
    }
    public String getType(){
        return type;
    }
    public void setGrosor(int grosor){
        this.grosor = grosor;
    }
    public void setType(String type){
        this.type = type;
    }
}
