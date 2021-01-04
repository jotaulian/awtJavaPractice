package es.studium.tema4;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class Ejercicio1
{
	Frame ventana = new Frame("Conversión de Temperaturas");
	Label lblCel = new Label("Celsius");
	Label lblFar = new Label("Fahrenheit");
	TextField txtCel = new TextField(20);
	TextField txtFar = new TextField(20);
	Button btnCel = new Button("Celsius a Fahrenheit");
	Button btnFar = new Button("Fahrenheit a Celsius");
	
	
	public Ejercicio1() {
		ventana.setLayout(new GridLayout(3,2));
		ventana.add(lblCel);
		ventana.add(txtCel);
		ventana.add(lblFar);
		ventana.add(txtFar);
		ventana.add(btnCel);
		ventana.add(btnFar);
		ventana.setSize(500,180);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Ejercicio1();
	}

}
