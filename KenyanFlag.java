

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class KenyanFlag extends JFrame implements ActionListener {
    public static int WIDTH = 500;
    public static int HEIGHT = 350;
    private JPanel blackPanel;
    private JPanel whitePanel;
    private JPanel whitePanel2;
    private JPanel redPanel;
    private JPanel greenPanel;
//    private JPanel resetPanel;

    public static void main(String[] args) {
        KenyanFlag gui = new KenyanFlag();
        gui.setVisible(true);
    }

    public KenyanFlag() {
        super("Kenyan Flag");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel biggerPanel = new JPanel();
        biggerPanel.setLayout(new GridLayout(5, 1));

        blackPanel = new JPanel();
        blackPanel.setBackground(Color.LIGHT_GRAY);
        blackPanel.setPreferredSize(new Dimension(500, 10));
        biggerPanel.add(blackPanel);

        whitePanel = new JPanel();
        whitePanel.setBackground(Color.LIGHT_GRAY);
        whitePanel.setSize(500, 10);
        biggerPanel.add(whitePanel);

        redPanel = new JPanel();
        redPanel.setBackground(Color.LIGHT_GRAY);
        redPanel.setSize(500, 100);
        biggerPanel.add(redPanel);

        whitePanel2 = new JPanel();
        whitePanel2.setBackground(Color.LIGHT_GRAY);
        whitePanel2.setSize(500, 10);
        biggerPanel.add(whitePanel2);

        greenPanel = new JPanel();
        greenPanel.setBackground(Color.LIGHT_GRAY);
        greenPanel.setSize(500, 100);
        biggerPanel.add(greenPanel);

        add(biggerPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setLayout(new FlowLayout());

        JButton blackButton = new JButton("Black");
        blackButton.setBackground(Color.BLACK);
        blackButton.addActionListener(this);
        buttonPanel.add(blackButton);

        JButton whiteButton = new JButton("White");
        whiteButton.setBackground(Color.WHITE);
        whiteButton.addActionListener(this);
        buttonPanel.add(whiteButton);

        JButton redButton = new JButton("Red");
        redButton.setBackground(Color.RED);
        redButton.addActionListener(this);
        buttonPanel.add(redButton);

        JButton greenButton = new JButton("Green");
        greenButton.setBackground(Color.GREEN);
        greenButton.addActionListener(this);
        buttonPanel.add(greenButton);

        JButton resetButton = new JButton("Reset");
        resetButton.setBackground(Color.PINK);
        resetButton.addActionListener(this);
        buttonPanel.add(resetButton);

        JButton applyButton = new JButton("Apply");
        applyButton.setBackground(Color.YELLOW);
        applyButton.addActionListener(this);
        buttonPanel.add(applyButton);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        String buttonString = e.getActionCommand();

        if (buttonString.equals("Black"))
            blackPanel.setBackground(Color.BLACK);
        else if (buttonString.equals("White")) {
            whitePanel.setBackground(Color.WHITE);
            whitePanel2.setBackground(Color.WHITE);
        } else if (buttonString.equals("Red"))
            redPanel.setBackground(Color.RED);
        else if (buttonString.equals("Green"))
            greenPanel.setBackground(Color.GREEN);
        else if (buttonString.equals("Reset")) {
            blackPanel.setBackground(Color.LIGHT_GRAY);
            whitePanel.setBackground(Color.LIGHT_GRAY);
            whitePanel2.setBackground(Color.LIGHT_GRAY);
            redPanel.setBackground(Color.LIGHT_GRAY);
            greenPanel.setBackground(Color.LIGHT_GRAY);
        } else if (buttonString.equals("Apply")) {
            blackPanel.setBackground(Color.BLACK);
            whitePanel.setBackground(Color.WHITE);
            whitePanel2.setBackground(Color.WHITE);
            redPanel.setBackground(Color.RED);
            greenPanel.setBackground(Color.GREEN);
        } else


            System.out.println("Unexpectedd error");
    }
}