import java.util.Scanner;

public class Main {

	static Scanner sc;
	
	private static PC creaPC(int scelta) {
		int cpu;
		int ram;
		int hd;
		int rom_choice;
		boolean rom;
		int codice;
		double prezzo;
		double peso;
		double schermo;
		
		System.out.println("--Hai scelto PC--");
		System.out.println("Inserisci i Ghz della cpu: ");
		cpu = sc.nextInt();
		System.out.println("Inserisci i Gb della ram: ");
		ram = sc.nextInt();
		System.out.println("Inserisci i Gb dell'Harddisk");
		hd = sc.nextInt();
		System.out.println("inserisci: \n1. se ha la rom\n0. se non ce l'ha\n");
		rom_choice = sc.nextInt();
		if(rom_choice==1)
			rom = true;
			else
			rom = false;
		
		System.out.println("Inserisci il codice prodotto: ");
		codice = sc.nextInt();
		System.out.println("Inserisci il prezzo: ");
		prezzo = sc.nextDouble();
		if(scelta == 1) {
			System.out.println("--------------------------------");
			return new PC(cpu,ram,hd,rom,codice,prezzo);
		}else {
			System.out.println("Inserisci il peso: ");
			peso = sc.nextDouble();
			System.out.println("Inserisci i pollici dello schermo: ");		
			schermo = sc.nextDouble();
			System.out.println("--------------------------------");
			return new NoteBook(cpu,ram,hd,rom,codice,prezzo,peso,schermo);
		}
		
	}
	
	public static void main(String[] args) {		
		sc = new Scanner(System.in);
		Negozio negozio = new Negozio();
		
		int choice=0;
		do{
			System.out.println("---Menu---");
			System.out.println("1.Inserire nuovo articolo");
			System.out.println("2.Cancellazione articolo (con codice)");
			System.out.println("3.Stampa articoli");
			System.out.println("0.Exit");
			choice = sc.nextInt();
			
			
			switch(choice){
			case 1:
				int inner_choice=0;
				System.out.println("1. per inserire un PC");
				System.out.println("2. per inserire un NoteBook");
				inner_choice = sc.nextInt();
				
				if(inner_choice==1) {
					negozio.nuovoProdotto(creaPC(inner_choice));
					System.out.println(negozio.getProdotti(negozio.getCont()-1).toString());
				}else{
					negozio.nuovoProdotto(creaPC(inner_choice));
					System.out.println(negozio.getProdotti(negozio.getCont()-1).toString());	
				}
				break;
			case 2: 
				int codice_el;
				System.out.println("Inserisci il codice del prodotto che vuoi eliminare: ");
				codice_el = sc.nextInt();
				negozio.cancellaArticolo(codice_el);
				
				System.out.println("--Stampa Array----");
				for(int i=0; i<negozio.getArrayProdotti().length;i++) {
					if(negozio.getProdotti(i)!=null) {
						System.out.println(negozio.getProdotti(i).toString());
						System.out.println("-------------------------------------");
					}
				}
				break;
			case 3: 
				break;
			default: 
				System.out.println("Arriverci");
				break;
			
			}
			
		}while(choice!=0);
		
		
		
		
		
		sc.close();
	}

}
