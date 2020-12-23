package bb;

public class EmployeeComission extends Employee{
	private int vente;
	private int commission;
	
	public EmployeeComission(String firstName, double salaire, int vente, int commission) {
		super(firstName, salaire);
		this.vente = vente;
		this.commission = commission;
	}

	public EmployeeComission() {
		super();
	}
	
	public int getVente() {
		return vente;
	}

	public void setVente(int vente) {
		this.vente = vente;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}
	
	@Override
	public String toString() {
		System.out.print("EmployeeCommission: ");
		return super.toString() + ", salaire Mensuel : " + (super.getSalaire() + getVente() * getCommission());
		
	}
}
