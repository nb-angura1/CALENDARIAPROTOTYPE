import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TODO class to identify errors from inputting the wrong type of data or wrong data at all
public class GUIError extends JPanel implements ActionListener {
    JFrame frame;

    public GUIError(int width, int height, String errorType){
        //TODO possibly have it intake something to output, so it can work for a variety of different errors??
        this.setPreferredSize(new Dimension(width, height));
        setLayout(null);

        frame = new JFrame("Add"); //initialising the window
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //disposes the window when closed without closing the entire program
        frame.setSize(width, height);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
