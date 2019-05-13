
import java.time.*;
import java.util.*;
import java.time.format.*;
public class Note {
    DateTimeFormatter d = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    protected String title;
    protected LocalDate intialized;
    protected String message;

    protected String author;

    public Note(String title, String message, String author){
        this.author=author;
        this.title = title;
        this.message= message;
        intialized = LocalDate.now();

    }


    public void print(){
        System.out.println("Title   "+title);
        System.out.println("Date "+intialized);
        System.out.println("Author: "+author);
        System.out.println("MESSAGE: "+message);
    }

    public Note getNote(){
        return this;
    }
    
    public static void main(String[] args) {
        Note n = new Note("primera nota", "HOLA HOLA", "Carla");
        n.print();
    }
}