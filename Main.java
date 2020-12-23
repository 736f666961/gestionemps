package bb;

public class Main {

	public static void main(String[] args) {
		// EmployeeFix Class
		Employee empFix = new EmployeeFix("Sofia", 100.12);
		System.out.println(empFix.toString());
		
		// EmployeeCommision Class
		Employee empCom = new EmployeeComission("Ahmed", empFix.getSalaire(), 100, 10);
		System.out.println(empCom.toString());
		
		// EmployeeHoraire Class
		EmployeeHoraire empHr = new EmployeeHoraire("Majdi", 234, 12, 23);
		System.out.println(empHr.toString());
	}
}
