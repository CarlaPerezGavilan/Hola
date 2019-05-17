import java.time.format.DateTimeFormatter;

public class Commit {

    public Version[] commitedVersions;
    public int countVersions = 0;
    public Version LastCommit;
    public String[] nameVersion;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    public Commit() {
        commitedVersions = new Version[100];
        nameVersion = new String[100];
    }

    public Version commit(Version current, String name) {

        nameVersion[countVersions] = name + " \n   creada  el:  " + current.dateInitialized.format(dtf);
        Version v = new Version();
        current.Equals(v);
        commitedVersions[countVersions++] = v;
        return current;

    }

    public void printCommited() {
        for (int i = 0; i < countVersions; i++) {
            System.out.println(nameVersion[i]);
            commitedVersions[i].printAllNotes();
        }

    }


 
}