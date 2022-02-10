import javax.lang.model.element.ModuleElement.ProvidesDirective;

public class Negozio {

	

	private static int SIZE=100;
	//array di prodotti 
	PC prodotti[]; 
	private int cont;
	
	public Negozio(){
		prodotti = new PC[SIZE]; 
		cont=0;
	}
	
	public PC getProdotti(int posizione) {
		return prodotti[posizione];
	}
	
	public PC[] getArrayProdotti() {
		return prodotti;
	}

	public void nuovoProdotto(PC nuovo) {
		this.prodotti[cont] = nuovo;
		cont++;
	}

	public int getCont() {
		return cont;
	}
	
	public void cancellaArticolo(int codArt) {
		for(int i=0;i<prodotti.length;i++) {
			if(prodotti[i]!=null) {
				if(prodotti[i].getCodiceProdotto()==codArt) {
					prodotti[i]=prodotti[prodotti.length-1];
					cont--;
				}
			}
		}
	}
	
}
