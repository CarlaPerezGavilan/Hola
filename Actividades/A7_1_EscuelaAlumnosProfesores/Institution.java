import java.util.Arrays;
public class Institution{
    private String name;
    private Student[]studentsList;
    private Teacher[]teachersList;
    private int contTeaches;
    private int contStudents;

//Constructor por default
private Institution(){
}
//Constructor con parámetro para incializar variables
public Institution(String name){
    this.name=name;
    contTeaches=0;
    contStudents=0;
    studentList= new Student[100];
    teacherList= new Teacher[100];
}
//AQUÍ HAY ASOCIACIÓN 
public void recievesVisit(Visitor visitor){
    visitor.visit(this);
}//end recievesVisit

public void print(){
    System.out.println("Nombre de la institución:"+name);
    System.out.println("Estudiantes: "+Arrays.toString(studentsList));
    System.out.println("Maestros: "+Arrays.toString(teachersList));
    //detalles institución
}//end Print

//AQUÍ HAY AGREGACIÓN CON TEACHER: GUARDA PERO NO CREA 
public void hiresTeacher(Teacher theTeacher){
    if(contTeacher<100){
    teachersList[contTeaches++]=theTeacher;
    }else{
        System.out.println("ya no hay espacio");
    }
}//end hiresTeacher

public void enrollStudents(Student theStudent){
    if(contStudent<100){
    studentList[contStudent++]=theStudent;
    }else{
        System.out.println("ya no hay espacio");
    }
}//end enrollStudents

public int getNumTeachers(){
    return contTeachers-1;
    }
    public String getInstName(){
        return name;
        }
public void  printTeachers(){
    for(int i=0; i<contStudents; i++){
        System.out.println("teacher"+(i+1)+" "+teachersList[i].getName());
    }
}

}//end of Institution