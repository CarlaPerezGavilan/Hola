public class Mejilla{
    private String tipo;
    private boolean freckles;

    // Constructores
    public Mejilla(){
        tipo = "Normal";
        freckles = false;

    }
    public Mejilla(String tipo, boolean freckles){
        this.tipo = tipo;
        this.freckles = freckles;

    }

    // Getters Setters
    public String getTipo(){
        return tipo;
    }
    public boolean getFreckles(){
        return freckles;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setFreckles(boolean freckles){
        this.freckles = freckles;
    }

}
