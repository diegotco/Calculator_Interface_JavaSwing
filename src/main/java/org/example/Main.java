package org.example;

import javax.swing.*;
import java.awt.*;

class Calc implements Calculations {

    int x;
    int y;

    public Calc() {
        JFrame frame = new JFrame("Integer Input Screen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);

        JPanel panel = new JPanel(new GridLayout(0, 1));
        frame.add(panel);

        JLabel firstInteger = new JLabel("Enter the first INTEGER:");
        JTextField integerField = new JTextField(20);

        JLabel secondInteger = new JLabel("Enter the second INTEGER:");
        JTextField integerField2 = new JTextField(20);

        JButton submitButton = new JButton("Submit");

        panel.add(firstInteger);
        panel.add(integerField);
        panel.add(secondInteger);
        panel.add(integerField2);
        panel.add(submitButton);

        submitButton.addActionListener(e -> {
            try {
                String enteredInteger1 = integerField.getText();
                String enteredInteger2 = integerField2.getText();
                x = Integer.parseInt(enteredInteger1);
                y = Integer.parseInt(enteredInteger2);
                // Perform calculations and display results here
                add();
                subtract();
                multiply();
                division();
                JOptionPane.showMessageDialog(null, "Integers entered: " + enteredInteger1 + " and " + enteredInteger2);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid integers.");
            }
        });

        frame.setVisible(true);
    }

    @Override
    public void add() {
        System.out.println("Total sum: " + (x + y));
    }

    @Override
    public void subtract() {
        System.out.println("Total subtract: " + (x - y));

    }

    @Override
    public void multiply() {
        System.out.println("Total multiplication: " + (x * y));

    }

    @Override
    public void division() {
        System.out.printf("Total division with 3 decimals: %.3f%n%n", ((double)x / y) );

    }
}
public class Main {
    public static void main(String[] args) {

        new Calc();

    }
}