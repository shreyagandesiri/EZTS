package hospital;

public class nurse extends person {
	private int roomno;
	private int floorno;
	
	
	public nurse(String name, int age, String gender, int roomno, int floorno) {
		super(name, age, gender);
		this.roomno = roomno;
		this.floorno = floorno;
	}


	@Override
	public String toString() {
		return "nurse [roomno=" + roomno + ", floorno=" + floorno + "]";
	}
	
	void nursedata() {
		super.hospitaldata();
		System.out.println("roomno =" +roomno);
		System.out.println("floorno =" +floorno);
	}
	

}
