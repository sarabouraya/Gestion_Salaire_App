package app;

public class Mission {
	private double cout;
	private String nomMission;
	
	
	public Mission(String nomMission, double cout ) {
		super();
		this.cout = cout;
		this.nomMission = nomMission;
	}


	public double getCout() {
		return cout;
	}


	public void setCout(double cout) {
		this.cout = cout;
	}


	public String getNomMission() {
		return nomMission;
	}


	public void setNomMission(String nomMission) {
		this.nomMission = nomMission;
	}
	
	
}
