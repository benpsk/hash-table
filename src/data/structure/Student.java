package data.structure;

public class Student {

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNrc() {
		return nrc;
	}

	public void setNrc(String nrc) {
		this.nrc = nrc;
	}

	private int rollNo;
	private String name;
	private String nrc;

	public Student(int rollNo, String name, String nrc) {
		this.rollNo = rollNo;
		this.name = name;
		this.nrc = nrc;
	}

	@Override
	public String toString() {
		return "Student [rollNo = " + rollNo + ", name = " + name + ", nrc = " + nrc + "]";
	}

}
