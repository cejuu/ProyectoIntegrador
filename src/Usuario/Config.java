package Usuario;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.sql.*;
import java.util.Date;

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
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

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
import java.awt.BorderLayout;

public class Config extends JFrame{

	private Controlador controlador;
	private Modelo modelo;
	public JTextField txtfUsuario;
	public JTextField txtfNombBbdd;
	public JTextField txtfContrasena;
	public JTextField txtfPuerto;
	public JTextField textField_5;
	public String[] keys = {"bd", "login", "pwd"};
	
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
					Config window = new Config();
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
	public Config() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(SportsWindow.class.getResource("/imagenes/Sin_titulo.png")));
		getContentPane().setBackground(new Color(255, 153, 153));
		setBounds(100, 100, 959, 661);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contenedor = getContentPane();
		contenedor.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Configuraci\u00F3n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(180, 54, 602, 49);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(131, 188, 129, 25);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre de la bbdd");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(131, 235, 185, 25);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(131, 284, 201, 25);
		getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Puerto");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(131, 332, 129, 25);
		getContentPane().add(lblNewLabel_1_3);
		
		txtfUsuario = new JTextField();
		txtfUsuario.setEditable(false);
		txtfUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtfUsuario.setBounds(344, 188, 185, 26);
		getContentPane().add(txtfUsuario);
		txtfUsuario.setColumns(10);
		
		txtfNombBbdd = new JTextField();
		txtfNombBbdd.setEditable(false);
		txtfNombBbdd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtfNombBbdd.setColumns(10);
		txtfNombBbdd.setBounds(344, 235, 185, 26);
		getContentPane().add(txtfNombBbdd);
		
		txtfContrasena = new JTextField();
		txtfContrasena.setEditable(false);
		txtfContrasena.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtfContrasena.setColumns(10);
		txtfContrasena.setBounds(344, 283, 185, 26);
		getContentPane().add(txtfContrasena);
		
		txtfPuerto = new JTextField();
		txtfPuerto.setEditable(false);
		txtfPuerto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtfPuerto.setColumns(10);
		txtfPuerto.setBounds(345, 331, 185, 26);
		getContentPane().add(txtfPuerto);
		
		JButton btnSeleccionar = new JButton("Selecciona");
		btnSeleccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionaFichero();
			}
		});
		btnSeleccionar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSeleccionar.setBackground(new Color(255, 240, 240));
		btnSeleccionar.setBounds(131, 136, 167, 29);
		getContentPane().add(btnSeleccionar);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_5.setToolTipText("Inserta la ruta del fichero");
		textField_5.setColumns(10);
		textField_5.setBounds(344, 136, 277, 29);
		getContentPane().add(textField_5);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.guardar();
				
			}
		});
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnGuardar.setBackground(new Color(255, 240, 240));
		btnGuardar.setBounds(158, 407, 129, 29);
		getContentPane().add(btnGuardar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnEditar.getText().equals("Editar")) {
					btnEditar.setText("Cancelar");
					txtfUsuario.setEditable(true);
					txtfNombBbdd.setEditable(true);
					txtfContrasena.setEditable(true);
					txtfPuerto.setEditable(true);
				}else {
					btnEditar.setText("Editar");
					txtfUsuario.setEditable(false);
					txtfNombBbdd.setEditable(false);
					txtfContrasena.setEditable(false);
					txtfPuerto.setEditable(false);
				}
			}
		});
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEditar.setBackground(new Color(255, 240, 240));
		btnEditar.setBounds(328, 407, 119, 29);
		getContentPane().add(btnEditar);
		
		JButton btnBack = new JButton("");
		btnBack.setIcon(new ImageIcon(infoevento.class.getResource("/imagenes/undo-alt-free-icon-font.png")));
		btnBack.setBounds(10, 10, 40, 40);
		btnBack.setBackground(new Color(0, 0, 0, 0));
		btnBack.setOpaque(false);
		getContentPane().add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.cambioPantalla(12,0);
			}
		});
	}
	public void seleccionaFichero () {
		File rutaProyecto = new File (System.getProperty("user.dir"));
		JFileChooser fc=new JFileChooser(rutaProyecto);
		fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.ini", "ini");
		fc.setFileFilter(filtro);
		int seleccion=fc.showOpenDialog(getContentPane());
		if(seleccion==JFileChooser.APPROVE_OPTION){
		    File fichero=fc.getSelectedFile();
		    textField_5.setText(fichero.getAbsolutePath());
		    txtfUsuario.setText(modelo.getPropconfig().getProperty("login"));
		    txtfNombBbdd.setText(fichero.getAbsolutePath());
		    txtfContrasena.setText(fichero.getAbsolutePath());
		    txtfPuerto.setText(fichero.getAbsolutePath());
		}
	}
	public JTextField getTxtUsuario() {
		return txtfUsuario;
	}
	public JTextField getTxtNombreBbdd() {
		return txtfNombBbdd;
	}
	public JTextField getTxtContrasena() {
		return txtfContrasena;
	}
	public String[] getKeys() {
        return keys;
    }
	
	
}
