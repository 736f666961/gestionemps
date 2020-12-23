package bb;

public class EmployeeFix extends Employee{


	public EmployeeFix(String firstName, double salaire) {
		super(firstName, salaire);
	}

	@Override
	public String toString() {
		System.out.print("EmployeeFix: ");
		return super.toString() + ",  salaire Mensuel : " + super.getSalaire();
	}
	
}
