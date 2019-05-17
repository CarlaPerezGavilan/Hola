
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.border.*;
import java.io.*;

public class Project {
    //Atributes
    public Commit commited;
    public int selectedColumn;
    public int selectedVersion;
    public Version currentVersion;
    public int count =0;

//Main Constructor
public Project() 
{
    
 //Create initial version for adding, editing and deleting notes. 
    currentVersion = new Version();
    commited = new Commit();
        
// Create main frame container
    JFrame all = new JFrame("Notes");

// Icon
    try 
    {
    Image i = ImageIO.read(getClass().getResource("/Images/icon.png"));
    all.setIconImage(i);
    } catch (Exception e) { }

//Import notes saved 
            File file = new File("Saved.txt");
                String s1 = "", sl = "";
            try 
            {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            sl = br.readLine();
            
            while ((s1 = br.readLine()) != null) 
            {
                sl += s1;
               
            }
            } catch (Exception evt) { }
           

// Customize frame
    all.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    all.setVisible(true);
    all.setBounds(0, 0, 1000, 600);
    all.setLayout(new GridLayout(1, 4, 2, 2));

// Color Palette
        Color white = new Color(255, 255, 255);
        Color blue = new Color(109, 205, 221);
        Color purple = new Color(147, 112, 219);
        Color green = new Color(32, 178, 170);
        Color lightblue = new Color(181, 239, 253);
        Color yellow = new Color(255, 230, 0);

// Panels in order of appearance left-right with secondary panels
        JPanel versionControl = new JPanel();
            JPanel versionButtons = new JPanel();

        JPanel previewNote = new JPanel();

        JPanel noteDisplayer = new JPanel();
            JPanel editBtn = new JPanel(new BorderLayout());

        JPanel noteCreator = new JPanel();
            JPanel buttons = new JPanel(); 
        
        JPanel noteList = new JPanel();
             JPanel searchBar = new JPanel();
             JPanel  inputSearch = new JPanel();
   
      


//Text Fields & Text Areas
        JTextField author = new JTextField(1);
        JTextField title = new JTextField(1);
        JTextField message = new JTextField(3);

        JTextField authorLabel = new JTextField();
            authorLabel.setFont(new Font("Avenir", Font.PLAIN, 18));
            authorLabel.setBackground(blue);
            authorLabel.setForeground(white);
            authorLabel.setBorder(BorderFactory.createLineBorder(Color.white));

        JTextField DateLabel = new JTextField();
            DateLabel.setFont(new Font("Avenir", Font.PLAIN, 18));
            DateLabel.setBackground(blue);
            DateLabel.setForeground(white);
            DateLabel.setBorder(BorderFactory.createLineBorder(Color.white));

        JTextField messageLabel = new JTextField("");
            messageLabel.setFont(new Font("Avenir", Font.PLAIN, 18));
            messageLabel.setBackground(blue);
            messageLabel.setForeground(white);
            messageLabel.setBorder(BorderFactory.createLineBorder(Color.white));

        JTextArea titleLabel = new JTextArea();
            titleLabel.setLineWrap(true);
            titleLabel.setFont(new Font("Avenir", Font.PLAIN, 18));
            titleLabel.setBackground(blue);
            titleLabel.setForeground(white);
            titleLabel.setBorder(BorderFactory.createLineBorder(Color.white));
        
        JTextArea messageCommit = new JTextArea("add a message to commit");
             messageCommit.setBorder(BorderFactory.createLineBorder(Color.gray));

        JTextArea searchInput = new JTextArea(" what do you want to search ?");
             searchInput.setSize(new Dimension(2, 10));
             searchInput.setBorder(BorderFactory.createLineBorder(Color.gray));

// Buttons for frame and Customization

        JButton add = new JButton();
            add.setFont(new Font("Avenir", Font.PLAIN, 20));
            add.setBorderPainted(false);
            add.setContentAreaFilled(false);
            add.setFocusPainted(false);
            add.setBackground(white);

        JButton delete = new JButton();
            delete.setFont(new Font("Avenir", Font.PLAIN, 20));
            delete.setBorderPainted(false);
            delete.setContentAreaFilled(false);
            delete.setFocusPainted(false);
            delete.setBackground(white);

        JButton edit = new JButton("Edit");
            edit.setFont(new Font("Avenir", Font.PLAIN, 15));

        JButton pushButton = new JButton("PUSH");
            pushButton.setFont(new Font("Avenir", Font.PLAIN, 20));
            pushButton.setBackground(green);
            pushButton.setForeground(white);
            pushButton.setBorderPainted(false);
            pushButton.setOpaque(true);

        JButton commitButton = new JButton("COMMIT");
            commitButton.setFont(new Font("Avenir", Font.PLAIN, 20));
            commitButton.setBackground(purple);
            commitButton.setForeground(white);
            commitButton.setBorderPainted(false);
            commitButton.setOpaque(true);

        JButton searchButton = new JButton();
            searchButton.setContentAreaFilled(false);
            searchButton.setFocusPainted(false);
            searchButton.setBackground(white);

        JButton fileChooseButton = new JButton("Export");
            fileChooseButton.setFont(new Font("Avenir", Font.PLAIN, 12));

        JButton openButton = new JButton("Open");
            openButton.setFont(new Font("Avenir", Font.PLAIN, 12));
       

        JButton clearButton = new JButton();
            clearButton.setContentAreaFilled(false);
            clearButton.setFocusPainted(false);
            clearButton.setBackground(white);

        JButton saveButton = new JButton("Save");
            saveButton.setFont(new Font("Avenir", Font.PLAIN, 12));

         JButton thanosButton = new JButton();
        
// Buttons icons
        try {
        //Export and resize Images 
            Image img = ImageIO.read(getClass().getResource("Images/Add.png"));
            Image img2 = ImageIO.read(getClass().getResource("Images/Delete.png"));
            Image resizedImage2 = img2.getScaledInstance(1, 2, Image.SCALE_SMOOTH);
            Image img3 = ImageIO.read(getClass().getResource("Images/Edit.png"));
            Image resizedImage3 = img3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            Image img4 = ImageIO.read(getClass().getResource("Images/search.png"));
            Image resizedImage4 = img4.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            Image img5 = ImageIO.read(getClass().getResource("Images/clearsearch.png"));
            Image resizedImage5 = img5.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            Image img6 = ImageIO.read(getClass().getResource("Images/export.png"));
            Image resizedImage6 = img6.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            Image img7 = ImageIO.read(getClass().getResource("Images/open.png"));
            Image resizedImage7 = img7.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            Image img8 = ImageIO.read(getClass().getResource("Images/save.png"));
            Image resizedImage8 = img8.getScaledInstance(30, 30, Image.SCALE_SMOOTH);            
            Image img9 = ImageIO.read(getClass().getResource("Images/clear.png"));
            Image resizedImage9 = img9.getScaledInstance(40, 40, Image.SCALE_SMOOTH);            
           
        //Adding Images
            add.setIcon(new ImageIcon(img));
            delete.setIcon(new ImageIcon(img2));
            edit.setIcon(new ImageIcon(resizedImage3));
            clearButton.setIcon(new ImageIcon(resizedImage4));
            searchButton.setIcon(new ImageIcon(resizedImage5));
            saveButton.setIcon(new ImageIcon(resizedImage8));
            fileChooseButton.setIcon(new ImageIcon(resizedImage6));
            openButton.setIcon(new ImageIcon(resizedImage7));
            thanosButton.setIcon(new ImageIcon(img9));
        } catch (Exception e) { }

//JLabels and Customization

    //Note Creator
    JLabel l1 = new JLabel("CREATE NEW NOTE");
        l1.setFont(new Font("Avenir", Font.PLAIN, 20));
    JLabel l4 = new JLabel("AUTHOR");
        l4.setFont(new Font("Avenir", Font.PLAIN, 18));
    JLabel l2 = new JLabel("TITLE");
        l2.setFont(new Font("Avenir", Font.PLAIN, 18));
    JLabel l3 = new JLabel("MESSAGE");
        l3.setFont(new Font("Avenir", Font.PLAIN, 18));
    //Note Displayer
    JLabel l5 = new JLabel("AUTHOR:");
        l5.setFont(new Font("Avenir", Font.PLAIN, 18));
        l5.setForeground(blue);
    JLabel l6 = new JLabel("TITLE:");
        l6.setFont(new Font("Avenir", Font.PLAIN, 18));
        l6.setForeground(blue);
    JLabel l7 = new JLabel("MESSAGE:");
        l7.setFont(new Font("Avenir", Font.PLAIN, 18));
        l7.setForeground(blue);
     JLabel l8 = new JLabel("DATE CREATED:");
        l8.setFont(new Font("Avenir", Font.PLAIN, 18));
        l8.setForeground(blue);

//JTables: notes & versions
    //Notes
    String twoarray[][] = {};
    String col[] = { "Notes" };

    DefaultTableModel model = new DefaultTableModel(twoarray, col);
    JTable notes = new JTable(model);

   
     //Importar notas guardadas
        // String[] notesArray = sl.split("<");
        // for (int i = 0; i < notesArray.length; i++) {
        // String[] componentNote = notesArray[i].split("~");
        // Notes tempNote = new Notes(componentNote[0], componentNote[1], componentNote[2]);
        // currentVersion.addNote(tempNote);
        // String[] titleS = new String[1];
        // titleS[0] = componentNote[0];
        // model.insertRow(model.getRowCount(), titleS);
        // }

        //Customize
        notes.setFont(new Font("Avenir", Font.PLAIN, 12));
        notes.setRowHeight(25);
        notes.setBackground(blue);
        notes.setForeground(Color.white);
        notes.getTableHeader().setFont(new Font("Avenir", Font.BOLD, 20));
        notes.getTableHeader().setBackground(Color.white);

        //Scroll
        JScrollPane scroll2 = new JScrollPane(notes);
        notes.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

    //Versions
    String array[][] = {};
    String[] colnames = { "VERSIONS" };
   
    DefaultTableModel modelVersion = new DefaultTableModel(array, colnames);
    JTable versions = new JTable(modelVersion);
  

        //Customize
        versions.setBackground(lightblue);
        versions.setFont(new Font("Avenir", Font.PLAIN, 12));
        versions.setRowHeight(40);
        versions.getTableHeader().setFont(new Font("Avenir", Font.PLAIN, 20));
        versions.getTableHeader().setBackground(Color.gray);
        versions.getTableHeader().setForeground(Color.white);
        versions.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        //Scroll
        JScrollPane scroll = new JScrollPane(versions);
    
//Panel 1: NOTE CREATOR
        //Layout      
        noteCreator.setLayout(new BoxLayout(noteCreator, BoxLayout.Y_AXIS));
        noteCreator.setBackground(white);

        //Supanel 1: Buttons
        buttons.add(add);
        buttons.add(delete);
        buttons.setBackground(white);

        //Adding Elements
        noteCreator.add(l1);
        noteCreator.add(Box.createRigidArea(new Dimension(0, 30)));   
        noteCreator.add(l4);
        noteCreator.add(author);
        noteCreator.add(Box.createRigidArea(new Dimension(0, 50)));
        noteCreator.add(l2);
        noteCreator.add(title);
        noteCreator.add(Box.createRigidArea(new Dimension(0, 50)));
        noteCreator.add(l3);
        noteCreator.add(message);
        noteCreator.add(Box.createRigidArea(new Dimension(0, 30)));
        noteCreator.add(buttons);

        all.add(noteCreator);
//Repaint
        all.revalidate();
        all.repaint();   


//Panel 2: PREVIEW NOTE
     
        //Layout
        previewNote.setLayout(new BoxLayout(previewNote, BoxLayout.Y_AXIS));
        previewNote.setBackground(Color.white);

        //Supanel 2: EditBtn
        editBtn.add(edit, BorderLayout.EAST);
        editBtn.setBackground(Color.white);

        //Adding Elements
        previewNote.add(Box.createRigidArea(new Dimension(0, 30)));
        previewNote.add(l5);
        previewNote.add(Box.createRigidArea(new Dimension(0, 30)));
        previewNote.add(authorLabel);
        previewNote.add(Box.createRigidArea(new Dimension(0, 20)));
        previewNote.add(l6);
        previewNote.add(Box.createRigidArea(new Dimension(0, 10)));
        previewNote.add(messageLabel);
        previewNote.add(Box.createRigidArea(new Dimension(0, 20)));
        previewNote.add(l7);
        previewNote.add(Box.createRigidArea(new Dimension(0, 10)));
        previewNote.add(titleLabel);
        previewNote.add(Box.createRigidArea(new Dimension(0, 20)));
        previewNote.add(Box.createRigidArea(new Dimension(0, 20)));
        previewNote.add(l8);
        previewNote.add(Box.createRigidArea(new Dimension(1, 10)));
        previewNote.add(DateLabel);
        previewNote.add(Box.createRigidArea(new Dimension(1, 10)));
        previewNote.add(editBtn);

        all.add(previewNote);
//Repaint
        all.revalidate();
        all.repaint();  
    
//Panel 3: VERSION CONTROL 

        //Layout
        versionControl.setBackground(Color.white);
        versionControl.setLayout(new BoxLayout(versionControl, BoxLayout.Y_AXIS));
        versionControl.add(scroll);
      
       //Adding Elements
        versionControl.add(fileChooseButton);
        versionControl.add(openButton);
        versionControl.add(saveButton);
        versionControl.add(Box.createRigidArea(new Dimension(0, 20)));
        versionControl.add(messageCommit);
        versionControl.add(Box.createRigidArea(new Dimension(0, 20)));
        versionControl.add(commitButton);
        versionControl.add(Box.createRigidArea(new Dimension(0, 10)));
        versionControl.add(pushButton);
        versionControl.add(Box.createRigidArea(new Dimension(0, 10)));
        
         all.add(versionControl);
//Repaint
        all.revalidate();
        all.repaint();  
        
//Panel 4: NOTE LIST

    //Subpanel 3: SearchBar
    searchBar.setBackground(Color.white);
    searchBar.add(searchButton);
    searchBar.add(clearButton);
    searchBar.add(thanosButton);
    inputSearch.add(searchInput);

    //Layout and Adding Elements
    noteList.setLayout(new BoxLayout(noteList, BoxLayout.Y_AXIS));

    noteList.add(searchBar);
    noteList.add(searchInput);
    noteList.add(scroll2);
  
    all.add(noteList);
    //Repaint
        all.revalidate();
        all.repaint();  





//Selection listeners for two JTables 

//NOTES SELECTION LISTENER
ListSelectionModel lsm = notes.getSelectionModel();
    lsm.addListSelectionListener(new ListSelectionListener()
    {
        public void valueChanged(ListSelectionEvent e) 
        {
                selectedColumn = lsm.getMinSelectionIndex();

                String titleSelected = currentVersion.notes[selectedColumn].title;
                String messageSelected = currentVersion.notes[selectedColumn].message;
                String authorSelected = currentVersion.notes[selectedColumn].author;
                String date = currentVersion.notes[selectedColumn].getDate();

                messageLabel.setText(messageSelected);
                authorLabel.setText(authorSelected);
                titleLabel.setText(titleSelected);
                DateLabel.setText(date);
        }
    });

//VERSIONS SELECTION LISTENER
ListSelectionModel versionLSM = versions.getSelectionModel();
    versionLSM.addListSelectionListener(new ListSelectionListener() 
    {
        public void valueChanged(ListSelectionEvent e) 
            {
                selectedVersion = versionLSM.getMinSelectionIndex();
                System.out.println(selectedVersion);
            }
    });




//BUTTON FUNTIONALITY

//SAVE: when re-opening app it will restore last version saved. 
saveButton.addActionListener(new ActionListener() 
{
     @Override
    public void actionPerformed(ActionEvent e) 
    {
        File fi = new File("Saved.txt");
        
        try 
        {
            FileWriter wr = new FileWriter(fi, false);
            BufferedWriter w = new BufferedWriter(wr);

            // Write in file 
            for (int i = 0; i < currentVersion.notes.length; i++) 
            {
                w.write(currentVersion.notes[i].title);
                w.write("~");
                w.write(currentVersion.notes[i].message);
                w.write("~");
                w.write(currentVersion.notes[i].author);
                w.write("~");
                w.write(currentVersion.notes[i].getDate());
                w.write("<");
                w.flush();
            }
                w.close();
        } catch (Exception evt) { }
    }
});

//EXPORT: saves all notes in file, will not be restored unless opened. 
fileChooseButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        
        // Create an object of JFileChooser class
        JFrame f = new JFrame("Editor");
        f.setFont(new Font("Avenir", Font.PLAIN, 12));
        f.setBackground(Color.white);
        JFileChooser j = new JFileChooser("f:");

        int r = j.showDialog(f, "Save");

        if (r == JFileChooser.APPROVE_OPTION) 
        {

        File fi = new File(j.getSelectedFile().getAbsolutePath());

        try 
        {            
        FileWriter wr = new FileWriter(fi, false);
        BufferedWriter w = new BufferedWriter(wr);

        // Write
            for (int i = 0; i < currentVersion.notes.length; i++) 
            {
                w.write(currentVersion.notes[i].title);
                w.write("~");
                w.write(currentVersion.notes[i].message);
                w.write("~");
                w.write(currentVersion.notes[i].author);
                w.write("~");
                w.write(currentVersion.notes[i].getDate());
                w.write("<");
                w.flush();
            }

                w.close();
        } catch (Exception evt) {
            JOptionPane.showMessageDialog(f, "Se ha guardado con exito!", "GUARDADO", JOptionPane.PLAIN_MESSAGE);}
        }
    }
});
        
//OPEN: adds all notes in file
openButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
               
        JFileChooser j = new JFileChooser("f:");
        JFrame f = new JFrame("Editor");     
        int r = j.showOpenDialog(null);
         
        if (r == JFileChooser.APPROVE_OPTION) 
        {
            File fi = new File(j.getSelectedFile().getAbsolutePath());
            try 
            {
                String s1 = "", sl = "";
                FileReader fr = new FileReader(fi);
                BufferedReader br = new BufferedReader(fr);
                sl = br.readLine();

                // Take the input from the file
                while ((s1 = br.readLine()) != null) 
                {
                    sl += s1;
                }

                        // Set the text
                        String[] notesArray = sl.split("<");
                        for (int i = 0; i < notesArray.length; i++) {
                            String[] componentNote = notesArray[i].split("~");
                            Notes tempNote = new Notes(componentNote[0], componentNote[1], componentNote[2]);
                            currentVersion.addNote(tempNote);
                            String[] title = new String[1];
                            title[0] = componentNote[0];
                            model.insertRow(model.getRowCount(), title);
                        }
                } catch (Exception evt) {JOptionPane.showMessageDialog(f, evt.getMessage()); }
            }

        }
    });


//ADD: creates new note
add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String author_input = author.getText();
                String title_input = title.getText();
                String message_input = message.getText();

                CreateNote(author_input, title_input, message_input);
                String[] temparray = { title_input };
                model.insertRow(notes.getRowCount(), temparray);
                author.setText("");
                message.setText("");
                title.setText("");

            }

        });

//COMMIT: saves latest version
commitButton.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        notes.clearSelection();
        String nameCommit = messageCommit.getText();
                currentVersion = commited.commit(currentVersion, nameCommit);
                String[] temparray = new String[1];
                temparray[0] = commited.nameVersion[count++];
                modelVersion.addRow(temparray);
                messageCommit.setText("");
    }

});

//SEARCH: search for name and author in notes
searchButton.addActionListener(new ActionListener() 
{
    @Override
    public void actionPerformed(ActionEvent e) 
    {
                model.setRowCount(0); 
        for (int i = 0; i < currentVersion.notes.length; i++) 
        {
                String[] temparray = new String[1];
                temparray[0] = currentVersion.notes[i].title;
                model.addRow(temparray);
        }

    }

});

//THANOS
thanosButton.addActionListener(new ActionListener() 
{
    @Override
    public void actionPerformed(ActionEvent e) 
    {

        model.setRowCount(0);        
         for (int i = 0; i < currentVersion.notes.length; i++) 
        {
                currentVersion.notes[i] = null;
        }
    }
});

//CLEAR: clears the search requirements
clearButton.addActionListener(new ActionListener() 
{
    @Override
    public void actionPerformed(ActionEvent e) 
    {

        model.setRowCount(0);        
        String inputS = searchInput.getText();
        Notes[] notasInput = new Notes[100];
        notasInput = currentVersion.Search(inputS);
        for (int i = 0; i < notasInput.length-1; i++) 
        {
            String[] temparray = new String[1];
            temparray[0] = notasInput[i].title;
            model.addRow(temparray);
        }
    }
});

//EDIT: saves the changes in the Text Boxes
edit.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String author_i = authorLabel.getText();
        String title_i = titleLabel.getText();
        String message_i = messageLabel.getText();
        String[] input = { title_i };
        model.setValueAt(title_i, selectedColumn, 0);
        currentVersion.editNote(selectedColumn, title_i, author_i, message_i);
    }
});
      
//PUSH: after selecting version, restores the version 
pushButton.addActionListener(new ActionListener() 
{

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        model.setRowCount(0);

        currentVersion = commited.commitedVersions[selectedVersion];
        Object[] arrayFill = currentVersion.notes;
        for (int i = 0; i < currentVersion.countNote; i++) 
        {
            String[] temparray = new String[1];
            temparray[0] = currentVersion.noteNames[i];
            model.addRow(temparray);
        }
            currentVersion.printAllNotes();
            authorLabel.setText("");
            messageLabel.setText("");
            titleLabel.setText("");
    }
});

//DELETE: deletes selected note
delete.addActionListener(new ActionListener() 
{
    @Override
    public void actionPerformed(ActionEvent e) 
    { 
                
                deleteNote(selectedColumn);

                try{                
                    model.removeRow(notes.getSelectedRow()); 
                }catch(Exception ec){
                    notes.clearSelection();
                    System.out.println(notes.getSelectedRow());
                }
    }

});

}//END OF CONTRUCTOR PROJECT

//METHODS

    //Construct Object of class Note and adds it to notes[] array in currentVersion
    public void CreateNote(String author, String title, String message) 
    {
        Notes note = new Notes(author, title, message);
        currentVersion.addNote(note);
    }

    //Deletes note in array of notes in curentVersion
    public void deleteNote(int input) 
    {
        currentVersion.deleteNote(input);
    }

    //Search note in array of note sin currentVersion
    public Notes[] searchNote(String input) 
    {
        return currentVersion.Search(input);
    }

    //MAIN CLASS: construct project
    public static void main(String[] args) 
    {
        Project m = new Project();
    }

}//END OF CLASS