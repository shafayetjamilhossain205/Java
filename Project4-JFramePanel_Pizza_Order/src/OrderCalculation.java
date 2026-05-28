
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * OrderCalculation class
 * Main JFrame that holds all panels and handles calculations.
 */
public class OrderCalculation extends JFrame {

    private BasePanel basePanel;
    private ToppingPanel toppingPanel;
    private DrinkPanel drinkPanel;

    /**
     * Constructor to initialize GUI components.
     */
    public OrderCalculation() {
        setTitle("Pizza Order Calculator");
        setSize(500, 300);
        setLayout(new BorderLayout());

        basePanel = new BasePanel();
        toppingPanel = new ToppingPanel();
        drinkPanel = new DrinkPanel();

        JPanel centerPanel = new JPanel();
        centerPanel.add(basePanel);
        centerPanel.add(toppingPanel);
        centerPanel.add(drinkPanel);

        add(centerPanel, BorderLayout.CENTER);
        add(createButtonPanel(), BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * Creates panel with Calculate and Exit buttons.
     * @return JPanel containing buttons
     */
    private JPanel createButtonPanel() {
        JPanel panel = new JPanel();

        JButton calcBtn = new JButton("Calculate");
        JButton exitBtn = new JButton("Exit");

        panel.add(calcBtn);
        panel.add(exitBtn);

        calcBtn.addActionListener(new CalculateListener());
        exitBtn.addActionListener(e -> System.exit(0));

        return panel;
    }

    /**
     *calculation button click;
     */
    private class CalculateListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double subtotal = basePanel.getPrice()
                    + toppingPanel.getPrice()
                    + drinkPanel.getPrice();

            double tax = subtotal * 0.06;
            double total = subtotal + tax;

            JOptionPane.showMessageDialog(null,
                    "Subtotal: $" + subtotal +
                            "\nTax: $" + tax +
                            "\nTotal: $" + total);
        }
    }
}