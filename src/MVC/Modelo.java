package MVC;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;
import java.util.Properties;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import Admin.PantallaAdmin;
import Usuario.Config;
import Usuario.CreateEventWindow;
import Usuario.EventsWindow;
import Usuario.EventsWindow2;
import Usuario.InicioSesion;
import Usuario.PantallaInicio;
import Usuario.PantallaInicioFriends;
import Usuario.PantallaInicioUsuario;
import Usuario.PerfilUsuario;
import Usuario.Registro;
import Usuario.Soporte;
import Usuario.SportsWindow;
import Usuario.infoevento;

public class Modelo {
	private String bd = "PI";
	private String login = "root";
	private String pwd = "";
	private String url = "jdbc:mysql://localhost/" + bd;
	private Connection conexion;
	
	private PantallaAdmin admin;
	private Config config;
	private CreateEventWindow createEvents;
	private EventsWindow events;
	private EventsWindow2 events2;
	private infoevento infoevent;
	private InicioSesion inicses;
	private PantallaInicio home;
	private PantallaInicioFriends amigos;
	private PantallaInicioUsuario user;
	private PerfilUsuario userProfile;
	private Registro register;
	private Soporte support;
	private SportsWindow sports;
	private Properties propconfig;
	private File fichero;
	private InputStream entrada;
	private OutputStream salida;
	private String respuesta;
	private final String ficheroConf = "bbdd.ini";
	private String sqlTablaEventos = "Select * from eventos";
	private String sqlTablaUsuario = "Select * from usuario";
	private DefaultTableModel table1;
	private DefaultTableModel table2;
	
	
	private Vista vista;
	
	private String usr= "";
	private String pass= "";
	private String rol= "";
	
	public void setPwdBBDD(String usuario) {
		this.pwd=usuario;
	}
	
	public String getPwdBBDD() {
		return this.pwd;
	}
	public void setUsrBBDD(String usuario) {
		this.login=usuario;
	}
	
	public String getUsrBBDD() {
		return this.login;
	}
	
	public void setNameBBDD(String usuario) {
		this.bd=usuario;
	}
	
	public String getNameBBDD() {
		return this.bd;
	}
	

	
	public void setVista(Vista vista) {
		this.vista = vista;
	}
	
	public Modelo() {
		propconfig = new Properties();
		try {
			
			fichero = new File(ficheroConf);
			if (fichero.exists()) {
				
				entrada = new FileInputStream(fichero);
				propconfig.load(entrada);
				
			} else {
				
				System.err.println("No encontrado");
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
    }
	
	public void ConexSQL() {
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(propconfig.getProperty("bd"), propconfig.getProperty("login"), propconfig.getProperty("pwd"));
            System.out.println(" - Conexion con MySQL establecida -");
//            if (conexion != null) {
            // System.out.println("Conexion a la bd" + url + "...ok!!!");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Driver JDBC no encontrado");
            cnfe.printStackTrace();
        } catch (SQLException sqle) {
            System.out.println("Error al conectarte a la DB");
            sqle.printStackTrace();
        } catch (Exception e) {
            System.out.println("- Error de Conexion con MySQL -");
            e.printStackTrace();
        }
	}
	
	public String LoginSQL(String query, String usr, String NumColumn) {
		ResultSet resultado = null;
		String resul = "";
		try {
			PreparedStatement pstmt = conexion.prepareStatement(query);
			pstmt.setString(1, usr);
			resultado = pstmt.executeQuery();
			resul = resultado.getString(NumColumn);
			pstmt.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return resul;
	}
	
	
	public boolean comprobarContra(String usuario, String contrasena) {
		this.pass = LoginSQL("SELECT contrasena FROM Usuario WHERE NombreUsuario = ?",usuario,"NombreUsuario");
		
		if(contrasena.equals(pass)) {
			return true;	
		}else {
		return false;
		}
	}
	
	//public int getPlayers(String NameEvent) {
		//int players = 0;
		//ResultSet resultado = null;
		//try {
			//PreparedStatement pstmt = conexion.prepareStatement("SELECT Players FROM Events WHERE EventName = ?");
			//pstmt.setInt(1, 2);
			//resultado = pstmt.executeQuery();
			//players = resultado.getInt(2);
			//pstmt.close();
		//} catch (SQLException e) {
			//System.err.println(e.getMessage());
		//}
		//return players;
	//}
	
	

	public void setAdmin(PantallaAdmin admin) {
		this.admin = admin;
	}

	public void setConfig(Config config) {
		this.config = config;
	}

	public void setCreateEvents(CreateEventWindow createEvents) {
		this.createEvents = createEvents;
	}

	public void setEvents(EventsWindow events) {
		this.events = events;
	}

	public void setEvents2(EventsWindow2 events2) {
		this.events2 = events2;
	}

	public void setInfoevent(infoevento infoevent) {
		this.infoevent = infoevent;
	}

	public void setInicses(InicioSesion inicses) {
		this.inicses = inicses;
	}

	public void setHome(PantallaInicio home) {
		this.home = home;
	}

	public void setAmigos(PantallaInicioFriends amigos) {
		this.amigos = amigos;
	}

	public void setUser(PantallaInicioUsuario user) {
		this.user = user;
	}

	public void setUserProfile(PerfilUsuario userProfile) {
		this.userProfile = userProfile;
	}

	public void setRegister(Registro register) {
		this.register = register;
	}

	public void setSports(SportsWindow sports) {
		this.sports = sports;
	}

	public Properties getPropconfig() {
		return propconfig;
	}

	public void setPropconfig(Properties propconfig) {
		this.propconfig = propconfig;
	}
	
	public void guardar(String[] datosConexion, String[] keys) {
		try {
			
			for(int i = 0; i < keys.length; i++) {
				propconfig.setProperty(keys[i], datosConexion[i]);
				salida = new FileOutputStream(fichero);
				propconfig.store(salida, "Guardado");
				respuesta = "Guardado";
			}
			
		}catch(Exception e){
			
		}
	}
	
	public void cargarTablaEventos() {
		table1 = new DefaultTableModel();
		int numColumnas = getNumColumnas(sqlTablaEventos);
		Object[] contenido = new Object[numColumnas];
		PreparedStatement pstmt;
		try {
			pstmt = conexion.prepareStatement(sqlTablaEventos);
			ResultSet rset = pstmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			for (int i = 0; i < numColumnas; i++) {
				table1.addColumn(rsmd.getColumnName(i+1));
			}
			while (rset.next()) {
				for (int col = 1; col <= numColumnas; col++) {
					contenido[col - 1] = rset.getString(col);
				}
				table1.addRow(contenido);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void cargarTablaUsuario() {
		table2 = new DefaultTableModel();
		int numColumnas = getNumColumnas(sqlTablaUsuario);
		Object[] contenido = new Object[numColumnas];
		PreparedStatement pstmt;
		try {
			pstmt = conexion.prepareStatement(sqlTablaUsuario);
			ResultSet rset = pstmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			for (int i = 0; i < numColumnas; i++) {
				table2.addColumn(rsmd.getColumnName(i+1));
			}
			while (rset.next()) {
				for (int col = 1; col <= numColumnas; col++) {
					contenido[col - 1] = rset.getString(col);
				}
				table2.addRow(contenido);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	private int getNumColumnas(String sql) {
		int num = 0;
		try {
			PreparedStatement pstmt = conexion.prepareStatement(sql);
			ResultSet rset = pstmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			num = rsmd.getColumnCount();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}

	private int getNumFilas(String sql) {
		int numFilas = 0;
		try {
			PreparedStatement pstmt = conexion.prepareStatement(sql);
			ResultSet rset = pstmt.executeQuery();
			while (rset.next())
				numFilas++;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return numFilas;
	}

	public DefaultTableModel getTabla1() {
		return table1;
	}
	
	public DefaultTableModel getTabla2() {
		return table2;
	}
	
}
