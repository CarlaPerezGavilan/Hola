public class Test{
    public static void main (String[] args){
        Persona juanito = new Persona("Juan");
        Persona marianita = new Persona("Mariana");
        Persona lucecita = new Persona("Luz");
        Persona mario  = new Persona("Mario");

        //PRUEBA ISNTRUCCIONES
        juanito.look(marianita);
        juanito.talk("Marianita, me das un beso");
        marianita.listen("Marianita, me das un beso");
        marianita.allowKiss(juanito);
        juanito.kiss(marianita);
        juanito.kiss(lucecita);

        //PRUEBAS DE OTROS MÉTODOS 
        juanito.exhale();
        juanito.inhale();
        marianita.blink();
        
    
    }
}