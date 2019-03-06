public class Ceja{
    private String typeEyebrow;
    private String amountHair;

    //Constructores
    public Ceja(){
        typeEyebrow = "Normal";
        amountHair = "Normal";
    }
    public Ceja(String typeEyebrow, String amountHair){
        this.typeEyebrow = typeEyebrow;
        this.amountHair = amountHair;
    }

    // Getters Setters
    public String getTypeEyebrow(){
        return typeEyebrow;
    }
    public String getAmountHair(){
        return amountHair;
    }
    public void setTipo(String tipo){
        this.typeEyebrow = typeEyebrow;
    }
    public void setFreckles(String freckles){
        this.amountHair = amountHair;
    }
}
