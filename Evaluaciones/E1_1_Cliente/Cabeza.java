public class Cabeza{
    private String headType;
    private int headSize;

    private Boca myMouth; 
    private Ceja[] myEyebrows;
    private Nariz myNose; 
    private Oreja[] myEars;
    private Ojo[] myEyes;
    
    public Cabeza(int sizeMouth, String colorMouth, String typeEyebrow, String amountHair, String typeNose, int sizeNose, int lengthEar, String tipoArete){
        myMouth= new Boca(sizeMouth, colorMouth);
        int numEyebrows=2;
        int i=0;
        myEyebrows= new Ceja[numEyebrows];
        while(i<numEyebrows){
            myEyebrows[i]= new Ceja(typeEyebrow, amountHair);
            i++;
        }
        myNose= new Nariz(typeNose, sizeNose);
        int numEars=2;
        int a=0;
        myEars= new Oreja[numEars];
        while(a<numEars){
            myEars[a]= new Oreja(lengthEar, tipoArete);
            a++;
        }
        myEyes= new Ojo[2];
        int q=0;
        while(q<2){
            myEyes[i]= new Ojo();
        }
    }
    public Cabeza(){
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

    public void allowKiss(){
        myMouth.allowKiss();
    }
    public void inhale(Persona p){
        myNose.inhale(p);
    }
    public void exhale(Persona p){
        myNose.exhale(p);
    }
    public void look(Persona p){
        myEyes[1].look(p);
        myEyes[2].look(p);
    }
    public void blink(Persona p){
        myEyes[1].blink(p);
        myEyes[2].blink(p);
    }
    public void talk(String words){
        myMouth.talk(words);
    }
    public void listen(String words){
        myEars[1].listen(words);
        myEars[2].listen(words);
    }

}