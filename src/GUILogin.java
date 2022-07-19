import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUILogin extends JPanel implements ActionListener {

    JFrame frame;

    JLabel bigTitle;

    JTextField user;
    JLabel userTitle;

    JPasswordField password;
    JLabel passwordTitle;

    JButton login;

    JButton exit;
    public GUILogin(int width, int height){
        this.setPreferredSize(new Dimension(width,height));
        setLayout(null);

        frame = new JFrame("Login"); //initialising the window
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(width, height);


        bigTitle = new JLabel("LOGIN");
        bigTitle.setBounds(200,0,50,40);

        userTitle = new JLabel("username");
        userTitle.setBounds(30,50,75,40);
        user = new JTextField();
        user.setBounds(120,50,200,40);
        user.addActionListener(this);

        passwordTitle = new JLabel("password");
        passwordTitle.setBounds(30,100,75,40);
        password = new JPasswordField();
        password.setBounds(120,100,200,40);
        password.addActionListener(this);

        login = new JButton("login");
        login.setBounds(170,150,100,40);
        login.addActionListener(this);

        exit = new JButton("exit");
        exit.setBounds(170,170,100,40);
        exit.addActionListener(this);

        frame.getContentPane().add(this);//canvas to hold the graphics
        frame.setVisible(true);//displays the frame after adding the panel to avoid drawing errors

        add(bigTitle);
        add(userTitle);
        add(user);
        add(passwordTitle);
        add(password);
        add(login);
    }
    @Override
    public void actionPerformed(ActionEvent e){
//coding the login button
        if(e.getSource()==login){
            String userText;
            String passText;
            userText = user.getText();
            passText = password.getText();
            if(userText.equalsIgnoreCase("nathan")&& passText.equalsIgnoreCase("333")){
                frame.dispose();
                GUIMain calendarDisplay = new GUIMain(600,400);
            }else if(userText.equalsIgnoreCase("client")&& passText.equalsIgnoreCase("london")) {
                frame.dispose();
                GUIMain calendarDisplay = new GUIMain(600,400);
            }else{
                JOptionPane.showMessageDialog(this,"Unsuccessful Login!!");
                password.setText("");
            }
        }
        if(e.getSource()==exit){

        }
    }
}
