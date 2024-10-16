import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginInterface extends JFrame {
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginButton;
    private JButton resetButton;
    private JDialog messageDialog;
    private JLabel messageLabel; // Label to display the message dynamically

    public LoginInterface() {
        // Create frame layout
        setLayout(new FlowLayout());

        // Add username and password labels
        add(new JLabel("Username:"));
        userField = new JTextField(20);
        add(userField);

        add(new JLabel("Password:"));
        passField = new JPasswordField(20);
        add(passField);

        // Add login and reset buttons
        loginButton = new JButton("Login");
        loginButton.setBackground(Color.GREEN);
        add(loginButton);

        resetButton = new JButton("Reset");
        resetButton.setBackground(Color.CYAN);
        add(resetButton);

        // Create dialog box for messages
        messageDialog = new JDialog(this, "Message", true);
        messageDialog.setLayout(new FlowLayout());
        messageLabel = new JLabel(""); // Empty label to be updated
        messageDialog.add(messageLabel);

        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageDialog.setVisible(false);
            }
        });
        messageDialog.add(okButton);
        messageDialog.setSize(300, 150);

        // Add action listeners
        loginButton.addActionListener(new LoginActionListener());
        resetButton.addActionListener(new ResetActionListener());

        // Setup the frame
        setSize(600, 500);
        setTitle("Login Interface");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class LoginActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String username = userField.getText();
            char[] password = passField.getPassword();

            // Check credentials
            if (username.equals("User Name") && new String(password).equals("password")) {
                // Update message for successful login
                messageLabel.setText("Login successful!");
            } else {
                // Update message for failed login
                messageLabel.setText("Oops, username/password is incorrect.");
            }
            // Show the dialog with the updated message
            messageDialog.setVisible(true);
        }
    }

    private class ResetActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Clear fields
            userField.setText("");
            passField.setText("");
        }
    }

    public static void main(String[] args) {
        new LoginInterface();
    }
}
