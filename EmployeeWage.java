//Calculate wages till a condition of a total working hours or day is reached for a month

public class EmployeeWage {
	public static void main(String[] args) {
		int wagePerHour = 20;	
		int maxWorkingDays = 20;
		int maxWorkingHours = 100;
		int totalWorkingHour = 0;
		int day = 0;
		while (day < maxWorkingDays && totalWorkingHour < maxWorkingHours) {
			day++;
			int empHr;
			int empPresent = (int)(Math.random() * 3);
			switch(empPresent) {
		
				case 1 :
					empHr = 8;	
				break;
			
				case 2 :
					empHr = 4;
				break;
				
				default :
					empHr = 0;
				break;
		
			}
			
			totalWorkingHour = totalWorkingHour + empHr;
		}
		int totalSalary = totalWorkingHour * wagePerHour;
		System.out.println("Employee monthly salary is : "+totalSalary+"$");
		System.out.println("Employee total working Hour is : "+totalWorkingHour+" Hours");
	}	
}
