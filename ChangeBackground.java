import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ChangeBackground extends JFrame implements ActionListener
{
    public static int WIDTH = 500;
    public static int HEIGHT = 200;
    private JPanel largerPanel;

    public static void main(String args [])
    {

        ChangeBackground gui = new ChangeBackground();
        gui.setVisible(true);
    }


    public ChangeBackground()
    {
        super("Change Background Color Demo");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel biggerPanel = new JPanel();
        biggerPanel.setLayout(new GridLayout(1,1));

        largerPanel = new JPanel();
        largerPanel.setBackground(Color.YELLOW);
        biggerPanel.add(largerPanel);

        JLabel label1 = new JLabel("click the button to change the background color");
        add(label1);
        largerPanel.add(label1, BorderLayout.NORTH);

        add(biggerPanel, BorderLayout.CENTER);

        // create a panel that will hold all the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setLayout(new FlowLayout());

//        create a button object named changeColor, then add it to the button panel
        JButton changeColor = new JButton("change color");
        changeColor.addActionListener(this);
        buttonPanel.add(changeColor);

        // add button panel to the borderLayout in the upper position
        add(buttonPanel, BorderLayout.SOUTH);
    }

    // implement the interface ActionListener
    public void actionPerformed (ActionEvent e)
    {
    String buttonString = e.getActionCommand();

    if (buttonString.equals("change color"))
        largerPanel.setBackground(Color.GREEN);
    else if(buttonString.equals("change color"))
        largerPanel.setBackground(Color.YELLOW);
    else
        System.out.println("Unknown error");
    }
}