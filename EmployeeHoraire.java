package bb;

public class EmployeeHoraire extends Employee{
	private int tauxHoraire;
	private int heuresPrestees;

	public EmployeeHoraire(String firstName, double salaire, int tauxHoraire, int heuresPrestees) {
		super(firstName, salaire);
		this.tauxHoraire = tauxHoraire;
		this.heuresPrestees = heuresPrestees;
	}


	public int getTauxHoraire() {
		return tauxHoraire;
	}

	public void setTauxHoraire(int tauxHoraire) {
		this.tauxHoraire = tauxHoraire;
	}

	public int getHeuresPrestees() {
		return heuresPrestees;
	}

	public void setHeuresPrestees(int heuresPrestees) {
		this.heuresPrestees = heuresPrestees;
	}
	
	@Override
	public String toString() {
		System.out.print("EmployeeHoraire: ");
		return super.toString() + ", salaire Mensuel : " + (getTauxHoraire() * getHeuresPrestees());
	}
}
