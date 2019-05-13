import java.awt.geom.Ellipse2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BaseProject extends JFrame {
    JTextArea commandPrompt;
    JTable listOfNotes;
    JTextArea noteEditor;
    JTextField textField;

    Note[] allNotes;

    int countNotes;

    public BaseProject() {
        super(new BorderLayout());
        JSplitPane splitPane;
        commandPrompt = new JTextArea("prompt:>>");
        setSize(500, 500);
        allNotes = new Note[100];
        listOfNotes = new JTable(new Object[][] { { "hola" } }, new Object[] { "Notes" });
        add(commandPrompt, BorderLayout.PAGE_START);
        add(listOfNotes, BorderLayout.CENTER);
        noteEditor = new JTextArea("note editor");

        JScrollPane scrollPane = new JScrollPane(listOfNotes);

        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, scrollPane, noteEditor);
        add(splitPane, BorderLayout.CENTER);

        ListSelectionModel lsm = listOfNotes.getSelectionModel();
        lsm.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                int selectedColumn = lsm.getMinSelectionIndex();
                System.out.println(selectedColumn);
            }
        });

        JPanel btnPanel = new JPanel();

        JTextPane author = new JTextPane();

        JTable notes = new JTable(new DefaultTableModel(1, 0));


        JButton a = new JButton("Buscar");
        btnPanel.add(a);
        a.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              
            }
        } );

        JButton c = new JButton("Mostrar");
        btnPanel.add(c);
        c.setBackground(Color.BLUE);
        repaint();

        add(btnPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        Project p = new Project();
    }
}