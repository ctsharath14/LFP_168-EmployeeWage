//Calculating Wages for a Month

public class EmployeeWage {
	public static void main(String[] args) {
		int wagePerHour = 20;	
		int totalWorkingDays = 20;
		int totalSalary = 0;

		for (int day=0;day<totalWorkingDays;day++) {
			int empPresent = (int)(Math.random() * 3);
			int empHr;
			switch(empPresent) {
				case 1 :
					System.out.println("Employee was Present and worked full-time");
					empHr = 8;	
				break;
			
				case 2 :
					System.out.println("Employee was Present and worked part-time");
					empHr = 4;
				break;
				
				default :
					System.out.println("Employee was Absent");
					empHr = 0;
				break;
			}
			int empWage = empHr * wagePerHour;
			totalSalary = totalSalary + empWage;
			System.out.println("Employee Wage was : "+empWage+"$");
			System.out.println("<--------------------------------------------------------------->");
		}
		System.out.println("Employee monthly salary is : "+totalSalary+"$");
	}	
}
