package hospital;

public class doctor extends person {
	private String Speciality;

	public doctor(String name, int age, String gender, String speciality) {
		super(name, age, gender);
		Speciality = speciality;
	}

	@Override
	public String toString() {
		return "doctor [Speciality=" + Speciality + "]";
	}
	
	void doctordata() {
		super.hospitaldata();
		System.out.println("Speciality =" +Speciality);
	}

}
