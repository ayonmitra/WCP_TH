package ayon;

public abstract class Weapon extends Combat {
	
	public Weapon(String name, int power) {
		
		super(name);
		this.power = power;
	}
	
	public int employ(int attack, int recoil) {
		endurance -= recoil;
		return (int)(power + (int)(attack*(0.8 + 0.3* Math.random())));
	}
	
}
