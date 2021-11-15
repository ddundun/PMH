import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Ex06 {
	/*
	 * html css -> position absoulute.. 절대좌표
	 * absoulute layout 절대좌표로 이동하자
	 * 
 	 * jlabel : 라벨 글자 다는것
 	 * jtextfiled :글자 넣는 것
 	 * jbutton : 버튼
	 *  
	 * 
	 * */

	private JFrame frame;	
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex06 window = new Ex06();
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
	public Ex06() {
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
		
		textField = new JTextField();
		textField.setBounds(30, 52, 116, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("클릭");
		btnNewButton.setBounds(158, 51, 97, 23); //		(,,,높이)
		btnNewButton.addActionListener(
				(e)-> {
					System.out.println("룰루랄라");
				}
				);
		
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("hoho");
		lblNewLabel.setBounds(30, 27, 57, 15);
		frame.getContentPane().add(lblNewLabel);
	}
}
