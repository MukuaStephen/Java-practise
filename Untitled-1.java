import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ImageDisplay extends JFrame implements ActionListener {
    JRadioButton radioButton1, radioButton2, radioButton3;
    JRadioButton radioButton4; JRadioButton radioButton5;

    private JLabel imageLabel;

    public ImageDisplay() {
        setTitle("Radio Button Image Display");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6,0));

        // Create radio buttons
        radioButton1 = new JRadioButton("cat");
        radioButton2 = new JRadioButton("bird");
        radioButton3 = new JRadioButton("Dog");
        JRadioButton radioButton4=new JRadioButton("Rabbit");
        JRadioButton radioButton5=new JRadioButton("Pig");

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);
        group.add(radioButton4);
        group.add(radioButton5);

        // Add action listeners
        radioButton1.addActionListener(this);
        radioButton2.addActionListener(this);
        radioButton3.addActionListener(this);
        radioButton4.addActionListener(this);
        radioButton5.addActionListener(this);

        // Add radio buttons to the frame
        add(radioButton1);
        add(radioButton2);
        add(radioButton3);
        add(radioButton4);
        add(radioButton5);

        // Label to display the image
        imageLabel = new JLabel();
        add(imageLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String imagePath = "";
        if (e.getSource() == radioButton1) {
            imagePath = "R.jpg";
        } else if (e.getSource() == radioButton2) {
            imagePath = "bir.jpg";
        } else if (e.getSource() == radioButton3) {
            imagePath = "cat.jpg";
        } else if (e.getSource() == radioButton4) {
            imagePath = "pig.webp";
        } else if (e.getSource() == radioButton5) {
            imagePath = "dog.jpg";
        }

        if (!imagePath.isEmpty()) {
            ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));
            if (icon.getIconWidth() == -1) {
                System.out.println("Could not load image: " + imagePath);
            } else {
                imageLabel.setIcon(icon);
            }
        }
    }

    public static void main(String[] args) {
        new ImageDisplay();
    }
}