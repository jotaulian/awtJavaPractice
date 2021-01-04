package es.studium.tema4;

import java.awt.*;

public class awtCard extends Frame
{
	private static final long serialVersionUID = 1L;  
	
	Panel pnlCard = new Panel();
	Panel pnlAc = new Panel();
	
	Choice choC = new Choice();
	
	final static String strPnlBtn = "Panel con Botones";
	final static String strPnlTxt = "Panel con Campo de Texto";
	
	//Creamos otros dos panels que irán dentro del Panel card
	Panel pnlP1 = new Panel();
	Panel pnlP2 = new Panel();
	
	Button btnB1 = new Button("Botón 1");
	Button btnB2 = new Button("Botón 2");
	Button btnB3 = new Button("Botón 3");
	TextField txtTexto = new TextField("Texto",20); //Campo de texto
	
	public awtCard() {
		setLayout(new BorderLayout());
		
		//Añadimos elementos al choice
		choC.add(strPnlBtn);
		choC.add(strPnlTxt);
		pnlAc.add(choC); //Añadimos choice al panel pnlAc
		add("North",pnlAc);
		
		pnlCard.setLayout(new CardLayout());
		//Añadir botones al panel pnlP1
		pnlP1.add(btnB1);
		pnlP1.add(btnB2);
		pnlP1.add(btnB3);
		
		//Añadir TextField al panel pnlP2
		pnlP2.add(txtTexto);
		
		//Añadir los panels pnlP1 y pnlP2 al panel pnlCard
		pnlCard.add(strPnlTxt,pnlP2);
		pnlCard.add(strPnlBtn,pnlP1);
		
		//Añadir el panel pnlCard al Frame en el centro
		add("Center", pnlCard);
		
		setSize(300,300);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	public static void main(String[] args)
	{
		new awtCard();
	}

}
