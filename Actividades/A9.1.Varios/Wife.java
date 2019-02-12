public class Wife extends Person{
    private Husband h;
    public Wife(){
    }
    public Wife(String name){
        super(name);
    }
    public void getMarried(Husband h){
        if(h!=this.h){
            this.h=h;
            h.getMarried(this);
        }
    }
    public void giveLove(){
        System.out.println("soy"+getName()+"y amo a "+ h.getName());
    }
}