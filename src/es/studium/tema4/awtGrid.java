package es.studium.tema4;

import java.awt.*;

public class awtGrid extends Frame
{
	private static final long serialVersionUID = 1L;
	Button btnBoton1 = new Button("1");
	Button btnBoton2 = new Button("2");
	Button btnBoton3 = new Button("3");
	Button btnBoton4 = new Button("4");
	Button btnBoton5 = new Button("5");
	Button btnBoton6 = new Button("6");
	
	public awtGrid() {
		setLayout(new GridLayout(3,2));
		add(btnBoton1);
		add(btnBoton2);
		add(btnBoton3);
		add(btnBoton4);
		add(btnBoton5);
		add(btnBoton6);
		setSize(300,300);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new awtGrid();
	}

}
