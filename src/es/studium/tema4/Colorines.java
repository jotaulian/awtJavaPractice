package es.studium.tema4;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

public class Colorines implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Colorines");
	Color[] colores = {
		Color.red, Color.white, Color.blue, Color.cyan, Color.yellow, Color.pink, Color.gray, Color.green, Color.black
	};
	Random rnd = new Random();
	int posicion;
	Button btnAceptar = new Button("Aceptar");

//	Constructor de la clase:
	public Colorines() {
		ventana.setBounds(50,50,300,200);
		ventana.setLayout(new GridLayout(3,3));
		for(int i=0;i<9;i++) {
			posicion = rnd.nextInt(9);
			Panel p = new Panel();
			p.setBackground(colores[posicion]);
			ventana.add(p);
		}
		btnAceptar.addActionListener(this);
		ventana.add(btnAceptar);
		ventana.addWindowListener(this);
		ventana.setResizable(false);
		ventana.setVisible(true);
	
	}
	

	@Override
	public void windowClosing(WindowEvent arg0)
	{
		System.out.println("Saliendo...");
		System.exit(0);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		System.out.println("Pulsaste el botón");
	}
	
	@Override
	public void windowActivated(WindowEvent arg0){}
	@Override
	public void windowClosed(WindowEvent arg0){}
	@Override
	public void windowDeactivated(WindowEvent arg0){}
	@Override
	public void windowDeiconified(WindowEvent arg0){}
	@Override
	public void windowIconified(WindowEvent arg0){}
	@Override
	public void windowOpened(WindowEvent arg0){}

	public static void main(String[] args)
	{
		new Colorines();
	}

}
