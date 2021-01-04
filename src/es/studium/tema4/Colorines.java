package es.studium.tema4;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.util.Random;

public class Colorines
{
	Frame ventana = new Frame("Colorines");
	Color[] colores = {
		Color.red, Color.white, Color.blue, Color.cyan, Color.yellow, Color.pink, Color.gray, Color.green, Color.black
	};
	Random rnd = new Random();
	int posicion;
//	Button btnAceptar = new Button("Aceptar");

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
			
		ventana.setResizable(false);
		ventana.setVisible(true);
	
	}
	
	public static void main(String[] args)
	{
		new Colorines();
	}

}
