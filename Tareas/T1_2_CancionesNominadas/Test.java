public class Test{
    public static void main(String[] args) {
        CancionesNominadas songs = new CancionesNominadas(10);
        songs.setArrayCanciones();
        songs.restablecerPosicionActual();
        songs.print();
    }
}