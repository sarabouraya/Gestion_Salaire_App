package app;

import java.time.LocalDate;

public class app {

	public static void main(String[] args) {
		System.out.println("Gestion techniciens");
		
		Employe tec=new Technicien("Tata", "Tati", 5000, 1000);
		tec.addAvance(new Avance(500, LocalDate.of(2022, 2, 5)));
		tec.addAvance(new Avance(100, LocalDate.of(2022, 2, 15)));
		tec.afficherDetail();
		
		
		System.out.println("-----------------------------------------");
		System.out.println("Gestion ingenieurs");
		Employe ing=new Ingenieur("Ali", "Baba", 9000, 2000);
		ing.addAvance(new Avance(1000, LocalDate.of(2022, 2, 5)));
		ing.addAvance(new Avance(1500, LocalDate.of(2022, 2, 15)));

		((Ingenieur)ing).addMission(new Mission("Dev Web", 25000));
		((Ingenieur)ing).addMission(new Mission("Dev Mobile", 15000));
		ing.afficherDetail();

	}

}
