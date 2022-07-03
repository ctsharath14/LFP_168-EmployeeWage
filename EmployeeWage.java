//Calculating Wages for a Month

public class EmployeeWage {
	public static void main(String[] args) {
		final int Present = 1;
		final int PartTime = 2;
		final int FullTime = 8;
		final int WagePerHour = 100;	
		final int WorkingDays = 20;

		int totalSalary = 0;

		for (int day=0;day<WorkingDays;day++) {
			int empPresent = (int)(Math.random() * 3);
			int empHr;
			switch(empPresent) {
				case Present :
					System.out.println("Employee was Present and worked full-time");
					empHr = FullTime;	
				break;
			
				case PartTime :
					System.out.println("Employee was Present and worked part-time");
					empHr = FullTime/2;
				break;
				
				default :
					System.out.println("Employee was Absent");
					empHr = 0;
				break;
			}
			int empWage = empHr * WagePerHour;
			totalSalary = totalSalary + empWage;
			System.out.println("Employee Wage is : Rs."+empWage);
			System.out.println("<--------------------------------------------------------------->");
		}
		System.out.println("Employee monthly salary is : Rs."+totalSalary);
	}	
}
