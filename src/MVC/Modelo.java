package MVC;
import java.sql.*;

public class Modelo {
	private String bd = "Proyecto_Integrador";
	private String login = "root";
	private String pwd = "";
	private String url = "jdbc:mysql://localhost/" + bd;
	private Connection conexion;
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
}
