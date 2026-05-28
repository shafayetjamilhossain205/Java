

import javax.swing.*;

/**
 * ToppingPanel class
 * Represents toppings using checkboxes.
 */
public class ToppingPanel extends JPanel {

    private JCheckBox cheese, tuna, pepperoni, mushroom;

    /**
     * Constructor to initialize topping options;
     */
    public ToppingPanel() {
    	//BorderFactory.createTitledBorder(String title)
        setBorder(BorderFactory.createTitledBorder("Toppings"));

        cheese = new JCheckBox("Cheese");
        tuna = new JCheckBox("Tuna");
        pepperoni = new JCheckBox("Pepperoni");
        mushroom = new JCheckBox("Mushrooms");

        add(cheese);
        add(tuna);
        add(pepperoni);
        add(mushroom);
    }

    /**
     * Calculates total topping price.
     * @return total topping cost
     */
    public double getPrice() {
        double total = 0;

        if (cheese.isSelected())
        	total += 1.5;
        if (tuna.isSelected()) 
        	total += 2.0;
        if (pepperoni.isSelected()) 
        	total += 2.5;
        if (mushroom.isSelected()) 
        	total += 1.0;

        return total;
    }
}
