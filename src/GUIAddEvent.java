import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GUIAddEvent extends JPanel implements ActionListener {
    //TODO possibly add in multiple date formatters so user can enter dates in different ways
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
        frame.setSize(width, height);

        event = new JTextField("event goes here");
        event.setBounds(0,10,100,40);
        event.addActionListener(this);

        date = new JTextField("date goes here"); //inputting the date as an integer (might change to JCalendar later)
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
            boolean flag = false;
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            String newEvent;
            String eventDateInString;
            Date eventDate = null;
            newEvent = event.getText();
            if(newEvent.length()>20){
                JOptionPane.showMessageDialog(this,"Invalid event!");
                event.setText("");
            }
            eventDateInString = date.getText();
                try {
                    eventDate = sdf.parse(eventDateInString);
                    flag = true;
                }catch(java.text.ParseException n){
                    JOptionPane.showMessageDialog(this,"Invalid date!");
                }

                if (flag){
                    System.out.println(eventDate);
                    newEvent = Padder.rightPadding(newEvent, ' ', 20);
                    eventFile.addRecord(newEvent, eventDate);
                    event.setText("");
                    date.setText("");
                    JOptionPane.showMessageDialog(this,"Event successfully added!");

            }

        }
    }
}
