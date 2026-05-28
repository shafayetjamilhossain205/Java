
import javax.swing.*;

/**
 * DrinkPanel class
 * Represents drink selection using radio buttons.
 */
public class DrinkPanel extends JPanel {

    private JRadioButton coke, diet, tea;

    /**
     * Constructor;
     */
    public DrinkPanel() {
        setBorder(BorderFactory.createTitledBorder("Drinks"));

        coke = new JRadioButton("Coke");
        diet = new JRadioButton("Diet Coke");
        tea = new JRadioButton("Sweet Tea");

        ButtonGroup group = new ButtonGroup();
        group.add(coke);
        group.add(diet);
        group.add(tea);

        add(coke);
        add(diet);
        add(tea);
    }

    /**
     * Returns selected drink price.
     * @return drink cost
     */
    public double getPrice() {
        if (coke.isSelected()) 
        	return 2.0;
        if (diet.isSelected()) 
        	return 2.0;
        if (tea.isSelected()) 
        	return 1.5;
        return 0;
    }
}
