package buchhaltung;

import java.util.ArrayList;

import buchhaltung.classes.Arbeitstag;
import buchhaltung.classes.Date;
import buchhaltung.classes.Woche;
import buchhaltung.classes.Zeitraum;
import buchhaltung.classes.Mitarbeiter;
import buchhaltung.classes.Schicht;
import buchhaltung.defs.interfaces.IMitteilung;
import buchhaltung.defs.enums.Wochentag;

public class Main {

	public static void TELL(IMitteilung test){
		test.tellMe();
	}
	
	public static void main(String[] args) {

		Mitarbeiter Roman=new Mitarbeiter("Roman","Bauer");
		
		Date date,date2;
		Woche woche;
		Schicht schicht;
		
		date=new Date(Wochentag.Montag,1,1,2000);

		woche=new buchhaltung.classes.Woche(date,new ArrayList<Arbeitstag>());

		
		Arbeitstag Montag=new Arbeitstag(Wochentag.Montag,date);
		schicht=new Schicht(Roman, date,new Zeitraum(13,30,14,30));
		
		date2=date.clone();
		date2.reset(Wochentag.Dienstag,2,1,2000);
		
		Arbeitstag Dienstag=new Arbeitstag(Wochentag.Dienstag,date2);
		
		woche.getWochenplan().add(Montag);
		woche.getWochenplan().add(Dienstag);

		Montag.getSchichtplan().add(schicht);
		System.out.println("");

		Dienstag.getSchichtplan().add(schicht);
		System.out.println("");
		
		Roman.getWochenschichten().add(schicht);
		
		TELL(woche);
		/*
//		Roman.tellMe();
//		woche.tellMe();
	*/
	}

}
