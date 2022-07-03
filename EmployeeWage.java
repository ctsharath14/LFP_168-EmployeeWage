//Calculate wages till a condition of a total working hours or day is reached for a month

public class EmployeeWageBuilder {
	public static void main(String[] args) {
		final int Present = 1;
		final int PartTime = 2;
		final int FullTime = 8;
		final int WagePerHour = 100;	
		final int MaxWorkingDays = 20;
		final int MaxWorkingHours = 100;
		
		int totalWorkingHour = 0;
		int day = 0;
		while (day < MaxWorkingDays && totalWorkingHour < MaxWorkingHours) {
			day++;
			int empPresent=0;
			if (totalWorkingHour == MaxWorkingHours-(FullTime/2)) {
				empPresent = PartTime;
			} 
			else {
				empPresent = (int)(Math.random() * 3);
			}
			int empHr;
			switch(empPresent) {
		
				case Present :
					//System.out.println("Employee is Present and working full-time");
					empHr = FullTime;	
				break;
			
				case PartTime :
					//System.out.println("Employee is Present and working part-time");
					empHr = FullTime/2;
				break;
				
				default :
					//System.out.println("Employee is Absent");
					empHr = 0;
				break;
		
			}
			
			totalWorkingHour = totalWorkingHour + empHr;
		}
		int totalSalary = totalWorkingHour * WagePerHour;
		System.out.println("Employee monthly salary is : Rs."+totalSalary);
		System.out.println("Employee total working Hour is : "+totalWorkingHour+" Hours");
	}	
}