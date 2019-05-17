import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;
import javax.imageio.ImageIO;
import javax.swing.border.*;


public class Project extends JFrame{

    // Atributos
    public Commit commited;
    public Push pushed;
    public int selectedColumn;
    public int selectedVersion;
    public int count =0;
    public  Version currentVersion;

public Project(){
    // Create initial versio
       currentVersion = new Version();
        commited = new Commit();


    // Create main frame container
       JFrame all = new JFrame("notes");

    // Icon program
    try{
         Image i = ImageIO.read(getClass().getResource("/Images/icon.png"));
        all.setIconImage(i);
    }catch (Exception e){}
   
        
    // Customize frame
        all.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        all.setVisible(true);
        all.setBounds(0,0, 1000,600);
        all.setLayout(new GridLayout(1,4,2,2));

        
 
    // Color Palette
        Color white = new Color(255, 255, 255);
        Color blue = new Color(109, 205, 221);
        Color purple = new Color(147,112,219);
        Color green = new Color(32,178,170);
        Color lightblue= new Color(181, 239, 253);

    // Creation of creating notes panel
        JPanel noteCreator = new JPanel();
        // Text boxes in panel
        JTextField author = new JTextField(1);
        JTextField title = new JTextField(1);
        JTextField message = new JTextField(3);

        // Buttons for frame
       
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
            
            JButton edit = new JButton();
            edit.setFont(new Font("Avenir", Font.PLAIN, 20));
            edit.setBorderPainted(false);
            edit.setContentAreaFilled(false);
            edit.setFocusPainted(false);
            edit.setBackground(white);

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
            searchButton.setBorderPainted(false);
            searchButton.setContentAreaFilled(false);
            searchButton.setFocusPainted(false);
            searchButton.setBackground(white);
        // Button icons          
        try
        {
            Image img = ImageIO.read(getClass().getResource("Images/Add.png"));
            Image resizedImage = img.getScaledInstance(1, 2,  Image.SCALE_SMOOTH);  
            Image img2 = ImageIO.read(getClass().getResource("Images/Delete.png"));
            Image resizedImage2 = img2.getScaledInstance(1, 2,  Image.SCALE_SMOOTH);  
            Image img3 = ImageIO.read(getClass().getResource("Images/Edit.png"));
            Image resizedImage3 = img3.getScaledInstance(1, 2,  Image.SCALE_SMOOTH); 
            Image img4 = ImageIO.read(getClass().getResource("Images/search.png"));
            Image resizedImage4 = img4.getScaledInstance(1, 2,  Image.SCALE_SMOOTH);
            add.setIcon(new ImageIcon(img));
            delete.setIcon(new ImageIcon(img2));
            edit.setIcon(new ImageIcon(img3));
            searchButton.setIcon(new ImageIcon(img4));
        } catch(Exception e){  }
        

        noteCreator.setLayout(new BoxLayout(noteCreator, BoxLayout.Y_AXIS));
        JLabel l1 = new JLabel("CREATE NEW NOTE");
        l1.setFont(new Font("Avenir", Font.PLAIN, 20));
        noteCreator.add(l1);

        noteCreator.add(Box.createRigidArea(new Dimension(0, 30)));
        JLabel l4 = new JLabel("AUTHOR");
        l4.setFont(new Font("Avenir", Font.PLAIN, 18));
        noteCreator.add(l4);
        noteCreator.add(author);

        noteCreator.add(Box.createRigidArea(new Dimension(0, 50)));
        JLabel l2 = new JLabel("TITLE");
        l2.setFont(new Font("Avenir", Font.PLAIN, 18));
        noteCreator.add(l2);
        noteCreator.add(title);

        noteCreator.setBackground(white);

        noteCreator.add(Box.createRigidArea(new Dimension(0, 50)));
        JLabel l3 = new JLabel("MESSAGE");
        l3.setFont(new Font("Avenir", Font.PLAIN, 18));
        noteCreator.add(l3);        
        noteCreator.add(message);
        noteCreator.add(Box.createRigidArea(new Dimension(0, 30)));

        JPanel buttons = new JPanel();
        buttons.add(add);
        buttons.add(delete);
        buttons.setBackground(white);

        noteCreator.add(buttons);

        String twoarray[][]= {};
        String col[] = {"Notes"};
        DefaultTableModel model = new DefaultTableModel(twoarray, col);
        JTable notes = new JTable(model);
        JPanel noteDisplayer = new JPanel();
        noteDisplayer.add(notes);
       
        JPanel previewNote = new JPanel();
        previewNote.setLayout(new BoxLayout(previewNote, BoxLayout.Y_AXIS));
        previewNote.setBackground(Color.white);

        previewNote.add(Box.createRigidArea(new Dimension(0, 30)));
        JLabel l5 = new JLabel("AUTHOR:");
        l5.setFont(new Font("Avenir", Font.PLAIN, 18));
        l5.setForeground(blue);
        previewNote.add(l5);
        previewNote.add(Box.createRigidArea(new Dimension(0, 30)));
        JTextField authorLabel = new JTextField();
        authorLabel.setFont(new Font("Avenir", Font.PLAIN, 18));
        authorLabel.setBackground(blue);
        authorLabel.setForeground(white);
        authorLabel.setBorder(BorderFactory.createLineBorder(Color.white));
        
        previewNote.add(authorLabel);

        previewNote.add(Box.createRigidArea(new Dimension(0, 20)));
        JLabel l6 = new JLabel("TITLE:");
        l6.setFont(new Font("Avenir", Font.PLAIN, 18));
        l6.setForeground(blue);
        previewNote.add(l6);
        previewNote.add(Box.createRigidArea(new Dimension(0, 10)));
        JTextField messageLabel = new JTextField("");
        messageLabel.setFont(new Font("Avenir", Font.PLAIN, 18));
        messageLabel.setBackground(blue);
        messageLabel.setForeground(white);
        messageLabel.setBorder(BorderFactory.createLineBorder(Color.white));
       
        previewNote.add(messageLabel);

        previewNote.add(Box.createRigidArea(new Dimension(0, 20)));
        JLabel l7 = new JLabel("MESSAGE:");
        l7.setFont(new Font("Avenir", Font.PLAIN, 18));
        l7.setForeground(blue);
        previewNote.add(l7);
        previewNote.add(Box.createRigidArea(new Dimension(0, 10)));
        JTextArea titleLabel = new JTextArea();
        titleLabel.setLineWrap(true);
        titleLabel.setFont(new Font("Avenir", Font.PLAIN, 18));
        titleLabel.setBackground(blue);
        titleLabel.setForeground(white);
        titleLabel.setBorder(BorderFactory.createLineBorder(Color.white));
        previewNote.add(titleLabel);
        previewNote.add(Box.createRigidArea(new Dimension(0, 20)));

        previewNote.add(Box.createRigidArea(new Dimension(0, 20)));
        JLabel l8 = new JLabel("DATE CREATED:");
        l8.setFont(new Font("Avenir", Font.PLAIN, 18));
        l8.setForeground(blue);
        previewNote.add(l8);
        previewNote.add(Box.createRigidArea(new Dimension(1, 10)));
        JTextField DateLabel = new JTextField();
         DateLabel.setFont(new Font("Avenir", Font.PLAIN, 18));
         DateLabel.setBackground(blue);
         DateLabel.setForeground(white);
         DateLabel.setBorder(BorderFactory.createLineBorder(Color.white));
        previewNote.add(DateLabel);
        previewNote.add(Box.createRigidArea(new Dimension(1, 10)));

        JPanel editBtn = new JPanel(new BorderLayout());
        editBtn.add(edit, BorderLayout.EAST);
        editBtn.setBackground(Color.white);
        previewNote.add(editBtn);




        JPanel versionControl = new JPanel();
        versionControl.setBackground(Color.white);

        
        
      
        String array[][]= {};
        String[] colnames = {"VERSIONS"};
        DefaultTableModel modelVersion = new DefaultTableModel(array, colnames);
        JTable versions = new JTable(modelVersion);
        versions.setBackground(lightblue);
        versions.setFont(new Font("Avenir", Font.PLAIN, 12));
        versions.setRowHeight(40);
        versions.getTableHeader().setFont(new Font("Avenir", Font.PLAIN, 20));
        versions.getTableHeader().setBackground(Color.gray);
        versions.getTableHeader().setForeground(Color.white);




        
        versionControl.setLayout(new BoxLayout(versionControl, BoxLayout.Y_AXIS));
        JScrollPane scroll = new JScrollPane(versions);
        versions.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        versionControl.add(scroll);
        JTextArea messageCommit = new JTextArea("add a message to commit");
        versionControl.add(messageCommit);
        versionControl.add(Box.createRigidArea(new Dimension(0, 10)));
        versionControl.add(commitButton);
        versionControl.add(Box.createRigidArea(new Dimension(0, 10)));
        versionControl.add(pushButton);
        versionControl.add(Box.createRigidArea(new Dimension(0, 10)));
      
        all.add(versionControl);

        JPanel versionButtons = new JPanel();
  


       ListSelectionModel lsm = notes.getSelectionModel();
        lsm.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
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
        
        notes.setFont(new Font("Avenir", Font.PLAIN, 12));
        notes.setRowHeight(25);
        notes.setBackground(blue);
        notes.setForeground(Color.white);
        notes.getTableHeader().setFont(new Font("Avenir", Font.BOLD, 20));
        notes.getTableHeader().setBackground(Color.white);


        JPanel noteList = new JPanel();
        noteList.setLayout(new BoxLayout(noteList, BoxLayout.Y_AXIS));
        JScrollPane scroll2 = new JScrollPane(notes);
        notes.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        noteList.add(scroll2);

        JPanel searchBar = new JPanel();
        JTextArea searchInput = new JTextArea(" what do you want to search ?");
        searchInput.setSize(new Dimension(2,10));
        searchBar.add(searchButton);
        searchBar.add(searchInput);
        searchBar.setBackground(Color.white);
        noteList.add(searchBar);
        all.add(previewNote);
        all.add(noteList);
        all.add(noteCreator);
        
        all.revalidate();
        all.repaint();

        // Actions for buttons
        add.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                String author_input = author.getText();
                String title_input = title.getText();
                String message_input = message.getText();

                CreateNote(author_input, title_input, message_input);
                String[] temparray = {title_input};
                model.insertRow(notes.getRowCount(), temparray);
                author.setText("");
                message.setText("");
                title.setText("");

            }

        });


    clearButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                model.setRowCount(0); 
        for (int i = 0; i < currentVersion.notes.length; i++) 
        {
                String[] temparray = new String[1];
                temparray[0] = currentVersion.notes[i].title;
                model.addRow(temparray);
        }

            }

        });

searchButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                model.setRowCount(0); 
                 
           String inputS = searchInput.getText();
             Notes[] notasInput = new Notes[100];
            notasInput = currentVersion.Search(inputS);

        for (int i = 0; i < notasInput.length-1; i++) {
              String[] temparray = new String[1];
                temparray[0] = notasInput[i].title;
              System.out.println(temparray[0]);
                model.addRow(temparray);
        }

         }

        });

             commitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                notes.clearSelection();
                String nameCommit = messageCommit.getText();
                commited.commit(currentVersion, nameCommit);

                String[] temparray= new String[1];
                temparray[0] = commited.nameVersion[count++];
                modelVersion.addRow(temparray);
                messageCommit.setText("");

                
            }

        });

        edit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                String author_i = authorLabel.getText();
                String title_i = titleLabel.getText();
                String message_i = messageLabel.getText();
                String[] input = {title_i};
                System.out.println(selectedColumn);
                model.setValueAt(title_i, selectedColumn, 0);
                currentVersion.editNote(selectedColumn, title_i, author_i, message_i); 

            }

        });
        ListSelectionModel versionLSM = versions.getSelectionModel();
        versionLSM.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                selectedVersion = versionLSM.getMinSelectionIndex();
                System.out.println(selectedVersion);
            }
        });
          pushButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("selected verison"+selectedVersion);
                currentVersion = commited.commitedVersions[selectedVersion];
                currentVersion.printAllNotes();
                model.setRowCount(0);
                Object[] arrayFill = currentVersion.notes;
                for(int i=0; i<currentVersion.countNote; i++){
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

       


    
    }

    public void CreateNote(String author, String title, String message){
        Notes note = new Notes(author, title, message);
        currentVersion.addNote(note);
    }

    public void DeleteNote(String input){

    }

    public Notes searchNote(String input){
        return currentVersion.Search(input);
    }

    public void commit(){

    }
    public void push(){

    }



      public static void main(String[] args) {
          Project main = new Project();

    }

}