package MVC;
import java.io.File;
import java.sql.*;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

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
	
	
	
	
	private Vista vista;
	
	private String usr= "";
	private String pass= "";
	private String rol= "";

	
	public void setVista(Vista vista) {
		this.vista = vista;
	}
	
	public Modelo() {
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, login, pwd);
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
	
	public void ConexSQL() {
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, login, pwd);
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
	
	public int getPlayers(String NameEvent) {
		int players = 0;
		ResultSet resultado = null;
		try {
			PreparedStatement pstmt = conexion.prepareStatement("SELECT Players FROM Events WHERE EventName = ?");
			pstmt.setInt(1, 2);
			resultado = pstmt.executeQuery();
			players = resultado.getInt(2);
			pstmt.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return players;
	}
	
	public void seleccionaFichero () {
		File rutaProyecto = new File (System.getProperty("user.dir"));
		JFileChooser fc=new JFileChooser(rutaProyecto);
		fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.ini", "ini");
		fc.setFileFilter(filtro);
		int seleccion=fc.showOpenDialog(Config.getContentPane());
		if(seleccion==JFileChooser.APPROVE_OPTION){
		    File fichero=fc.getSelectedFile();
		    Config.textField_5.setText(fichero.getAbsolutePath());
		    Config.txtfUsuario.setText(fichero.getAbsolutePath());
		    Config.txtfNombBbdd.setText(fichero.getAbsolutePath());
		    Config.txtfContrasena.setText(fichero.getAbsolutePath());
		    Config.txtfPuerto.setText(fichero.getAbsolutePath());
		}
	}

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
}
