package buchhaltung.defs.classes;

import java.util.ArrayList;

import buchhaltung.classes.Arbeitstag;
import buchhaltung.classes.Date;

public abstract class ProtoTypeWoche  
		implements buchhaltung.defs.interfaces.IMitteilung{
	
	public void setWochenplan(ArrayList<Arbeitstag> tage) {
		for (Arbeitstag tag:tage) {
			this.getWochenplan().add(tag);
		}
	}
	
	private Date Datum;
	private ArrayList<Arbeitstag> Wochenplan=new ArrayList<Arbeitstag>();
	
	public Date getDatum() {
		return this.Datum;
	}
	public void setDatum(Date datum) {
		this.Datum = datum;
	}
	public ArrayList<Arbeitstag> getWochenplan() {
		return this.Wochenplan;
	}
	
	
	@Override
	public void tellMe(){
		System.out.println("Woche beginnend mit Montag, den "+
							this.getDatum().getTag()+"."+
							this.getDatum().getMonat()+"."+
							this.getDatum().getJahr()+":");
		System.out.println();
		System.out.println("#######################");
		System.out.println("#######################");
		System.out.println("#######################");
		System.out.println();
		if (getWochenplan()!=null){
			for (int i=0;i<this.getWochenplan().size();i++){
				this.getWochenplan().get(i).tellMe();
				System.out.println();
				System.out.println("########################");
				System.out.println();
			}
		}
		System.out.println();
	}
}
