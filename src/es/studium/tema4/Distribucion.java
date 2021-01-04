package es.studium.tema4;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextArea;
import java.awt.TextField;

public class Distribucion extends Frame
{
	private static final long serialVersionUID = 1L;
	//Añadimos componentes
	
	public Distribucion() {
		setTitle("Ejemplo GridBagLayout");
		setLayout(new GridBagLayout());
		
		TextArea txtArea = new TextArea("Area texto");
		GridBagConstraints cons = new GridBagConstraints();
		cons.gridx = 0; //El area de texto empieza en la columna cero.
		cons.gridy = 0; //El area de texto empieza en la fila cero.
		cons.gridwidth = 2; //El area de texto ocupa dos columnas.
		cons.gridheight = 2; //El area de texto ocupa dos filas.
		cons.weighty = 1.0; // La fila 0 debe estirarse, le ponemos un 1.0
		cons.fill = GridBagConstraints.BOTH; // Para que el componente se estire en ambas dimensiones
		add(txtArea, cons);
		// Restauramos al valor por defecto, para no afectar a los siguientes componentes
		cons.weighty = 0.0; 
		
		Button btn1 = new Button("Boton 2");
		cons.gridx = 2;
		cons.gridy = 0;
		cons.gridwidth = 1;
		cons.gridheight = 1;
		cons.anchor = GridBagConstraints.NORTH; //La posición que queremos que ocupe.
		cons.fill = GridBagConstraints.NONE;
		cons.weighty = 1.0; // Ya lo hicimos antes pero lo repetimos para que quede claro
		add(btn1, cons);
		// Restauramos al valor por defecto, para no afectar a los siguientes componentes
		cons.weighty = 0.0; 
		cons.anchor = GridBagConstraints.CENTER; 
		
		Button btnBoton2 = new Button ("Boton 2");
		cons.gridx = 2;
		cons.gridy = 1;
		cons.gridwidth = 1;
		cons.gridheight = 1;
		cons.weighty = 1.0; // Estiramos la fila uno.
		cons.anchor = GridBagConstraints.NORTH;
		add(btnBoton2, cons);
		// Restauramos al valor por defecto
		cons.weighty = 0.0; 
		
		Button btnBoton3 = new Button ("Boton 3");
		cons.gridx = 0;
		cons.gridy = 2;
		cons.gridwidth = 1;
		cons.gridheight = 1;
		add(btnBoton3, cons);
		
		Button btnBoton4 = new Button ("Boton 4");
		cons.gridx = 2;
		cons.gridy = 2;
		cons.gridwidth = 1;
		cons.gridheight = 1;
		add(btnBoton4, cons);

		TextField txtCampo = new TextField("Campo de texto");
		cons.gridx = 1;
		cons.gridy = 2;
		cons.gridwidth = 1;
		cons.gridheight = 1;
		cons.weightx = 1.0;
		cons.fill = GridBagConstraints.HORIZONTAL;
		add(txtCampo, cons);
		
		setSize(600,250);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Distribucion();
	}

}
