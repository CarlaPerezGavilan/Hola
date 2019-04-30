import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TestJFrame extends JFrame {
    JFrame thisFrame = this;
    public TestJFrame() {
        this.setBounds(100, 100, 300, 300);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton button = new JButton("Click");
        this.add(button);
        button.setBounds(10, 10, 100, 30);
        button.addActionListener(new ButtonAction());

        JButton secondButton = new JButton("Move");
        secondButton.setSize(100, 30);

        JButton thirdButton = new JButton("Move 10");
        thirdButton.setSize(100, 30);
        this.add(thirdButton);
       
        this.add(secondButton);
        secondButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                thisFrame.setLocation(50, 50);
            }
        });

    }

    public static void main(String[] args) {
        TestJFrame frame = new TestJFrame();

    }

    private class ButtonAction implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
}