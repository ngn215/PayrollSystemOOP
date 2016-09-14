
public class PayrollSystemOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] empFirstNames = {"Karan", "Rakesh", "Anish", "Prakash", "Sandeep"};
		String[] empLastNames = {"Arora", "Singh", "Parwal", "Bhatti", "Paul"};
		String[] empDesignations = {"CEO", "VP", "Senior Manager", "Manager", "Developer"};
		double[] empSalaries = {200000, 180000, 150000, 120000, 100000};
		int[] empHours = {100, 80, 70, 60, 50};
		int[] empPaidOffHours = {20, 10, 8, 6, 5};
		
		Employee[] empList = new Employee[empFirstNames.length];
		
		//Building employee objects
		for(int i=0; i<empFirstNames.length; i++)
		{
			Employee emp = new Employee(empLastNames[i], empFirstNames[i], empDesignations[i], empSalaries[i]);
			emp.addHours(empHours[i]);
			emp.addPaidOffHours(empPaidOffHours[i]);
			
			empList[i] = emp;
			emp.PrintEmployeeDetails();
			System.out.println("");
		}
		
		System.out.println("----------------------------------");
		
		//Processing paychecks for Employees
		for(int i=0; i<empFirstNames.length; i++)
		{
			empList[i].processPaycheckAndPrint();
			System.out.println();
		}
	}

}

/* OUTPUT
Employee : Arora, Karan
Designation : CEO | Salary : 200000.0
Timesheet Hours : 20 | Paid Off Hours : 0

Employee : Singh, Rakesh
Designation : VP | Salary : 180000.0
Timesheet Hours : 10 | Paid Off Hours : 0

Employee : Parwal, Anish
Designation : Senior Manager | Salary : 150000.0
Timesheet Hours : 8 | Paid Off Hours : 0

Employee : Bhatti, Prakash
Designation : Manager | Salary : 120000.0
Timesheet Hours : 6 | Paid Off Hours : 0

Employee : Paul, Sandeep
Designation : Developer | Salary : 100000.0
Timesheet Hours : 5 | Paid Off Hours : 0

----------------------------------
** PAYCHECK for ARORA, KARAN **
Gross Amount : 7692.31 | Amount to be Paid : 5770.77

** PAYCHECK for SINGH, RAKESH **
Gross Amount : 6923.08 | Amount to be Paid : 5193.69

** PAYCHECK for PARWAL, ANISH **
Gross Amount : 5769.23 | Amount to be Paid : 4328.08

** PAYCHECK for BHATTI, PRAKASH **
Gross Amount : 4615.38 | Amount to be Paid : 3462.46

** PAYCHECK for PAUL, SANDEEP **
Gross Amount : 3846.15 | Amount to be Paid : 2885.38


 */
