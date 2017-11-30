import javax.swing.*;

public class AddPlayers extends JPanel {


    private static int bet;
    private static String choice = "";
    static String name = "";


       public AddPlayers()
       {



        JPanel panel1 = new JPanel();
        name = JOptionPane.showInputDialog(null, "Please Enter Player Name: ", "Player Reg", JOptionPane.INFORMATION_MESSAGE);


        JPanel panel2 = new JPanel();
        choice = JOptionPane.showInputDialog(null, "Please enter a choice (c1/c2/c3/c4/c5)", "Choose Car", JOptionPane.INFORMATION_MESSAGE);

        JPanel panel3 = new JPanel();
        bet = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your amount", "Amount", JOptionPane.INFORMATION_MESSAGE));
    }

    public int getBet() {
        return bet;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name :" + name + "\'"+
                "bet : " + bet +  "\'" +
                ", choice : " + choice + '\'' +
                '}';
    }
}





