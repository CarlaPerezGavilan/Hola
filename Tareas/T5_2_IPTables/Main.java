package Tareas.T5_2_IPTables;

public class Main{
    public static void main(String[] args) {
        Servidor server = new Servidor();

        server.getIPTables().addRule('A', "122.35.30.12", "ACCEPT");
        server.getIPTables().addRule('A', "103.40.12.2", "REJECT");
        server.getIPTables().addRule('A', "13.40.12.6", "REJECT");
        server.getIPTables().addRule('I', "114.42.16.3", "DROP");
        server.getIPTables().addRule('I', "123.45.32.1", "ACCEPT");

        server.getIPTables().start();
    
       
            server.simulateNavegation("122.35.30.12", "www.google.com");
            server.simulateNavegation("103.40.12.2", "www.itesm.mx");
            server.simulateNavegation("103.40.12.2", "www.itesm.mx");
        
        server.getIPTables().stop();

        
            server.simulateNavegation("123.45.32.1", "www.google.com");
            server.simulateNavegation("103.40.12.2", "www.itesm.mx");
            server.simulateNavegation("114.42.16.3", "www.sep.gob");;
    }
}