package app;

import java.util.ArrayList;
import java.util.List;


public abstract class Employe {
	protected String nom;
	protected String prenom;
	protected double salaireBrut;
	protected double totalAvances;
	protected List<Avance> avances = new ArrayList<>();
	
	
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employe(String nom, String prenom, double salaireBrut) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.salaireBrut = salaireBrut;
	}
	public abstract double getSalaireNet();
	
	public abstract void afficherDetail();
	
	public void addAvance(Avance av) {
		this.avances.add(av);
	}
	
	
	
	
}
