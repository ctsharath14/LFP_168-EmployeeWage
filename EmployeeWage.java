//Solving using Case Statement

public class EmployeeWage {
	public static void main(String[] args) {
		int wagePerHour = 20;	
		int empPresent = (int)(Math.random() * 3);
		int empHr;
		switch(empPresent) {
			case 1 :
				System.out.println("Employee is Present and working full-time");
				empHr = 8;	
			break;
		
			case 2 :
				System.out.println("Employee is Present and working part-time");
				empHr = 4;
			break;
			
			default :
				System.out.println("Employee is Absent");
				empHr = 0;
			break;
	
		}
		int empWage = empHr * wagePerHour;
		System.out.println("Employee Wage is : "+empWage+"$");
	}
}
