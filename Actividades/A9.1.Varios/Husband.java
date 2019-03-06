
public class Husband extends Person{
    private Wife w;
    public Husband(){
    }
    public Husband(String name){
        super(name);
    }
    public void getMarried(Wife w){
        if(w!=this.w){
            this.w=w;
            w.getMarried(this);
        }
    }
    public void giveLove(){
        System.out.println("soy"+getName()+"y amo a "+ w.getName());
    }
    public static void main(String[] args){
    
        Wife w = new Wife("Hanna");
        Husband h = new Husband("Mario");
        h.getMarried(w);
        h.giveLove();
        w.giveLove();
    
}
}