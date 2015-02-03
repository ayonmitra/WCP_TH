package ayon;

public abstract class Health extends Item {
	
	public int healing;
	
	public Health(String name, int healing) {
		super(name);
		this.healing = healing;
	}
	
	public int restore() {
		return healing;
	}
	
	public boolean isDestroyed() {
		return true;
	}

	
	

}
