public class Teacher extends Employee{
    private Teachertype type;
    private int professionalLicense;
    
    public Teacher(String name, int jobId, int salary)
    {
        super(name, jobId, salary);
    }

    public void teaches()
    {
        System.out.println(getName() + " is teaching");
    }
}