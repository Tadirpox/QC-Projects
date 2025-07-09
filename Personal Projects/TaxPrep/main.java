import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame implements ActionListener {

	private final int WIDTH = 1050;
	private final int HEIGHT = 750;
	Container contentPane = getContentPane();

	public Main() {
		super("Tax Prep");
		setSize(WIDTH, HEIGHT);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setLayout(new BorderLayout());

//		int result = JOptionPane.showConfirmDialog(contentPane, // HTML formating to look better
//				"<html>" + "<div style= text-align: center;>" + "Hi! Welcome to the free NYC Tax Prep Helper! <br> "
//						+ "Please press Yes to continue. " + "</div" + "</html>",
//				"Continue?", JOptionPane.YES_NO_OPTION); // Gives User option of Only Yes & No
//		if (result == JOptionPane.NO_OPTION || result == JOptionPane.CLOSED_OPTION) {// Exit Application if User does so
//			System.exit(0);
//		}

		JPanel main = new JPanel();
		main.setLayout(new GridLayout(1, 3));

		main.add(new NYCTax());
		main.add(new NYSTax());
		main.add(new FEDERALTax());

		contentPane.add(main, BorderLayout.CENTER);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

	}

	public static void main(String args[]) {
		Main gui = new Main();
	}
}
