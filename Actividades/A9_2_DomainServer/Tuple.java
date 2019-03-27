public class Tuple<Direccion, IP>{
    public Direccion direccion;
    public IP IP;

    public Tuple(Direccion direccion, IP  IP){
        this.direccion = direccion;
        this.IP = IP;
        }

    public Direccion getDireccion(){
        return direccion;
    }

    public IP getIP(){
        return IP;
    }

    public String toString(){
        return "("+direccion+", "+IP+")";
    }
    

}