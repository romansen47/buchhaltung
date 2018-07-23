package buchhaltung.defs.classes;

import java.util.ArrayList;

import buchhaltung.defs.enums.Wochentag;

public abstract class ProtoArbeitstag 
	implements buchhaltung.defs.interfaces.IMitteilung{
	
	private ProtoTypeDate Datum;
	private Wochentag Tag;
	private ArrayList<ProtoTypeSchicht>Schichtplan=new ArrayList<ProtoTypeSchicht>();
	
	@Override
	public void tellMe(){
		System.out.println("Datum: "+this.Tag+
				", den "+Datum.getTag()+"."+Datum.getMonat()+"."+Datum.getJahr());
		System.out.println();
		if (this.Schichtplan!=null){
			System.out.println("Schichtplan:");
			System.out.println();
			for (int i=0; i<this.Schichtplan.size();i++){
				this.Schichtplan.get(i).tellMe();
				System.out.println();
			}
		}
		else{System.out.println("Schichtplan ist leer!");}
	}
	
	public ProtoTypeDate getDatum() {
		return this.Datum;
	}
	public void setDatum(ProtoTypeDate datum) {
		this.Datum = datum;
	}
	public Wochentag getWochentag() {
		return this.Tag;
	}
	public void setWochentag(Wochentag tag) {
		this.Tag = tag;
	}
	public ArrayList<ProtoTypeSchicht> getSchichtplan() {
		return this.Schichtplan;
	}
	public void setSchichtplan(ArrayList<ProtoTypeSchicht> schichtplan) {
		this.Schichtplan = schichtplan;
	}

}
