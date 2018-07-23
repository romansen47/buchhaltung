package buchhaltung.classes;

import buchhaltung.defs.classes.ProtoTypeDate;
import buchhaltung.defs.enums.Wochentag;

public class Arbeitstag extends buchhaltung.defs.classes.ProtoArbeitstag{

	public Arbeitstag(Wochentag tag,ProtoTypeDate datum){
		this.setWochentag(tag);
		this.setDatum(datum);
	}

}
