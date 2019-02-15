public class Visitor{
    private Date dateVisit;
    public Visitor(String name)
    {
        super(name);
    }
    public void visit(Institution inst)
    {
        System.out.println(getName() + " is visiting " + inst.getInstName());
    }
}