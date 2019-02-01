public class Persona{
    private String nombre; 
    private String dire;
    private String telefono;

    public Persona(String nombre, String dire, String telefono){
        this.nombre=nombre;
        this.dire=dire;
        this.telefono=telefono;
    }
    public String getNombre(){
        return nombre;
    }
     public String getDireccion(){
        return dire;
    }
     public String getTelefono(){
        return telefono;
    }
    public void print(){
        System.out.println("Nombre:"+getNombre());
        System.out.println("Dirección:"+getDireccion());
        System.out.println("Teléfono:"+getTelefono());

    }

}
