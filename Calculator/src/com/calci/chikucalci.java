package com.calci;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.beans.PropertyChangeEvent;

public class chikucalci {

	private JFrame frame;
	private JTextField textField;
	private JTextField display;

	
	ArrayList<Float> number = new ArrayList<>();
	float num1 , num2 , ans;
	String oprt = "";
	
	double result;
	double second;
	double first;
	String operation;
	int counter = 0;
//	private final Action action = new SwingAction();
	
	
	
	/**
	 * 
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chikucalci window = new chikucalci();
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
	public chikucalci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
//		action.addPropertyChangeListener(new PropertyChangeListener() {
//			public void propertyChange(PropertyChangeEvent evt) {
//			}
//		});
		frame = new JFrame();
		frame.setBounds(100, 100, 323, 429);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 10, 289, 38);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		display = new JTextField();
		display.setColumns(10);
		display.setBounds(20, 58, 269, 38);
		frame.getContentPane().add(display);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				
				
				display.setText(display.getText() + btn1.getText());
				counter = 0;
			
				
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 185, 60, 38);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				display.setText(display.getText() + btn2.getText());
				counter = 0;
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(80, 185, 60, 38);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				display.setText(display.getText() + btn3.getText());
				counter = 0;

			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(150, 185, 60, 38);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				display.setText(display.getText() + btn4.getText());
				counter = 0;
				
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 235, 60, 38);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				display.setText(display.getText() + btn5.getText());
				counter = 0;
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(80, 233, 60, 38);
		frame.getContentPane().add(btn5);
		
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				display.setText(display.getText() + btn6.getText());
				counter = 0;

			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(150, 233, 60, 38);
		frame.getContentPane().add(btn6);
		
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				display.setText(display.getText() + btn7.getText());	
				counter = 0;
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 283, 60, 38);
		frame.getContentPane().add(btn7);
		
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				display.setText(display.getText() + btn8.getText());
				counter = 0;

			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(80, 281, 60, 38);
		frame.getContentPane().add(btn8);
		
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				display.setText(display.getText() + btn9.getText());
             counter = 0;
			

			}
		});
		btn9.setBounds(150, 281, 60, 38);
		frame.getContentPane().add(btn9);
		
		
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

     
				
				
				display.setText(display.getText() + btn0.getText());	
				counter = 0;

			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 331, 60, 38);
		frame.getContentPane().add(btn0);
		
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				display.setText(display.getText() + btndot.getText());
				counter = 0;
			}
			
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 14));
		btndot.setBounds(80, 329, 60, 38);
		frame.getContentPane().add(btndot);
		
		
		
		JButton divide = new JButton("/");
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				counter++;
				if(counter==1) {
					
					if(oprt == "=") {
						oprt = divide.getText();
						operation = oprt;
						num1= number.get(0);
						number.clear();
					}
				
				oprt = divide.getText();
	     textField.setText(textField.getText() + display.getText()+ oprt);
	     
	     if(number.size()!=1) {
	     number.add(  Float.valueOf(display.getText()));
	     display.setText(null);
	     operation = oprt;
	     }else {
	     
	     if(oprt != "=" && number.size() ==1) {
	    		number.add(  Float.valueOf(display.getText()));
	    		System.out.println(number.size());
	    	if(number.size()== 2) {
				num1 = number.get(0);
				num2 = number.get(1);
				
				number.clear();
				
				if(operation.equals("-")) {
					ans = num1-num2;
				}
				else if(operation.equals("*")) {
					ans = num1*num2;
				}
				else if(operation.equals("+")) {
					ans = num1+num2;
				}
				else if(operation.equals("/")) {
					ans = num1/num2;
				}
				else if(operation.equals("%")) {
					ans = num1%num2;
				}
				number.add(ans);
	    	}
	    	}
	     }
		}else {
			oprt = divide.getText();
			String str = textField.getText();
	    	 String str1 = str.substring(0,str.length()-1);
	    	 textField.setText( str1 + oprt);
	     }
		operation = oprt;
	     display.setText(null);
	     	
	}
		});
		divide.setFont(new Font("Tahoma", Font.BOLD, 14));
		divide.setBounds(220, 185, 60, 38);
		frame.getContentPane().add(divide);
		
		
		

		JButton into = new JButton("*");
		into.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				counter++;
				if(counter==1) {
				
					if(oprt == "=") {
						oprt = into.getText();
						operation = oprt;
						num1= number.get(0);
						number.clear();
					}
				
				oprt = into.getText();
			     textField.setText(textField.getText()+ display.getText()+ oprt);
			    
			  
			     if(number.size()!=1) {
			     number.add(  Float.valueOf(display.getText()));
			     display.setText(null);
			     operation = oprt;
			    
			     }else {
			    
			     if(oprt != "=" && number.size()==1 ) {
			    		number.add(  Float.valueOf(display.getText()));
			    		System.out.println(number.size());
			    	if(number.size()== 2) {
						num1 = number.get(0);
						num2 = number.get(1);
						
						number.clear();
						
						if(operation.equals("-")) {
							ans = num1-num2;
						}
						else if(operation.equals("*")) {
							ans = num1*num2;
						}
						else if(operation.equals("+")) {
							ans = num1+num2;
						}
						else if(operation.equals("/")) {
							ans = num1/num2;
						}
						else if(operation.equals("%")) {
							ans = num1%num2;
						}
						number.add(ans);
			    	}
			    	}
			     }
				}else {
					oprt = into.getText();
			    	 String str = textField.getText();
			    	 String str1 = str.substring(0,str.length()-1);
			    	 textField.setText( str1 + oprt);
			     }
			    operation = oprt;
			     display.setText(null);
			}
		});
		into.setFont(new Font("Tahoma", Font.BOLD, 15));
		into.setBounds(220, 233, 60, 38);
		frame.getContentPane().add(into);
		
		

		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   
				counter++;
				if(counter==1) {
							
				if(oprt == "=") {
				oprt = minus.getText();
				operation = oprt;
				num1= number.get(0);
				number.clear();
//				display.setText(null);
				}
				oprt = minus.getText();
			     textField.setText(textField.getText() + display.getText()+ oprt);
			     

			     if(number.size()!= 1) {
			    	 
			    	 System.out.println("gufdhslhWL");
			     number.add(  Float.valueOf(display.getText()));
			     display.setText(null);
			     operation = oprt;
			     }else {
			    
			     if(oprt != "=" && number.size()==1) {   // display.getText().equals("")
			    		number.add(  Float.valueOf(display.getText()));
			    	System.out.println(number.size());	
			    	if(number.size()== 2 ) {
						num1 = number.get(0);
						num2 = number.get(1);
						
						number.clear();
						
						if(operation.equals("-")) {
							ans = num1-num2;
							display.setText("" + ans);
						}
						else if(operation.equals("*")) {
							ans = num1*num2;
						}
						else if(operation.equals("+")) {
							ans = num1+num2;
						}
						else if(operation.equals("/")) {
							ans = num1/num2;
						}
						else if(operation.equals("%")) {
							ans = num1%num2;
						}
						number.add(ans);
			    	}
			    	}
			     
			     }
				}else {
					oprt = minus.getText();
					String str = textField.getText();
					String str1 = str.substring(0,str.length()-1);
					textField.setText( str1 + oprt);
				}
			     operation = oprt;
			     display.setText(null);
			    
			    	
			}
		});
		minus.setFont(new Font("Tahoma", Font.BOLD, 15));
		minus.setBounds(220, 281, 60, 38);
		frame.getContentPane().add(minus);
		
		
		JButton takke = new JButton("%");
		takke.setFont(new Font("Tahoma", Font.BOLD, 15));
		takke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				counter++;
				if(counter == 1) {
					
					if(oprt == "=") {
						oprt = takke.getText();
						operation = oprt;
						num1 = number.get(0);
						number.clear();
					}
				
				oprt = takke.getText();
			     textField.setText(textField.getText() + display.getText()+ oprt);
			     
			     if(number.size()!=1) {
			    	 ans = num1/num2*100;
			     number.add(  Float.valueOf(display.getText()));
			     display.setText(null);
			     operation = oprt;
			     }
			     
			     else {
			    		
			    	if(oprt != "=" && number.size()== 1) {
			    		number.add(  Float.valueOf(display.getText()));
				    	System.out.println(number.size());	
				    	if(number.size()==2) {
						num1 = number.get(0);
						num2 = number.get(1);
						
						number.clear();
						
						if(operation.equals("-")) {
							ans = num1-num2;
						}
						else if(operation.equals("*")) {
							ans = num1*num2;
						}
						else if(operation.equals("+")) {
							ans = num1+num2;
						}
						else if(operation.equals("/")) {
							ans = num1/num2;
						}
						else if(operation.equals("%")) {
							ans = num1%num2;
						}
						number.add(ans);
			    	}
			    	}
			    	}
				}else {
				oprt = takke.getText();
				String str = textField.getText();
				String str1 = str.substring(0,str.length()-1);
				textField.setText( str1 + oprt);
				
			}
			operation = oprt;
			    display.setText(null);  
			
			}
		});
		takke.setBounds(115, 118, 60, 38);
		frame.getContentPane().add(takke);
		
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				counter++;
				if(counter ==1) {
		
					if(oprt == "=") {
						oprt = plus.getText();
						operation = oprt;
						num1 = number.get(0);
						number.clear();
					}
			
				oprt = plus.getText();
			     textField.setText(textField.getText()+ display.getText()+ oprt);
			     
			     if(number.size()!=1) {
			     number.add(  Float.valueOf(display.getText()));
			     display.setText(null);
			     operation = oprt;
			     }else {
			    	
			     if(oprt != "=" && number.size()==1) {
			    		number.add(  Float.valueOf(display.getText()));
			    		System.out.println(number.size());
			    	if(number.size()== 2) {
						num1 = number.get(0);
						num2 = number.get(1);
						
						number.clear();
						
						if(operation.equals("-")) {
							ans = num1-num2;
						}
						else if(operation.equals("*")) {
							ans = num1*num2;
						}
						else if(operation.equals("+")) {
							ans = num1+num2;
						}
						else if(operation.equals("/")) {
							ans = num1/num2;
						}
						else if(operation.equals("%")) {
							ans = num1%num2;
						}
						number.add(ans);
			    	}
			     }
			     }
				}else {
					oprt = plus.getText();
					String str = textField.getText();
					String str1 = str.substring(0,str.length()-1);
					textField.setText( str1 + oprt);
				}
				operation= oprt;
			     display.setText(null);
			}
			
		});
		plus.setFont(new Font("Tahoma", Font.BOLD, 15));
		plus.setBounds(220, 329, 60, 38);
		frame.getContentPane().add(plus);
		
		
		
		
		
		JButton equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				number.add(  Float.valueOf(display.getText()));
				
				
				if(number.size()== 2) {
				num1 = number.get(0);
				num2 = number.get(1);
				
				number.clear();
			
				if(operation.equals("+")) {
					ans = num1+num2;
				}
				else if(operation.equals("-")) {
					ans = num1-num2;
				}
				else if(operation.equals("*")) {
					ans = num1*num2;
				}
				else if(operation.equals("/")) {
					ans = num1/num2;
				}
				else if(operation.equals("%")) {
					ans = num1%num2;
				}
				number.add(ans);
			
				textField.setText(textField.getText() + display.getText()+ "=" + ans);
				display.setText(ans + "");
				}
				oprt = equal.getText();

			      

			}
		});
		equal.setFont(new Font("Tahoma", Font.BOLD, 15));
		equal.setBounds(150, 329, 60, 38);
		frame.getContentPane().add(equal);
		
		
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String back = null;
				if(display.getText().length()>0) {
				
					StringBuilder str = new StringBuilder(display.getText());
					str.deleteCharAt(display.getText().length()-1);
					back = str.toString();
					display.setText(back);
							
					
				}
			}
		});
		back.setFont(new Font("Tahoma", Font.BOLD, 15));
		back.setBounds(10, 121, 95, 32);
		frame.getContentPane().add(back);
		
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				textField.setText(null);
				display.setText(null);
				number.clear();
				oprt="";
				counter = 0;
			}
		});
		clear.setFont(new Font("Tahoma", Font.BOLD, 15));
		clear.setBounds(185, 121, 95, 32);
		frame.getContentPane().add(clear);
		
		
	}
//	private class SwingAction extends AbstractAction {
//		public SwingAction() {
//			putValue(NAME, "SwingAction");
//			putValue(SHORT_DESCRIPTION, "Some short description");
//		}
//		public void actionPerformed(ActionEvent e) {
//		}
//	}

}
