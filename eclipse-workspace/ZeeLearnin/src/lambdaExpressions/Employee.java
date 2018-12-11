package lambdaExpressions;

public class Employee {
	private Integer empId;
	private String empName;
	private String country;
	
	public static int compareByCountry(Employee e1, Employee e2) {
		return e1.getCountry().compareTo(e2.getCountry());
	}
	
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
