package MainPackage;


import java.awt.EventQueue;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GUI {

	
	private JTextField estimatedvalue;
	
	private JTextField startpoint;
	
	private JTextField annualinterest;
	
	
	private JTextField Years;
	
	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel splitPanel = new JPanel();
		splitPanel.setBounds(22, 24, 387, 175);
		frame.getContentPane().add(splitPanel);
		splitPanel.setLayout(null);
		
		JLabel InvestmentAmount = new JLabel("$ of investment ");
		InvestmentAmount.setFont(new Font("QuickType II", Font.PLAIN, 14));
		InvestmentAmount.setBounds(10, 11, 154, 32);
		splitPanel.add(InvestmentAmount);
		
		startpoint = new JTextField();
		startpoint.setBounds(220, 11, 140, 32);
		splitPanel.add(startpoint);
		startpoint.setColumns(10);
		
		
		Years = new JTextField();
		Years.setBounds(220, 54, 140, 32);
		splitPanel.add(Years);
		Years.setColumns(10);
		
		JLabel AnnualInterestRate = new JLabel("yearly rate");
		AnnualInterestRate.setHorizontalAlignment(SwingConstants.LEFT);
		AnnualInterestRate.setFont(new Font("QuickType II", Font.PLAIN, 14));
		AnnualInterestRate.setBounds(10, 105, 154, 14);
		splitPanel.add(AnnualInterestRate);
		
		annualinterest = new JTextField();
		annualinterest.setBounds(220, 97, 140, 32);
		splitPanel.add(annualinterest);
		annualinterest.setColumns(10);
		
		
		
		
		
		
		JTextField estimatedvalue  = new JTextField("funture amount ");
		estimatedvalue .setFont(new Font("QuickType II", Font.PLAIN, 14));
		estimatedvalue .setHorizontalAlignment(SwingConstants.LEFT);
		estimatedvalue .setBounds(10, 150, 130, 14);
		splitPanel.add(estimatedvalue );
		
		
		
		

		
		estimatedvalue  = new JTextField();
		estimatedvalue .setBounds(220, 141, 140, 32);
		splitPanel.add(estimatedvalue );
		((JTextField) estimatedvalue ).setColumns(10);
		
		JButton calculateButton = new JButton("Calculate");
		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				double starting = Double.parseDouble(startpoint.getText());
				
				double rate = Double.parseDouble(annualinterest.getText());
				
				double total;
				
				calculator tester = new calculator();
				
				
				
				
		
			}
		});
		calculateButton.setBounds(250, 210, 127, 41);
		frame.getContentPane().add(calculateButton);
	}
}