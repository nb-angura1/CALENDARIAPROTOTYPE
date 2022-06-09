import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUILogin extends JPanel implements ActionListener {

    JFrame loginFrame;

    JLabel bigTitle;

    JTextField user;
    JLabel userTitle;

    JPasswordField password;
    JLabel passwordTitle;

    JButton login;

    JButton exit;
    public GUILogin(int width, int height, JFrame frame1){
        this.setPreferredSize(new Dimension(width,height));
        setLayout(null);

        loginFrame = frame1;

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
                JOptionPane.showMessageDialog(this,"Successful Login!!");
                loginFrame.dispose();
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
