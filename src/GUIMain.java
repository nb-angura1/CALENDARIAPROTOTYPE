import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUIMain extends JPanel implements ActionListener {
    JFrame frame;

    JButton add;

    JButton remove;

    JButton view;

    JButton exit;
    public GUIMain(int width, int height){
        frame = new JFrame("Main"); //initialising the window
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //disposes the window when closed without closing the entire program
        frame.setSize(300, 100);

        add = new JButton("add");
        add.setBounds(0,60,100,40);
        add.addActionListener(this);

        remove = new JButton("remove");
        remove.setBounds(120,60,100,40);
        remove.addActionListener(this);

        view = new JButton("view");
        view.setBounds(240,60,100,40);
        view.addActionListener(this);

        exit = new JButton("exit");
        exit.setBounds(360,60,100,40);
        exit.addActionListener(this);

        frame.getContentPane().add(this);

        frame.setVisible(true);

        add(add);
        add(remove);
        add(view);
        add(exit);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == add){
            GUIAddEvent test = new GUIAddEvent(600,400);
        }else if(e.getSource()==remove){
            GUIRemoveEvent test2 = new GUIRemoveEvent(600,400);
        }else if(e.getSource()==view){
            GUIViewEvent test3 = new GUIViewEvent(600,400);
        }else if(e.getSource()==exit){
            frame.dispose();
        }
    }

}
