package es.studium.tema4;

import java.awt.*;

public class flowLayoutTeoria extends Frame
{

	private static final long serialVersionUID = 1L;
	
	Button btnAceptar = new Button("Aceptar");
	Button btnCancelar = new Button("Cancelar");
	Button btnAbrir = new Button("Abrir");
	
	public flowLayoutTeoria(){
		setLayout(new FlowLayout()); //Distribucion del Frame
		setTitle("Prueba"); 		 //Titulo
		
		//Agregamos los botones
		add(btnAceptar);
		add(btnCancelar);
		add(btnAbrir);
		
		setSize(200,200); 			//Establecemos tamaño del Frame
		setLocationRelativeTo(null);//Centra la ventana en la pantalla
		
		//Mostramos el Frame en la pantalla
		setVisible(true);
	}
	
	//Método Main. Es el método que se ejecutará en primer lugar
	public static void main(String[] args)
	{
		new flowLayoutTeoria();
	}

}
