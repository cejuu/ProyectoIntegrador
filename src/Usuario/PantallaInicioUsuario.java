package Usuario;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;

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
import javax.swing.JSeparator;
import java.sql.*;

public class PantallaInicioUsuario extends JFrame {
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
					PantallaInicioUsuario window = new PantallaInicioUsuario();
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
	public PantallaInicioUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the
	 */
	public void initialize() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(PantallaInicioUsuario.class.getResource("/imagenes/Sin_titulo.png")));
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 959, 659);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contenedor = getContentPane();
		contenedor.setLayout(null);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(255, 102, 102), 4));
		panel_1_1.setBackground(new Color(255, 102, 102));
		panel_1_1.setBounds(692, 56, 230, 291);
		getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);

		JLabel lblNombre = new JLabel("New label");
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setBounds(34, 5, 169, 37);
		panel_1_1.add(lblNombre);

		JButton btnMiCuenta = new JButton("Mi Cuenta");
		btnMiCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.cambioPantalla(3,9);
			}
		});
		btnMiCuenta.setForeground(new Color(255, 255, 255));
		btnMiCuenta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMiCuenta.setBackground(new Color(0, 0, 0, 0));
		btnMiCuenta.setOpaque(false);
		btnMiCuenta.setBounds(34, 65, 169, 37);
		panel_1_1.add(btnMiCuenta);

		JButton btnAyuda = new JButton("Ayuda");
		btnAyuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.cambioPantalla(3,7);
			}
		});
		btnAyuda.setForeground(new Color(255, 255, 255));
		btnAyuda.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAyuda.setBackground(new Color(0, 0, 0, 0));
		btnAyuda.setOpaque(false);
		btnAyuda.setBounds(34, 146, 169, 37);
		panel_1_1.add(btnAyuda);

		JButton btnCerrarSesin = new JButton("Cerrar Sesi\u00F3n");
		btnCerrarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.cambioPantalla(3,0);
			}
		});
		btnCerrarSesin.setForeground(new Color(255, 255, 255));
		btnCerrarSesin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCerrarSesin.setBackground(new Color(0, 0, 0, 0));
		btnCerrarSesin.setOpaque(false);
		btnCerrarSesin.setBounds(34, 226, 169, 37);
		panel_1_1.add(btnCerrarSesin);

		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(255, 204, 204));
		separator.setBounds(10, 122, 210, 14);
		panel_1_1.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(255, 204, 204));
		separator_1.setBounds(10, 204, 210, 2);
		panel_1_1.add(separator_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(new Color(255, 204, 204));
		separator_2.setBounds(10, 41, 210, 14);
		panel_1_1.add(separator_2);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBorder(null);
		desktopPane.setBackground(new Color(255, 51, 51));
		desktopPane.setBounds(0, 0, 945, 54);
		getContentPane().add(desktopPane);

		JButton btnProfile = new JButton("");
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.cambioPantalla(3, 2);
			}
		});
		btnProfile.setIcon(new ImageIcon(PantallaInicioUsuario.class.getResource("/imagenes/Perfil (2).png")));
		btnProfile.setBackground(new Color(0, 0, 0, 0));
		btnProfile.setOpaque(false);
		btnProfile.setBounds(873, 1, 51, 51);
		desktopPane.add(btnProfile);

		JButton btnFriends = new JButton("");
		btnFriends.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.cambioPantalla(3,4);
			}
		});
		btnFriends.setBackground(new Color(0, 0, 0, 0));
		btnFriends.setOpaque(false);
		btnFriends.setIcon(new ImageIcon(PantallaInicioUsuario.class.getResource("/imagenes/personas (1).png")));
		btnFriends.setBounds(801, 1, 51, 51);
		desktopPane.add(btnFriends);

		JButton btnHome = new JButton("");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.cambioPantalla(3, 2);
			}
		});
		btnHome.setBounds(10, 8, 70, 37);
		desktopPane.add(btnHome);
		btnHome.setIcon(new ImageIcon(PantallaInicioUsuario.class.getResource("/imagenes/Sin_titulo2 (1).png")));
		btnHome.setBackground(new Color(0, 0, 0, 0));
		btnHome.setOpaque(false);

		JDesktopPane dsktpBotones = new JDesktopPane();
		dsktpBotones.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
		dsktpBotones.setBounds(-21, 48, 175, 167);
		getContentPane().add(dsktpBotones);
		dsktpBotones.setBackground(new Color(255, 204, 204));

		JButton btnEventos = new JButton("Eventos");
		btnEventos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.cambioPantalla(3, 5);
				modelo.cargarTablaEventos();
			}
		});
		btnEventos.setBackground(new Color(0, 0, 0, 0));
		btnEventos.setOpaque(false);
		btnEventos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEventos.setBounds(37, 86, 120, 41);
		dsktpBotones.add(btnEventos);

		JButton btnDeportes = new JButton("Deportes");
		btnDeportes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.cambioPantalla(3, 8);
			}
		});
		btnDeportes.setBackground(new Color(0, 0, 0, 0));
		btnDeportes.setOpaque(false);
		btnDeportes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDeportes.setBounds(37, 26, 120, 41);
		dsktpBotones.add(btnDeportes);

		JDesktopPane dsktpMisEventos = new JDesktopPane();

		dsktpMisEventos.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
		dsktpMisEventos.setBackground(new Color(255, 204, 204));
		dsktpMisEventos.setBounds(-21, 213, 175, 632);
		getContentPane().add(dsktpMisEventos);

		JLabel lblNewLabel_1_2 = new JLabel("Eventos Apuntados");
		lblNewLabel_1_2.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblNewLabel_1_2.setBounds(41, 10, 109, 30);
		dsktpMisEventos.add(lblNewLabel_1_2);

		JLabel lblNewLabel_2 = new JLabel("Baloncesto 10/06/22");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(41, 50, 109, 13);
		dsktpMisEventos.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("F\u00FAtbol 11/06/22");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_1.setBounds(41, 71, 99, 13);
		dsktpMisEventos.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_2 = new JLabel("P\u00E1del 12/06/22");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_2.setBounds(41, 94, 109, 13);
		dsktpMisEventos.add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_2_1 = new JLabel("P\u00E1del 13/06/22");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_2_1.setBounds(41, 117, 109, 13);
		dsktpMisEventos.add(lblNewLabel_2_2_1);

		JLabel lblNewLabel_2_2_1_1 = new JLabel("Badminton 14/06/22");
		lblNewLabel_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_2_1_1.setBounds(41, 140, 109, 13);
		dsktpMisEventos.add(lblNewLabel_2_2_1_1);

		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Front\u00F3n 15/06/22");
		lblNewLabel_2_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_2_1_1_1.setBounds(41, 163, 109, 13);
		dsktpMisEventos.add(lblNewLabel_2_2_1_1_1);
		btnFriends.setBackground(new Color(0, 0, 0, 0));
		btnFriends.setOpaque(false);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 248, 248));
		panel.setBounds(153, 53, 760, 510);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(730, 800));

		TextField textField = new TextField();
		textField.setText("Buscar\r\n");
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(23, 20, 185, 21);
		panel.add(textField);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(153, 54, 792, 791);
		getContentPane().add(scrollPane);
		scrollPane.setViewportView(panel);

		JPanel panelBeisbol = new JPanel();
		panelBeisbol.setBorder(new LineBorder(new Color(255, 153, 153), 4, true));
		panelBeisbol.setBackground(new Color(255, 204, 204));
		panelBeisbol.setBounds(305, 332, 185, 200);
		panel.add(panelBeisbol);
		panelBeisbol.setLayout(null);

		JLabel lblVoleyIcon_1 = new JLabel("");
		lblVoleyIcon_1.setIcon(
				new ImageIcon(PantallaInicioUsuario.class.getResource("/imagenes/baseball-alt-free-icon-font_1.png")));
		lblVoleyIcon_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblVoleyIcon_1.setBounds(0, 0, 185, 129);
		panelBeisbol.add(lblVoleyIcon_1);

		JLabel lblBeisbol = new JLabel("Beisbol");
		lblBeisbol.setForeground(Color.WHITE);
		lblBeisbol.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBeisbol.setBounds(10, 139, 115, 51);
		panelBeisbol.add(lblBeisbol);

		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(PantallaInicioUsuario.class.getResource("/imagenes/next (1).png")));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(130, 139, 51, 51);
		panelBeisbol.add(lblNewLabel_1_1);

		JPanel panelBalonmano = new JPanel();
		panelBalonmano.setLayout(null);
		panelBalonmano.setBorder(new LineBorder(new Color(255, 153, 153), 4, true));
		panelBalonmano.setBackground(new Color(255, 204, 204));
		panelBalonmano.setBounds(61, 332, 185, 200);
		panel.add(panelBalonmano);

		JLabel lblBeisbol_1_1 = new JLabel("Balonmano");
		lblBeisbol_1_1.setForeground(Color.WHITE);
		lblBeisbol_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBeisbol_1_1.setBounds(10, 139, 158, 51);
		panelBalonmano.add(lblBeisbol_1_1);

		JLabel lblVoleyIcon_1_5 = new JLabel("");
		lblVoleyIcon_1_5
				.setIcon(new ImageIcon(PantallaInicioUsuario.class.getResource("/imagenes/unknown (2) (2).png")));
		lblVoleyIcon_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblVoleyIcon_1_5.setBounds(0, 0, 185, 129);
		panelBalonmano.add(lblVoleyIcon_1_5);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(PantallaInicioUsuario.class.getResource("/imagenes/next (1).png")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(130, 139, 51, 51);
		panelBalonmano.add(lblNewLabel_1);

		JPanel panelPadel = new JPanel();
		panelPadel.setLayout(null);
		panelPadel.setBorder(new LineBorder(new Color(255, 153, 153), 4, true));
		panelPadel.setBackground(new Color(255, 204, 204));
		panelPadel.setBounds(61, 91, 185, 200);
		panel.add(panelPadel);

		JLabel lblPdel = new JLabel("P\u00E1del");
		lblPdel.setForeground(Color.WHITE);
		lblPdel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPdel.setBounds(10, 139, 115, 51);
		panelPadel.add(lblPdel);

		JLabel lblVoleyIcon_1_4_1 = new JLabel("");
		lblVoleyIcon_1_4_1
				.setIcon(new ImageIcon(PantallaInicioUsuario.class.getResource("/imagenes/raquet-free-icon-font.png")));
		lblVoleyIcon_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblVoleyIcon_1_4_1.setBounds(0, 0, 185, 129);
		panelPadel.add(lblVoleyIcon_1_4_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setIcon(new ImageIcon(PantallaInicioUsuario.class.getResource("/imagenes/next (1).png")));
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(130, 139, 51, 51);
		panelPadel.add(lblNewLabel_1_1_1);

		JPanel panelFutbol = new JPanel();
		panelFutbol.setLayout(null);
		panelFutbol.setBorder(new LineBorder(new Color(255, 153, 153), 4, true));
		panelFutbol.setBackground(new Color(255, 204, 204));
		panelFutbol.setBounds(305, 91, 185, 200);
		panel.add(panelFutbol);

		JLabel lblFutbol = new JLabel("F\u00FAtbol");
		lblFutbol.setForeground(Color.WHITE);
		lblFutbol.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFutbol.setBounds(10, 139, 115, 51);
		panelFutbol.add(lblFutbol);

		JLabel lblVoleyIcon_1_4 = new JLabel("");
		lblVoleyIcon_1_4.setIcon(
				new ImageIcon(PantallaInicioUsuario.class.getResource("/imagenes/football-free-icon-font.png")));
		lblVoleyIcon_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblVoleyIcon_1_4.setBounds(0, 0, 185, 129);
		panelFutbol.add(lblVoleyIcon_1_4);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1.setIcon(new ImageIcon(PantallaInicioUsuario.class.getResource("/imagenes/next (1).png")));
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setBounds(130, 139, 51, 51);
		panelFutbol.add(lblNewLabel_1_1_1_1);

		JPanel panelBaloncesto = new JPanel();
		panelBaloncesto.setLayout(null);
		panelBaloncesto.setBorder(new LineBorder(new Color(255, 153, 153), 4, true));
		panelBaloncesto.setBackground(new Color(255, 204, 204));
		panelBaloncesto.setBounds(545, 91, 185, 200);
		panel.add(panelBaloncesto);

		JLabel lblBasket = new JLabel("Baloncesto");
		lblBasket.setForeground(Color.WHITE);
		lblBasket.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBasket.setBounds(10, 139, 115, 51);
		panelBaloncesto.add(lblBasket);

		JLabel lblVoleyIcon_1_4_2 = new JLabel("");
		lblVoleyIcon_1_4_2.setIcon(
				new ImageIcon(PantallaInicioUsuario.class.getResource("/imagenes/basketball-free-icon-font_1.png")));
		lblVoleyIcon_1_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblVoleyIcon_1_4_2.setBounds(0, 0, 185, 129);
		panelBaloncesto.add(lblVoleyIcon_1_4_2);

		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1_1.setIcon(new ImageIcon(PantallaInicioUsuario.class.getResource("/imagenes/next (1).png")));
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setBounds(130, 139, 51, 51);
		panelBaloncesto.add(lblNewLabel_1_1_1_1_1);

		JPanel panelVoleibol = new JPanel();
		panelVoleibol.setLayout(null);
		panelVoleibol.setBorder(new LineBorder(new Color(255, 153, 153), 4, true));
		panelVoleibol.setBackground(new Color(255, 204, 204));
		panelVoleibol.setBounds(545, 332, 185, 200);
		panel.add(panelVoleibol);

		JLabel lblVoleyIcon = new JLabel("");
		lblVoleyIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblVoleyIcon.setIcon(
				new ImageIcon(PantallaInicioUsuario.class.getResource("/imagenes/volleyball-free-icon-font.png")));
		lblVoleyIcon.setBounds(0, 0, 185, 129);
		panelVoleibol.add(lblVoleyIcon);

		JLabel lblNewLabel = new JLabel("Voleibol");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 139, 115, 51);
		panelVoleibol.add(lblNewLabel);

		JLabel lblNewLabel_1_1_1_1_5 = new JLabel("");
		lblNewLabel_1_1_1_1_5.setIcon(new ImageIcon(PantallaInicioUsuario.class.getResource("/imagenes/next (1).png")));
		lblNewLabel_1_1_1_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_5.setBounds(130, 139, 51, 51);
		panelVoleibol.add(lblNewLabel_1_1_1_1_5);

		JLabel lblRecomendados = new JLabel("Recomendados");
		lblRecomendados.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRecomendados.setBounds(23, 32, 185, 80);
		panel.add(lblRecomendados);

		JLabel lblPopulares = new JLabel("Populares");
		lblPopulares.setHorizontalAlignment(SwingConstants.LEFT);
		lblPopulares.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPopulares.setBounds(23, 274, 185, 80);
		panel.add(lblPopulares);

	}
}
