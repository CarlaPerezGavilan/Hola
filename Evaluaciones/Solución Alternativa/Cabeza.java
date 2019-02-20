public class Cabeza{
    private String headType;
    private int headSize;

    private Boca myMouth;
    private Ceja[] myEyebrows;
    private Nariz myNose;
    private Oreja[] myEars;
    private Ojo[] myEyes;

    // Constructores
    public Cabeza(){
        myMouth= new Boca();
        myNose= new Nariz();
        myEars= new Oreja[2];
        myEars[0]= new Oreja();
        myEars[1]= new Oreja();
        myEyes= new Ojo[2];
        myEyes[0]= new Ojo();
        myEyes[1]= new Ojo();
        myEyebrows= new Ceja[2];
        myEyebrows[0]= new Ceja();
        myEyebrows[1]= new Ceja();
    }

    public Cabeza(int sizeMouth, String colorMouth, String typeEyebrow, String amountHair, String typeNose, int sizeNose, int lengthEar, String tipoArete){
        myMouth= new Boca(sizeMouth, colorMouth);
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

    // Metodos
    public void hKiss(Persona p){
        myMouth.kissPerson(p);
    }

    public void hInhale(Persona p){
        myNose.nInhale(p);
    }

    public void hExhale(Persona p){
        myNose.nExhale(p);
    }

    public void hLook(Persona p){
        myEyes[0].look(p);
    }

    public void hBlink(Persona p){
        myEyes[0].blink(p);
    }

    public void hTalk(String words){
        myMouth.talk(words);
    }

    public void hListen(String words){
        myEars[0].listen(words);
    }

    // Getters Setters
    public String getHeadType(){
        return headType;
    }
    public int getHeadSize(){
        return headSize;
    }
    public void setHeadType(String headType){
        this.headType = headType;
    }
    public void setHeadSize(int headSize){
        this.headSize = headSize;
    }
}
