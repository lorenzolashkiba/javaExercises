import java.util.Scanner;

public class MainClass 
{
	static Scanner sc;
	
	public static int inputBoundedInt(String message, int min, int max)
	{
		System.out.println(message);
		int x = sc.nextInt();
		while(x < min || x > max)
		{
			System.out.println("Errore, il valore deve essere compreso tra "+min+" e "+max+"\n"+message);
			x = sc.nextInt();
		}
		return x;
	}
	
	public static Volume inputVolume()
	{
		String message = "Inserisci un livello di volume\n";
		
		for(Volume v : Volume.values())
		{
			message += v.getValore()+" - "+v+"\n"; 
		}
		message += "Volume : ";
		int x =  inputBoundedInt(message, 0,3);
		
		return Volume.valueOf(x);
	}

	/*
	public static String volumeToString(Volume v)
	{
		switch(v)
		{
			case SILENT : return "Silenzioso";
			case LOW : return "Basso";
			case HIGH : return "Alto";
			default : return "Massimo";
		}
	}
	*/
	
	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		Volume v = inputVolume();
		System.out.println("Hai scelto il volume "+v);

	}

}
