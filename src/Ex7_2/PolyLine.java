package Ex7_2;

import java.util.ArrayList;
import java.util.List;

public class PolyLine {
	private List<Point> points;
	
	public PolyLine() {
		points = new ArrayList<>();
	}
	public PolyLine(List<Point> point) {
		this.points=point;
	}
	public void appendPoint(int x, int y) {
		Point newPoint = new Point(x,y);
		points.add(newPoint);
	}
	public void appendPont(Point point) {
		points.add(point);
	}
	public String toString() {
		return ""; //
	}
	public double getLength() {
		return 0.0; ///
	}
}
