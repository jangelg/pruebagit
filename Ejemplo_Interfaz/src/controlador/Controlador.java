package controlador;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador {
	private Mundo bd;
	private Interfaz gui;
public Controlador() 
{
	
	bd=new Mundo();
	gui=new Interfaz();
	bd.setDato(gui.pedirDato());
	bd.procesarDato();
	gui.escribirDato(bd.getDato());
	bd.setDato2(gui.pedirDato2());
	bd.procesarDato2();
	gui.escribirDato2(bd.getDato2());
}


}
