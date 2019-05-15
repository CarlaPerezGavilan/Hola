public class Oreja{
    private int length;
    private String tipoAretes;

    // Constructores
    public Oreja(){
        tipoAretes = "Normal";
        length = 2;
    }
    public Oreja(int length, String tipoAretes){
        this.length = length;
        this.tipoAretes = tipoAretes;
    }

    // Metodos
    public void listen(String words){
        System.out.println(" escucha: " + words);
        System.out.println("");
    }

    // Getters Setters
    public int getLength(){
        return length;
    }
    public String getTipoAretes(){
        return tipoAretes;
    }
    public void setLength(int length){
        this.length = length;
    }
    public void setTipoAretes(String tipoAretes){
        this.tipoAretes = tipoAretes;
    }
}
