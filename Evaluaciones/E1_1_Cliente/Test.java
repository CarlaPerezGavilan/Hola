public class Test{
    public static void main (String[] args){
        Persona juanito = new Persona("Juan");
        Persona marianita = new Persona("Mariana");
        Persona lucecita = new Persona("Luz");

        juanito.look(marianita);
        juanito.talk("Marianita, me das un beso");
        System.out.println(juanito);
        marianita.allowKiss(juanito);
        juanito.kiss(marianita);
        juanito.kiss(lucecita);
    
    }
}