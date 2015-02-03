package ayon;

public abstract class Item implements Being{
	
	private String name;
	
	public Item(String name) {
		name(name);
	}
	
	public void name(String name) {
		this.name = name;
	}
	
	public abstract boolean isDestroyed();
	

}
