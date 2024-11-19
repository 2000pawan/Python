import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingApp {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Programming Language Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Create JComboBox for programming languages
        String[] languages = {"Java", "Python", "C++", "JavaScript"};
        JComboBox<String> languageComboBox = new JComboBox<>(languages);

        // Create JCheckBoxes for levels
        JCheckBox beginnerCheckBox = new JCheckBox("Beginner");
        JCheckBox intermediateCheckBox = new JCheckBox("Intermediate");
        JCheckBox expertCheckBox = new JCheckBox("Expert");

        // Create a JLabel to display the selection
        JLabel resultLabel = new JLabel("Select a language and level.");

        // Add ActionListener to JComboBox and JCheckBoxes
        ActionListener updateResult = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String language = (String) languageComboBox.getSelectedItem();
                StringBuilder levels = new StringBuilder();

                if (beginnerCheckBox.isSelected()) levels.append("Beginner ");
                if (intermediateCheckBox.isSelected()) levels.append("Intermediate ");
                if (expertCheckBox.isSelected()) levels.append("Expert ");

                String levelText = levels.toString().trim();
                if (levelText.isEmpty()) levelText = "No level selected";

                resultLabel.setText("Language: " + language + ", Level: " + levelText);
            }
        };

        languageComboBox.addActionListener(updateResult);
        beginnerCheckBox.addActionListener(updateResult);
        intermediateCheckBox.addActionListener(updateResult);
        expertCheckBox.addActionListener(updateResult);

        // Add components to the frame
        frame.add(new JLabel("Select Programming Language:"));
        frame.add(languageComboBox);
        frame.add(new JLabel("Select Level:"));
        frame.add(beginnerCheckBox);
        frame.add(intermediateCheckBox);
        frame.add(expertCheckBox);
        frame.add(resultLabel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
