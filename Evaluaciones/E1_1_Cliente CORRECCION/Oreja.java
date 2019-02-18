public class Oreja{
    private int length;
    private String tipoAretes;
    public Oreja(){

    }
    public Oreja(int length, String tipoAretes){
        this.length= length; 
        this.tipoAretes= tipoAretes;
    }
    public void listen(String words){
        System.out.println(" escucha: "+words);
    }
}
