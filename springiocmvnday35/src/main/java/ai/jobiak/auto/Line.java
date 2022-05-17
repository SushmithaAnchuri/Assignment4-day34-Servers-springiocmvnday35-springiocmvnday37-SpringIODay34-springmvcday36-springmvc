package ai.jobiak.auto;

public class Line {

	private Point a;
	private Point b;
	public Line() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Line(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;
	}
	public Point getA() {
		return a;
	}
	public void setA(Point a) {
		this.a = a;
	}
	public Point getB() {
		return b;
	}
	public void setB(Point b) {
		this.b = b;
	}
	
	public void draw() {
		System.out.println(a+ "to" +b);
	}
	@Override
	public String toString() {
		return "Line [a=" + a + ", b=" + b + "]";
	}
	
	
}
