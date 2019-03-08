public abstract class Libro{
    protected String autor;
    protected String titulo;
    protected int yearPublished;
    protected int yearEdition;
    protected double precio;

    public Libro(){}
    public Libro(String autor, String titulo, int yearPublished, int yearEdition){
        this.autor= autor;
        this.titulo= titulo;
        this.yearEdition=yearPublished;
        this.yearEdition=yearEdition;
    }

    final public void print(){
        System.out.println("AUTOR: "+autor);
        System.out.println("TITULO: "+titulo);
        System.out.println("AÑO DE PUBLICACIÓN: "+yearPublished);
        System.out.println("AÑO DE EDICIÓN: "+yearEdition);
        System.out.println("PRECIO: "+precio);


    }


}