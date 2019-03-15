public class Test{
    public static void main(String[] args){

        Banco b =  new Banco(1000);
       
       
       
        try{
            int[] array = new int[5];
           array[6]=10;

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
       
    }
}