package Main;
import javax.swing.JFrame;

import Admin.PantallaAdmin;
import MVC.Controlador;
import MVC.Modelo;
import MVC.Vista;
import Usuario.CreateEventWindow;
import Usuario.EventsWindow;
import Usuario.InicioSesion;
import Usuario.PantallaInicio;
import Usuario.PantallaInicioFriends;
import Usuario.PantallaInicioUsuario;
import Usuario.PartidoFutbol;
import Usuario.PartidoTenis;
import Usuario.PerfilUsuario;
import Usuario.Registro;
import Usuario.Soporte;
import Usuario.SportsWindow;
import Usuario.TorneoPadel;

import java.sql.*;
public class Main {

	public static void main(String[] args) {
		Vista vista = new Vista();
		Modelo modelo = new Modelo();
		Controlador controlador = new Controlador();
		
		
		InicioSesion login = new InicioSesion();
		Registro register = new Registro();
		PantallaInicio home = new PantallaInicio();
		PantallaInicioUsuario homeUser = new PantallaInicioUsuario();
		PantallaInicioFriends homeFriends = new PantallaInicioFriends();
		EventsWindow events = new EventsWindow();
		CreateEventWindow createEvent = new CreateEventWindow();
		Soporte support = new Soporte();
		SportsWindow sport = new SportsWindow();
		PerfilUsuario user = new PerfilUsuario();
		PantallaAdmin admin = new PantallaAdmin();
		TorneoPadel torneo = new TorneoPadel();
		PartidoTenis partidoTenis = new PartidoTenis();
		PartidoFutbol partidoFutbol = new PartidoFutbol();
		
		
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
		controlador.setEventsWindow(events);
		controlador.setCreateEventWindow(createEvent);
		controlador.setSoporte(support);
		controlador.setSportsWindow(sport);
		controlador.setPerfilUsuario(user);
		controlador.setPantallaAdmin(admin);
		controlador.setPartidoFutbol(partidoFutbol);
		controlador.setPartidoTenis(partidoTenis);
		controlador.setTorneoPadel(torneo);
		
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
		partidoFutbol.setControlador(controlador);
		partidoTenis.setControlador(controlador);
		torneo.setControlador(controlador);
		
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
		partidoFutbol.setModelo(modelo);
		partidoTenis.setModelo(modelo);
		torneo.setModelo(modelo);
		
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
				partidoFutbol,
				partidoTenis,
				torneo};
		controlador.setPantallas(pantallas);
		
		login.setVisible(true);
	}
	

}
