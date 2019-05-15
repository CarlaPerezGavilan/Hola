import java.time.format.DateTimeFormatter;

public class Commit{

    public Version[] commitedVersions; 
    public int countVersions = 0;
    public Version LastCommit;
    public String[] nameVersion;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");


    public Commit(){
        commitedVersions = new Version[100];
        nameVersion= new String[100];
    }
    public void commit(Version current, String name)
    {
        System.out.println("Commit number: "+countVersions);
        nameVersion[countVersions] = name+" \n   creada  el:  " +current.dateInitialized.format(dtf);
        commitedVersions[countVersions] = new Version();
        commitedVersions[countVersions].equal(current);
        countVersions++;
    }

    public void printCommited(){
        for(int i=0; i<countVersions; i++){
                System.out.println(nameVersion[i]);
                commitedVersions[i].printAllNotes();
        }
        
    }


    public Version Search(String input)
    {
        for(int i=0; i<countVersions; i++)
        {
               if(input.equals(commitedVersions[i].dateInitialized))
            {
                return commitedVersions[i];
            }
        }
        return null;
    }
}