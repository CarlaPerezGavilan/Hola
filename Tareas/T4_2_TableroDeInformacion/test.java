public class test{
   
    public static void main(String[] args) {
        // Creacion de pizarron
        Pizarron blackBoard = Pizarron.getInstance();

        // Creación de alumnos de la escuela 
        User carla = new User("Carla", "carlapgavilan@gmail.com", "Pérez Gavilán");
        User viviana = new User("Viviana", "viviana.cortez@hotmail.com", "Del Castillo");
        User milton = new User("Miltón", "milton.suarez@hotmail.com", "Suárez");
        User sebastian = new User("Sebastian", "sebsjuncos@gmail.com", "Juncos");
        User katia = new User("Katia", "katybell@gmail.com", "Bellido");

        // Creación de la institución 
        Institution ITESM = new Institution("Tecnológico de Monterrey Campus Santa Fe", blackBoard);

        // Publicar un mensaje
        ITESM.postMessage("Hoy ceremonia de graduación", 18, 3, 2019, 10, 0);
        ITESM.addUser(carla);
        ITESM.addUser(viviana);
        ITESM.addUser(milton);
        ITESM.addUser(katia);

        // Alumnos leen la información 
        carla.getMessage(blackBoard);
        viviana.getMessage(blackBoard);
        milton.getMessage(blackBoard);

        // Usuario no agregado intenta accesar pizarrón
        sebastian.getMessage(blackBoard);

        // Institución publica otro mensaje
        ITESM.postMessage("Cancelada la ceremonia", 03, 4, 2019, 4, 0);
        katia.getMessage(blackBoard);

        // alumno solicita historial de mensajes 
        katia.getHistory(blackBoard);


        // Alumno busca un mensaje 
        Message buscar = new Message("Hoy ceremonia de graduación", 18, 3, 2019, 10, 0);
        katia.searchMessage(blackBoard, buscar);
        
    }
}