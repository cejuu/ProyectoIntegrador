package Usuario;

import java.awt.EventQueue;
import java.sql.*;
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

public class InicioSesion extends JFrame {
	private String error = "";
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_3;
	private Controlador controlador;
	private Modelo modelo;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSesion window = new InicioSesion();
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
	public InicioSesion() {
		initialize();
	}
	
	

	/**
	 * Initialize the contents of the 
	 */
	public void initialize() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(InicioSesion.class.getResource("/imagenes/Sin_titulo.png")));
		getContentPane().setBackground(new Color(255, 153, 153));
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(342, 0, 817, 613);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(InicioSesion.class.getResource("/imagenes/BeFunky-design (1).jpg")));
		lblNewLabel_4.setBounds(0, 0, 817, 613);
		panel.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(10, 206, 280, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 225, 280, 14);
		getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 175, 169, 21);
		getContentPane().add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblContrasea.setBounds(10, 249, 169, 21);
		getContentPane().add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 280, 280, 19);
		getContentPane().add(passwordField);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 299, 280, 14);
		getContentPane().add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("Inciar Sesion");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(75, 126, 158, 32);
		
		getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.cambioPantalla(0,1);
			}
		});
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBackground(new Color(255, 102, 102));
		btnNewButton.setBounds(50, 383, 205, 32);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(InicioSesion.class.getResource("/imagenes/Sin_titulo.png")));
		lblNewLabel_2.setBounds(67, 33, 180, 100);
		getContentPane().add(lblNewLabel_2);
		
		JButton btnIniciarSesion = new JButton("Iniciar Sesion");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.ConexSQL();
				boolean login = false;
				login = modelo.comprobarContra(textField.getText(),String.valueOf(passwordField.getPassword())); 
				if(login == true){
				controlador.cambioPantalla(0,2);
				}
			}
		});
		btnIniciarSesion.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnIniciarSesion.setForeground(Color.DARK_GRAY);
		btnIniciarSesion.setBackground(new Color(255, 102, 102));
		btnIniciarSesion.setBounds(50, 328, 205, 32);
		getContentPane().add(btnIniciarSesion);
		
		lblNewLabel_3 = new JLabel("Usuario ó contraseña incorrectos");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(255, 153, 153));
		lblNewLabel_3.setBounds(50, 345, 209, 16);
		getContentPane().add(lblNewLabel_3);
		setBackground(Color.WHITE);
		setBounds(100, 100, 1166, 643);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
		
	}
}
