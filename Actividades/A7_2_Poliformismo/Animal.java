public abstract  class Animal{
    public abstract void eat();
    public abstract void wakeUp();
    public abstract void sleep();
    public abstract void run();
    public Animal[] animal;

    public Animal(){
        animal[0]= new Bird();
        animal[1]= new Bear();
    }
     public void doHisStuff()
    {
        wakeUp();
        eat();
        run();
        sleep();
    }

}