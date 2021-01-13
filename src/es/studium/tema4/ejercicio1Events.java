package es.studium.tema4;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ejercicio1Events implements WindowListener
{
	Frame ventana = new Frame("Conversión de Temperaturas");
	Label lblCel = new Label("Celsius");
	Label lblFar = new Label("Fahrenheit");
	TextField txtCel = new TextField(20);
	TextField txtFar = new TextField(20);
	Button btnCel = new Button("Celsius a Fahrenheit");
	Button btnFar = new Button("Fahrenheit a Celsius");
	
	
	public ejercicio1Events() {
		ventana.setLayout(new GridLayout(3,2));
		ventana.add(lblCel);
		ventana.add(txtCel);
		ventana.add(lblFar);
		ventana.add(txtFar);
		ventana.add(btnCel);
		ventana.add(btnFar);
		ventana.addWindowListener(this);
		ventana.setSize(500,180);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new ejercicio1Events();
	}

	@Override
	public void windowActivated(WindowEvent arg0){}

	@Override
	public void windowClosed(WindowEvent arg0){}

	@Override
	public void windowClosing(WindowEvent arg0){
		System.out.println("Usted cerro la ventana...");
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0){}

	@Override
	public void windowDeiconified(WindowEvent arg0){}

	@Override
	public void windowIconified(WindowEvent arg0){}

	@Override
	public void windowOpened(WindowEvent arg0){}

}
