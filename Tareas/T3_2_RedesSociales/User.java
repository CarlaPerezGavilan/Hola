public class User{
    protected String name; 
    protected String password;

    private User(){}
    
    public User(String name, String password){
        this.name=name;
        this.password=password;
    }
    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }

    public boolean equals(User theUser){
        if(theUser.name.equals(name) && theUser.password.equals(password)){
            return true;
        }
        return false;
    }
}