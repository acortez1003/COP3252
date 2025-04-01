import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CrapsGUI extends JFrame {
    private JLabel r1Label, r2Label, sumLabel, pointLabel, feedbackLabel;
    private JTextField r1Field, r2Field, sumField, pointField;
    private JButton rollButton;
    private Craps game;

    public CrapsGUI() {
        setTitle("Craps");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        game = new Craps();

        r1Label = new JLabel("Roll 1:");
        r1Field = new JTextField(5);
        r2Label = new JLabel("Roll 2:");
        r2Field = new JTextField(5);
        sumLabel = new JLabel("Sum:");
        sumField = new JTextField(5);
        pointLabel = new JLabel("Point:");
        pointField = new JTextField(5);
        rollButton = new JButton("Roll");
        feedbackLabel = new JLabel("");

        r1Field.setEditable(false);
        r2Field.setEditable(false);
        sumField.setEditable(false);
        pointField.setEditable(false);

        Box gameBox = Box.createVerticalBox();
        JPanel rollPanel = new JPanel(new FlowLayout());
        rollPanel.add(r1Label);
        rollPanel.add(r1Field);
        rollPanel.add(r2Label);
        rollPanel.add(r2Field);
        rollPanel.add(sumLabel);
        rollPanel.add(sumField);
        rollPanel.add(pointLabel);
        rollPanel.add(pointField);

        JPanel feedbackPanel = new JPanel(new FlowLayout());
        feedbackPanel.add(feedbackLabel);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(rollButton);

        gameBox.add(rollPanel);
        gameBox.add(feedbackPanel);
        gameBox.add(buttonPanel);

        container.add(gameBox);

        rollButton.addActionListener(e -> handleRoll());

        setVisible(true);
    }

    private void handleRoll() {
        game.rollDice();

        r1Field.setText(String.valueOf(game.getRoll1()));
        r2Field.setText(String.valueOf(game.getRoll2()));
        sumField.setText(String.valueOf(game.getSum()));
        pointField.setText(game.getPoint() > 0 ? String.valueOf(game.getPoint()) : ""); 

        if (game.getPoint() == 0) {
            feedbackLabel.setText("You win!");
        } else if (game.getPoint() == -1) {
            feedbackLabel.setText("You lose!");
        } else {
            feedbackLabel.setText("Roll again.");
        }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CrapsGUI::new);
    }
}