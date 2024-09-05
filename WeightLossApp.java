import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class WeightLossApp {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	
	private static double BMR(double Weightpnds,double HeightInch,double age1) {
			return 655.1+9.563*Weightpnds+1.850*HeightInch-4.676*age1;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeightLossApp window = new WeightLossApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WeightLossApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 578, 486);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_2 = new JLabel("Name:");
		panel_2.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Weight:");
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		frame.getContentPane().add(panel_3);
		
		JLabel lblNewLabel_3 = new JLabel("Height:");
		panel_3.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		panel_3.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Age:");
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		frame.getContentPane().add(panel_4);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Use Pounds/Inches");
		panel_4.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("Do Recommendations");
		frame.getContentPane().add(tglbtnNewToggleButton_1);
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("Male?");
		frame.getContentPane().add(tglbtnNewToggleButton_2);
		
		JButton btnNewButton = new JButton("Calculate");
		
		JPanel panel_5 = new JPanel();
		frame.getContentPane().add(panel_5);
		
		JTextArea textAreaRecommend = new JTextArea();
		textAreaRecommend.setEditable(false);
		textAreaRecommend.setRows(15);
		textAreaRecommend.setColumns(40);
		panel_5.add(textAreaRecommend);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					String name = textField_2.getText();
					String weight = textField.getText();
					String height = textField_3.getText();
					String age = textField_1.getText();
					double kgWeight = Double.parseDouble(weight);
					double cmHeight = Double.parseDouble(height);
					double age1 = Double.parseDouble(age);
					
					double Weightpnds = kgWeight /2.2;
					double HeightInch = cmHeight *2.54;
					double bmi = Weightpnds/Math.pow(HeightInch/100,2);
					double bmr = WeightLossApp.BMR(Weightpnds, HeightInch, age1);
					
					double bmi1 = kgWeight/Math.pow(cmHeight/100,2);
					double bmr1 = WeightLossApp.BMR(kgWeight, cmHeight, age1);
					
					double dailyCaloricIntake = bmr;
					double dc1 =dailyCaloricIntake * 1.2;
					double dc2 =dailyCaloricIntake * 1.375;
					double dc3 =dailyCaloricIntake * 1.55;
					double dc4 =dailyCaloricIntake * 1.725;
					double dc5 =dailyCaloricIntake * 1.9;
					
					double dailyCaloricIntake1 = bmr1;
					
					double dc6 =dailyCaloricIntake1 * 1.2;
					double dc7 =dailyCaloricIntake1 * 1.375;
					double dc8 =dailyCaloricIntake1 * 1.55;
					double dc9 =dailyCaloricIntake1 * 1.725;
					double dc10 =dailyCaloricIntake1 * 1.9;
					
					double bmr3 = 66.5+13.75*kgWeight+5.003*cmHeight-6.75*age1;
					double dailyCaloricIntake2 = bmr3;
					
					double dc11 =dailyCaloricIntake2 * 1.2;
					double dc12 =dailyCaloricIntake2 * 1.375;
					double dc13 =dailyCaloricIntake2 * 1.55;
					double dc14 =dailyCaloricIntake2 * 1.725;
					double dc15 =dailyCaloricIntake2 * 1.9;
					
					double bmr4 = 66.5+13.75*Weightpnds+5.003*HeightInch-6.75*age1;
					double dailyCaloricIntake3 = bmr4;
					double dc16 =dailyCaloricIntake3 * 1.2;
					double dc17 =dailyCaloricIntake3 * 1.375;
					double dc18 =dailyCaloricIntake3 * 1.55;
					double dc19 =dailyCaloricIntake3 * 1.725;
					double dc20 =dailyCaloricIntake3 * 1.9;
					
					
//					Calculate BMI and BMR without the pound/inches selection
					textAreaRecommend.setText(String.format("Name: %s\nBMI: %.3f\nBMR: %.3f",name,bmi1,bmr1));
//					Pound/Inches selection
					if(tglbtnNewToggleButton.isSelected()) {
						
						textAreaRecommend.setText(String.format("Name: %s\nBMI: %.3f\nBMR: %.3f",name,bmi,bmr));
					}
//					Recommendation selection
					if(tglbtnNewToggleButton_1.isSelected()) {
						
						textAreaRecommend.setText(String.format("Name: %s\nBMI: %.3f\nBMR: %.3f\nFor different activity levels, calorie intake to maintain weight\n1. %.3f\n2. %.3f\n3. %.3f\n4. %.3f\n5. %.3f\nEat 500 calories less a day to loose 1 pound (-0.5kg) per week\nEat calories less a day to loose 2 pound (-0.9kg) per week",name,bmi1,bmr1,dc6,dc7,dc8,dc9,dc10));
					}
//						Pound/Inches & Recommendation condition
					if(tglbtnNewToggleButton.isSelected() && tglbtnNewToggleButton_1.isSelected()) {
						
						textAreaRecommend.setText(String.format("Name: %s\nBMI: %.3f\nBMR: %.3f\nFor different activity levels, calorie intake to maintain weight\n1. %.3f\n2. %.3f\n3. %.3f\n4. %.3f\n5. %.3f\nEat 500 calories less a day to loose 1 pound (-0.5kg) per week\nEat calories less a day to loose 2 pounds (-0.9kg) per week",name,bmi,bmr,dc1,dc2,dc3,dc4,dc5));
					}
//					Male selection
							if(tglbtnNewToggleButton_2.isSelected()) { 
								textAreaRecommend.setText(String.format("Name: %s\nBMI: %.3f\nBMR: %.3f",name,bmi1,bmr3));
							}
//							Male and Recommendation condition
							if(tglbtnNewToggleButton_2.isSelected() && tglbtnNewToggleButton_1.isSelected ()) {	
								
								textAreaRecommend.setText(String.format("Name: %s\nBMI: %.3f\nBMR: %.3f\nFor different activity levels, calorie intake to maintain weight\n1. %.3f\n2. %.3f\n3. %.3f\n4. %.3f\n5. %.3f\nEat 500 calories less a day to loose 1 pound (-0.5kg) per week\nEat calories less a day to loose 2 pounds (-0.9kg) per week",name,bmi1,bmr3,dc11,dc12,dc13,dc14,dc15));
							}
//							 pounds and male condition
							if(tglbtnNewToggleButton.isSelected() && tglbtnNewToggleButton_2.isSelected()) {
								textAreaRecommend.setText(String.format("Name: %s\nBMI: %.3f\nBMR: %.3f",name,bmi,bmr3));
							}
//							 pounds recommendation and male condition
							if(tglbtnNewToggleButton.isSelected() && tglbtnNewToggleButton_2.isSelected() && tglbtnNewToggleButton_1.isSelected()) {
								textAreaRecommend.setText(String.format("Name: %s\nBMI: %.3f\nBMR: %.3f\nFor different activity levels, calorie intake to main weight\n1. %.3f\n2. %.3f\n3. %.3f\n4. %.3f\n5. %.3f\nEat 500 calories calories less a day to loose 1 pound (0.5kg) per week\nEat calories less a day to loose 2 pounds (-0.9kg) per week",name,bmi,bmr4,dc16,dc17,dc18,dc19,dc20));
							}
				} catch(Exception e1) {
					textAreaRecommend.setText(e1.toString()+e1.getMessage());
					textAreaRecommend.setText("Please input a valid number");
				}
				
					
				
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		
		
		
		
		
		
	}
	

}