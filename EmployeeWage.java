//Check Employee is Present or Absent

public class EmployeeWage {
	public static void main(String[] args) {
		int empPresent = 1;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == empPresent)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
		}
}