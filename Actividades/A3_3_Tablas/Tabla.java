import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.List;
import java.util.ArrayList;
public class Tabla extends JPanel
    {
        protected  String line;
        protected Object[][] dataFields;
           public Tabla()
    {
       GridLayout layout =  new GridLayout(1,1);
        super(layout);

        ArrayList<String> dataLines = new ArrayList<>();

        try{
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            while((line = br.readLine()) != null){
                dataLines.add(line);
            }
            dataFields=  new Object[dataLines.size()][4];
            for(int i=0; i<dataLines.size(); i++){
                dataFields[i] = dataLines.get(i).split(",");
            }

        }catch(IOException e){
            System.out.println(e.toString());
        }

    String[] titles = new String[]{"Name", "L Name", "Phone Number", "Genre"};
    JTable data = new JTable(dataFields, titles);
    JScrollPane scroll = new JScrollPane(data);
    scroll.setVisible(true);
    add(scroll);

    repaint();
    // Actualiza el conteneder
    }
    

public static void main(String[] args) {
    JFrame ventana = new JFrame("Tablita");
    Tabla dataTable = new Tabla();
    ventana.setContentPane(dataTable);
    ventana.pack();
    ventana.setVisible(true);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}