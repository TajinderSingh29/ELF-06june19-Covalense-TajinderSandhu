
public class Receiver {
	
	void receive(Gift g)
	{
		if (g instanceof MoblieGift) 
		{
			System.out.println("Thanks for Moblie");
		}
		else if (g instanceof Watch)
		{
			System.out.println("Thanks for Watch");
		}
	}

}
