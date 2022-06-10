package Usuario;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

import MVC.Controlador;
import MVC.Modelo;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.awt.Scrollbar;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import java.awt.Component;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.FlowLayout;
public class EventsWindow2 extends JFrame{
	private Controlador controlador;
	private Modelo modelo;
	private JTable table;
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
					EventsWindow2 window = new EventsWindow2();
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
	public EventsWindow2() {
		initialize();
	}

	/**
	 * Initialize the contents of the 
	 */
	public void initialize() {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(SportsWindow.class.getResource("/imagenes/Sin_titulo.png")));
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 959, 661);
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
		btnProfile.setIcon(new ImageIcon(SportsWindow.class.getResource("/imagenes/Perfil (2).png")));
		btnProfile.setBackground(new Color(0, 0, 0, 0));
		btnProfile.setOpaque(false);
		btnProfile.setBounds(884, 1, 51, 51);
		desktopPane.add(btnProfile);

		JButton btnFriends = new JButton("");
		btnFriends.setBackground(new Color(0, 0, 0, 0));
		btnFriends.setOpaque(false);
		btnFriends.setIcon(new ImageIcon(SportsWindow.class.getResource("/imagenes/personas (1).png")));
		btnFriends.setBounds(813, 1, 51, 51);
		desktopPane.add(btnFriends);

		JButton btnHome = new JButton("");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.cambioPantalla(5,2);
			}
		});
		btnHome.setBounds(10, 8, 70, 37);
		desktopPane.add(btnHome);
		btnHome.setIcon(new ImageIcon(SportsWindow.class.getResource("/imagenes/Sin_titulo2 (1).png")));
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
			}
		});
		btnEventos.setEnabled(false);
		btnEventos.setBackground(new Color(0, 0, 0, 0));
		btnEventos.setOpaque(false);
		btnEventos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEventos.setBounds(37, 86, 120, 41);
		dsktpBotones.add(btnEventos);

		JButton btnDeportes = new JButton("Deportes");
		btnDeportes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				controlador.cambioPantalla(5,8);
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
		dsktpMisEventos.setBounds(-21, 213, 175, 409);
		getContentPane().add(dsktpMisEventos);

		JLabel lblNewLabel_1_3 = new JLabel("Eventos Apuntados");
		lblNewLabel_1_3.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblNewLabel_1_3.setBounds(44, 10, 109, 30);
		dsktpMisEventos.add(lblNewLabel_1_3);

		JLabel lblNewLabel_2_3 = new JLabel("Baloncesto 10/06/22");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_3.setBounds(44, 50, 109, 13);
		dsktpMisEventos.add(lblNewLabel_2_3);

		JLabel lblNewLabel_2_1_1 = new JLabel("F\u00FAtbol 11/06/22");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_1_1.setBounds(44, 71, 99, 13);
		dsktpMisEventos.add(lblNewLabel_2_1_1);

		JLabel lblNewLabel_2_2_1 = new JLabel("P\u00E1del 12/06/22");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_2_1.setBounds(44, 94, 109, 13);
		dsktpMisEventos.add(lblNewLabel_2_2_1);

		JLabel lblNewLabel_2_2_1_1 = new JLabel("P\u00E1del 13/06/22");
		lblNewLabel_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_2_1_1.setBounds(44, 117, 109, 13);
		dsktpMisEventos.add(lblNewLabel_2_2_1_1);

		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Badminton 14/06/22");
		lblNewLabel_2_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_2_1_1_1.setBounds(44, 140, 109, 13);
		dsktpMisEventos.add(lblNewLabel_2_2_1_1_1);

		JLabel lblNewLabel_2_2_1_1_1_1 = new JLabel("Front\u00F3n 15/06/22");
		lblNewLabel_2_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_2_1_1_1_1.setBounds(44, 163, 109, 13);
		dsktpMisEventos.add(lblNewLabel_2_2_1_1_1_1);
		btnFriends.setBackground(new Color(0, 0, 0, 0));
		btnFriends.setOpaque(false);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 248, 248));
		panel.setBounds(153, 53, 760, 510);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(730, 1300));

		TextField textField = new TextField();
		textField.setFont(new Font("Dialog", Font.PLAIN, 18));
		textField.setEditable(false);
		textField.setText("Buscar\r\n");
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(130, 100, 522, 33);
		panel.add(textField);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(153, 54, 792, 568);
		getContentPane().add(scrollPane);
		scrollPane.setColumnHeaderView(panel);
		scrollPane.getVerticalScrollBar().setUnitIncrement(10);

		JPanel panel_1_4 = new JPanel();
		panel_1_4.setBounds(61, 575, 185, 200);
		panel.add(panel_1_4);

		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBounds(305, 575, 185, 200);
		panel.add(panel_1_1_2);

		JPanel panel_1_2_2 = new JPanel();
		panel_1_2_2.setBounds(545, 575, 185, 200);
		panel.add(panel_1_2_2);

		JPanel panel_1_3_1 = new JPanel();
		panel_1_3_1.setBounds(61, 820, 185, 200);
		panel.add(panel_1_3_1);

		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBounds(305, 820, 185, 200);
		panel.add(panel_1_1_1_1);

		JPanel panel_1_2_1_1 = new JPanel();
		panel_1_2_1_1.setBounds(545, 820, 185, 200);
		panel.add(panel_1_2_1_1);

		JPanel panel_1_3_1_1 = new JPanel();
		panel_1_3_1_1.setBounds(61, 1065, 185, 200);
		panel.add(panel_1_3_1_1);

		JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setBounds(305, 1065, 185, 200);
		panel.add(panel_1_1_1_1_1);

		JPanel panel_1_2_1_1_1 = new JPanel();
		panel_1_2_1_1_1.setBounds(545, 1065, 185, 200);
		panel.add(panel_1_2_1_1_1);

		JLabel lblNewLabel = new JLabel("PROXIMOS EVENTOS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 34));
		lblNewLabel.setBounds(203, 32, 381, 62);
		panel.add(lblNewLabel);
		
		JButton btnAdd = new JButton("");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAdd.setIcon(new ImageIcon(EventsWindow2.class.getResource("/imagenes/add-free-icon-font (4).png")));
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				controlador.cambioPantalla(5,6);
			}
		});

		btnAdd.setBounds(723, 36, 40, 40);
		panel.add(btnAdd);
		btnAdd.setBackground(new Color(0, 0, 0, 0));
		btnAdd.setOpaque(false);
		
		
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(255, 153, 153), 3, true));
		panel_1_1.setBackground(new Color(255, 228, 225));
		panel_1_1.setBounds(46, 195, 702, 318);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JScrollPane scrollTable = new JScrollPane();
		scrollTable.setBounds(4, 4, 694, 310);
		panel_1_1.add(scrollTable);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setForeground(new Color(254, 254, 254));
		table.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		table.setBackground(new Color(255, 228, 225));
		scrollTable.setViewportView(table);
		scrollTable.setBackground(new Color(255, 228, 225));
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				table.setModel(modelo.getTabla());
			}
		});
		
		textField.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(textField.getText().equals("Buscar ")) {
					textField.setText("");
				}
				textField.setEditable(true);
			}
		});

		scrollPane.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(textField.getText().equals("")) {
					textField.setText("Buscar\r\n");
				}
				textField.setEditable(false);
			}
		});

	}
	

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}
}

