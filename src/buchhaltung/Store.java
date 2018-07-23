package buchhaltung;

import java.util.ArrayList;

import buchhaltung.classes.Date;
import buchhaltung.classes.Mitarbeiter;
import buchhaltung.classes.Woche;

public class Store {

	private Woche Week;
	private ArrayList<Mitarbeiter> Personal;
	
	public Store(Date datum){
		Week=new Woche(datum,null);
		Personal=new ArrayList<Mitarbeiter>();
		
	}
	public Woche getWoche() {
		return this.Week;
	}
	public void setWoche(Woche Week) {
		this.Week = Week;
	}
	public ArrayList<Mitarbeiter> getPersonal() {
		return Personal;
	}
	public void setPersonal(ArrayList<Mitarbeiter> personal) {
		this.Personal = personal;
	}
	
}
