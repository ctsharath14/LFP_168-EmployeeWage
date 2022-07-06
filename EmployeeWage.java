//Add part time Employee and Wage

public class EmployeeWage {
	public static void main(String[] args) {
		int wagePerHour = 20;	
		int empPresent = (int)(Math.random() * 3);
		int empHr;
		if (empPresent == 1) {
			System.out.println("Employee is Present and working full-time");
			empHr = 8;
		} 
		else if(empPresent == 2) {
			System.out.println("Employee is Present and working part-time");
			empHr = 4;
		} 
		else {
			System.out.println("Employee is Absent");
			empHr = 0;
		}
		int empWage = empHr * wagePerHour;
		System.out.println("Employee daily Wage is : "+empWage+"$");
	}
}
