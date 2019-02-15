public class Cabeza{
    private String headType;
    private int headSize;

    private Boca myMouth; 
    private Ceja[] myEyebrows;
    private Nariz myNose; 
    private Oreja[] myEars;
    private Ojo[] myEyes;
    
    public Cabeza(int sizeMouth, String colorMouth, String typeEyebrow, String amountHair, String typeNose, int sizeNose, int lengthEar, String tipoArete){
             myMouth= new Boca();

            myEars= new Oreja[2];
            myEyes= new Ojo[2];
            myEyebrows= new Ceja[2];
            myEyebrows[0]= new Ceja(typeEyebrow, amountHair);
            myEyebrows[1]= new Ceja(typeEyebrow, amountHair);
            myNose= new Nariz(typeNose, sizeNose);
            myEars[0]= new Oreja(lengthEar, tipoArete);
            myEars[1]= new Oreja(lengthEar, tipoArete);
            myEyes[0]= new Ojo();
            myEyes[1]= new Ojo();
    }
    public Cabeza(){
            myMouth= new Boca();
            myEars= new Oreja[2];
            myEyes= new Ojo[2];
            myEyebrows= new Ceja[2];
            myEyebrows[0]= new Ceja();
            myEyebrows[1]= new Ceja();
            myNose= new Nariz();
            myEars[0]= new Oreja();
            myEars[1]= new Oreja();
            myEyes[0]= new Ojo();
            myEyes[1]= new Ojo();
    }

    public void setType(String headType){
        this.headType=headType;
    }
    public void setSize(int headSize){
        this.headSize= headSize;
    }

    public void kiss(Persona p){
        myMouth.kissPerson(p);
    }

    public void allowKiss(Persona p){
        System.out.println(p);
        myMouth.allowKiss(p);
    }
    public void inhale(Persona p){
        myNose.inhale(p);
    }
    public void exhale(Persona p){
        myNose.exhale(p);
    }
    public void look(Persona p){
        myEyes[0].look(p);
    }
    public void blink(Persona p){
        myEyes[0].blink(p);
    }
    public void talk(String words){
        myMouth.talk(words);
    }
    public void listen(String words){
        myEars[0].listen(words);
    }
}