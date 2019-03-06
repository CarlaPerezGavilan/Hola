import java.util.*;
public abstract class SocialNetwork implements Session{
    protected User[] users;
    protected boolean session = false;
    protected  int contUsers;
    

    public SocialNetwork(){
        users = new User[10];
        contUsers=0;

    }

    public void addUser(User theUser){
                users[contUsers++]=theUser;
                System.out.println("El usuario "+theUser.name+" se ha agregado");
            }

    public void sendData(byte[] bytes){
            Random r= new Random();
            int time = r.nextInt(5-2)+2;
            long start = System.currentTimeMillis();
            while(true){
                long current = System.currentTimeMillis();
                if(start+time*1000 < current){
                    break;
                }
                }
    }

    public void postMessage(String message)
    {
        if(session)
        {
            sendData(messageToBytes(message));

        }
    }

    public byte[] messageToBytes(String message)
    {
       System.out.println(message.getBytes());
        return message.getBytes();
    }

    public boolean logIn(User theUser){
        for(int i=0; i<10; i++){
            if(users[i].equals(theUser)){
                setSession(true);
                return true;
            }
        }
        return false;
    }

    public void setSession(boolean set){
        session = set;
    }

    
    

}