package pkg_person;

public class Student extends Person {
	private int rollNo;
	private int std;
	private String divison;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public String getDivison() {
		return divison;
	}
	public void setDivison(String divison) {
		this.divison = divison;
	}
	
	public Student(String name, String emailId, String phoneNumber, String address, String dob, int rollNo, int std,
			String divison) {
		super(name, emailId, phoneNumber, address, dob);
		this.rollNo = rollNo;
		this.std = std;
		this.divison = divison;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", std=" + std + ", divison=" + divison + ", name=" + name + ", emailId="
				+ emailId + ", phoneNumber=" + phoneNumber + ", address=" + address + ", dob=" + dob + "]";
	}	
	
	
}
