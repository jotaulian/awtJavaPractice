package es.studium.tema4;

import java.awt.*;

public class AwtBorder extends Frame
{
	private static final long serialVersionUID = 1L;
	Button btnBotonN = new Button("Norte");
	Button btnBotonS = new Button("Sur");
	Button btnBotonE = new Button("Este");
	Button btnBotonO = new Button("Oeste");
	Button btn = new Button("Kace");
	Panel pnl = new Panel();
	
	public AwtBorder() {
		setLayout(new BorderLayout());
		setTitle("The old BorderLayout NEWSC");
		
		//Añadimos los botones
		add("North",btnBotonN);
		add("South",btnBotonS);
		add("East",btnBotonE);
		add("West",btnBotonO);
		pnl.add(btn);
		add(pnl);
		
		setSize(300,300);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new AwtBorder();
	}
}
