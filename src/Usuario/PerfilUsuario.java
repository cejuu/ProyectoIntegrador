package Usuario;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.LineBorder;

import MVC.Controlador;
import MVC.Modelo;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.Toolkit;
import javax.swing.JScrollPane;

public class PerfilUsuario extends JFrame{
	private Controlador controlador;
	private Modelo modelo;
	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
		
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerfilUsuario window = new PerfilUsuario();
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
	public PerfilUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the 
	 */
	public void initialize() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(PerfilUsuario.class.getResource("/imagenes/Sin_titulo.png")));
		getContentPane().setForeground(new Color(255, 204, 204));
		setBounds(100, 100, 901, 668);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 153, 153));
		panel.setBounds(0, 0, 897, 631);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new LineBorder(new Color(255, 255, 255), 4, true));
		panel_1.setBounds(126, 71, 612, 514);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PerfilUsuario.class.getResource("/imagenes/imagen de perfil (1).png")));
		lblNewLabel.setBounds(23, 25, 88, 77);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(110, 28, 111, 27);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellidos:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(110, 57, 111, 27);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Resalta en:P\u00E1del/Baloncesto");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(23, 112, 198, 27);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("10");
		lblNewLabel_2.setForeground(new Color(255, 76, 76));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(23, 174, 45, 27);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(PerfilUsuario.class.getResource("/imagenes/Heart free icon (2).png")));
		lblNewLabel_3.setBounds(50, 168, 45, 39);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("50");
		lblNewLabel_2_1.setForeground(new Color(255, 76, 76));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(130, 174, 45, 27);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("3");
		lblNewLabel_2_2.setForeground(new Color(255, 76, 76));
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(240, 174, 45, 27);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("15");
		lblNewLabel_2_3.setForeground(new Color(255, 76, 76));
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_3.setBounds(334, 174, 45, 27);
		panel_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(PerfilUsuario.class.getResource("/imagenes/like free icon (1).png")));
		lblNewLabel_4.setBounds(160, 164, 45, 39);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(PerfilUsuario.class.getResource("/imagenes/dislike free icon (1).png")));
		lblNewLabel_5.setBounds(260, 172, 45, 39);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(PerfilUsuario.class.getResource("/imagenes/comments-free-icon-font.png")));
		lblNewLabel_6.setBounds(362, 166, 45, 41);
		panel_1.add(lblNewLabel_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 250, 250));
		panel_2.setBorder(new LineBorder(new Color(255, 153, 153), 3, true));
		panel_2.setBounds(23, 230, 357, 168);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Detalles del contacto");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(10, 10, 157, 13);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(PerfilUsuario.class.getResource("/imagenes/envelope-free-icon-font.png")));
		lblNewLabel_8.setBounds(10, 33, 45, 32);
		panel_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("micuenta@gmail.com");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(65, 33, 157, 24);
		panel_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(PerfilUsuario.class.getResource("/imagenes/call-incoming-free-icon-font.png")));
		lblNewLabel_10.setBounds(10, 75, 45, 39);
		panel_2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_9_1 = new JLabel("1 919 555 0198");
		lblNewLabel_9_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9_1.setBounds(65, 75, 157, 24);
		panel_2.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon(PerfilUsuario.class.getResource("/imagenes/map-marker-home-free-icon-font.png")));
		lblNewLabel_11.setBounds(10, 124, 45, 34);
		panel_2.add(lblNewLabel_11);
		
		JLabel lblNewLabel_9_1_1 = new JLabel("Edifico B/2/151C");
		lblNewLabel_9_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9_1_1.setBounds(65, 124, 157, 24);
		panel_2.add(lblNewLabel_9_1_1);
		
		JLabel lblNewLabel_12 = new JLabel("M\u00E1s sobre mi");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_12.setBounds(23, 408, 111, 13);
		panel_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("100");
		lblNewLabel_13.setForeground(new Color(255, 76, 76));
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_13.setBounds(497, 59, 45, 18);
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setIcon(new ImageIcon(PerfilUsuario.class.getResource("/imagenes/eye-free-icon-font.png")));
		lblNewLabel_14.setBounds(540, 54, 45, 30);
		panel_1.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Se uni\u00F3 en abril de 2022");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_15.setBounds(421, 25, 164, 13);
		panel_1.add(lblNewLabel_15);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 250, 250));
		panel_3.setBorder(new LineBorder(new Color(255, 153, 153), 3, true));
		panel_3.setBounds(23, 431, 562, 73);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(3, 3, 554, 67);
		panel_3.add(editorPane);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Sexo:");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_2.setBounds(110, 83, 111, 27);
		panel_1.add(lblNewLabel_1_1_2);
		
		JButton btnNewButton_1 = new JButton("General");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(31, 21, 85, 21);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Calendario");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1_1.setBounds(126, 21, 85, 21);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Flujo de actividad");
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1_1_1.setBounds(221, 21, 123, 21);
		panel.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.cambioPantalla(9,2);
			}
		});
		btnNewButton_2.setBackground(new Color(0, 0, 0, 0));
		btnNewButton_2.setOpaque(false);
		btnNewButton_2.setIcon(new ImageIcon(PerfilUsuario.class.getResource("/imagenes/cross-circle-free-icon-font (1).png")));
		btnNewButton_2.setBounds(783, 21, 60, 60);
		panel.add(btnNewButton_2);
		
		
	}
}
