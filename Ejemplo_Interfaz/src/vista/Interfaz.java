package vista;

import javax.swing.JOptionPane;

public class Interfaz {

	public void escribirDato(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, "El hombre de acero", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public String pedirDato() 
	{
		return (JOptionPane.showInputDialog(null,"Escribe superman","Hola",JOptionPane.INFORMATION_MESSAGE));
	}
    
	
	public void escribirDato2(String dato2) 
	{
		JOptionPane.showMessageDialog(null, dato2, "Es un Helicoptero", JOptionPane.INFORMATION_MESSAGE);
	}
	public String pedirDato2() 
	{
		return (JOptionPane.showInputDialog(null,"Escribe Helicoptero"," Helicoptero ",JOptionPane.INFORMATION_MESSAGE));
	}
}
