import java.util.Date;
import java.util.Calendar;

public class Employee extends Person
{
    private Job hisJob;

//Aquí hay composición con Job 
public Employee(String name, int jobId, int salary){
    super(name);
   hisJob= new Job(jobId, salary, new Date());
}
public void print(){
 hisJob.Print();
}
}