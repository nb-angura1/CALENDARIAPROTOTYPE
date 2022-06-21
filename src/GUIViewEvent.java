import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
public class GUIViewEvent extends JPanel implements ActionListener {
    //TODO ALLOW CLIENT TO PUT IN SPECIFIC MONTH AND RETURN EVERY EVENT IN THAT MONTH
    Database eventFile = new Database("N:\\computer science\\IB\\Java\\CALENDAR IA PROTOTYPE\\src\\events.txt", 21);

    JFrame frame;

    JButton view;

    JTextField date;

    public GUIViewEvent(int width, int height){
        this.setPreferredSize(new Dimension (width, height));
        setLayout(null);

        frame = new JFrame("View"); //initialising the window
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //disposes the window when closed without closing the entire program
        frame.setSize(300, 300);

        view = new JButton("view");
        view.setBounds(0,10,100,40);
        view.addActionListener(this);

        date = new JTextField("month goes here (3 characters)"); //inputting the date as an integer (might change to JCalendar later)
        date.setBounds(20,100,100,40);
        date.addActionListener(this);

        frame.getContentPane().add(this);//canvas to hold the graphics

        frame.setVisible(true);//displays the frame after adding the panel to avoid drawing errors

        add(view);
        add(date);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==view){
            String month = (date.getText().substring(0, 3));
            System.out.println("Showing all data");
            FileHandler.readAllLines(month);
        }
    }
}
