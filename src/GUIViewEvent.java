import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUIViewEvent extends JPanel implements ActionListener {
    Database eventFile = new Database("N:\\computer science\\IB\\Java\\CALENDAR IA PROTOTYPE\\src\\events.txt", 21);

    JFrame frame;

    JButton view;

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

        frame.getContentPane().add(this);//canvas to hold the graphics

        frame.setVisible(true);//displays the frame after adding the panel to avoid drawing errors

        add(view);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==view){
            int length = eventFile.getRecordCount();
            for(int x = 0;x<length;x++){
                String viewEvent = eventFile.getRecord(x);
                JOptionPane.showMessageDialog(this,viewEvent);
            }
        }
    }
}
