import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NYCTax extends JPanel implements ActionListener {
	JTextField input;

	public NYCTax() {
		super();

		setBackground(Color.RED);
		setLayout(null);

		JLabel title = new JLabel("NYC Tax");
		title.setBackground(Color.YELLOW);
		title.setOpaque(true); // To check size of panel called title
		title.setSize(200, 50);
		title.setFont(new Font("SansSerif", Font.BOLD, 25)); // Set font and size
		title.setHorizontalAlignment(SwingConstants.CENTER); // Center The text
		title.setLocation(75, 25); // Set the title in a constant location
		add(title);

		JTextField in = new JTextField("$ ", 4); // SHow an dollar sign that user can't edit off
		in.setEditable(false);
		in.setLocation(100, 200);
		in.setSize(15, 35);
		add(in);

		input = new JTextField(4);
		input.setLocation(115, 200);
		input.setSize(135, 35);
		add(input);

		JButton submit = new JButton("Submit");
		submit.setSize(75, 35);
		submit.setLocation(140, 250);
		submit.addActionListener(this);
		add(submit);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "Submit") {
			JOptionPane.showMessageDialog(null, input.getText());
		}
	}
	

}
