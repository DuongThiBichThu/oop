package Ex5_3;

public abstract class Monster {
	private String name;
	
	public Monster(String name) {
		this.name=name;
	}
	public abstract String attack();
}
