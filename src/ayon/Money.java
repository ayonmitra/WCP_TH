package ayon;

public class Money extends Item {
	
	public static int quantity;
	
	private Money(int quantity) {
		super("money");
		Money.quantity = quantity;
	}
	
	public boolean isDestroyed() {
		if (quantity <=0) {
			return true;
		}
		return false;
	}
	
	public void spend(int price) {
		if (!isDestroyed() && quantity >= price) {
			quantity -= price;
		} else
			System.out.println("You have not the money.");
	}
	
	public void obtain(int cash) {
		quantity += cash;
		System.out.println("You got " + cash + " monies.");
	}

}
