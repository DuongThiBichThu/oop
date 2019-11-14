package Ex5_1a;

public class Line {
	private Point begin;
	private Point end;
	
	public Line(Point begin, Point end) {
		this.begin=begin;
		this.end=end;
	}
	public Line(int beginX, int beginY, int endX, int endY) {
		begin= new Point(beginX, beginY);
		end=new Point(endX, endY);
	}
	public Point getBegin() {
		return begin;
	}
	public void setBegin(Point begin) {
		this.begin = begin;
	}
	public Point getEnd() {
		return end;
	}
	public void setEnd(Point end) {
		this.end = end;
	}
	
	public int getBeginX() {
		return begin.getX();
	}
	public int getBeginY() {
		return begin.getY();
	}
	public int getendX() {
		return end.getX();
	}
	public int getendY() {
		return end.getY();
	}
	public void setBeginX(int beginX) {
		begin.setX(beginX);
	}
	public void setBeginY(int beginY) {
		begin.setY(beginY);
	}
	public void setEndX(int endX) {
        begin.setX(endX);
    }
    public void setEndY(int endY) {
        begin.setY(endY);
    }
    public void setBeginXY(int beginX, int beginY) {
        begin.setXY(beginX,beginY);
    }
    public String toString() {
    	return "Line[Begin="+begin+",end="+end+"]";
    }
    
}
