package ayon;

public abstract class Defense extends Combat {
	
	public Defense(String name, int defense) {
		super(name);
		power = defense;
	}	
	
	public int employ(int defense, int recoil) {
		endurance -= recoil;
		return (int) ((power + defense)*(0.6 + 0.8 * Math.random()));
	}

}
