package es.studium.tema4;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class AwtFlow
{

	
//		Componentes
		Frame ventana = new Frame(); //Contenedor
		Button btnAceptar = new Button("Aceptar");
		Button btnCerrar = new Button("Cerrar");
		Button btnGuardar = new Button("Guardar");
		
		public AwtFlow() {
			ventana.setTitle("FlowLayout");
			ventana.setLayout(new FlowLayout());
			ventana.setSize(260, 200);
//			ventana.setResizable(false);
			ventana.setLocationRelativeTo(null);
			
			ventana.add(btnAceptar);
			ventana.add(btnCerrar);
			ventana.add(btnGuardar);
			ventana.setVisible(true);
		}
		
		public static void main(String[] args)
		{
			new AwtFlow();
		}

}
