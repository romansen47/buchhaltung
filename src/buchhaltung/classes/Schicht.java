package buchhaltung.classes;

import buchhaltung.defs.classes.ProtoTypeDate;
import buchhaltung.defs.classes.ProtoTypeMitarbeiter;
import buchhaltung.defs.classes.ProtoTypeZeitraum;

public class Schicht extends buchhaltung.defs.classes.ProtoTypeSchicht{

	public Schicht(ProtoTypeMitarbeiter personal,ProtoTypeDate datum,ProtoTypeZeitraum protoTypeZeitraum){
		this.setPersonal(personal);
		this.setZeitraum(protoTypeZeitraum);
	}
	

}
