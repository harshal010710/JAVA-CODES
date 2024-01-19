import javax.swing.*;
import java.awt.*;

public class Calculator {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 400);

            JPanel panel = new JPanel();
            panel.setLayout(new GridBagLayout());
            GridBagConstraints c = new GridBagConstraints();

            JTextField textField = new JTextField();
            textField.setEditable(false);
            textField.setPreferredSize(new Dimension(280, 50));
            textField.setBackground(Color.WHITE);
            textField.setForeground(Color.BLACK);
            textField.setHorizontalAlignment(SwingConstants.RIGHT);
            textField.setFont(new Font("Arial", Font.BOLD, 24));
            textField.setBorder(BorderFactory.createEmptyBorder());

            JButton[] numberButtons = new JButton[10];
            for (int i = 0; i < 10; i++) {
                numberButtons[i] = new JButton(String.valueOf(i));
                numberButtons[i].setPreferredSize(new Dimension(50, 50));
                numberButtons[i].setFont(new Font("Arial", Font.BOLD, 24));
                numberButtons[i].setFocusable(false);
            }

            JButton addButton = new JButton("+");
            addButton.setPreferredSize(new Dimension(50, 50));
            addButton.setFont(new Font("Arial", Font.BOLD, 24));
            addButton.setFocusable(false);

            JButton subtractButton = new JButton("-");
            subtractButton.setPreferredSize(new Dimension(50, 50));
            subtractButton.setFont(new Font("Arial", Font.BOLD, 24));
            subtractButton.setFocusable(false);

            JButton multiplyButton = new JButton("*");
            multiplyButton.setPreferredSize(new Dimension(50, 50));
            multiplyButton.setFont(new Font("Arial", Font.BOLD, 24));
            multiplyButton.setFocusable(false);

            JButton divideButton = new JButton("/");
            divideButton.setPreferredSize(new Dimension(50, 50));
            divideButton.setFont(new Font("Arial", Font.BOLD, 24));
            divideButton.setFocusable(false);

            JButton equalsButton = new JButton("=");
            equalsButton.setPreferredSize(new Dimension(50, 50));
            equalsButton.setFont(new Font("Arial", Font.BOLD, 24));
            equalsButton.setFocusable(false);

            JButton clearButton = new JButton("C");
            clearButton.setPreferredSize(new Dimension(50, 50));
            clearButton.setFont(new Font("Arial", Font.BOLD, 24));
            clearButton.setFocusable(false);

            // Constraints
            c.fill = GridBagConstraints.HORIZONTAL;
            c.gridwidth = 4;
            c.gridx = 0;
            c.gridy = 0;
            panel.add(textField, c);

            c.gridwidth = 1;
            c.gridy = 1;
            for (int i = 1; i < 4; i++) {
                c.gridx = i - 1;
                panel.add(numberButtons[i], c);
            }

            c.gridx = 0;
            c.gridy = 2;
            panel.add(numberButtons[7], c);

            c.gridx = 1;
            panel.add(numberButtons[8], c);

            c.gridx = 2;
            panel.add(numberButtons[9], c);

            c.gridx = 3;
            panel.add(multiplyButton, c);

            c.gridy = 3;
            c.gridx = 0;
            panel.add(numberButtons[4], c);

            c.gridx = 1;
            panel.add(numberButtons[5], c);

            c.gridx = 2;
            panel.add(numberButtons[6], c);

            c.gridx = 3;
            panel.add(addButton, c);

            c.gridy = 4;
            c.gridx = 0;
            panel.add(subtractButton, c);

            c.gridx = 1;
            panel.add(numberButtons[1], c);

            c.gridx = 2;
            panel.add(numberButtons[2], c);

            c.gridx = 3;
            panel.add(numberButtons[3], c);

            c.gridy = 5;
            c.gridx = 0;
            panel.add(divideButton, c);

            c.gridx = 1;
            panel.add(clearButton, c);

            c.gridx = 2;
            panel.add(numberButtons[0], c);

            c.gridx = 3;
            panel.add(equalsButton, c);

            frame.add(panel);
            frame.setVisible(true);
        });
    }
}