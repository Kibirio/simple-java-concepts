import javax.swing.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuGui extends JFrame implements ActionListener {
    public static final int WIDTH = 400;
    public static final int HEIGHT = 200;
    private JMenuBar bar;
    private JMenu csMenu, courseMenu;


    public static void main(String[] args) {
        MenuGui gui = new MenuGui();
        gui.setVisible(true);
    }

    public MenuGui() {
        super("CSE 364E(LAB 1a):Menus, Icons,TextArea");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 1));



        JMenu courseMenu = new JMenu("CS Core Courses");


       JMenuItem calculus = new JMenuItem("Calculus");
        calculus.addActionListener(this);
        courseMenu.add(calculus);

        JMenuItem discrete_structures = new JMenuItem("Discrete structures");
        discrete_structures.addActionListener(this);
        courseMenu.add(discrete_structures);

        JMenuItem algorithms = new JMenuItem("Algorithms");
        algorithms.addActionListener(this);
        courseMenu.add(algorithms);

        bar = new JMenuBar();
        bar.add(courseMenu);
        setJMenuBar(bar);

        bar = new JMenuBar();
        bar.add(csMenu);
        setJMenuBar(bar);

        JMenu csMenu = new JMenu("CS Options");

        // create menu items to be held in the csMenu
        JMenuItem netSecMenu = new JMenuItem("Network and Security");
        netSecMenu.addActionListener(this);
        csMenu.add(netSecMenu);

        JMenuItem softDevMenu = new JMenuItem("Software and Development");
        softDevMenu.addActionListener(this);
        csMenu.add(softDevMenu);

        JMenuItem csEngMenu = new JMenuItem("Computer Engineering");
        csEngMenu.addActionListener(this);
        csMenu.add(csEngMenu);

         add(bar);

    }


    public void actionPerformed(ActionEvent e) {
        String menuString = e.getActionCommand();
    }
}