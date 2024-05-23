package vehicle;

public class car extends master {
	private String fuel_type;

	public car(int model, int engine, String color, String fuel_type) {
		super(model, engine, color);
		this.fuel_type = fuel_type;
	}

	@Override
	public String toString() {
		return "car [fuel_type=" + fuel_type + ", toString()=" + super.toString() + "]";
	}
	void carout() {
		super.masterout();
		System.out.println("fuel_type=" +fuel_type);
	}
	

}
