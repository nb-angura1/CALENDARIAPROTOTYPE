import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

public class GUIEvents extends JPanel {
    JFrame frame;

    ArrayList<Date> dates = new ArrayList<Date>();

    JLabel[] labels = new JLabel[30];

    public GUIEvents(int width, int height,ArrayList<Date> dates){
        this.setPreferredSize(new Dimension(width, height));
        setLayout(null);

        frame = new JFrame("Showing"); //initialising the window
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //disposes the window when closed without closing the entire program
        frame.setSize(200, 1000);

        this.dates = dates;

        for(int displayCount=0;displayCount<dates.size()-1;displayCount++){
                labels[displayCount]= new JLabel(dates.get(displayCount).toString());
                labels[displayCount].setBounds(0,50*displayCount,350,40);
        }

        frame.getContentPane().add(this);//canvas to hold the graphics

        frame.setVisible(true);//displays the frame after adding the panel to avoid drawing errors
        for(int y=0;y<dates.size()-1;y++){
            add(labels[y]);
        }
    }
}
