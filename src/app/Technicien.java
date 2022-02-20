package app;

public class Technicien extends Employe{
	private double primeRisque;
	
	
	public Technicien(String nom, String prenom, double salaireBrut,double primeRisque) {
		super(nom,prenom,salaireBrut);
		this.primeRisque = primeRisque;
	
		
	}
	
	@Override
	public double getSalaireNet() {
		return super.salaireBrut + primeRisque - this.calculAvance();
	}
	

	@Override
	public void afficherDetail() {
		 System.out.println("Nom : "+ super.nom +"\n"+
				"Prenom : "+ super.prenom +"\n"+
				"Salaire Brut : "+ super.salaireBrut +"\n"+
				"Prime risque : "+ primeRisque +"\n"+
				"Avance : "+ this.calculAvance() +"\n"+
				"Salaire net : "+ this.getSalaireNet() +"\n");
		
	}

	public double getPrimeRisque() {
		return primeRisque;
	}

	public void setPrimeRisque(double primeRisque) {
		this.primeRisque = primeRisque;
	}
	private double calculAvance(){ 
		double total = 0.0d;
		for (Avance avance : avances) {
			 total += avance.getMontant();
		}
		return total;
	}
	

}
