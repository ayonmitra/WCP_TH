package ayon;

public abstract class Item{
	
	public int health;
	public String name;
	
	private Item() {
		
	}
	
	public abstract boolean isDestroyed();

}