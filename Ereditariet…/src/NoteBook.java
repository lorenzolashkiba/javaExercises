/**
 * 
 */


public class NoteBook extends PC {



	private double peso;
	private double schermo;
	

	public NoteBook(int cpu, int ram, int harddisk, boolean rom, int codiceProdotto, double prezzo, double peso, double schermo) {
		super(cpu, ram, harddisk, rom, codiceProdotto, prezzo);
		this.peso = peso;
		this.schermo = schermo;
	}

	public NoteBook(NoteBook copia) {
		super(copia);
		this.peso = copia.peso;
		this.schermo = copia.schermo;
	}
	
	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getSchermo() {
		return schermo;
	}
	
	public String toString() {
		return super.toString() + "\npeso: " + peso + "\n schermo: " + schermo;
	}
}
