package javaSE8.defaultnstatic;

public interface Remunerator {
	public abstract double deductFoodFee();
	public final double HEALTH_INSURANCE_PERCENTAGE = 5.0;
	final double PENSION_PERCENTAGE = 5.0;
	
	public default double deductHealthInsurancePremium() {
		return 0;
	};
	
	public static double deductForPension(double employeeSalary) {
		return(employeeSalary * PENSION_PERCENTAGE / 100);
	}
	

}
