public interface Session{
    
    void setSession(boolean a);

   boolean logIn(User theUser);
   
   default boolean logOut(){
    setSession(false);
    return false;
    }

}
   