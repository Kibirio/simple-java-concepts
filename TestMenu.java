import javax.swing.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestMenu extends JFrame implements ActionListener {
    public static final int WIDTH = 400;
    public static final int HEIGHT = 200;
    private JMenuBar menuBar;
    private JMenu csOption, csCourses;
    private JMenuItem netScty, softDev, csEng;
    private JMenuItem discrete, calculus, statistics;
    private JPanel textArea;

    public static void main(String [] args)
    {
        TestMenu gui = new TestMenu();
        gui.setVisible(true);
}

public TestMenu()
{
    super("CSE 364E(LAB 1a):Menus, Icons,TextArea");
    setSize(WIDTH, HEIGHT);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    menuBar = new JMenuBar();

    csCourses = new JMenu("CS Core Courses");
    csCourses.addActionListener(this);
    menuBar.add(csCourses);

    csOption = new JMenu("Cs Options");
    csOption.addActionListener(this);
    menuBar.add(csOption);

    add(menuBar, BorderLayout.NORTH);

    netScty = new JMenuItem("Network and Security");
    netScty.addActionListener(this);
    csOption.add(netScty);

    softDev = new JMenuItem("Software and Development");
    softDev.addActionListener(this);
    csOption.add(softDev);

    csEng = new JMenuItem("Computer Engineering");
    csEng.addActionListener(this);
    csOption.add(csEng);

    discrete = new JMenuItem("Discrete structures");
    discrete.addActionListener(this);
    csCourses.add(discrete);

    calculus = new JMenuItem("Calculus");
    calculus.addActionListener(this);
    csCourses.add(calculus);

    statistics = new JMenuItem("Statistics");
    statistics.addActionListener(this);
    csCourses.add(statistics);

    textArea = new JPanel();
    textArea.setBackground(Color.WHITE);
    textArea.setLayout(new FlowLayout());

    JTextArea text = new JTextArea("Description of course is shown here...", 5,10);
    text.setLineWrap(true);
    text.setEditable(false);
    textArea.add(text);

    add(textArea, BorderLayout.EAST);


    JPanel buttonPanel = new JPanel();
    buttonPanel.setBackground(Color.LIGHT_GRAY);
    buttonPanel.setLayout(new GridLayout(1,2));

    JButton exitButton = new JButton("EXIT", new ImageIcon("C:\\Users\\ruiru\\IdeaProjects\\JFramesKenyanFlag\\src\\exit.jpg"));
    exitButton.addActionListener(this);
    buttonPanel.add(exitButton);


    JButton changeColorBtn = new JButton("TOGGLE BACKGROUND COLOR");
    changeColorBtn.addActionListener(this);
    buttonPanel.add(changeColorBtn);

    add(buttonPanel, BorderLayout.SOUTH);
}



public void actionPerformed(ActionEvent e)
{
    String buttonString = e.getActionCommand();

    if(buttonString.equals("TOGGLE BACKGROUND COLOR"))
        textArea.setBackground(Color.CYAN);

    else if (buttonString.equals("TOGGLE BACKGROUND COLOR"))
        textArea.setBackground(Color.WHITE);
}
}
