package buchhaltung.defs.classes;

public abstract class ProtoTypeZeitraum implements buchhaltung.defs.interfaces.IMitteilung{

	private int BeginnStd,BeginnMin,EndeStd,EndeMin;

	public ProtoTypeZeitraum(int beginnstd,int beginnmin,int endestd,int endemin){
		this.BeginnStd=beginnstd;
		this.BeginnMin=beginnmin;
		this.EndeStd=endestd;
		this.EndeMin=endemin;
	}
	
	@Override
	public void tellMe(){
		System.out.println(this.BeginnStd+":"+this.BeginnMin+"-"+this.EndeStd+":"+this.EndeMin);
	}
	
	public int getBeginnStd() {
		return BeginnStd;
	}

	public void setBeginnStd(int beginnStd) {
		BeginnStd = beginnStd;
	}

	public int getBeginnMin() {
		return BeginnMin;
	}

	public void setBeginnMin(int beginnMin) {
		BeginnMin = beginnMin;
	}

	public int getEndeStd() {
		return EndeStd;
	}

	public void setEndeStd(int endeStd) {
		EndeStd = endeStd;
	}

	public int getEndeMin() {
		return EndeMin;
	}

	public void setEndeMin(int endeMin) {
		EndeMin = endeMin;
	}
	
}
