
public class Paycheck {
	
	private static final double STATETAX = 9.87;
	private static final double FEDERALTAX = 10.11;
	private static final double MEDICARE = 5.0;
	private double grossAmount;
	private double stateTaxAmount;
	private double federalTaxAmount;
	private double medicareAmount;
	private double toBePaidAmount;
	private Employee emp;
	
	public Paycheck(Employee emp)
	{
		this.emp = emp;
	}
	
	public double getGrossAmount() {
		return grossAmount;
	}
	
	//gross amount should be set here only
	private void setGrossAmount(double grossAmount) {
		this.grossAmount = Math.round(grossAmount * 100.00) / 100.00;
	}
	
	public double getStateTaxAmount() {
		return stateTaxAmount;
	}

	public void setStateTaxAmount(double stateTaxAmount) {
		this.stateTaxAmount = stateTaxAmount;
	}

	public double getFederalTaxAmount() {
		return federalTaxAmount;
	}

	public void setFederalTaxAmount(double federalTaxAmount) {
		this.federalTaxAmount = federalTaxAmount;
	}

	public double getMedicareAmount() {
		return medicareAmount;
	}

	public void setMedicareAmount(double medicareAmount) {
		this.medicareAmount = medicareAmount;
	}

	public double getToBePaidAmount() {
		return toBePaidAmount;
	}

	public void setToBePaidAmount(double toBePaidAmount) {
		this.toBePaidAmount = Math.round(toBePaidAmount * 100.00) / 100.00;
	}

	private double getHourlyPay() 
	{
		return emp.getSalary() / 52.0 * 2.0;
	}
	
	public void processPaycheck()
	{
		double hourlyPay = getHourlyPay();
		setGrossAmount(hourlyPay);
		
		double stateTaxAmount = hourlyPay * STATETAX / 100.00;
		double federalTaxAmount = hourlyPay * FEDERALTAX / 100.00;
		double medicareAmount = hourlyPay * MEDICARE / 100.00;
		
		toBePaidAmount = hourlyPay - stateTaxAmount - federalTaxAmount - medicareAmount;
		
		setToBePaidAmount(toBePaidAmount);
		setStateTaxAmount(stateTaxAmount);
		setFederalTaxAmount(federalTaxAmount);
		setMedicareAmount(medicareAmount);
	}
	
	public void printPaycheckDetails()
	{
		System.out.println("** PAYCHECK for " + emp.getLastName().toUpperCase() + ", " + emp.getFirstName().toUpperCase() + " **");
		System.out.println("Gross Amount : " + this.getGrossAmount() + " | " + "Amount to be Paid : " + this.getToBePaidAmount());
	}

}
