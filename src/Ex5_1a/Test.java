package Ex5_1a;

public class Test {

	public static void main(String[] args) {
		
        Point p1 = new Point(1,1);
        Point p2 = new Point(2,2);
        Line l2 = new Line(p1,p2);
        System.out.println(l2);

        
        LineSub lineSub1 = new LineSub(0,0,3,4);
        System.out.println(lineSub1.getLength());
        System.out.println(lineSub1.getGradient());
        System.out.println(lineSub1);
	}

}
