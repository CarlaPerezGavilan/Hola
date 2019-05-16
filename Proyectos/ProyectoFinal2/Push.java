public class Push{

    public Version pushVersion; 
    



    public void push (Commit c)
    {
        pushVersion  = c.LastCommit;
    }
}