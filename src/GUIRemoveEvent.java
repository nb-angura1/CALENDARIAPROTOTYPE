import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUIRemoveEvent extends JPanel implements ActionListener {
    Database eventFile = new Database("N:\\computer science\\IB\\Java\\CALENDAR IA PROTOTYPE\\src\\events.txt", 21);

    JFrame frame;

    JButton confirm;
    public GUIRemoveEvent(int width, int height){
        this.setPreferredSize(new Dimension (width, height));
        setLayout(null);

        frame = new JFrame("Remove"); //initialising the window
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //disposes the window when closed without closing the entire program
        frame.setSize(300, 300);

        confirm = new JButton("confirm");
        confirm.setBounds(0,50,100,40);
        confirm.addActionListener(this);

        frame.getContentPane().add(this);//canvas to hold the graphics

        frame.setVisible(true);//displays the frame after adding the panel to avoid drawing errors


        add(confirm);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==confirm){
            eventFile.deleteRecord(2);
            JOptionPane.showMessageDialog(this,"Event successfully removed!");
        }
    }

}
