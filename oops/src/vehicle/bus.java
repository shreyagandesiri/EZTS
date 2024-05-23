package vehicle;

public class bus extends master {
	private int seat_cap;

	public bus(int model, int engine, String color, int seat_cap) {
		super(model, engine, color);
		this.seat_cap = seat_cap;
	}

	@Override
	public String toString() {
		return "bus [seat_cap=" + seat_cap + ", toString()=" + super.toString() +"]";
		
	}
	
	void busout() {
		super.masterout();
		System.out.println("seat_cap=" +seat_cap);
	}

}
