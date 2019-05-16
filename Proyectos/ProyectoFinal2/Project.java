import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;

import javax.swing.JFileChooser;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.swing.border.*;
import java.io.*;

public class Project {

    // Atributos
    public Commit commited;
    public Push pushed;
    public int selectedColumn;
    public int selectedVersion;
    public int count = 0;
    public Version currentVersion;

    public Project() {
        // Create initial versio
        currentVersion = new Version();
        commited = new Commit();

        // Create main frame container
        JFrame all = new JFrame("notes");

        // Icon program
        try {
            Image i = ImageIO.read(getClass().getResource("/Images/icon.png"));
            all.setIconImage(i);
        } catch (Exception e) {
        }

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

        JButton fileChooseButton = new JButton("Save in New File");
        fileChooseButton.setFont(new Font("Avenir", Font.PLAIN, 12));
        fileChooseButton.setBackground(blue);
        fileChooseButton.setForeground(Color.black);
        fileChooseButton.setBorderPainted(false);
        fileChooseButton.setOpaque(true);

        JButton openButton = new JButton("Open");
        openButton.setFont(new Font("Avenir", Font.PLAIN, 12));
        openButton.setBackground(blue);
        openButton.setForeground(Color.black);
        openButton.setBorderPainted(false);
        openButton.setOpaque(true);

        JButton clearButton = new JButton();
        clearButton.setBorderPainted(false);
        clearButton.setContentAreaFilled(false);
        clearButton.setFocusPainted(false);
        clearButton.setBackground(white);

         JButton saveButton = new JButton();

        
        // Button icons
        try {
            Image img = ImageIO.read(getClass().getResource("Images/Add.png"));
            Image resizedImage = img.getScaledInstance(1, 2, Image.SCALE_SMOOTH);
            Image img2 = ImageIO.read(getClass().getResource("Images/Delete.png"));
            Image resizedImage2 = img2.getScaledInstance(1, 2, Image.SCALE_SMOOTH);
            Image img3 = ImageIO.read(getClass().getResource("Images/Edit.png"));
            Image resizedImage3 = img3.getScaledInstance(1, 2, Image.SCALE_SMOOTH);
            Image img4 = ImageIO.read(getClass().getResource("Images/search.png"));
            Image resizedImage4 = img4.getScaledInstance(1, 2, Image.SCALE_SMOOTH);
            Image img5 = ImageIO.read(getClass().getResource("Images/clear.png"));
            Image resizedImage5 = img4.getScaledInstance(1, 2, Image.SCALE_SMOOTH);
            Image img6 = ImageIO.read(getClass().getResource("Images/file.png"));
            Image resizedImage6 = img6.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            Image img7 = ImageIO.read(getClass().getResource("Images/open.png"));
            Image resizedImage7 = img7.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            add.setIcon(new ImageIcon(img));
            delete.setIcon(new ImageIcon(img2));
            edit.setIcon(new ImageIcon(img3));
            clearButton.setIcon(new ImageIcon(img4));
            searchButton.setIcon(new ImageIcon(img5));
            fileChooseButton.setIcon(new ImageIcon(resizedImage6));
        } catch (Exception e) {
        }

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

        String twoarray[][] = {};
        String col[] = { "Notes" };
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

        String array[][] = {};
        String[] colnames = { "VERSIONS" };
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

        versionControl.add(fileChooseButton);
        versionControl.add(openButton);
        versionControl.add(messageCommit);
        versionControl.add(saveButton);
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
saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    // Set the label to the path of the selected directory
                    File fi = new File("Saved.txt");

                    try {
                        // Create a file writer
                        FileWriter wr = new FileWriter(fi, false);

                        // Create buffered writer to write
                        BufferedWriter w = new BufferedWriter(wr);

                        // Write
                        for (int i = 0; i < currentVersion.notes.length; i++) {
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

                    }
                }
        });


        openButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create an object of JFileChooser class
                JFileChooser j = new JFileChooser("f:");
                JFrame f = new JFrame("Editor");

                // Invoke the showsOpenDialog function to show the save dialog
                int r = j.showOpenDialog(null);

                // If the user selects a file
                if (r == JFileChooser.APPROVE_OPTION) {
                    // Set the label to the path of the selected directory
                    File fi = new File(j.getSelectedFile().getAbsolutePath());

                    try {
                        // String
                        String s1 = "", sl = "";

                        // File reader
                        FileReader fr = new FileReader(fi);

                        // Buffered reader
                        BufferedReader br = new BufferedReader(fr);

                        // Initilize sl
                        sl = br.readLine();

                        // Take the input from the file
                        while ((s1 = br.readLine()) != null) {
                            sl = sl + s1;
                        }

                        System.out.println(sl);

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

                    } catch (Exception evt) {
                        JOptionPane.showMessageDialog(f, evt.getMessage());

                    }

                }

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
        searchInput.setSize(new Dimension(2, 10));
        searchBar.add(searchButton);
        searchBar.add(clearButton);
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
                String[] temparray = { title_input };
                model.insertRow(notes.getRowCount(), temparray);
                author.setText("");
                message.setText("");
                title.setText("");

            }

        });

        commitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                notes.clearSelection();
                String nameCommit = messageCommit.getText();
                currentVersion = commited.commit(currentVersion, nameCommit);

                String[] temparray = new String[1];
                temparray[0] = commited.nameVersion[count++];
                modelVersion.addRow(temparray);
                messageCommit.setText("");
                commited.printCommited();

            }

        });

        searchButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hola");
                int rowCount = model.getRowCount();
                // Remove rows one by one from the end of the table
                for (int a = rowCount - 1; a >= 0; a--) {
                    model.removeRow(a);
                }

                String inputS = searchInput.getText();
                Notes[] notasInput = new Notes[100];
                notasInput = currentVersion.Search(inputS);

                for (int i = 0; i < notasInput.length; i++) {
                    String[] temparray = new String[1];
                    temparray[0] = notasInput[i].title;
                    model.addRow(temparray);
                }

            }

        });

        edit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String author_i = authorLabel.getText();
                String title_i = titleLabel.getText();
                String message_i = messageLabel.getText();
                String[] input = { title_i };
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
                model.setRowCount(0);

                currentVersion = commited.commitedVersions[selectedVersion];

                Object[] arrayFill = currentVersion.notes;
                for (int i = 0; i < currentVersion.countNote; i++) {
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

    public void CreateNote(String author, String title, String message) {
        Notes note = new Notes(author, title, message);
        currentVersion.addNote(note);
    }

    public void DeleteNote(String input) {

    }

    public Notes[] searchNote(String input) {
        return currentVersion.Search(input);
    }

    public void commit() {

    }

    public void push() {

    }

    public static void main(String[] args) {
        Project main = new Project();

    }

}