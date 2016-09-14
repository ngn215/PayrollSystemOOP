
public class Timesheet {

	private int hours;
	private int paidOffHours;

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getPaidOffHours() {
		return paidOffHours;
	}

	public void setPaidOffHours(int paidOffHours) {
		this.paidOffHours = paidOffHours;
	}
	
	public void addHours(int hours)
	{
		setHours(getHours() + hours);
	}
	
	public void addPaidOffHours(int paidOffHours)
	{
		setHours(getPaidOffHours() + paidOffHours);
	}
}
