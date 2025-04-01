import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Align extends JFrame {
    JCheckBox snapToGrid, showGrid;
	JLabel xLabel, yLabel;
	JTextField xField, yField;
	JButton okButton, cancelButton, helpButton;

	public Align() {
        setTitle("Align");
        setSize(300, 135);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        snapToGrid = new JCheckBox("Snap to Grid");
        showGrid = new JCheckBox("Show Grid");
        xLabel = new JLabel("X:");
        yLabel = new JLabel("Y:");
        xField = new JTextField(3);
        yField = new JTextField(3);
        okButton = new JButton("Ok");
        cancelButton = new JButton("Cancel");
        helpButton = new JButton("Help");

        // Checkboxes
        Box leftBox = Box.createVerticalBox();
        leftBox.add(snapToGrid);
        leftBox.add(showGrid);

        // X: Y:
        Box middleBox = Box.createVerticalBox();
        JPanel xPanel = new JPanel(new FlowLayout());
        xPanel.add(xLabel);
        xPanel.add(xField);
        JPanel yPanel =  new JPanel(new FlowLayout());
        yPanel.add(yLabel);
        yPanel.add(yField);
        middleBox.add(xPanel);
        middleBox.add(yPanel);

        // Buttons
        Box rightBox = Box.createVerticalBox();
        JPanel buttonPanel = new JPanel(new GridLayout(3, 1, 5, 5));
        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);
        buttonPanel.add(helpButton);
        rightBox.add(buttonPanel);

        add(leftBox);
        add(middleBox);
        add(rightBox);

        setVisible(true);
    }

    public static void main(String args[])
    {
        SwingUtilities.invokeLater(Align::new);
    }
}