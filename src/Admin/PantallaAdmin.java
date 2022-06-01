package Admin;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import MVC.Controlador;
import MVC.Modelo;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaAdmin extends JFrame {
	private Controlador controlador;
	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}
	private JPanel contentPane;
	private JTextField txtBuscar;
	private Modelo modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaAdmin frame = new PantallaAdmin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PantallaAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(0, 0, 448, 48);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(380, 0, 45, 46);
		lblNewLabel.setIcon(new ImageIcon(PantallaAdmin.class.getResource("/imagenes/Perfil (2).png")));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Administration Screen");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 10, 231, 28);
		panel.add(lblNewLabel_1);
		
		txtBuscar = new JTextField();
		txtBuscar.setText("Buscar...");
		txtBuscar.setBounds(138, 59, 178, 19);
		contentPane.add(txtBuscar);
		txtBuscar.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 88, 416, 168);
		contentPane.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.RED);
		panel_2.setBounds(10, 10, 260, 50);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(PantallaAdmin.class.getResource("/imagenes/Perfil (2).png")));
		lblNewLabel_2.setBounds(10, 0, 45, 50);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("@UserName\r\n");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(83, 12, 127, 22);
		panel_2.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Eliminar Cuenta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(280, 10, 124, 21);
		panel_1.add(btnNewButton);
		
		JButton btnBanear = new JButton("Banear");
		btnBanear.setBounds(280, 41, 124, 21);
		panel_1.add(btnBanear);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.RED);
		panel_2_1.setBounds(10, 87, 260, 50);
		panel_1.add(panel_2_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon(PantallaAdmin.class.getResource("/imagenes/Perfil (2).png")));
		lblNewLabel_2_1.setBounds(10, 0, 45, 50);
		panel_2_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("@UserName\r\n");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(83, 12, 127, 22);
		panel_2_1.add(lblNewLabel_3_1);
		
		JButton btnNewButton_1 = new JButton("Eliminar Cuenta");
		btnNewButton_1.setBounds(280, 87, 124, 21);
		panel_1.add(btnNewButton_1);
		
		JButton btnBanear_1 = new JButton("Banear");
		btnBanear_1.setBounds(280, 118, 124, 21);
		panel_1.add(btnBanear_1);
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
		
	}
}
