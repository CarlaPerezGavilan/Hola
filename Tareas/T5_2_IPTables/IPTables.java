package Tareas.T5_2_IPTables;

public class IPTables {
    protected IPTuple[] direccionesIp;
    protected int count;
    protected boolean activo = false;

    public IPTables() {
        direccionesIp = new IPTuple[100];
        count = 0;
    }

    public boolean simulateNavegation(String IPadress) throws  IPAccessDenied{
        if (activo == true) {
            for (int i = 0; i < count; i++) {
            if (direccionesIp[i].getIP().equals(IPadress) && direccionesIp[i].getPermission().equals("ACCEPT")) {
                return true;
            }
            if (direccionesIp[i].getIP().equals(IPadress) && direccionesIp[i].getPermission().equals("DROP")) {
                return false;
            }
            if (direccionesIp[i].getIP().equals(IPadress) && direccionesIp[i].getPermission().equals("REJECT")) {
                throw new IPAccessDenied();
            }
        }
    }
    return false;
    }

    public void start() {
        activo = true;
    }

    public void stop() {
        activo = false;
    }

    public boolean getActivo(){
        return activo;
    }

    public void addRule(char command, String sourceIP, String action) 
    {
        if (command == 'I') 
        {
            for (int i = count; i > 0; i--) 
                direccionesIp[i + 1] = direccionesIp[i];
          
            direccionesIp[0] = new IPTuple<String, String>(sourceIP, action);
            System.out.println("Se ha agregado el ususario " + sourceIP + " en el espacio 0");
        }

        if (command == 'A') 
        {
            direccionesIp[count++] = new IPTuple<String, String>(sourceIP, action);
            System.out.println("Se ha agregado el ususario " + sourceIP + " en el espacio " + count);
        }
    }
}