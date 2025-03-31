import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;   // JFrame, JTextField, JLabel, JButton

public class F2C extends JFrame {
    public F2C() {
        setTitle("Farenheit to Celsius Converter");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JTextField fahrenheitField = new JTextField(10);
        JButton convertButton = new JButton("Convert");
        JLabel resultLabel = new JLabel("Celsius:");

        add(new JLabel("Fahrenheit:"));
        add(fahrenheitField);
        add(convertButton);
        add(resultLabel);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double fahrenheit = Double.parseDouble(fahrenheitField.getText());
                    double celsius = (5.0/9.0) * (fahrenheit - 32);
                    resultLabel.setText("Celsius: " + String.format("%.2f", celsius));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input.");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new F2C().setVisible(true);
        });
    }
}