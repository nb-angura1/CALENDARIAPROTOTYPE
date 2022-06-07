import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIAddEvent extends JPanel implements ActionListener {
    Database eventFile = new Database("N:\\computer science\\IB\\Java\\CALENDAR IA PROTOTYPE\\src\\events.txt", 21);

    JFrame frame;

    JTextField event;

    JTextField date;

    JButton confirm;
    public GUIAddEvent(int width, int height){

        this.setPreferredSize(new Dimension (width, height));
        setLayout(null);

        frame = new JFrame("Add"); //initialising the window
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //disposes the window when closed without closing the entire program
        frame.setSize(300, 300);

        event = new JTextField("event goes here");
        event.setBounds(0,10,100,40);
        event.addActionListener(this);

        date = new JTextField("date goes here"); //inputting the date as an integer (might change to JCalendar later)
        //TODO, SIMPLE DATE FORMAT SO USER CAN INPUT A DATE
        date.setBounds(0,60,100,40);
        date.addActionListener(this);

        confirm = new JButton("confirm");
        confirm.setBounds(0,120,100,40);
        confirm.addActionListener(this);

        frame.getContentPane().add(this);//canvas to hold the graphics

        frame.setVisible(true);//displays the frame after adding the panel to avoid drawing errors

        add(event);
        add(date);
        add(confirm);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==confirm){
            String newEvent;
            newEvent = event.getText();
            newEvent = Padder.rightPadding(newEvent, ' ', 20);
            eventFile.addRecord(newEvent);
            event.setText("");
            JOptionPane.showMessageDialog(this,"Event successfully added!");
        }
    }
}
