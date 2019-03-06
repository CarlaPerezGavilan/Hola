public class Main{
    public static void main(String[] args) {
        Facebook f = Facebook.getInstance();
        Twitter t = new Twitter();
        Instagram i = new Instagram();
        User user1 = new User("Carla", "2305");
        f.addUser(user1);
        t.addUser(user1);
        i.addUser(user1);
        i.logIn(user1);
        t.logIn(user1);

        if(f.logIn(user1)){
            f.postMessage("Mi primer mensaje");
            i.postMessage("jajajajajaj");
            t.postMessage("Hola! Hoy me siento feliz :)");
        }else{
            System.out.println("Usuario y contraseña incorrecto");
        }
        f.logOut();
    }
}