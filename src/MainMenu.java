import sun.applet.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class MainMenu extends JFrame{
    public static void main(String args[]){

        JFrame MainMenuFrame = new JFrame("Main Menu");
        MainMenuFrame.setSize(600,600);
        MainMenuFrame.setLocationRelativeTo(null);//Centering the Jframe in the middle

        JPanel MainMenuPanel = new JPanel();
        MainMenuPanel.setBackground(Color.RED);

        JButton startGame = new JButton("Start");
        startGame.setVisible(true);

        MainMenuFrame.add(MainMenuPanel);
        MainMenuPanel.add(startGame);
        MainMenuFrame.setVisible(true);

        String bet = "";
        String car = "";

        JOptionPane.showInputDialog(null,"Please enter your name:","Player Registration",JOptionPane.INFORMATION_MESSAGE);
        car = JOptionPane.showInputDialog(null,"Please enter your choice:",JOptionPane.INFORMATION_MESSAGE);
        bet = JOptionPane.showInputDialog(null, "Please enter your betting amount:",JOptionPane.INFORMATION_MESSAGE);


    }
}
