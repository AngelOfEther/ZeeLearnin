package javaSE8.defaultnstatic;

public class PartTimeEmployee extends Employee{

	
	
	private double employeeSalary;

	@Override
	public double deductFoodFee() {
		// TODO Auto-generated method stub
		this.employeeSalary -= Remunerator.deductForPension(this.employeeSalary);
		return 0;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

}
