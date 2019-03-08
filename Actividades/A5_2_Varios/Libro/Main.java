public class Main{
    public static void main(String[] args) {
        Romantic book1 = new Romantic("Octavio Paz", "El Laberinto de la Soledad", 2000, 1990); 
        Fiction book2 = new Fiction("J.K. Rowlling", "Harry Potter", 2001, 2003);
        book1.print();
        book2.print();
    }
}