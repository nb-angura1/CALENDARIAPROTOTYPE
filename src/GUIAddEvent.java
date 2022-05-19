import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIAddEvent extends JPanel implements ActionListener {
    JFrame frame;

    JTextField event;
    public GUIAddEvent(int width, int height){
        frame = new JFrame("Add"); //initialising the window
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //disposes the window when closed without closing the entire program
        frame.setSize(300, 300);

        event = new JTextField();
        event.setBounds(0,10,100,40);
        event.addActionListener(this);

        frame.getContentPane().add(this);//canvas to hold the graphics

        frame.setVisible(true);//displays the frame after adding the panel to avoid drawing errors
    }

@Override

public void actionOccurred(ActionEvent e){
if(e.getSource()==event){

}
}
}
