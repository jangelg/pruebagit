package modelo;

public class Mundo {
	private Superman superman;
	private Bird bird;
	private Airplane avion;
	private seaPlane seaplane;
	private Helicopter helicopter;
	private String dato;
	private String dato2;
	public Mundo() 
	{
		superman= new Superman();
		bird=new Bird();
		avion= new Airplane();
		seaplane=new seaPlane();
		helicopter=new Helicopter();
		superman.Fly();
		superman.LeapBuilding();
		superman.stopBullet();
		superman.takeoff();
		bird.eat();
		bird.layEggs();
		bird.land();
		bird.takeoff();
		seaplane.Fly();
		seaplane.land();
		helicopter.Fly();
		helicopter.land();
		dato="";
		dato2="";
	}

	public String getDato() {
		return dato;
	}


	//setter para el atributo ejemplo
	public void setDato(String dato) {
		this.dato = dato;
	}



	/* metodo que realiza un proceso basado en un atributo dato (ejemplo)  
	 * Reemplazar por lo que se necesiten
	 */
	public void procesarDato() {
		this.dato = this.dato + " No es un pajaro, Ni un avion es superman";
	}
	public String getDato2() {
		return dato;
	}


	//setter para el atributo ejemplo
	public void setDato2(String dato2) {
		this.dato = dato2;
	}



	/* metodo que realiza un proceso basado en un atributo dato (ejemplo)  
	 * Reemplazar por lo que se necesiten
	 */
	public void procesarDato2() {
		this.dato2 = this.dato2 + " No es un pajaro, Ni un avion es un Helicoptero";
	}
	




}
