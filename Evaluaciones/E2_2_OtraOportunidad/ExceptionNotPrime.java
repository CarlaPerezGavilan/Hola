package Evaluaciones.E2_2_OtraOportunidad;

public class ExceptionNotPrime extends Exception {

    public String print(Primos typePrime) {
        return new String("EXCEPTION_NOT_PRIME: No es un número PRIMO " + typePrime.getType());
    }
}