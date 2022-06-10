package Usuario;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.List;
import java.awt.Canvas;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Label;
import javax.swing.JToggleButton;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

import MVC.Controlador;
import MVC.Modelo;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.awt.Scrollbar;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.DefaultComboBoxModel;

public class CreateEventWindow extends JFrame{

	private JTextField txtUbicacin;
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
					CreateEventWindow window = new CreateEventWindow();
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
	public CreateEventWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the 
	 */
	public void initialize() {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(CreateEventWindow.class.getResource("/imagenes/Sin_titulo.png")));
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 959, 643);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contenedor = getContentPane();
		contenedor.setLayout(null);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBorder(null);
		desktopPane.setBackground(new Color(255, 51, 51));
		desktopPane.setBounds(0, 0, 945, 54);
		getContentPane().add(desktopPane);

		JButton btnProfile = new JButton("");
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnProfile.setIcon(new ImageIcon(CreateEventWindow.class.getResource("/imagenes/Perfil (2).png")));
		btnProfile.setBackground(new Color(0, 0, 0, 0));
		btnProfile.setOpaque(false);
		btnProfile.setBounds(884, 1, 51, 51);
		desktopPane.add(btnProfile);

		JButton btnFriends = new JButton("");
		btnFriends.setBackground(new Color(0, 0, 0, 0));
		btnFriends.setOpaque(false);
		btnFriends.setIcon(new ImageIcon(CreateEventWindow.class.getResource("/imagenes/personas (1).png")));
		btnFriends.setBounds(813, 1, 51, 51);
		desktopPane.add(btnFriends);

		JButton btnHome = new JButton("");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				PantallaInicio inicio = new PantallaInicio();
				inicio.initialize();
			}
		});
		btnHome.setBounds(10, 8, 70, 37);
		desktopPane.add(btnHome);
		btnHome.setIcon(new ImageIcon(CreateEventWindow.class.getResource("/imagenes/Sin_titulo2 (1).png")));
		btnHome.setBackground(new Color(0, 0, 0, 0));
		btnHome.setOpaque(false);
		
		JDesktopPane dsktpBotones = new JDesktopPane();
		dsktpBotones.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
		dsktpBotones.setBounds(-21, 48, 175, 167);
		getContentPane().add(dsktpBotones);
		dsktpBotones.setBackground(new Color(255, 204, 204));
		
		JButton btnEventos = new JButton("Eventos");
		btnEventos.setBackground(new Color(0, 0, 0, 0));
		btnEventos.setOpaque(false);
		btnEventos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				controlador.cambioPantalla(6, 5);
				modelo.cargarTablaEventos();
			}
		});
		btnEventos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEventos.setBounds(37, 86, 120, 41);
		dsktpBotones.add(btnEventos);
		
		JButton btnDeportes = new JButton("Deportes");
		btnDeportes.setBackground(new Color(0, 0, 0, 0));
		btnDeportes.setOpaque(false);
		btnDeportes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				controlador.cambioPantalla(6, 8);
			}
		});
		btnDeportes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDeportes.setBounds(37, 26, 120, 41);
		dsktpBotones.add(btnDeportes);
		
		JDesktopPane dsktpMisEventos = new JDesktopPane();

		dsktpMisEventos.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
		dsktpMisEventos.setBackground(new Color(255, 204, 204));
		dsktpMisEventos.setBounds(-21, 213, 175, 632);
		getContentPane().add(dsktpMisEventos);
		
		JLabel lblNewLabel_1 = new JLabel("Eventos Apuntados");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(43, 10, 109, 30);
		dsktpMisEventos.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Baloncesto 10/06/22");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(43, 50, 109, 13);
		dsktpMisEventos.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("F\u00FAtbol 11/06/22");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_1.setBounds(43, 71, 99, 13);
		dsktpMisEventos.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("P\u00E1del 12/06/22");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_2.setBounds(43, 94, 109, 13);
		dsktpMisEventos.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("P\u00E1del 13/06/22");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_2_1.setBounds(43, 117, 109, 13);
		dsktpMisEventos.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Badminton 14/06/22");
		lblNewLabel_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_2_1_1.setBounds(43, 140, 109, 13);
		dsktpMisEventos.add(lblNewLabel_2_2_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Front\u00F3n 15/06/22");
		lblNewLabel_2_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_2_1_1_1.setBounds(43, 163, 109, 13);
		dsktpMisEventos.add(lblNewLabel_2_2_1_1_1);
		btnFriends.setBackground(new Color(0, 0, 0, 0));
		btnFriends.setOpaque(false);
		
		JPanel panelPadel = new JPanel();
		panelPadel.setLayout(null);
		panelPadel.setBackground(new Color(255, 248, 248));
		panelPadel.setBounds(153, 53, 792, 553);
		getContentPane().add(panelPadel);
		
		JLabel lblNewLabel = new JLabel("Ubicaci\u00F3n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(69, 110, 174, 26);
		panelPadel.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(240, 128, 128));
		separator.setForeground(new Color(240, 128, 128));
		separator.setBounds(69, 135, 268, 14);
		panelPadel.add(separator);
		
		txtUbicacin = new JTextField();
		txtUbicacin.setBackground(new Color(255, 228, 228));
		txtUbicacin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtUbicacin.setBounds(69, 146, 475, 31);
		panelPadel.add(txtUbicacin);
		txtUbicacin.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Deportes", "Baloncesto", "Badminton", "Front\u00F3n", "F\u00FAtbol", "P\u00E1del"}));
		comboBox.setBounds(69, 47, 179, 42);
		panelPadel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Nivel", "Principiante", "Medio", "Avanzado", "Experto"}));
		comboBox_1.setBounds(302, 47, 179, 42);
		panelPadel.add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Edad"}));
		comboBox_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_1_1.setBounds(543, 47, 179, 42);
		panelPadel.add(comboBox_1_1);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(302, 494, 179, 49);
		panelPadel.add(btnNewButton);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n");
		lblDescripcin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDescripcin.setBounds(69, 298, 174, 27);
		panelPadel.add(lblDescripcin);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(240, 128, 128));
		separator_1.setForeground(new Color(240, 128, 128));
		separator_1.setBounds(69, 326, 268, 3);
		panelPadel.add(separator_1);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFecha.setBounds(69, 187, 174, 27);
		panelPadel.add(lblFecha);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBackground(new Color(240, 128, 128));
		separator_1_1.setForeground(new Color(240, 128, 128));
		separator_1_1.setBounds(69, 211, 268, 3);
		panelPadel.add(separator_1_1);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(new Color(255, 228, 228));
		editorPane.setBounds(69, 339, 606, 145);
		panelPadel.add(editorPane);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"D\u00EDa", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_2.setBounds(69, 231, 179, 42);
		panelPadel.add(comboBox_2);
		
		JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setModel(new DefaultComboBoxModel(new String[] {"Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
		comboBox_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_1_2.setBounds(302, 231, 179, 42);
		panelPadel.add(comboBox_1_2);
		
		JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"A\u00F1o", "2022", "2023", "2024", "2025", "2026"}));
		comboBox_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_1_1_1.setBounds(543, 231, 179, 42);
		panelPadel.add(comboBox_1_1_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(CreateEventWindow.class.getResource("/imagenes/undo-alt-free-icon-font.png")));
		btnNewButton_1.setBounds(10, 10, 40, 40);
		btnNewButton_1.setBackground(new Color(0, 0, 0, 0));
		btnNewButton_1.setOpaque(false);
		panelPadel.add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				controlador.cambioPantalla(6, 5);
			}
		});
		
	}
}


