package com.calci;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import org.w3c.dom.Text;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class calci1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField display;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci1 window = new calci1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    ArrayList<Float> number = new ArrayList<>();
    float num1, num2, ans;
	String opr = "";
	String oprt = "";
	int counter = 0;
	
	/**
	 * Create the application.
	 */
	public calci1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 336, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 10, 302, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		display = new JTextField();
		display.setColumns(10);
		display.setBounds(20, 54, 278, 34);
		frame.getContentPane().add(display);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//	          String num = textField.getText() + btn1.getText();
//	          display.setText(num);
	          
	          display.setText(display.getText()+ btn1.getText());
	          counter = 0;
				
				
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 141, 58, 45);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 display.setText(display.getText()+ btn2.getText());
				 counter = 0;
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(87, 141, 58, 45);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 display.setText(display.getText()+ btn3.getText());
				 counter = 0;
				
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(165, 141, 58, 45);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 display.setText(display.getText()+ btn4.getText());
				 counter = 0;
				
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 196, 58, 45);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 display.setText(display.getText()+ btn5.getText());
				 counter = 0;
				
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(87, 196, 58, 45);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 display.setText(display.getText()+ btn6.getText());
				 counter = 0;
				
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(165, 196, 58, 45);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 display.setText(display.getText()+ btn7.getText());
				 counter = 0;
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 251, 58, 45);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 display.setText(display.getText()+ btn8.getText());
				 counter = 0;
				
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(87, 251, 58, 45);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				 display.setText(display.getText()+ btn9.getText());
				 counter = 0;
				
			}
			
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(165, 251, 58, 45);
		frame.getContentPane().add(btn9);
		
		JButton bhagakar = new JButton("/");
		bhagakar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				counter++;
				if(counter==1) {
				
					opr = bhagakar.getText();
				number.add(  Float.valueOf(display.getText()));
				textField.setText(textField.getText() + display.getText() + opr);
				
				if(number.size()==2) {
					num1 = number.get(0);
					num2 = number.get(1);
				
			number.clear();
				
				if(oprt == "+") {
					ans = num1 + num2;
				}
				else if(oprt == "-") {
					ans = num1 - num2;
				}
				else if(oprt == "*") {
					ans = num1 * num2;
				}
				else if(oprt == "/") {
					ans = num1 / num2;
				}
				else if(oprt == "%") {
					ans = num1 % num2;
				}
				number.add(ans);
				
				}
				oprt = opr;
				}else {
					opr = bhagakar.getText();
					String str = textField.getText();
			    	 String str1 = str.substring(0,str.length()-1);
			    	 textField.setText( str1 + opr);
				}
				
				display.setText(null);
			}
		});
		bhagakar.setFont(new Font("Tahoma", Font.BOLD, 18));
		bhagakar.setBounds(241, 141, 58, 45);
		frame.getContentPane().add(bhagakar);
		
		JButton into = new JButton("*");
		into.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				counter++;
				if(counter==1) {
				
				opr = into.getText();
				number.add(  Float.valueOf(display.getText()));
				textField.setText(textField.getText() + display.getText() + opr);
				
				if(number.size()==2) {
					num1 = number.get(0);
					num2 = number.get(1);
				
			number.clear();
				
				if(oprt == "+") {
					ans = num1 + num2;
				}
				else if(oprt == "-") {
					ans = num1 - num2;
				}
				else if(oprt == "*") {
					ans = num1 * num2;
				}
				else if(oprt == "/") {
					ans = num1 / num2;
				}
				else if(oprt == "%") {
					ans = num1 % num2;
				}
				  number.add(ans);
				
				}
				oprt = opr;
				
				}else {
					opr = into.getText();
					String str = textField.getText();
			    	 String str1 = str.substring(0,str.length()-1);
			    	 textField.setText( str1 + opr);
				}
				
				
				display.setText(null);
				
			}
		});
		into.setFont(new Font("Tahoma", Font.BOLD, 18));
		into.setBounds(241, 196, 58, 45);
		frame.getContentPane().add(into);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				counter++;
				if(counter==1) {
				opr = minus.getText();
				number.add(  Float.valueOf(display.getText()));
				textField.setText(textField.getText() + display.getText() + opr);
				
				if(number.size()==2) {
					num1 = number.get(0);
					num2 = number.get(1);
				
			number.clear();
				
				if(oprt == "+") {
					ans = num1 + num2;
				}
				else if(oprt == "-") {
					ans = num1 - num2;
				}
				else if(oprt == "*") {
					ans = num1 * num2;
				}
				else if(oprt == "/") {
					ans = num1 / num2;
				}
				else if(oprt == "%") {
					ans = num1 % num2;
				}
				number.add(ans);
				System.out.println(number.get(0));
				}
			
				oprt = opr;
				}else {
					opr = minus.getText();
					String str = textField.getText();
			    	 String str1 = str.substring(0,str.length()-1);
			    	 textField.setText( str1 + opr);
				}
				
				
				oprt = opr;
				display.setText(null);
				
			}
		});
		minus.setFont(new Font("Tahoma", Font.BOLD, 18));
		minus.setBounds(241, 251, 58, 45);
		frame.getContentPane().add(minus);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				 display.setText(display.getText()+ btn0.getText());
				 counter = 0;
				
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 306, 58, 45);
		frame.getContentPane().add(btn0);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				 display.setText(display.getText()+ btndot.getText());
				 counter = 1;
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndot.setBounds(87, 306, 58, 45);
		frame.getContentPane().add(btndot);
		
		JButton equalto = new JButton("=");
		equalto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				number.add(  Float.valueOf(display.getText()));
				
				if(number.size()==2) {
					num1 = number.get(0);
					num2 = number.get(1);
				
			number.clear();
				
				if(oprt == "+") {
					ans = num1 + num2;
				}
				else if(oprt == "-") {
					ans = num1 - num2;
				}
				else if(oprt == "*") {
					ans = num1 * num2;
				}
				else if(oprt == "/") {
					ans = num1 / num2;
				}
				else if(oprt == "%") {
					ans = num1 % num2;
				}
				number.add(ans);
				System.out.println(number.get(0));
				}
				
				textField.setText(textField.getText() + display.getText() +  "=" + ans);
				display.setText(String.valueOf(ans));
				
				
				
						

					
				
			}
		});
		equalto.setFont(new Font("Tahoma", Font.BOLD, 18));
		equalto.setBounds(165, 306, 58, 45);
		frame.getContentPane().add(equalto);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				counter++;
				if(counter==1) {
				opr = plus.getText();
				number.add(  Float.valueOf(display.getText()));
				textField.setText(textField.getText() + display.getText() + opr);
				
				
				if(number.size()==2) {
					num1 = number.get(0);
					num2 = number.get(1);
				
			number.clear();
				
				if(oprt == "+") {
					ans = num1 + num2;
				}
				else if(oprt == "-") {
					ans = num1 - num2;
				}
				else if(oprt == "*") {
					ans = num1 * num2;
				}
				else if(oprt == "/") {
					ans = num1 / num2;
				}
				else if(oprt == "%") {
					ans = num1 % num2;
				}
				number.add(ans);
				
				}
				oprt = opr;
				}else {
					opr = plus.getText();
					String str = textField.getText();
			    	 String str1 = str.substring(0,str.length()-1);
			    	 textField.setText( str1 + opr);
				}
			
				display.setText(null);
				
			}
		});
		plus.setFont(new Font("Tahoma", Font.BOLD, 18));
		plus.setBounds(241, 306, 58, 45);
		frame.getContentPane().add(plus);
		
		JButton Back = new JButton("Back");
		Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		Back.setFont(new Font("Tahoma", Font.BOLD, 14));
		Back.setBounds(10, 102, 73, 29);
		frame.getContentPane().add(Back);
		
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	             
				textField.setText(null);
				display.setText(null);
	             oprt = "";
	             number.clear();
				
			}
		});
		clear.setFont(new Font("Tahoma", Font.BOLD, 14));
		clear.setBounds(103, 102, 73, 29);
		frame.getContentPane().add(clear);
		
		JButton takkke = new JButton("%");
		takkke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				counter++;
				if(counter==1) {
				opr = takkke.getText();
				number.add(  Float.valueOf(display.getText()));
				textField.setText(textField.getText() + display.getText()+ opr);
				
				
				if(number.size()==2) {
					num1 = number.get(0);
					num2 = number.get(1);
				
			number.clear();
				
				if(oprt == "+") {
					ans = num1 + num2;
				}
				else if(oprt == "-") {
					ans = num1 - num2;
				}
				else if(oprt == "*") {
					ans = num1 * num2;
				}
				else if(oprt == "/") {
					ans = num1 / num2;
				}
				else if(oprt == "%") {
					ans = num1 % num2;
				}
				number.add(ans);
				
				}
				oprt = opr;
				}else {
					String str = textField.getText();
			    	 String str1 = str.substring(0,str.length()-1);
			    	 textField.setText( str1 + opr);
				}
				display.setText(null);
				
			}
		});
		takkke.setFont(new Font("Tahoma", Font.BOLD, 12));
		takkke.setBounds(240, 98, 50, 33);
		frame.getContentPane().add(takkke);
	}
}
