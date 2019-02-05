@startuml
public class Institution{
    private String name;
    private Student[]studentsList;
    private Teacher[]teachersList;
    private int contTeaches;
    private int contStudents;

//Constructor por default
public Institution(){
     this.name="School with no name";
    contTeaches=0;
    studentList= new String[100];
    teacherList= new String[100];
    contStudents=0
}
//Constructor con parámetro para incializar variables
public Institution(String name){
    this.name=name;
    contTeaches=0;
    contStudents=0
    studentList= new String[100];
    teacherList= new String[100];
}
//AQUÍ HAY ASOCIACIÓN 
public void recievesVisit(Visitor visitor){
    visitor.visit();
}//end recievesVisit

public void print(){
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
}//end hiresTeacher

public int getNumTeachers(){
    return contTeachers-1;
    }
}

}//end of Institution
@enduml