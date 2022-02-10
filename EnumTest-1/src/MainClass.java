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
		Volume ret;
		
		String message = "Inserisci un livello di volume\n";
		
		int i = 0;
		for(Volume v : Volume.values())
		{
            System.out.println(Volume.values());
			message += i+" - "+v.toString()+"\n"; 
			i++;
		}
		message += "Volume : ";
		int x =  inputBoundedInt(message, 0,3);
		
		switch(x)
		{
			case 0 : ret = Volume.SILENT; break;
			case 1 : ret = Volume.LOW; break;
			case 2 : ret = Volume.HIGH; break;
			default : ret = Volume.MAX; break;
		}
		
		return ret;
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
