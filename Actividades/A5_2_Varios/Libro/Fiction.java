public class Fiction extends Libro{

    public Fiction(String autor, String titulo, int yearPublished, int yearEdition){
        super(autor, titulo, yearPublished, yearEdition);
        super.precio = 500;

    }
}