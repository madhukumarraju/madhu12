package practise;

public interface payable {
void pay();
}
class DebitCard implements payable{
	public void pay()
	{
		System.out.println("paid by debit card");
		
	}
}
class creditCard implements payable{
	public void pay()
	{
		System.out.println("paid by cerdit card");
		
	}
}
class paytm implements payable{
	public void pay()
	{
		System.out.println("paid by paytm");
		
	}
}
class Factory
{
	static payable getInstance(String po)
	{
		if(po.equals("creditCard"))
			return new creditCard();
		if(po.equals("DebitCard"))
			return new DebitCard();
		if(po.equals("paytm"))
			return new paytm();
		System.out.println("invalid Option");
		return null;
	}
}
