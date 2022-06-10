package Main;
import javax.swing.JFrame;

import Admin.PantallaAdmin;
import MVC.Controlador;
import MVC.Modelo;
import MVC.Vista;
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
import Usuario.Config;

import java.sql.*;
public class Main {

	public static void main(String[] args) {
		Vista vista = new Vista();
		Modelo modelo = new Modelo();
		Controlador controlador = new Controlador();
		
		Config configuracion = new Config();
		InicioSesion login = new InicioSesion();
		Registro register = new Registro();
		PantallaInicio home = new PantallaInicio();
		PantallaInicioUsuario homeUser = new PantallaInicioUsuario();
		PantallaInicioFriends homeFriends = new PantallaInicioFriends();
		EventsWindow2 events = new EventsWindow2();
		CreateEventWindow createEvent = new CreateEventWindow();
		Soporte support = new Soporte();
		SportsWindow sport = new SportsWindow();
		PerfilUsuario user = new PerfilUsuario();
		PantallaAdmin admin = new PantallaAdmin();
		infoevento torneo = new infoevento();
		
		
		modelo.setVista(vista);
		
		vista.setControlador(controlador);
		vista.setModelo(modelo);
		
		controlador.setModelo(modelo);
		controlador.setVista(vista);
		controlador.setInicioSesion(login);
		controlador.setRegistro(register);
		controlador.setPantallaInicio(home);
		controlador.setPantallaInicioUsuario(homeUser);
		controlador.setPantallaInicioFriends(homeFriends);
		controlador.setEventsWindow2(events);
		controlador.setCreateEventWindow(createEvent);
		controlador.setSoporte(support);
		controlador.setSportsWindow(sport);
		controlador.setPerfilUsuario(user);
		controlador.setPantallaAdmin(admin);
		controlador.setinfoevento(torneo);
		controlador.setConfiguracion(configuracion);
		
		login.setControlador(controlador);
		register.setControlador(controlador);
		home.setControlador(controlador);
		homeUser.setControlador(controlador);
		homeFriends.setControlador(controlador);
		events.setControlador(controlador);
		createEvent.setControlador(controlador);
		support.setControlador(controlador);
		sport.setControlador(controlador);
		user.setControlador(controlador);
		admin.setControlador(controlador);
		torneo.setControlador(controlador);
		configuracion.setControlador(controlador);
		
		login.setModelo(modelo);
		register.setModelo(modelo);
		home.setModelo(modelo);
		homeUser.setModelo(modelo);
		homeFriends.setModelo(modelo);
		events.setModelo(modelo);
		createEvent.setModelo(modelo);
		support.setModelo(modelo);
		sport.setModelo(modelo);
		user.setModelo(modelo);
		admin.setModelo(modelo);
		torneo.setModelo(modelo);
		configuracion.setModelo(modelo);
		
		JFrame[] pantallas = {
				login, 
				register, 
				home, 
				homeUser, 
				homeFriends, 
				events, 
				createEvent, 
				support, 
				sport, 
				user, 
				admin,
				torneo,
				configuracion};
		controlador.setPantallas(pantallas);
		
		login.setVisible(true);
	}
	

}
