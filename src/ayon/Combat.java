package ayon;

public abstract class Combat extends Item {

	public static int endurance;
	public int power;
	
	public Combat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isDestroyed() {
		return endurance <= 0;
	}
	
	public abstract int employ(int stat, int recoil);

}
