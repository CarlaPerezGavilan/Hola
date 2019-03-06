public class Facebook extends SocialNetwork{
    // singleton que solo existe una solo 

    protected static Facebook instance =null;

    private Facebook(){ }

    public static Facebook getInstance(){
        if(instance==null)
        instance = new Facebook();
        return instance;
    }

    public void postMessage(String message){
        super.postMessage(message);
        System.out.println("\n******************FACEBOOK*******************\n          "+message+"       \n*                                           *\n*                                           *\n*********************************************");
    }
}