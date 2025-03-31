import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.security.SecureRandom;

public class GuessGame extends JFrame {
    private static final SecureRandom randomNum = new SecureRandom();
    private int target, prevGuess = -1;

    private JTextField guessField;
    private JLabel feedbackLabel;
    private JButton playAgainButton;

    public GuessGame() {
        setTitle("Guess the Number Game");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        generateNum();

        // Guess components
        JLabel instructionLabel = new JLabel("I have a number between 1 and 1000. Can you guess my number?", SwingConstants.CENTER);
        guessField = new JTextField(10);
        JButton submitButton = new JButton("Submit");
        feedbackLabel = new JLabel("", SwingConstants.CENTER);
        playAgainButton = new JButton("Play Again");
        playAgainButton.setVisible(false);
        
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Guess:"));
        inputPanel.add(guessField);
        inputPanel.add(submitButton);

        JPanel feedbackPanel = new JPanel();
        feedbackPanel.add(feedbackLabel);
        feedbackPanel.add(playAgainButton);

        add(instructionLabel, BorderLayout.NORTH);
        add(inputPanel, BorderLayout.CENTER);
        add(feedbackPanel, BorderLayout.SOUTH);

        submitButton.addActionListener(e -> handleGuess());
        playAgainButton.addActionListener(e -> resetGame());

        setVisible(true);
    }

    private void handleGuess() {
        try {
            int guess = Integer.parseInt(guessField.getText());
            checkGuess(guess);
            updateBackground(guess);
            prevGuess = guess;
        } catch (NumberFormatException ex) {
            feedbackLabel.setText("Invalid input.");
        }
    }

    private void checkGuess(int guess) {
        if (guess == target) {
            feedbackLabel.setText("Correct!");
            guessField.setEditable(false);
            playAgainButton.setVisible(true);
        } else if (guess > target) {
            feedbackLabel.setText("Too High");
        } else {
            feedbackLabel.setText("Too Low");
        }
    }

    private void updateBackground(int guess) {
        if (prevGuess == -1) return; // first guess

        int prevDiff = Math.abs(target - prevGuess);
        int currDiff = Math.abs(target - guess);

        if (currDiff < prevDiff) {
            getContentPane().setBackground(Color.RED);
        } else {
            getContentPane().setBackground(Color.BLUE);
        }
    }

    private void resetGame() {
        generateNum();
        prevGuess = -1;
        feedbackLabel.setText("");
        guessField.setText("");
        guessField.setEditable(true);
        getContentPane().setBackground(null);
        playAgainButton.setVisible(false);
    }

    private void generateNum() {
        target = new SecureRandom().nextInt(1000) + 1;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GuessGame::new);
    }
}
