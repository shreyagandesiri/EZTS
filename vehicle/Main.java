package vehicle;

public class Main {

	public static void main(String[] args) {
		
		master vehicle = new master(2010,999,"red");
		System.out.println(vehicle.toString());
		vehicle.masterout();
		
		bike b=new bike(2010,99,"blue","Sports");
		System.out.println(b.toString());
		b.bikeout();
		
		car c=new car(2012,98,"white","diesel");
		System.out.println(c.toString());
		c.carout();
		
		bus d=new bus(2002,992,"Red",60);
		System.out.println(d.toString());
		d.busout();

	}

}
