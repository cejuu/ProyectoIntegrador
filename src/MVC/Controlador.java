package MVC;
import javax.swing.JFrame;

import Admin.PantallaAdmin;
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

public class Controlador{
		private Modelo modelo;
		private Vista vista;
		private InicioSesion InicioSesion;
		private Registro Registro;
		private PantallaInicio PantallaInicio;
		private PantallaInicioUsuario PantallaInicioUsuario;
		private PantallaInicioFriends PantallaInicioFriends;
		private EventsWindow EventsWindow;
		private CreateEventWindow CreateEventWindow;
		private Soporte Soporte;
		private SportsWindow SportsWindow;
		private PerfilUsuario PerfilUsuario;
		private PantallaAdmin PantallaAdmin;
		private TorneoPadel TorneoPadel;
		private PartidoTenis PartidoTenis;
		private PartidoFutbol PartidoFutbol;
		
		public void setModelo(Modelo modelo) {
			this.modelo = modelo;
		}
		public void setVista(Vista vista) {
			this.vista = vista;
		}
		public void setInicioSesion(InicioSesion inicioSesion) {
			InicioSesion = inicioSesion;
		}
		public void setRegistro(Registro registro) {
			Registro = registro;
		}
		public void setPantallaInicio(PantallaInicio pantallaInicio) {
			PantallaInicio = pantallaInicio;
		}
		public void setPantallaInicioUsuario(PantallaInicioUsuario pantallaInicioUsuario) {
			PantallaInicioUsuario = pantallaInicioUsuario;
		}
		public void setPantallaInicioFriends(PantallaInicioFriends pantallaInicioFriends) {
			PantallaInicioFriends = pantallaInicioFriends;
		}
		public void setEventsWindow(EventsWindow eventsWindow) {
			EventsWindow = eventsWindow;
		}
		public void setCreateEventWindow(CreateEventWindow createEventWindow) {
			CreateEventWindow = createEventWindow;
		}
		public void setSoporte(Soporte soporte) {
			Soporte = soporte;
		}
		public void setSportsWindow(SportsWindow sportsWindow) {
			SportsWindow = sportsWindow;
		}
		public void setPerfilUsuario(PerfilUsuario perfilUsuario) {
			PerfilUsuario = perfilUsuario;
		}
		public void setPantallaAdmin(PantallaAdmin pantallaAdmin) {
			PantallaAdmin = pantallaAdmin;
		}
		public void setTorneoPadel(TorneoPadel torneoPadel) {
			TorneoPadel = torneoPadel;
		}
		public void setPartidoTenis(PartidoTenis partidoTenis) {
			PartidoTenis = partidoTenis;
		}
		public void setPartidoFutbol(PartidoFutbol partidoFutbol) {
			PartidoFutbol = partidoFutbol;
		}
		JFrame[] pantallas = {
				InicioSesion, 
				Registro, 
				PantallaInicio, 
				PantallaInicioUsuario, 
				PantallaInicioFriends, 
				EventsWindow, 
				CreateEventWindow, 
				Soporte, 
				SportsWindow, 
				PerfilUsuario, 
				PantallaAdmin,
				PartidoFutbol,
				PartidoTenis,
				TorneoPadel};
		
		public void cambioPantalla(int p1, int p2) {
			pantallas[p1].setVisible(false);
			pantallas[p2].setVisible(true);
		}
		
		public void setPantallas(JFrame [] pantallas) {
			for(int i = 0; i < pantallas.length; i++) {
				this.pantallas[i] = pantallas[i];
			}
		}
		
}


