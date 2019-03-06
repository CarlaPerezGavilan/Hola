public class Test
{
    public static void main(String[] args) {
        Institution tec = new Institution("ITESM");
    
        //Asociación
        Visitor padreDeFamilia = new Visitor("Pancho López");
        padreDeFamilia.visit(tec);

        //Agregación
        Teacher jorge = new Teacher("Jorge", 2, 1000);
        Teacher raul = new Teacher("Raúl", 3, 1001);
        tec.hiresTeacher(jorge);
        tec.hiresTeacher(raul);
        System.out.println("The number of teachers at "  + tec.getInstName() + " are " + tec.getNumberOfTeachers());
        System.out.println("the teachers at " + tec.getInstName() + " are:");
        tec.printTeachers();
        //Agregación
        Student a1 = new Student("Roy", 11);
        tec.enrollStudent(a1);        
    }
}