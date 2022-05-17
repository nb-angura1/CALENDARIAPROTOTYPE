import javax.swing.*;
import java.awt.*;
public class GUIAddEvent extends JPanel {
    private JFrame frame;

    JTextField event;
    public GUIAddEvent(int width, int height){
        frame = new JFrame("Demo"); //initialising the window
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //disposes the window when closed without closing the entire program
        frame.setSize(300, 300);

        frame.getContentPane().add(this);//canvas to hold the graphics

        frame.setVisible(true);//displays the frame after adding the panel to avoid drawing errors
    }
    @Override

}
