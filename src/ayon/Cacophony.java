package ayon;

public class Cacophony extends Natural {
	
	public Cacophony() {
		super("Cacophony", 2);
		endurance = 30;
	}

	public void weakenPower() {
			
		if (endurance >= 10)
			power = 2;
		else
			power = 1;
		
	}
	
	

}
