package buchhaltung.classes;

import buchhaltung.defs.enums.Wochentag;

public class Date 
		extends buchhaltung.defs.classes.ProtoTypeDate{
	
	public Date(Wochentag wochentag,int tag,int monat,int jahr){
		this.setWochentag(wochentag);
		this.setTag(tag);
		this.setMonat(monat);
		this.setJahr(jahr);
	}
	
	public void reset(Wochentag wochentag,int tag,int monat,int jahr){
		this.setWochentag(wochentag);
		this.setTag(tag);
		this.setMonat(monat);
		this.setJahr(jahr);
	}
	
	public Date clone(){
		return new Date(this.getWochentag(),this.getTag(),this.getMonat(),this.getJahr());
	}
}
