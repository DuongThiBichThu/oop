package Ex1_2;


public class TestLine {

	public static void main(String[] args) {
		Line l1 = new Line(1,2,3,4);
		System.out.println(l1);
		Line l2= new Line(new Point(3,6), new Point(3,6));
		System.out.println(l2);
		
		l1.setBegin(new Point(11,12));
		l1.setEnd(new Point(13,14));
		System.out.println(l1);
		System.out.println(l1.getBegin());
		System.out.println(l1.getEnd());

		l1.setBeginX(21);
		l1.setBeginY(22);
		l1.setEndX(23);
		l1.setEndY(24);
		System.out.println(l1);
		
		l1.setBeginXY(31,32);
		l1.setEndXY(33,34);
		System.out.println(l1);
		System.out.println(l1.getBeginXY()[0]);
		System.out.println(l1.getBeginXY()[1]);
		System.out.println(l1.getEndXY()[0]);
		System.out.println(l1.getEndXY()[1]);
		
		System.out.println(l1.getLength());
	
	}

}



