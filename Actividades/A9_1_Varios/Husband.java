public class Husband{
    private Wife w;
    public void getMarried(Wife w)){
        if(h==null){
            this.w=w;
            w.getMarried(this);
        }
    }
}