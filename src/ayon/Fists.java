package ayon;

public class Fists extends Natural {
	
	public Fists() {
		super("Fists", 4);
		endurance = 40;
	}

	public void weakenPower() {
		if (endurance >= 25)
			power = 4;
		else if (endurance >= 15)
			power = 3;
		else
			power = 2;
	}

}
