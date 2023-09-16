package com.calci;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Demo1 {

	private JFrame frame;
	private JTextField display;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	
	public void alrt() {
		if(opr=="=") {
			
			display.setText("Please use btn Clear or Operator First");
		}
	}
	
	public void calcu() {
		if (opr == "=" && numo.size()==1) {
			textField.setText(String.valueOf(numo.get(0)));
			display.setText(null);
		}
		System.out.println(numo.size() + " array index size before first numo add");
		if (numo.size() == 0 && display.getText().isEmpty() == false) {
			numo.add(Double.parseDouble(display.getText()));

		} else if (numo.size() == 1 && opr != "=" && display.getText().isEmpty() == false) {
			numo.add(Double.parseDouble(display.getText()));
		}
		System.out.println(numo.size() + " array index size before numo == 2");
		if (numo.size() == 2) {
			System.out.println(numo.get(0) + " value of index 0 from method");
			System.out.println(numo.get(1) + " value of index 1 from method");
		}

		if (numo.size() == 2) {
			double var1 = numo.get(0);
			first = (float) var1;
			double var2 = numo.get(1);
			second = (float) var2;

			if (opr == "+") {
				ans = first + second;
			} else if (opr == "-") {
				ans = first - second;
			} else if (opr == "*") {
				ans = first * second;
			} else if (opr == "/") {
				ans = first / second;
			} else if (opr == "%") {
				ans = first % second;
			}
			numo.clear();
			numo.add(ans);
			System.out.println(ans + " 0 index ans from method");
			counter = 0;

		}
//		}
		else if (counter >= 2) {
			StringBuilder nn = new StringBuilder(textField.getText());
			nn.deleteCharAt(textField.getText().length() - 1);
			String gf = nn.toString();
			textField.setText(gf);
			counter = 1;
			System.out.println("1 minus");
		}

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo1 window = new Demo1();
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
	public Demo1() {
		initialize();
	}

	ArrayList<Double> numo = new ArrayList<>();

	String opr = "";
	float first;
	float second;
	double ans;
	int counter;
	String oprt;

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 329, 349);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton Equal = new JButton("=");
		Equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

//				counter++;

				if (numo.size() == 1 && opr!="=") {
					System.out.println(numo.get(0) + " value of index 0 from equal button");
					numo.add(Double.parseDouble(display.getText()));
				}

				if (numo.size() == 2) {
					System.out.println(numo.get(1) + " value of index 1 from equal button");
				}

				if (numo.size() == 2) {
					
					double var1 = numo.get(0);
					first = (float) var1;
					double var2 = numo.get(1);
					second = (float) var2;

					if (opr == "+") {
						ans = first + second;
					} else if (opr == "-") {
						ans = first - second;
					} else if (opr == "*") {
						ans = first * second;
					} else if (opr == "/") {
						ans = first / second;
					} else if (opr == "%") {
						ans = first % second;
//					ans = first / second * 100;     // ans remainder
					}
					// display.setText(null);

					numo.clear();
					numo.add(ans);
					System.out.println(numo.get(0) + " 0 index Ans from equal button");
					counter = 0;

					// display.setText(textField.getText()+ display.getText());
					textField.setText(textField.getText() + display.getText() + Equal.getText() + ans);
					// textField.setText(ans + "");
					display.setText(ans + " ");
				}
				opr = "=";
			}
		});
		Equal.setBounds(100, 223, 58, 30);
		frame.getContentPane().add(Equal);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(opr=="=") {
					alrt();
			}else {
				String number = display.getText() + btn1.getText();
				display.setText(number);
			}}
		});
		btn1.setBounds(31, 96, 58, 30);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(opr=="=") {
					alrt();
			}else {
				String number = display.getText() + btn2.getText();
				display.setText(number);
			}}
		});
		btn2.setBounds(100, 96, 58, 30);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(opr=="=") {
					alrt();
			}else {
				String number = display.getText() + btn3.getText();
				display.setText(number);

			}}
		});
		btn3.setBounds(169, 96, 58, 30);
		frame.getContentPane().add(btn3);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(opr=="=") {
					alrt();
			}else {
				String number = display.getText() + btn4.getText();
				display.setText(number);

			}}
		});
		btn4.setBounds(31, 136, 58, 30);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(opr=="=") {
					alrt();
			}else {
				String number = display.getText() + btn5.getText();
				display.setText(number);

			}}
		});
		btn5.setBounds(100, 136, 58, 30);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(opr=="=") {
					alrt();
			}else {
				String number = display.getText() + btn6.getText();
				display.setText(number);

			}}
		});
		btn6.setBounds(169, 136, 58, 30);
		frame.getContentPane().add(btn6);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(opr=="=") {
					alrt();
			}else {
				String number = display.getText() + btn7.getText();
				display.setText(number);
			}}
		});
		btn7.setBounds(31, 179, 58, 30);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(opr=="=") {
					alrt();
			}else {
				String number = display.getText() + btn8.getText();
				display.setText(number);

			}}
		});
		btn8.setBounds(100, 179, 58, 30);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(opr=="=") {
					alrt();
			}else {
				String number = display.getText() + btn9.getText();
				display.setText(number);
			}}
		});
		btn9.setBounds(169, 179, 58, 30);
		frame.getContentPane().add(btn9);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(opr=="=") {
					alrt();
			}else {
				String number = display.getText() + btn0.getText();
				display.setText(number);
			}}
		});
		btn0.setBounds(31, 223, 58, 30);
		frame.getContentPane().add(btn0);

		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter++; // it makes counter=1
				calcu();
				opr = "+";

				textField.setText(textField.getText() + display.getText() + plus.getText());
				display.setText("");
			}
		});
		plus.setBounds(237, 96, 58, 30);
		frame.getContentPane().add(plus);

		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				counter++;

				// numo.add(Double.parseDouble(display.getText()));
				calcu();
				opr = "-";

				textField.setText(textField.getText() + display.getText() + minus.getText());
				display.setText("");
			}
		});
		minus.setBounds(237, 141, 58, 30);
		frame.getContentPane().add(minus);

		JButton into = new JButton("*");
		into.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				counter++;
				calcu();
				opr = "*";

				textField.setText(textField.getText() + display.getText() + into.getText());
				display.setText("");
			}
		});
		into.setBounds(237, 179, 58, 30);
		frame.getContentPane().add(into);

		JButton divide = new JButton("/");
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter++;
				calcu();
				// numo.add(Double.parseDouble(display.getText()));
				opr = "/";

				textField.setText(textField.getText() + display.getText() + divide.getText());
				display.setText("");
			}
		});
		divide.setBounds(237, 223, 58, 30);
		frame.getContentPane().add(divide);

		JButton perc = new JButton("%");
		perc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				counter++;

				// numo.add(Double.parseDouble(display.getText())); //numo is arraylist...number
				// store in array position index zero
				calcu();
				opr = "%";

				textField.setText(textField.getText() + display.getText() + perc.getText());
				display.setText("");
			}
		});
		perc.setBounds(169, 223, 58, 30);
		frame.getContentPane().add(perc);

		display = new JTextField();
		display.setBounds(41, 50, 239, 30);
		frame.getContentPane().add(display);
		display.setColumns(10);

		textField = new JTextField();
		textField.setBounds(31, 10, 264, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (display.getText().isEmpty() == false) {
					StringBuilder nn = new StringBuilder(display.getText());
					nn.deleteCharAt(display.getText().length() - 1);
					String gf = nn.toString();
					display.setText(gf);
				}

			}
		});
		back.setBounds(31, 263, 104, 30);
		frame.getContentPane().add(back);

		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textField.setText(null);
				display.setText(null);
				opr = "";
				counter = 0;
				numo.clear();

			}
		});
		clear.setBounds(169, 263, 111, 30);
		frame.getContentPane().add(clear);
	}
}
