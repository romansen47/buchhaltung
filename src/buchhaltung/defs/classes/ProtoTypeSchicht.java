package buchhaltung.defs.classes;

import buchhaltung.defs.interfaces.IArbeit;

public abstract class ProtoTypeSchicht  
	implements IArbeit{

	private ProtoTypeMitarbeiter Personal;
	private ProtoTypeZeitraum ProtoTypeZeitraum;
	
	@Override
	public void tellMe(){
		ProtoTypeZeitraum.tellMe();
		System.out.println(Personal.getVorname()+" "+Personal.getNachname());
	}

	public ProtoTypeZeitraum getZeitraum() {
		return ProtoTypeZeitraum;
	}


	public void setZeitraum(ProtoTypeZeitraum protoTypeZeitraum) {
		ProtoTypeZeitraum = protoTypeZeitraum;
	}

	public ProtoTypeMitarbeiter getPersonal() {
		return Personal;
	}

	public void setPersonal(ProtoTypeMitarbeiter personal) {
		Personal = personal;
	}
	
}
