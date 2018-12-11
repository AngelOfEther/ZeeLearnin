package streams;

import java.util.Arrays;
import java.util.List;

public class Employee {
	
	public int id;
	public String name;
	private int sal;
	private double yearsInOrg;
	private String role;
	public enum Gender {MALE,FEMALE}
	private Gender gender;
	
	
	public Employee(int id, String name, int sal, double yearsInOrg, String role, Gender thegender) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.yearsInOrg = yearsInOrg;
		this.role = role;
		gender = thegender;
	}
	
	public static List<Employee> createEmpList(){
		return Arrays.asList(
				new Employee(1,"Devin",500000,1,"CEO",Gender.MALE),
				new Employee(2,"Mitch",400000,5,"CTO",Gender.MALE),
				new Employee(3,"David",400000,4,"CRO",Gender.MALE),
				new Employee(4,"Nora",350000,3,"COO",Gender.FEMALE),
				new Employee(5,"Logan",300000,1,"CDO",Gender.MALE),
				new Employee(6,"Brittany", 200000,4,"CFO",Gender.FEMALE),
				new Employee(7,"Archana",200000,6,"CCO",Gender.FEMALE));
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public double getYearsInOrg() {
		return yearsInOrg;
	}

	public void setYearsInOrg(double yearsInOrg) {
		this.yearsInOrg = yearsInOrg;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", yearsInOrg=" + yearsInOrg + ", role="
				+ role + ", gender=" + gender + "]";
	}
	
	
	
	
	

}
