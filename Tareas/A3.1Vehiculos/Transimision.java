public class Transmision{
    public void changeGear(Motor theMotor){
        theMotor.setGear(theMotor.getGear()+1);
        System.out.println("TRANSMISION: motor changed gear");
    }
}