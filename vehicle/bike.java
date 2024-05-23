package vehicle;

public class bike extends master {
	private String Type;

	public bike(int model, int engine, String color, String type) {
		super(model, engine, color);
		Type = type;
	}

	//@Override
	//public String toString() {
	//	return "bike [Type=" + Type + ", toString()=" + super.toString() + "]";
	//}

	@Override
	public String toString() {
		return "bike [Type=" + Type + "]";
	}
	
	void bikeout() {
		super.masterout();
		System.out.println("Type =" +Type);
	}
	
}
