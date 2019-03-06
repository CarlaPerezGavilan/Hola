public class Twitter extends SocialNetwork{
    public void postMessage(String message){
        super.postMessage(message);
        System.out.println("\n*****"+message+"*****");
    }
}