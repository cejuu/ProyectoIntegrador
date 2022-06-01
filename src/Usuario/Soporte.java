package Usuario;


import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.*;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Soporte extends JFrame{

	private JTextField txtDescribeTuProblema;
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
					Soporte window = new Soporte();
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
	public Soporte() {
		initialize();
	}

	/**
	 * Initialize the contents of the 
	 */
	public void initialize() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Soporte.class.getResource("/imagenes/Sin_titulo.png")));
		getContentPane().setBackground(new Color(255, 153, 153));
		getContentPane().setLayout(null);
		setBackground(Color.WHITE);
		setBounds(100, 100, 966, 561);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel6 = new JPanel();
		panel6.setBackground(new Color(255, 255, 255));
		panel6.setBounds(153, 53, 760, 510);
		panel6.setLayout(null);
		panel6.setPreferredSize(new Dimension(730, 1060));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(255, 153, 153));
		scrollPane.setBounds(0, 0, 952, 524);
		getContentPane().add(scrollPane);
		scrollPane.setViewportView(panel6);
		scrollPane.getVerticalScrollBar().setUnitIncrement(10);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.DARK_GRAY);
		separator_1_1.setBackground(Color.BLACK);
		separator_1_1.setBounds(133, 405, 703, 3);
		panel6.add(separator_1_1);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setForeground(Color.DARK_GRAY);
		separator_1_1_1.setBackground(Color.BLACK);
		separator_1_1_1.setBounds(133, 468, 703, 3);
		panel6.add(separator_1_1_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.DARK_GRAY);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(133, 340, 703, 3);
		panel6.add(separator_1);
		
		JLabel lblNewLabel = new JLabel("\u00BFEn que podemos ayudarte?");
		lblNewLabel.setBounds(262, 84, 441, 75);
		panel6.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 30));
		
		txtDescribeTuProblema = new JTextField();
		txtDescribeTuProblema.setEditable(false);
		txtDescribeTuProblema.setBackground(new Color(255, 204, 204));
		txtDescribeTuProblema.setBounds(199, 169, 570, 40);
		panel6.add(txtDescribeTuProblema);
		txtDescribeTuProblema.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtDescribeTuProblema.setText("Describe tu problema");
		txtDescribeTuProblema.setColumns(10);
		
		txtDescribeTuProblema.addMouseListener(new MouseAdapter(){
	            public void mouseClicked(MouseEvent e){
	            	if(txtDescribeTuProblema.getText().equals("Describe tu problema")) {
	            		txtDescribeTuProblema.setText("");
					}
	            	txtDescribeTuProblema.setEditable(true);
	            }
	        });
		
		panel6.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
            	if(txtDescribeTuProblema.getText().equals("")) {
            		txtDescribeTuProblema.setText("Describe tu problema");
				}
            	txtDescribeTuProblema.setEditable(false);
            }
        });
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(199, 209, 570, 15);
		panel6.add(separator);
		separator.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblOtrosProblemas = new JLabel("Otros problemas");
		lblOtrosProblemas.setBounds(199, 219, 183, 34);
		panel6.add(lblOtrosProblemas);
		lblOtrosProblemas.setHorizontalAlignment(SwingConstants.CENTER);
		lblOtrosProblemas.setFont(new Font("Verdana", Font.PLAIN, 20));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 153, 153));
		panel.setBounds(133, 276, 703, 65);
		panel6.add(panel);
		panel.setLayout(null);
		
		JLabel txtpnPregunta2 = new JLabel("Let me tell you tada kore ga\r\n"
				+ "sukinadake nani ga warui biito\r\n"
				+ "ni korogaru ore no kuchi tekitou\r\n"
				+ "konashite iki terya ii mou\r\n"
				+ "jankenpon de kime chaeba ii\r\n"
				+ "\r\n"
				+ "tada matteru dake ja imi\r\n"
				+ "naidaro karamatteru\r\n"
				+ "nan demo kan demo atatamatteru\r\n"
				+ "ore wa merameramen ore no katte\r\n"
				+ "\r\n"
				+ "chinpunkanpun yarou-domo wa\r\n"
				+ "san-funkan mo motanai ne uin\r\n"
				+ "ore mata yatchatta ne ando i kiipu\r\n"
				+ "\r\n"
				+ "suru achichina maindo I'm ritchi\r\n"
				+ "youha ki no mochi you datte koto\r\n"
				+ "imi nantena'iyo daitai sukina you\r\n"
				+ "yatte odottara kon'na n natchimatte\r\n"
				+ "matta nashi alright\r\n"
				+ "\r\n"
				+ "I'm high, I'm high, I'm high, I'm high");
		
		JLabel txtpnPregunta3 = new JLabel("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce iaculis quam sit amet sem commodo condimentum. Aenean dignissim elit nec sapien fermentum consequat. Ut blandit ac massa sed vehicula. Donec porta nulla vitae mi rutrum euismod. Sed feugiat, enim bibendum imperdiet semper, libero augue venenatis mi, et tincidunt ex dui non enim. Aenean nec sodales nulla, vel dapibus mauris. Vestibulum eu quam sagittis, eleifend orci vitae, mollis libero. Cras ut diam nibh. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam rhoncus mauris sed turpis rhoncus, nec eleifend odio lobortis.");
		
		JLabel txtpnPregunta4 = new JLabel("Vivamus elementum vel arcu vel luctus. Phasellus scelerisque elit ligula, vel rutrum dui ullamcorper nec. Pellentesque consectetur massa sit amet ligula ornare vehicula. Cras gravida vulputate lacus quis pretium. Nullam tincidunt facilisis lacus eu gravida. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Integer viverra mi a est porta finibus. Sed laoreet non sapien ut fringilla. Vestibulum consequat erat eu urna consectetur, id luctus nisl efficitur. Nullam non pulvinar felis. Phasellus in ultricies magna. Donec sapien purus, placerat sed nulla at, venenatis euismod ligula.");
		
		JLabel lblcomoPuedoCambiar = new JLabel("\u00BFComo puedo cambiar mi nombre?");
		lblcomoPuedoCambiar.setHorizontalAlignment(SwingConstants.LEFT);
		lblcomoPuedoCambiar.setBounds(35, 0, 600, 64);
		lblcomoPuedoCambiar.setBackground(Color.WHITE);
		lblcomoPuedoCambiar.setFont(new Font("Verdana", Font.PLAIN, 20));
		panel.add(lblcomoPuedoCambiar);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(Soporte.class.getResource("/imagenes/angle-down-free-icon-font (3).png")));
		btnNewButton_1.setBackground(new Color(0, 0, 0, 0));
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setBounds(637, 0, 66, 64);
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 153, 153));
		panel_1.setBounds(133, 341, 703, 65);
		panel6.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblcomoPuedoCambiar_1 = new JLabel("\u00BFComo puedo cambiar mi nombre?");
		lblcomoPuedoCambiar_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblcomoPuedoCambiar_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblcomoPuedoCambiar_1.setBackground(Color.WHITE);
		lblcomoPuedoCambiar_1.setBounds(35, 0, 600, 65);
		panel_1.add(lblcomoPuedoCambiar_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(Soporte.class.getResource("/imagenes/angle-down-free-icon-font (3).png")));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(634, 0, 66, 64);
		panel_1.add(lblNewLabel_2_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 153, 153));
		panel_2.setBounds(133, 406, 703, 65);
		panel6.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblcomoPuedoCambiar_2 = new JLabel("\u00BFComo puedo cambiar mi nombre?");
		lblcomoPuedoCambiar_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblcomoPuedoCambiar_2.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblcomoPuedoCambiar_2.setBackground(Color.WHITE);
		lblcomoPuedoCambiar_2.setBounds(35, 0, 600, 65);
		panel_2.add(lblcomoPuedoCambiar_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon(Soporte.class.getResource("/imagenes/angle-down-free-icon-font (3).png")));
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setBounds(634, 1, 66, 64);
		panel_2.add(lblNewLabel_2_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 153, 153));
		panel_3.setBounds(133, 469, 703, 65);
		panel6.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblcomoPuedoCambiar_3 = new JLabel("\u00BFComo puedo cambiar mi nombre?");
		lblcomoPuedoCambiar_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblcomoPuedoCambiar_3.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblcomoPuedoCambiar_3.setBackground(Color.WHITE);
		lblcomoPuedoCambiar_3.setBounds(35, 0, 600, 65);
		panel_3.add(lblcomoPuedoCambiar_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setIcon(new ImageIcon(Soporte.class.getResource("/imagenes/angle-down-free-icon-font (3).png")));
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setBounds(634, 0, 66, 64);
		panel_3.add(lblNewLabel_2_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 0, 933, 69);
		panel_4.setBackground(new Color(255, 153, 153));
		panel6.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(10, 10, 40, 40);
		panel_4.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.cambioPantalla(7,2);
				
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 0, 0));
		btnNewButton.setOpaque(false);
		btnNewButton.setIcon(new ImageIcon(Soporte.class.getResource("/imagenes/undo-alt-free-icon-font (1).png")));
		
		JLabel lblNewLabel_1 = new JLabel("Soporte de SportsChoiche");
		lblNewLabel_1.setBounds(88, 10, 342, 40);
		panel_4.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 25));
		
		JLabel lblNewLabel_1_1 = new JLabel("Asistente");
		lblNewLabel_1_1.setBounds(770, 10, 153, 40);
		panel_4.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Verdana", Font.PLAIN, 25));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(133, 342, 703, 116);
		panel_5.setBackground(new Color(255, 218, 218));
		panel_5.setVisible(false);
		panel6.add(panel_5);
		panel_5.setLayout(null);
		
		JTextArea txtrSeguimosConLos = new JTextArea();
		txtrSeguimosConLos.setEditable(false);
		txtrSeguimosConLos.setBackground(new Color(255, 218, 218));
		txtrSeguimosConLos.setText("Seguimos con los versos perversos demuestro a todos que ejerzo De chico raro, con descaro, hijo de Amparo y de un tuerto Mi t\u00EDo es \r\nBerto, no Romero, no Tomillo. Ver todos los d\u00EDas al primo pillo, que pillaba fr\u00EDo y no se abriga Le suena la barriga, \u00BFdiga?\r\r\n\"Hello, I'm your belly, can you give me some comida?\" Mira, of course I can, y compro un caldo de AvecremSe creen ustedes que soy \r\nrico, rico el caldo, \u00A1Sabe bien! \u00BFSabes qu\u00E9 m\u00E1s sabe bien? Jeje, exacto Aunque parezca pintada por Goya, no es m\u00E1s que mi po-po-po \r\nPoci\u00F3n tra\u00EDda de Troya, la han tra\u00EDdo Luis, Bernardo, Ernesto En esto que me da por ver el m\u00F3vil; mensaje de texto\r\r\nResulta ser Felipe VI el remitente \"Lo siento, brother, tengo el casoncio lleno 'e gente\" No te rayes - le contesto - y, fuera de contexto");
		txtrSeguimosConLos.setBounds(0, 6, 703, 112);
		panel_5.add(txtrSeguimosConLos);
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtpnPregunta2.setVisible(false);
                txtpnPregunta3.setVisible(false);
                if (panel_5.isVisible()) {
                	panel_5.setVisible(false);
                    panel_1.setBounds(133, 341, 703, 65);
                    panel_2.setBounds(133, 406, 703, 65);
                    panel_3.setBounds(133, 469, 703, 65);
                    separator_1_1_1.setBounds(133, 468, 703, 3);
                    separator_1_1.setBounds(133, 405, 703, 3);
                    btnNewButton_1.setIcon(new ImageIcon(Soporte.class.getResource("/imagenes/angle-down-free-icon-font (3).png")));
                } else {
                	 panel_5.setVisible(true);
                     panel_1.setBounds(133, 453, 703, 65);
                     panel_2.setBounds(133, 518, 703, 65);
                     panel_3.setBounds(133, 581, 703, 65);
                     separator_1_1_1.setBounds(133, 580, 703, 3);
                     separator_1_1.setBounds(133, 517, 703, 3);
                     btnNewButton_1.setIcon(new ImageIcon(Soporte.class.getResource("/imagenes/angle-up-free-icon-font (1).png")));
                }
            }
        });
		
		
	}
}
