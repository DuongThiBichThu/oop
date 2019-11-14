package Ex5_3;

public class FireMonter extends Monster {
	
	public FireMonter(String name) {
		super(name);
	}
	@Override
	public String attack() {
		return "Attack with fire!";
	}
}
