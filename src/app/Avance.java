package app;

import java.time.LocalDate;


public class Avance {
	private double montant;
	private LocalDate date;
	 
	
	public Avance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Avance(double montant, LocalDate date) {
		super();
		this.montant = montant;
		this.date = date;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
}
