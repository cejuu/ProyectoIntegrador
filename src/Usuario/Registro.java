package Usuario;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import MVC.Controlador;
import MVC.Modelo;

import java.awt.Toolkit;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.sql.*;

public class Registro extends JFrame{
	private JTextField textField;
	private JPasswordField passwordField_1;
	private JTextField textField_1;
	private JRadioButton rdbtnMujer;
	private JRadioButton rdbtnHombre;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private Controlador controlador;
	private JTextField textField_2;
	private Modelo modelo;
	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro window = new Registro();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public Registro() {
		initialize();
	}
	/**
	 * Initialize the contents of the 
	 */
	public void initialize() {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(Registro.class.getResource("/imagenes/Sin_titulo.png")));
		getContentPane().setBackground(new Color(255, 153, 153));
		getContentPane().setLayout(null);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(15, 196, 280, 14);
		getContentPane().add(separator_2);
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(332, 0, 817, 613);
		getContentPane().add(panel);
		panel.setLayout(null);
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Registro.class.getResource("/imagenes/BeFunky-design (1).jpg")));
		lblNewLabel_4.setBounds(0, 0, 817, 613);
		panel.add(lblNewLabel_4);
		textField = new JTextField();
		textField.setBounds(15, 240, 280, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		JSeparator separator = new JSeparator();
		separator.setBounds(15, 259, 280, 14);
		getContentPane().add(separator);
		JLabel lblNewLabel = new JLabel("Nombre y apellidos");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel.setBounds(15, 209, 169, 21);
		getContentPane().add(lblNewLabel);
		JLabel lblContrasea = new JLabel("Correo Electr\u00F3nico");
		lblContrasea.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblContrasea.setBounds(15, 273, 169, 21);
		getContentPane().add(lblContrasea);
		JLabel lblNewLabel_1 = new JLabel("Registro");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(81, 103, 158, 32);
		getContentPane().add(lblNewLabel_1);
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Registro.class.getResource("/imagenes/Sin_titulo.png")));
		lblNewLabel_2.setBounds(73, 10, 180, 100);
		getContentPane().add(lblNewLabel_2);
		JButton btnIniciarSesion = new JButton("Registrarse");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pwd = new String (passwordField_1.getPassword());
				if (textField.getText().equals(pwd)) {
					controlador.cambioPantalla(1,2);
				}
			}
		});
		btnIniciarSesion.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnIniciarSesion.setForeground(Color.DARK_GRAY);
		btnIniciarSesion.setBackground(new Color(255, 102, 102));
		btnIniciarSesion.setBounds(55, 509, 205, 32);
		getContentPane().add(btnIniciarSesion);
		JLabel lblContrasea_1 = new JLabel("Contrase\u00F1a");
		lblContrasea_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblContrasea_1.setBounds(15, 337, 169, 21);
		getContentPane().add(lblContrasea_1);
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(15, 368, 280, 19);
		getContentPane().add(passwordField_1);
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(15, 387, 280, 14);
		getContentPane().add(separator_1_1);
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(15, 304, 280, 19);
		getContentPane().add(textField_1);
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(15, 323, 280, 14);
		getContentPane().add(separator_1);
		rdbtnHombre = new JRadioButton("Hombre");
		buttonGroup.add(rdbtnHombre);
		rdbtnHombre.setOpaque(false);
		rdbtnHombre.setFont(new Font("Verdana", Font.PLAIN, 14));
		rdbtnHombre.setBackground(new Color(0, 0, 0, 0));
		rdbtnHombre.setBounds(56, 463, 104, 21);
		getContentPane().add(rdbtnHombre);
		rdbtnMujer = new JRadioButton("Mujer");
		buttonGroup.add(rdbtnMujer);
		rdbtnMujer.setOpaque(false);
		rdbtnMujer.setFont(new Font("Verdana", Font.PLAIN, 14));
		rdbtnMujer.setBackground(new Color(0, 0, 0, 0));
		rdbtnMujer.setBounds(150, 463, 131, 21);
		getContentPane().add(rdbtnMujer);
		JLabel lblContrasea_1_1 = new JLabel("G\u00E9nero");
		lblContrasea_1_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblContrasea_1_1.setBounds(15, 436, 169, 21);
		getContentPane().add(lblContrasea_1_1);
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar Contrase\u00F1a");
		chckbxNewCheckBox.setBackground(new Color(0, 0, 0, 0));
		chckbxNewCheckBox.setOpaque(false);
		chckbxNewCheckBox.setFont(new Font("Verdana", Font.PLAIN, 13));
		chckbxNewCheckBox.setBounds(15, 409, 169, 21);
		getContentPane().add(chckbxNewCheckBox);

		JButton btnVolver = new JButton("Ya tengo cuenta");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				controlador.cambioPantalla(1,0);

			}
		});
		btnVolver.setForeground(Color.DARK_GRAY);
		btnVolver.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnVolver.setBackground(new Color(255, 102, 102));
		btnVolver.setBounds(55, 551, 205, 32);
		getContentPane().add(btnVolver);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(15, 179, 280, 19);
		getContentPane().add(textField_2);
		
		JLabel lblNewLabel_3 = new JLabel("Usuario");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(15, 148, 169, 21);
		getContentPane().add(lblNewLabel_3);
		setBackground(Color.WHITE);
		setBounds(100, 100, 1157, 643);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
		
	}
}
