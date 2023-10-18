public class Main {

	public static void main(String[] args) {
		
		String employeeName = "Peter Medison";
		int grossSalary = 20000;
		double stateTaxes = (grossSalary / 100) * 28.4;
		double personalTax = 0;
			if((grossSalary - stateTaxes - 7000) > 0) {
				personalTax = (grossSalary - stateTaxes - 7000) / 100 * 10;
			}else {
				personalTax= 0;
			}
		double netSalary = grossSalary - stateTaxes - personalTax;
		
		stateTaxes = Math.round(stateTaxes);
		personalTax = Math.round(personalTax);
		netSalary = Math.round(netSalary);
		
		System.out.println("The employee: " + employeeName + "with Gross salary of: " + grossSalary + "MKD. will get NET salary:" + netSalary + " MKD.");
		System.out.println("State taxes are: " + stateTaxes + " MKD.");
		System.out.println("Personal tax is: " + personalTax + " MKD.");
	}
}
