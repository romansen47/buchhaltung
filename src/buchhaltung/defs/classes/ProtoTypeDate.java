package buchhaltung.defs.classes;

import buchhaltung.defs.enums.Wochentag;
import buchhaltung.defs.interfaces.IMitteilung;

public abstract class ProtoTypeDate 
		implements IMitteilung{
	
	private Wochentag Wochentag;
	private int Tag;
	private int Monat;
	private int Jahr;
	
	@Override
	public void tellMe(){
		System.out.println(getWochentag()+", den "+
						 getTag()+"."+
						 getMonat()+"."+
						 getJahr());
	}
	
	public Wochentag getWochentag() {
		return Wochentag;
	}
	public void setWochentag(Wochentag wochentag) {
		Wochentag = wochentag;
	}
	public int getTag() {
		return Tag;
	}
	public void setTag(int tag) {
		Tag = tag;
	}
	public int getJahr() {
		return Jahr;
	}
	public void setJahr(int jahr) {
		Jahr = jahr;
	}
	public int getMonat() {
		return Monat;
	}
	public void setMonat(int monat) {
		Monat = monat;
	}
	
}
