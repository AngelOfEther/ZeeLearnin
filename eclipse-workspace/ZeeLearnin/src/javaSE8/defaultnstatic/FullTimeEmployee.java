package javaSE8.defaultnstatic;

public class FullTimeEmployee extends Employee {
	
	private double employeeSalary;

	@Override
	public double deductFoodFee() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public double deductHealthInsurancePremium() {
		return (HEALTH_INSURANCE_PERCENTAGE * employeeSalary) / 100;
	}

}
