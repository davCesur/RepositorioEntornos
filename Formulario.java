import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario window = new Formulario();
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
	public Formulario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Formulario Departamento");
		frame.getContentPane().setBackground(new Color(0, 51, 0));
		frame.getContentPane().setForeground(new Color(0, 51, 51));
		frame.setBounds(100, 100, 543, 385);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel FORMULARIO = new JLabel("FORMULARIO");
		FORMULARIO.setForeground(new Color(255, 255, 255));
		FORMULARIO.setBounds(212, 11, 146, 23);
		FORMULARIO.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(FORMULARIO);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Se ha pulsado el botón Insertar");
				textField.setText("");
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
			}
		});
		btnInsertar.setBounds(143, 288, 89, 23);
		frame.getContentPane().add(btnInsertar);
		
		btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Se ha pulsado el botón Salir");
				textField.setText("");
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
			}
		});
		btnNewButton_1.setBounds(298, 288, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 204, 153));
		panel.setBounds(65, 49, 405, 228);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField("");
		textField.setBounds(204, 48, 130, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField("");
		textField_1.setBounds(204, 103, 130, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField("");
		textField_2.setBounds(204, 161, 130, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Código Departamento");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(27, 51, 148, 14);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Nombre Departamento");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(27, 106, 148, 14);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Extensión Departamento");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(27, 164, 167, 14);
		panel.add(lblNewLabel_2);
	}
}
