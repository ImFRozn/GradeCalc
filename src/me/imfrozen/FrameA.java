package me.imfrozen;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpinnerNumberModel;

@SuppressWarnings("serial")
public class FrameA extends JFrame {
	static JSpinner sa6;
	static JSpinner sa7;
	static JSpinner sa8;
	static JSpinner sa1;
	static JSpinner sa2;
	static JSpinner sa3;
	static JSpinner sa4;
	static JSpinner sa5;
	
	static JSpinner ex2;
	static JSpinner ex3;
	static JSpinner ex7;
	static JSpinner ex8;
	static JSpinner ex5;
	static JSpinner ex4;
	static JSpinner ex6;
	static JSpinner ex1;
	
	static JSpinner af2;
	static JSpinner af4;
	static JSpinner af6;
	static JSpinner af8;
	static JSpinner af3;
	static JSpinner af1;
	static JSpinner af5;
	static JSpinner af7;
	
	static JLabel lblNewLabel;
	static JLabel label;
	
	public FrameA() {
		setTitle("Notenrechner");
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrameA.class.getResource("/me/imfrozen/icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		
		JLabel lblSchulaufgaben = new JLabel("Schulaufgaben");
		lblSchulaufgaben.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblExen = new JLabel("Stegreifaufgaben");
		lblExen.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblAbfragen = new JLabel("Abfragen");
		lblAbfragen.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JSpinner sa5 = new JSpinner();
		sa5.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		sa5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		sa6 = new JSpinner();
		sa6.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		sa6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		sa7 = new JSpinner();
		sa7.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		sa7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		sa8 = new JSpinner();
		sa8.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		sa8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		sa1 = new JSpinner();
		sa1.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		sa1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		sa2 = new JSpinner();
		sa2.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		sa2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		sa3 = new JSpinner();
		sa3.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		sa3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		sa4 = new JSpinner();
		sa4.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		sa4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		ex2.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		ex2 = new JSpinner();
		ex2.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		ex2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ex3.setModel(new SpinnerNumberModel(0, 0, 6, 1));

		ex3 = new JSpinner();
		ex3.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		ex3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ex7.setModel(new SpinnerNumberModel(0, 0, 6, 1));

		ex7 = new JSpinner();
		ex7.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		ex7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ex8.setModel(new SpinnerNumberModel(0, 0, 6, 1));

		ex8 = new JSpinner();
		ex8.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		ex8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ex5.setModel(new SpinnerNumberModel(0, 0, 6, 1));

		ex5 = new JSpinner();
		ex5.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		ex5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ex4.setModel(new SpinnerNumberModel(0, 0, 6, 1));

		ex4 = new JSpinner();
		ex4.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		ex4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ex6.setModel(new SpinnerNumberModel(0, 0, 6, 1));

		ex6 = new JSpinner();
		ex6.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		ex6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ex1.setModel(new SpinnerNumberModel(0, 0, 6, 1));

		ex1 = new JSpinner();
		ex1.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		ex1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		af2.setModel(new SpinnerNumberModel(0, 0, 6, 1));

		af2 = new JSpinner();
		af2.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		af2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		af4.setModel(new SpinnerNumberModel(0, 0, 6, 1));

		af4 = new JSpinner();
		af4.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		af4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		af6.setModel(new SpinnerNumberModel(0, 0, 6, 1));

		af6 = new JSpinner();
		af6.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		af6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		af8.setModel(new SpinnerNumberModel(0, 0, 6, 1));

		af8 = new JSpinner();
		af8.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		af8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		af3.setModel(new SpinnerNumberModel(0, 0, 6, 1));

		af3 = new JSpinner();
		af3.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		af3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		af1.setModel(new SpinnerNumberModel(0, 0, 6, 1));

		af1 = new JSpinner();
		af1.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		af1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		af5.setModel(new SpinnerNumberModel(0, 0, 6, 1));

		af5 = new JSpinner();
		af5.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		af5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		af7.setModel(new SpinnerNumberModel(0, 0, 6, 1));

		af7 = new JSpinner();
		af7.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		af7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		lblNewLabel = new JLabel("Dein Notendurchschnitt:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		label = new JLabel("" + rechner.note);
		label.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(37)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblSchulaufgaben)
							.addGap(33)
							.addComponent(lblExen)
							.addGap(36)
							.addComponent(lblAbfragen))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(sa1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(sa5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(63)
							.addComponent(ex2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(ex5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(38)
							.addComponent(af1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(af2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(sa2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(sa6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(63)
							.addComponent(ex3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(ex4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(38)
							.addComponent(af3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(af4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(sa3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(sa7, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(sa4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(sa8, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
							.addGap(63)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(ex7, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(ex6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(ex8, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(ex1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
							.addGap(38)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(af5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(af6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(label)
										.addComponent(af7, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(af8, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSchulaufgaben, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblExen, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAbfragen, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(sa1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(sa5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(ex2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(ex5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(af1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(af2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(sa2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(sa6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(ex3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(ex4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(af3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(af4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(sa3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(sa7, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(ex7, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addComponent(ex6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addComponent(af5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(af6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(sa4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addComponent(sa8, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(af7, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addComponent(af8, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(ex1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addComponent(ex8, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(label))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		
	}
}
