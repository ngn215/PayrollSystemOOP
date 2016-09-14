
public class Employee {
	
	private String designation;
	private String firstName;
	private String lastName;
	private double salary;
	private Timesheet timesheet;
	
	public Employee(String lastName, String firstName, String designation, double salary)
	{
		setLastName(lastName);
		setFirstName(firstName);
		setDesignation(designation);
		setSalary(salary);
		timesheet = new Timesheet();
	}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getHours()
	{
		return timesheet.getHours();
	}
	
	public void addHours(int hours)
	{
		timesheet.addHours(hours);
	}
	
	public int getPaidOffHours() 
	{
		return timesheet.getPaidOffHours();
	}

	public void addPaidOffHours(int paidOffHours) {
		timesheet.addPaidOffHours(paidOffHours);
	}
	
	public void PrintEmployeeDetails()
	{
		System.out.println("Employee : " + getLastName() + ", " + getFirstName());
		System.out.println("Designation : " + getDesignation() + " | Salary : " + getSalary());
		System.out.println("Timesheet Hours : " + getHours() + " | Paid Off Hours : " + getPaidOffHours());
	}

	

}
