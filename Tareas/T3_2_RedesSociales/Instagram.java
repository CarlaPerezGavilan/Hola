import  javax.swing.*;
public class Instagram extends SocialNetwork{
    public void postMessage(String message){
        super.postMessage(message);
        JOptionPane.showMessageDialog(null, message, "INSTAGRAM POST", JOptionPane.INFORMATION_MESSAGE);
    }
}