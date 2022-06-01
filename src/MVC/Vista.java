package MVC;
import javax.swing.JFrame;

public class Vista extends JFrame{
		private Controlador controlador;
		private Modelo modelo;
		
		public void setControlador(Controlador controlador) {
			this.controlador = controlador;
		}
		public void setModelo(Modelo modelo) {
			this.modelo = modelo;
		}

		
}
