import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Version {
    // Atributos
    public Notes[] notes;
    public LocalDate dateInitialized;
    public int countNote;
    public int countNoteNames;
    public String[] noteNames;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    // Constructor
    public Version() {
        notes = new Notes[100];
        noteNames = new String[100];
        dateInitialized = LocalDate.now();
        countNote = 0;
        countNoteNames = 0;
    }

    // Heredar las notas de una verisón pasada
    public Version(Version v) {
        dateInitialized = LocalDate.now();
        notes = v.notes;
        countNote = 0;
    }

    // Método de búsqueda entre las notas de versión
    public Notes[] Search(String input) {
        Notes[] results = new Notes[100];
        int count = 0;
        for (int i = 0; i < countNote; i++) {
            if (notes[i].title.contains(input)) {
                results[count++] = notes[i];
            }
            if (notes[i].author.contains(input)) {
                results[count++] = notes[i];
            }
        }
        return results;
    }

    public void addNote(Notes n) {
        notes[countNote++] = n;
        noteNames[countNoteNames++] = n.message;
    }

    public Notes[] getNotes() {
        return notes;
    }

    public String[] getLast() {
        return noteNames;
    }

    public void printAllNotes() {
        for (int i = 0; i < countNote; i++) {
            notes[i].print();
        }
    }

    public void editNote(int i, String title, String author, String message) {
        notes[i].title = title;
        notes[i].author = author;
        notes[i].message = message;
        noteNames[i] = title;

    }

    public void deleteNote(int i) {
        int a;
        for (a = i; a < countNote; a++) {
            notes[a] = notes[a + 1];
        }
        countNote = countNote - 1;
    }

    public void Equals(Version v) {
        v.notes = notes;
        v.dateInitialized = dateInitialized;
        v.countNote = countNote;
        v.countNoteNames = countNoteNames;
        v.noteNames = noteNames;

    }
}// Fin de la clase