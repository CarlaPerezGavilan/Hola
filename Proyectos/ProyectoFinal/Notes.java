import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Notes 
{
    

    public LocalDate dateInitialized;
    public String author;
    public String message;
    public String title;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");



    public Notes(String author, String message, String title)
    {
        this.author=author;
        this.message = message;
        this.title = title;
        dateInitialized = LocalDate.now();  
    }

    public void print()
    {
        System.out.println(author);
        System.out.println(message);
        System.out.println(title);
        System.out.println(dateInitialized.format(dtf));


    }
    public String getDate(){
        return dateInitialized.format(dtf);
    }

    
}