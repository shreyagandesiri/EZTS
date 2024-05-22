package hospital;

public class person {
	private String name;
	private int age;
	private String gender;
	
	public person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	void hospitaldata() {
		System.out.println("name =" +name);
		System.out.println("age=" +age);
		System.out.println("gender=" +gender);
	}
	
	

}
