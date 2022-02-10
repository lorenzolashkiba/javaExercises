/**
 * 
 */


public class PC {
	
	private int cpu; //solo lettura
	private int ram; //espandibili 
	private int harddisk; // espandibili
	private boolean rom; // espandibile
	private int codiceProdotto; //solo lettura
	private double prezzo; //espandibile
	
	public PC(int cpu, int ram, int harddisk, boolean rom, int codiceProdotto, double prezzo) {
		this.cpu = cpu;
		this.ram = ram;
		this.harddisk = harddisk;
		this.rom = rom;
		this.codiceProdotto = codiceProdotto;
		this.prezzo = prezzo;
	}
	
	public PC(PC copia) {
		this(copia.cpu, copia.ram, copia.harddisk, copia.rom, copia.codiceProdotto, copia.prezzo);
	}
	
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getHarddisk() {
		return harddisk;
	}
	public void setHarddisk(int harddisk) {
		this.harddisk = harddisk;
	}
	public boolean isRom() {
		return rom;
	}
	public void setRom(boolean rom) {
		this.rom = rom;
	}
	public int getCpu() {
		return cpu;
	}

	public double getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}


	public int getCodiceProdotto() {
		return codiceProdotto;
	}
	
	@Override
	public String toString() {
		return "cpu: " + cpu + "\nram: " + ram + "\nharddisk: " + harddisk + "\nrom: " + rom + "\ncodiceProdotto: "
				+ codiceProdotto + "\nprezzo: " + prezzo;
	}
}
