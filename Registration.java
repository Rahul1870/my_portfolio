import javax.swing.*;
import java.awt.*;

public class Registration extends JDialog {
    private JPanel registerPanel;
    private JTextField tfFatherName;
    private JTextField tfEmail;
    private JTextField tfName;
    private JPasswordField pfPassword;
    private JPasswordField pfConfirmPassword;
    private JButton btnRegister;
    private JButton btnCancel;

    public Registration(JFrame parent) {
        super(parent);
        setTitle("Create a new Account");
        setContentPane(registerPanel);
        setMinimumSize(new Dimension(450, 474));
        setModal(true);
        setLocationRelativeTo(parent);
        setVisible(true);
    }

    public static void main(String[] args) {
        Registration myForm= new Registration(null);
    }
}
