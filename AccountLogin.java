import javax.swing.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountLogin extends JFrame implements ActionListener
{
   public static final int WIDTH = 350;
    public static final int HEIGHT = 150;
    public static final int NUM_OF_CHAR = 20;

    private JTextField name;
    private JPasswordField password;

    public static void main(String args[])
    {
        AccountLogin gui = new AccountLogin();
        gui.setVisible(true);
    }


public AccountLogin()
{
    super("CSE 364 Account Login");
    setSize(WIDTH, HEIGHT);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new GridLayout(3,1));
    setBackground(Color.LIGHT_GRAY);



    JPanel biggerPanel = new JPanel();
    biggerPanel.setLayout(new BorderLayout());
//    biggerPanel.setBackground(Color.RED);

    JPanel namePanel = new JPanel();
    namePanel.setLayout(new BorderLayout());
//    namePanel.setBackground(Color.YELLOW);
    name = new JTextField(NUM_OF_CHAR);
    namePanel.add(name, BorderLayout.EAST);
    JLabel nameLabel = new JLabel("Username:");
    namePanel.add(nameLabel, BorderLayout.WEST);
    add(namePanel);

    JPanel pwdPanel = new JPanel();
    pwdPanel.setLayout(new BorderLayout());
//    pwdPanel.setBackground(Color.BLUE);
    password = new JPasswordField(NUM_OF_CHAR);
    pwdPanel.add(password,BorderLayout.EAST);
    JLabel pwdLabel = new JLabel("Password:");
    pwdPanel.add(pwdLabel, BorderLayout.WEST);
    add(pwdPanel);

    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new FlowLayout());
//    buttonPanel.setBackground(Color.GREEN);

    JButton loginButton = new JButton("Login");
    loginButton.addActionListener(this);
    buttonPanel.add(loginButton);

    add(buttonPanel, BorderLayout.SOUTH);


}


public void actionPerformed(ActionEvent e)
{
    String actionCommand = e.getActionCommand();
    if (actionCommand.equals("Login"))
        name.getText();
    else
        name.setText("unexpected error!!");
}
}