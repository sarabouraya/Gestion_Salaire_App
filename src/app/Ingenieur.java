package app;

import java.util.ArrayList;
import java.util.List;

public class Ingenieur extends Employe{
	private double primeLogement;
	private double totalIndemnitesMissions;
	private List<Mission> missions = new ArrayList<Mission>();
	
	
	public Ingenieur(String nom, String prenom, double salaireBrut,double primeLogement) {
		super(nom,prenom,salaireBrut);
		this.primeLogement = primeLogement;
	}

	@Override
	public double getSalaireNet() {
		return super.salaireBrut + primeLogement + this.calculIndemnite()  - this.calculAvance() ;
	}

	@Override
	public void afficherDetail() {
		 System.out.println("Nom : "+ super.nom +"\n"+
				"Prenom : "+ super.prenom +"\n"+
				"Salaire Brut : "+ super.salaireBrut +"\n"+
				"Prime Logement : "+ primeLogement +"\n"+
				"Indemnités missions : "+ this.calculIndemnite() +"\n"+
				"Avance : "+ this.calculAvance() +"\n"+
				"Salaire net : "+ this.getSalaireNet() +"\n");
		
	}
	public void addMission(Mission m) {
		this.missions.add(m);
	}

	public double getPrimeLogement() {
		return primeLogement;
	}

	public void setPrimeLogement(double primeLogement) {
		this.primeLogement = primeLogement;
	}

	public double getTotalIndemnitesMissions() {
		return totalIndemnitesMissions;
	}

	public void setTotalIndemnitesMissions(double totalIndemnitesMissions) {
		
		this.totalIndemnitesMissions = totalIndemnitesMissions;
	}
	private double calculAvance(){ 
		double total = 0.0d;
		for (Avance avance : avances) {
			 total += avance.getMontant();
		}
		return total;
	}
	private double calculIndemnite() {
		double totalMission = 0.0d;
		for (Mission mission : missions) {
			totalMission = totalMission + mission.getCout();
		}
		return totalMission * 0.1;
	}
	
}
