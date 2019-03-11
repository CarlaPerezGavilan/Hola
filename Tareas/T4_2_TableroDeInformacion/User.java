
public class User{
    protected String name;
    protected String mail;
    protected String lastName;

    public User(String name, String mail, String lastName){
        this.name= name;
        this.mail = mail;
        this.lastName= lastName;
    }
    
    public String getName(){
        return name; 
    }

    public String getMail(){
        return name; 
    }

    public String lastName(){
        return lastName;
    }

    public boolean equals(User theUser){
        if((theUser.name).equals(name)){
            if((theUser.mail).equals(mail)){
                if((theUser.lastName).equals(lastName)){
                    return true;
                }
            }
        }
        return false;
    }

    public void getMessage(Pizarron p){
        int i;
        for(i=0; i<p.contUsers; i++){
            if ((p.usuarios[i]).equals(this)){
                System.out.println("-------ÚLTIMO MENSAJE PUBLICADO--------");
                p.getMessage();
                break;
            }
            }
            if(i==p.contUsers){ System.out.println("USUARIO SIN ACCESO A PIZARRÓN");}   
           
        }

    public void getHistory(Pizarron p){
        System.out.println("---------HISTORIAL-----------");
        for(int i=0; i<p.contUsers; i++){
            if(p.usuarios[i].equals(this)){
                p.getHistory();
            }
        }
    }

    public void searchMessage(Pizarron p, Message message){
        System.out.println("---------BÚSQUEDA DE MENSAJES--------\n Resultados para: <"+message.message+">");
        for(int i=0; i<p.contUsers; i++){
            if(p.usuarios[i].equals(this)){
                p.searchMessage(message);
            }
        }
    }
       
}