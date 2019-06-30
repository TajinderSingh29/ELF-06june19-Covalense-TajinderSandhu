
public class TestIceCream {
	public static void main(String[] args)
	{
		IceCream ic=new IceCream();
		Baby b=new Baby();
		StrawberryIceCream sic=new StrawberryIceCream();
		ChocolateIceCream cic=new ChocolateIceCream();
		b.take(cic);
	}

}
