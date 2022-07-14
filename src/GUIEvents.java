import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

public class GUIEvents extends JPanel {
    JFrame frame;

    ArrayList<Date> dates = new ArrayList<Date>();

    JLabel label;

    JLabel label2;

    public GUIEvents(int width, int height,ArrayList<Date> dates){

        this.dates = dates;

        this.setPreferredSize(new Dimension(width, height));
        setLayout(null);

        label2 = new JLabel("yes");
        label2.setBounds(0,50,350,40);

        /*for(int displayCount=0;displayCount<dates.size();displayCount++){
            label = new JLabel("yes");
            label.setBounds(0,50 * displayCount,350,40);
            //System.out.println("view events class "+dates.get(displayCount));
            label.setText(String.valueOf(dates.get(displayCount)));
        }*/


        frame.getContentPane().add(this);//canvas to hold the graphics

        frame.setVisible(true);//displays the frame after adding the panel to avoid drawing errors

        //add(label);
        add(label2);
    }
}
