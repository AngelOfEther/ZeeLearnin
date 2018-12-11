
public class Student {
	
	private int studentId = 1001;
	private String name = "Jacob";
	private float qualifyingExamMarks = 80;
	private char residentialStatus;
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", qualifyingExamMarks=" + qualifyingExamMarks
				+ ", residentialStatus=" + residentialStatus + ", yearOfEngg=" + yearOfEngg + "]";
	}
	
	public Student(int studentId, String name, float qualifyingExamMarks, char residentialStatus, int yearOfEngg) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.qualifyingExamMarks = qualifyingExamMarks;
		this.residentialStatus = residentialStatus;
		this.yearOfEngg = yearOfEngg;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getQualifyingExamMarks() {
		return qualifyingExamMarks;
	}
	public void setQualifyingExamMarks(float qualifyingExamMarks) {
		this.qualifyingExamMarks = qualifyingExamMarks;
	}
	public char getResidentialStatus() {
		return residentialStatus;
	}
	public void setResidentialStatus(char residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
	public int getYearOfEngg() {
		return yearOfEngg;
	}
	public void setYearOfEngg(int yearOfEngg) {
		this.yearOfEngg = yearOfEngg;
	}
	private int yearOfEngg = 3;
	
	

}
