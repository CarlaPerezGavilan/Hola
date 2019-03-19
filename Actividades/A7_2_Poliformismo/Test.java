public class Test{
    public static void main(String[] args) {
        

        Bird birdy = new Bird(); 
        // static binding
        Animal tweety = new Bear();
        // dynamic binding 
        Bear b= (Bear)tweety;
        arr[1].doHisStuff();
        tweety.animal[0].doHisStuff();
        if(tweety instanceof Bird){
            ((Bird)tweety).sing(" Canción");
        }else{
            tweety.doHisStuff();
        }

    }
}