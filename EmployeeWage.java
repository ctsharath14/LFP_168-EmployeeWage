//Add part time employee and Wage

public class EmployeeWage {
	public static void main(String[] args) {
		final int Present = 1;
		final int PartTime = 2;
		final int FullTime = 8;
		final int WagePerHour = 100;	
		int empPresent = (int)(Math.random() * 3);
		int empHr;
		System.out.println(empPresent);
		if (empPresent == Present) {
			System.out.println("Employee is Present and working full-time");
			empHr = FullTime;
		} 
		else if(empPresent == PartTime) {
			System.out.println("Employee is Present and working part-time");
			empHr = FullTime/2;
		} 
		else {
			System.out.println("Employee is Absent");
			empHr = 0;
		}
		int empWage = empHr * WagePerHour;
		System.out.println("Employee daily Wage is : Rs."+empWage);
	}
}