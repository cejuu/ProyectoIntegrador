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

public class PartidoFutbol extends JFrame{

	private JTextField txtUbicacin;
	private Controlador controlador;
	private Modelo modelo;
	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
		
	}


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PartidoFutbol window = new PartidoFutbol();
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
	public PartidoFutbol() {
		initialize();
	}

	/**
	 * Initialize the contents of the 
	 */
	public void initialize() {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(PartidoFutbol.class.getResource("/imagenes/Sin_titulo.png")));
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
		btnProfile.setIcon(new ImageIcon(PartidoFutbol.class.getResource("/imagenes/Perfil (2).png")));
		btnProfile.setBackground(new Color(0, 0, 0, 0));
		btnProfile.setOpaque(false);
		btnProfile.setBounds(884, 1, 51, 51);
		desktopPane.add(btnProfile);

		JButton btnFriends = new JButton("");
		btnFriends.setBackground(new Color(0, 0, 0, 0));
		btnFriends.setOpaque(false);
		btnFriends.setIcon(new ImageIcon(PartidoFutbol.class.getResource("/imagenes/personas (1).png")));
		btnFriends.setBounds(813, 1, 51, 51);
		desktopPane.add(btnFriends);

		JButton btnHome = new JButton("");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.cambioPantalla(11,8);
			}
		});
		btnHome.setBounds(10, 8, 70, 37);
		desktopPane.add(btnHome);
		btnHome.setIcon(new ImageIcon(PartidoFutbol.class.getResource("/imagenes/Sin_titulo2 (1).png")));
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
				controlador.cambioPantalla(11,5);
			}
		});
		btnEventos.setFont(new Font("Verdana", Font.PLAIN, 14));
		btnEventos.setBounds(37, 86, 120, 41);
		dsktpBotones.add(btnEventos);
		
		JButton btnDeportes = new JButton("Deportes");
		btnDeportes.setBackground(new Color(0, 0, 0, 0));
		btnDeportes.setOpaque(false);
		btnDeportes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				controlador.cambioPantalla(11,8);
			}
		});
		btnDeportes.setFont(new Font("Verdana", Font.PLAIN, 14));
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
		panelPadel.setPreferredSize(new Dimension(752, 650));
		
		JLabel lblNewLabel = new JLabel("Ubicaci\u00F3n");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel.setBounds(69, 191, 174, 26);
		panelPadel.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(240, 128, 128));
		separator.setForeground(new Color(240, 128, 128));
		separator.setBounds(69, 216, 268, 14);
		panelPadel.add(separator);
		
		txtUbicacin = new JTextField();
		txtUbicacin.setText("Pl. de Madrid, s/n, 11010 C\u00E1diz");
		txtUbicacin.setBackground(new Color(255, 228, 228));
		txtUbicacin.setFont(new Font("Verdana", Font.PLAIN, 17));
		txtUbicacin.setBounds(69, 240, 653, 31);
		panelPadel.add(txtUbicacin);
		txtUbicacin.setColumns(10);
		
		JButton btnNewButton = new JButton("Desunirse");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(302, 533, 179, 49);
		panelPadel.add(btnNewButton);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n");
		lblDescripcin.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblDescripcin.setBounds(69, 303, 174, 27);
		panelPadel.add(lblDescripcin);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(240, 128, 128));
		separator_1.setForeground(new Color(240, 128, 128));
		separator_1.setBounds(69, 331, 268, 3);
		panelPadel.add(separator_1);
		
		JEditorPane dtrpnLoremIpsumIs = new JEditorPane();
		dtrpnLoremIpsumIs.setFont(new Font("Verdana", Font.PLAIN, 15));
		dtrpnLoremIpsumIs.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.");
		dtrpnLoremIpsumIs.setBackground(new Color(255, 228, 228));
		dtrpnLoremIpsumIs.setBounds(69, 350, 653, 145);
		panelPadel.add(dtrpnLoremIpsumIs);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(PartidoFutbol.class.getResource("/imagenes/undo-alt-free-icon-font.png")));
		btnNewButton_1.setBounds(10, 10, 40, 40);
		btnNewButton_1.setBackground(new Color(0, 0, 0, 0));
		btnNewButton_1.setOpaque(false);
		panelPadel.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(153, 53, 792, 553);
		scrollPane.setViewportView(panelPadel);
		scrollPane.getVerticalScrollBar().setUnitIncrement(10);
		
		JLabel lblNewLabel_3 = new JLabel("Partido F\u00FAtbol");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(251, 10, 289, 49);
		panelPadel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Alto");
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(69, 114, 179, 42);
		panelPadel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("25-30 a\u00F1os");
		lblNewLabel_4_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(302, 114, 179, 42);
		panelPadel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("20/06/2022");
		lblNewLabel_4_2.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel_4_2.setBounds(543, 114, 179, 42);
		panelPadel.add(lblNewLabel_4_2);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblFecha.setBounds(543, 85, 149, 27);
		panelPadel.add(lblFecha);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(new Color(240, 128, 128));
		separator_1_1.setBackground(new Color(240, 128, 128));
		separator_1_1.setBounds(543, 109, 178, 3);
		panelPadel.add(separator_1_1);
		
		JLabel lblAos = new JLabel("Edad");
		lblAos.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblAos.setBounds(302, 85, 149, 27);
		panelPadel.add(lblAos);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setForeground(new Color(240, 128, 128));
		separator_1_1_1.setBackground(new Color(240, 128, 128));
		separator_1_1_1.setBounds(302, 109, 178, 3);
		panelPadel.add(separator_1_1_1);
		
		JLabel lblNivel = new JLabel("Nivel");
		lblNivel.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNivel.setBounds(69, 85, 149, 27);
		panelPadel.add(lblNivel);
		
		JSeparator separator_1_1_2 = new JSeparator();
		separator_1_1_2.setForeground(new Color(240, 128, 128));
		separator_1_1_2.setBackground(new Color(240, 128, 128));
		separator_1_1_2.setBounds(69, 109, 178, 3);
		panelPadel.add(separator_1_1_2);
		getContentPane().add(scrollPane);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.cambioPantalla(11,5);
			}
		});
		
	}
}


