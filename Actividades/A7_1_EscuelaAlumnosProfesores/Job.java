import java.util.Date;

public class Job{
    private int job_id;
    private int salary;
    private Date startDate;
    private Date endDate;

public void doTheJob(){
    System.out.pritnln("doing the job");
}
public Job(int job_id, ){
    this.job_id = job_id;
    this.salary = salary;
    this.startDate = startDate;
}
private Job(){
}
public void Print(){
    System.out.pritnln("JOB ID:"+job_id+"  SALARY:"+salary+"  START DATE:"+startDate+"  END DATE"+endDate);
}
}