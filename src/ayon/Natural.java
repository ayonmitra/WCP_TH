package ayon;

public abstract class Natural extends Weapon {
	
	public Natural(String name, int power) {
		super(name, power);
	}
	
	public void regenerate(Health h) {
		endurance += h.healing;
	}

	public abstract void weakenPower();
}
