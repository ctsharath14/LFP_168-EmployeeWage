//Calculate daily employee wage

public class EmployeeWage {
	public static void main(String[] args) {
		int wagePerHour = 20;	
		int empPresent = (int)(Math.random() * 2);
		int empHr;
		if (empPresent == 1) {
			System.out.println("Employee is Present");
			empHr = 8;
		} 
		else {
			System.out.println("Employee is Absent");
			empHr = 0;
		}
		int empWage = empHr * wagePerHour;
		System.out.println("Employee Wage is :"+empWage+"$");
	}
	
}
