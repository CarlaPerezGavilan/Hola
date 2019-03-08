public class Romantic extends Libro{
    
    public Romantic(String autor, String titulo, int yearPublished, int yearEdition){
        super(autor, titulo, yearPublished, yearEdition);
        super.precio = 300;
    }
    
}