package hospital;

public class patient extends person {
	private String disease;
	private int bed_no;
	
	public patient(String name, int age, String gender, String disease, int bed_no) {
		super(name, age, gender);
		this.disease = disease;
		this.bed_no = bed_no;	
	}

	@Override
	public String toString() {
		return "patient [disease=" + disease + ", bed_no=" + bed_no + "]";
	}
	
	void patientdata() {
		super.hospitaldata();
		System.out.println("disease =" +disease);
		System.out.println("bed_no ="+bed_no);
		
	}
	
	

}
