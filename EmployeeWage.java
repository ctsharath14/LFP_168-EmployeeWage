//Solving using Case Statement

public class EmployeeWage {
	public static void main(String[] args) {
		final int Present = 1;
		final int PartTime = 2;
		final int FullTime = 8;
		final int WagePerHour = 100;	
		int empPresent = (int)(Math.random() * 3);
		int empHr;
		switch(empPresent) {
			case Present :
				System.out.println("Employee is Present and working full-time");
				empHr = FullTime;	
			break;
		
			case PartTime :
				System.out.println("Employee is Present and working part-time");
				empHr = FullTime/2;
			break;
			
			default :
				System.out.println("Employee is Absent");
				empHr = 0;
			break;
	
		}
		int empWage = empHr * WagePerHour;
		System.out.println("Employee Wage is : Rs."+empWage);
	}
}