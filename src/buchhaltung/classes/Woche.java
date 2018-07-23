package buchhaltung.classes;

import java.util.ArrayList;
import buchhaltung.classes.Arbeitstag;
import buchhaltung.classes.Date;
import buchhaltung.defs.enums.Wochentag;;

public class Woche extends buchhaltung.defs.classes.ProtoTypeWoche{

	public Woche() {
		this.setDatum(new Date(Wochentag.Montag,1,1,2018));
		this.setWochenplan(new ArrayList<Arbeitstag>());
	}
	
	public Woche(Date datum, ArrayList<Arbeitstag> tage ){
		this.setDatum(datum);
		if (tage!=null) {
			this.setWochenplan(tage);
		}
		else {
			this.setWochenplan(new ArrayList<Arbeitstag>());
		}
	}
	
}
