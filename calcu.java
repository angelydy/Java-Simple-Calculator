import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class calcu extends JFrame {
	
	JFrame frame = new JFrame ("ANGELY'S CALCULATOR");
	JButton num7 = new JButton("7");
	JButton num8 = new JButton("8");
	JButton num9 = new JButton("9");
	JButton num4 = new JButton("4");
	JButton num5 = new JButton("5");
	JButton num6 = new JButton("6");
	JButton num1 = new JButton("1");
	JButton num2 = new JButton("2");
	JButton num3 = new JButton("3");
	JButton num0 = new JButton("0");
	JButton equal = new JButton("=");
	JButton add = new JButton("+");
	JButton subt = new JButton("-");
	JButton mul = new JButton("x");
	JButton divi = new JButton("/");
	JButton perce=new JButton("%");
	JButton clear=new JButton ("DEL");
	double number, answer;
	JTextField result = new JTextField(10);
	
	Boolean addBool = false;
	Boolean mulBool = false;
	Boolean diviBool = false;
	Boolean subtBool = false;
	Boolean percentBool = false;
	String display = "";
	
	public calcu() {
		
		result.setHorizontalAlignment(JTextField.RIGHT);
		result.setFont(new Font("Montserrat", Font.BOLD,30));
		num7.setBackground(Color.white);
		num7.setFont(new Font("Montserrat", Font.BOLD,30));
		num8.setBackground(Color.white);
		num8.setFont(new Font("Montserrat", Font.BOLD,30));
		num9.setBackground(Color.white);
		num9.setFont(new Font("Montserrat", Font.BOLD,30));
		num4.setBackground(Color.white);
		num4.setFont(new Font("Montserrat", Font.BOLD,30));
		num5.setBackground(Color.white);
		num5.setFont(new Font("Montserrat", Font.BOLD,30));
		num6.setBackground(Color.white);
		num6.setFont(new Font("Montserrat", Font.BOLD,30));
		num1.setBackground(Color.white);
		num1.setFont(new Font("Montserrat", Font.BOLD,30));
		num2.setBackground(Color.white);
		num2.setFont(new Font("Montserrat", Font.BOLD,30));
		num3.setBackground(Color.white);
		num3.setFont(new Font("Montserrat", Font.BOLD,30));
		num0.setBackground(Color.white);
		num0.setFont(new Font("Montserrat", Font.BOLD,30));
		equal.setBackground(Color.orange);
		equal.setFont(new Font("Montserrat", Font.BOLD,30));
		add.setBackground(Color.white);
		add.setFont(new Font("Montserrat", Font.BOLD,30));
		subt.setBackground(Color.white);
		subt.setFont(new Font("Montserrat", Font.BOLD,30));
		mul.setBackground(Color.white);
		mul.setFont(new Font("Montserrat", Font.BOLD,30));
		divi.setBackground(Color.white);
		divi.setFont(new Font("Montserrat", Font.BOLD,30));
		perce.setBackground(Color.WHITE);
		perce.setFont(new Font("Montserrat", Font.BOLD,30));
		clear.setBackground(Color.orange);
		clear.setFont(new Font("Montserrat", Font.BOLD,20));
		result.setBackground(Color.white);
		result.setEditable(false);
		
		frame.add(result);
		result.setBounds(20,20,270,90);
		frame.add(num7);
		num7.setBounds(20,180,60,40);
		frame.add(num8);
		num8.setBounds(90,180,60,40);
		frame.add(num9);
		num9.setBounds(160,180,60,40);
		frame.add(num4);
		num4.setBounds(20,230,60,40);
		frame.add(num5);
		num5.setBounds(90,230,60,40);
		frame.add(num6);
		num6.setBounds(160,230,60,40);
		frame.add(num1);
		num1.setBounds(20,280,60,40);
		frame.add(num2);
		num2.setBounds(90,280,60,40);
		frame.add(num3);
		num3.setBounds(160,280,60,40);
		frame.add(num0);
		num0.setBounds(20,330,60,40);
		frame.add(equal);
		equal.setBounds(90,330,200,40);
		frame.add(add);
		add.setBounds(230,180,60,40);
		frame.add(subt);
		subt.setBounds(230,230,60,40);
		frame.add(mul);
		mul.setBounds(230,280,60,40);
		frame.add(divi);
		divi.setBounds(230,130,60,40);
		frame.add(perce);
		perce.setBounds(160,130,60,40);
		frame.add(clear);
		clear.setBounds(20,130,130,40);
		
		num1.addActionListener(new numberone());
	    num2.addActionListener(new numbertwo());
	    num3.addActionListener(new numberthree());
	    num4.addActionListener(new numberfour());
	    num5.addActionListener(new numberfive());
	    num6.addActionListener(new numbersix());
	    num7.addActionListener(new numberseven());
	    num8.addActionListener(new numbereight());
	    num9.addActionListener(new numbernine());
	    num0.addActionListener(new numberzero());
	    equal.addActionListener(new equals());
	    add.addActionListener(new addition());
	    subt.addActionListener(new subtract());
	    mul.addActionListener(new multiply());
	    divi.addActionListener(new divide());
	    perce.addActionListener( new percentage());
	    clear.addActionListener(new delete());
		
		frame.getContentPane().setBackground(Color.black);
		frame.setLayout(null);
		frame.setSize(330,430);
		frame.setVisible(true);
	}
	
	public class numberone implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = result.getText();
			result.setText(display + "1");
		}
	}
	
	public class numbertwo implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = result.getText();
			result.setText(display + "2");
		}
	}
	
	public class numberthree implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = result.getText();
			result.setText(display + "3");
		}
	}
	
	public class numberfour implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = result.getText();
			result.setText(display + "4");
		}
	}
	
	public class numberfive implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = result.getText();
			result.setText(display + "5");
		}
	}
	
	public class numbersix implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = result.getText();
			result.setText(display + "6");
		}
	}
	
	public class numberseven implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = result.getText();
			result.setText(display + "7");
		}
	}
	
	public class numbereight implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = result.getText();
			result.setText(display + "8");
		}
	}
	
	public class numbernine implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = result.getText();
			result.setText(display + "9");
		}
	}
	
	public class numberzero implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = result.getText();
			result.setText(display + "0");
		}
	}
	
	public class addition implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			number = Double.parseDouble(result.getText());
			result.setText("");
			addBool = true;
		}
	}
	
	public class subtract implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			number = Double.parseDouble(result.getText());
			result.setText("");
			subtBool = true;		}
	}
	
	public class divide implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			number = Double.parseDouble(result.getText());
			result.setText("");
			diviBool = true;
		}
	}
	
	public class multiply implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			number = Double.parseDouble(result.getText());
			result.setText("");
			mulBool = true;
		}
	}
	
	public class percentage implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			number = Double.parseDouble(result.getText());
			result.setText("");
			percentBool = true;
		}
	}
	
	public class delete implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			result.setText("");
			addBool = false;
			mulBool = false;
			subtBool = false;
			diviBool = false;
			percentBool = false;
			
			answer = 0;
			number=0;
		}
	}
	
	public class equals implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			answer = Double.parseDouble(result.getText());
			if (addBool == true)
					answer = number + answer;
			else if (subtBool == true)
				answer = number - answer;
			else if (mulBool == true)
				answer = number * answer;
			else if (diviBool == true)
				answer = number / answer;
			else if (percentBool == true)
				answer = number % answer;
			
			result.setText(Double.toString(answer));
			
			addBool = false;
			mulBool = false;
			subtBool = false;
			diviBool = false;
			percentBool = false;
		}
	}
	
	public static void main(String[] args) {
		calcu c = new calcu();
	}
}
