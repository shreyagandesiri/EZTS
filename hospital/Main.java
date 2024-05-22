package hospital;

public class Main {
	public static void main(String[] args) {
		person hospital=new person("somu", 23, "male");
		System.out.println(hospital.toString());
		hospital.hospitaldata();
		
		doctor d= new doctor("ramu",35,"male","dentist");
		System.out.println(d.toString());
		d.doctordata();
		
		patient p=new patient("sai",25,"male","malaria",4);
		System.out.println(p.toString());
		p.patientdata();
		
		nurse n=new nurse("rama",45,"female",5,6);
		System.out.println(n.toString());
		n.nursedata();
				
	}

}
