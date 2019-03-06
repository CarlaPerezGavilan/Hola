public class Nariz{
    private String type;
    private int tamano;

    // Constructores
    public Nariz(){
    type = "Normal";
    tamano = 3;
    }
    public Nariz(String type, int tamano){
        this.type = type;
        this.tamano = tamano;
    }

    // Metodos
    public void nInhale(Persona p){
        System.out.println(p.getName() + " inhaló.");
        System.out.println("");
    }

    public void nExhale(Persona p){
        System.out.println(p.getName() + " exhaló.");
        System.out.println("");
    }

    // Getters Setters
    public String getTipo(){
        return type;
    }
    public int getTamano(){
        return tamano;
    }
    public void setTipo(String type){
        this.type = type;
    }
    public void setTamano(int tamano){
        this.tamano = tamano;
    }
}
