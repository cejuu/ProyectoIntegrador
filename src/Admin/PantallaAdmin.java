package Admin;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import MVC.Controlador;
import MVC.Modelo;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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

	public PantallaAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 927, 657);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 903, 48);
		panel.setBackground(Color.RED);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(848, 0, 45, 46);
		lblNewLabel.setIcon(new ImageIcon(PantallaAdmin.class.getResource("/imagenes/Perfil (2).png")));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Administration Screen");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 10, 231, 28);
		panel.add(lblNewLabel_1);
		
		txtBuscar = new JTextField();
		txtBuscar.setBounds(138, 59, 178, 19);
		txtBuscar.setText("Buscar...");
		contentPane.add(txtBuscar);
		txtBuscar.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 88, 893, 158);
		contentPane.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 10, 725, 50);
		panel_2.setBackground(Color.RED);
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
		btnNewButton.setBounds(757, 10, 124, 21);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnNewButton);
		
		JButton btnBanear = new JButton("Banear");
		btnBanear.setBounds(757, 39, 124, 21);
		panel_1.add(btnBanear);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(10, 87, 725, 50);
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.RED);
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
		btnNewButton_1.setBounds(757, 71, 124, 21);
		panel_1.add(btnNewButton_1);
		
		JButton btnBanear_1 = new JButton("Banear");
		btnBanear_1.setBounds(757, 102, 124, 21);
		panel_1.add(btnBanear_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(255, 153, 153), 3, true));
		panel_1_1.setBackground(new Color(255, 228, 225));
		panel_1_1.setBounds(107, 277, 702, 318);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JScrollPane scrollTable = new JScrollPane();
		scrollTable.setBounds(4, 4, 694, 310);
		panel_1_1.add(scrollTable);
		
		JTable tablaUsuario= new JTable();
		tablaUsuario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tablaUsuario.setForeground(new Color(254, 254, 254));
		tablaUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		tablaUsuario.setBackground(new Color(255, 228, 225));
		scrollTable.setViewportView(tablaUsuario);
		scrollTable.setBackground(new Color(255, 228, 225));
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				tablaUsuario.setModel(modelo.getTabla());
			}
		});
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
		
	}
}
