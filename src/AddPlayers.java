import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class AddPlayers extends JPanel {


    private String bet = "";



    private String car = "";
    static String name = "";
    private static JTextField ageField;
    private static JLabel res;

    private AddPlayers() {

        setLayout(new BorderLayout());

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Please enter your name:");
        northPanel.add(label);
        northPanel.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        northPanel.setPreferredSize(new Dimension(100, 100));

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new FlowLayout());
        JLabel label2 = new JLabel("Please enter your choice of car: ");
        southPanel.add(label2);
        southPanel.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        southPanel .setPreferredSize(new Dimension(100, 100));


        ageField = new JTextField(15);
        northPanel.add(ageField);
        add(northPanel, BorderLayout.NORTH);

        ageField = new JTextField(15);
        southPanel.add(ageField);
        add(southPanel, BorderLayout.SOUTH);



        JPanel centerPanel = new JPanel();


        res = new JLabel();
        res.setVisible(false);
        centerPanel.add(res);

        add(centerPanel, BorderLayout.CENTER);


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Players Reg");
        frame.add(new AddPlayers());
        frame.setVisible(true);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(200, 200));
        frame.setLocationRelativeTo(null);//Centering the Jframe in the middle
    }




    public String getBet() {
        return bet;
    }

    public void setBet(String bet) {
        this.bet = bet;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
