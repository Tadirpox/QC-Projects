import javax.swing.*;
import java.awt.*;

public class FEDERALTax extends JPanel{
	
	public FEDERALTax() {
		super();
		
		setBackground(Color.YELLOW);
		setLayout(null);
		
		JLabel title = new JLabel("Federal Tax");
		title.setBackground(Color.ORANGE);
		title.setOpaque(true); // To check size of panel called title
		title.setSize(200, 50);
		title.setFont(new Font("SansSerif", Font.BOLD, 25)); // Set font and size
		title.setHorizontalAlignment(SwingConstants.CENTER); // Center The text
		title.setLocation(75, 25); //Set the title in a constant location
		add(title);
		
		JTextArea input = new JTextArea(3,5);
		JTextField in = new JTextField(4);
		in.setLocation(100, 200);
		in.setSize(150, 35);
		add(in);
	}
}
