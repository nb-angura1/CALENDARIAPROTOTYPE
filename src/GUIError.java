import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TODO class to identify errors from inputting the wrong type of data or wrong data at all
public class GUIError extends JPanel implements ActionListener {
    JFrame frame;

    JLabel errorLabel;

    JButton confirm;

    public GUIError(int width, int height, String errorType){
        //TODO possibly have it intake something to output, so it can work for a variety of different errors??
        this.setPreferredSize(new Dimension(width, height));
        setLayout(null);

        frame = new JFrame("Add"); //initialising the window
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //disposes the window when closed without closing the entire program
        frame.setSize(width, height);

        errorLabel = new JLabel("An error occurred, please try again");
        errorLabel.setBounds(30,100,75,40);

        confirm = new JButton("OK");
        confirm.setBounds(0,120,100,40);
        confirm.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==confirm){

        }
    }
}
