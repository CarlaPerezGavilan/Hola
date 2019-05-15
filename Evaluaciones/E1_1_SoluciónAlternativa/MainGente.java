public class MainGente {
    public static void main (String[] args){
        Persona juanito = new Persona("Juan");
        Persona marianita = new Persona("Mariana");
        Persona lucecita = new Persona("Luz");


        juanito.pLook(marianita);
        juanito.pTalk("Marianita, me das un beso?");
        marianita.pInhale();
        marianita.pListen("Marianita, me das un peso?");
        marianita.pAllowKiss(juanito);
        juanito.pBlink();
        juanito.pKiss(marianita);
        juanito.pKiss(lucecita);
        juanito.pExhale();

        /* marianita.pEstornuda();
        juanito.pLevantaCeja();
        juanito.pMuerdeLabio(marianita);
        marianita.psangraLabio();
        lucecita.pKissCheek(juanito);

        persona paquito = new Persona("Paco", 10, "cafes", "grueso", "denso", "fino", 6, 2, "Diamante", "azul", "largos");
        */

    }

}
