
public enum Volume 
{
	SILENT(0,"Silenzioso"),
	LOW(1,"Basso"),
	HIGH(2,"Alto"),
	MAX(3,"Massimo");

	private final int valore;
	private final String descrizione;
	
	private Volume(int valore, String descrizione) {
		this.valore = valore;
		this.descrizione = descrizione;
	}

	public int getValore() {
		return valore;
	}

	@Override
	public String toString() {
		return descrizione;
	}
	
	public static Volume valueOf(int val)
	{ 
		for(Volume v : Volume.values())
		{
			if(v.valore == val)
				return v;
		}
		
		return null;
	}
}
