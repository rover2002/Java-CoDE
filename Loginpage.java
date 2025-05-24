import java.awt.*;
import javax.swing.*;

public class Loginpage extends JFrame {
    JLabel lblLogin, lblUser, lblPass;
    JTextField txtUser;
    JPasswordField txtPass;
    JButton btnLogin;

    public Loginpage() {

        setLayout(null);

        lblLogin = new JLabel("LOGIN");
        lblLogin.setBounds(150, 50, 100, 30); // Adjusted position
        add(lblLogin);

        lblUser = new JLabel("User_ID");
        lblUser.setBounds(50, 100, 100, 30); // Adjusted position
        add(lblUser);

        txtUser = new JTextField();
        txtUser.setBounds(150, 100, 150, 30); // Adjusted position
        add(txtUser);

        lblPass = new JLabel("Password");
        lblPass.setBounds(50, 150, 100, 30); // Adjusted position
        add(lblPass);

        txtPass = new JPasswordField();
        txtPass.setBounds(150, 150, 150, 30); // Adjusted position
        add(txtPass);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(150, 200, 100, 30); // Added button
        add(btnLogin);
    }

    public static void main(String[] args) {
        Loginpage obj = new Loginpage();
        obj.setSize(400, 300); // Adjusted size
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the application exits on close
    }
}
