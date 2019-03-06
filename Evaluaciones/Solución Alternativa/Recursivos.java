public class Recursivos {
    // esto es para ver cuantas vocales tiene el string que escribas.
    // recursivamente
    public int vocalsRec(String str, int pos){
        String lower = str.toLowerCase();
        if (pos == 0)
            return 0;
        else
            return check(lower.charAt(pos)) + vocalsRec(lower, pos - 1);
    }
    public int check(char x){
        return (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') ? 1 : 0;
    }

    // esto hace lo mismo
    // iterativamente
    public int vocalsIt(String str){
      String lower = str.toLowerCase();
      int total = 0;
      for(int cont = 0; cont <= (lower.length() - 1); cont++){
        char x = lower.charAt(cont) ;
        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
          total += 1;
        }
      }
      return total;
    }


    // main para probar
    public static void main(String[] args) {
        Recursivos miObjeto = new Recursivos();
        String palabra = "Gerardo Anglada de Landa";
        System.out.println("El String: \"" + palabra + "\" tiene: " + miObjeto.vocalsRec(palabra, (palabra.length() - 1)) + " vocales.");
        System.out.println("");
        System.out.println(miObjeto.vocalsIt(palabra) + " vocales.");
    }
}
