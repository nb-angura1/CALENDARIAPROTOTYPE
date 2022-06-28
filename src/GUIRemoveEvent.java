import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

//TODO MAKE THIS SO THE CLIENT HAS TO ENTER A CERTAIN DATE, SHOW ALL EVENTS ON THIS DATE, THEN WHICH TO DELETE - JComboBox maybe?? --extra
public class GUIRemoveEvent extends JPanel implements ActionListener {
    Database eventFile = new Database("N:\\computer science\\IB\\Java\\CALENDAR IA PROTOTYPE\\src\\events.txt", 21);

    JFrame frame;

    JLabel label;

    JButton confirm;

    JTextField select;

    public GUIRemoveEvent(int width, int height){
        this.setPreferredSize(new Dimension (width, height));
        setLayout(null);

        frame = new JFrame("Remove"); //initialising the window
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //disposes the window when closed without closing the entire program
        frame.setSize(450, 300);

        label = new JLabel("Enter the date you want to delete an event from here.");
        label.setBounds(0,50,350,40);

        select = new JTextField("row goes here"); //inputting the date as an integer (might change to JCalendar later)
        select.setBounds(0,100,100,40);
        select.addActionListener(this);

        confirm = new JButton("confirm");
        confirm.setBounds(0,150,100,40);
        confirm.addActionListener(this);


        frame.getContentPane().add(this);//canvas to hold the graphics

        frame.setVisible(true);//displays the frame after adding the panel to avoid drawing errors


        add(confirm);
        add(select);
        add(label);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        //TODO CHANGE IT TO CLEAR ALL EVENTS ON A CERTAIN DATE
        if(e.getSource()==confirm){
            Date removeDate = null;
            String removeDateInString = select.getText();
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                removeDate = sdf.parse(removeDateInString);
            }catch(java.text.ParseException n){
                n.printStackTrace();
            }
            System.out.println(removeDate);
            eventFile.deleteRecord(removeDate);
            JOptionPane.showMessageDialog(this,"Event successfully removed!");
        }
    }

}
