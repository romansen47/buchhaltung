package buchhaltung.defs.classes;

import java.util.ArrayList;

public abstract class ProtoTypeMitarbeiter  
		implements buchhaltung.defs.interfaces.IArbeit{

	private String Vorname,Nachname;
	private ArrayList<ProtoTypeSchicht> Wochenschichten;
	
	public ProtoTypeMitarbeiter(String vorname,String nachname){
		this.Vorname=vorname;
		this.Nachname=nachname;
		this.Wochenschichten=new ArrayList<ProtoTypeSchicht>();
	}
	
	@Override
	public void tellMe(){
		System.out.println("Name: "+Vorname+" "+Nachname);
		if (Wochenschichten!=null){
			for (int i=0;i<Wochenschichten.size();i++){
				Wochenschichten.get(i).tellMe();
			}
		}
	}
	
	public String getVorname() {
		return this.Vorname;
	}

	public void setVorname(String vorname) {
		this.Vorname = vorname;
	}
	
	public String getNachname() {
		return this.Nachname;
	}

	public void setNachname(String nachname) {
		this.Nachname = nachname;
	}

	public ArrayList<ProtoTypeSchicht> getWochenschichten() {
		return this.Wochenschichten;
	}

	public void setWochenschichten(ArrayList<ProtoTypeSchicht> wochenschichten) {
		this.Wochenschichten = wochenschichten;
	}
}
