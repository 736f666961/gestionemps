package bb;

public class Employee {
	private String firstName;
	private double salaire;
	
	public Employee() {
		super();
	}
	
	public Employee(String firstName, double salaire) {
		this.firstName = firstName;
		this.salaire = salaire;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "firstName=" + firstName + ", salaire=" + salaire + "";
	}
}
