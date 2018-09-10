package modelo;

public class Bird extends Animal  implements Flyer {
private String construirnido;
private String dejarhuevos;


	@Override
	public void takeoff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	public String buildNest() 
	{
		return construirnido;
		
	}
	public String layEggs() 
	{
		return dejarhuevos;
		
	}

}
