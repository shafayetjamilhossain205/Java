


import javax.swing.*;

/**
 * BasePanel class
 * Represents pizza base selection using radio buttons.
 */
public class BasePanel extends JPanel {

    private JRadioButton thin, raised;

    /**
     * the  Constructor;
     */
    public BasePanel() {
        setBorder(BorderFactory.createTitledBorder("Base"));

        thin = new JRadioButton("Thin Crust");
        raised = new JRadioButton("Raised Crust");

        ButtonGroup group = new ButtonGroup();
        group.add(thin);
        group.add(raised);

        add(thin);
        add(raised);
    }

    /**
     * Returns selected base price.
     * @return price of base
     */
    public double getPrice() {
        if (thin.isSelected()) 
        	return 5.0;
        if (raised.isSelected())
        	return 7.0;
        return 0;
    }
}        