package alex.classes;

public class Entity extends Object{
	
	protected double hp;
	protected double attack;
	protected double defence;
	protected double speed;
	protected String name;
	
	public double getHp() {
		return hp;
	}
	
	public void setHp(double newVal) {
		hp = newVal;
	}
	
	public double getAttack() {
		return attack;
	}
	
	public void setAttack(double newVal) {
		attack = newVal;
	}
	
	public double getDefence() {
		return defence;
	}
	
	public void setDefence(double newVal) {
		defence = newVal;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public void setSpeed(double newVal) {
		speed = newVal;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newVal) {
		name = newVal;
	}
}
