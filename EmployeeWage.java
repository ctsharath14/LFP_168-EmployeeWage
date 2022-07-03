//Calculate daily employee wage

public class EmployeeWage {
	public static void main(String[] args) {
		final int Present = 1;
		final int FullTime = 8;
		final int WagePerHour = 100;	
		int empPresent = (int)(Math.random() * 2);
		int empHr;
		if (empPresent == Present) {
			System.out.println("Employee is Present");
			empHr = FullTime;
		} 
		else {
			System.out.println("Employee is Absent");
			empHr = 0;
		}
		int empWage = empHr * WagePerHour;
		System.out.println("Employee Wage is : Rs."+empWage);
	}
	
}