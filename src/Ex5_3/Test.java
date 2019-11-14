package Ex5_3;

public class Test {

	public static void main(String[] args) {
		Monster m = new FireMonter("u2r2");
		System.out.println(m.attack());
		
		Monster m1 = new WaterMonster("a2a2");
		System.out.println(m1.attack());
		WaterMonster w= (WaterMonster) m1;
		System.out.println(w.attack());
		
	}

}
