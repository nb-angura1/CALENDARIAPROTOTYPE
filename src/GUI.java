import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUI extends JPanel implements ActionListener {

    JButton add;
    JButton remove;
    JButton view;
    JButton exit;
    public GUI(int width, int height){
        //GUI constructor
        this.setPreferredSize(new Dimension (width, height));
        setLayout(null);

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
        }
    }

}
