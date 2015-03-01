class Point{
	private int x , y;
	public  Point(int x , int y){
		this.x = x;
		this.y  = y;
	}
	public void move(int byX , int byY){
		this.x = +byX;
		this y = +byY;
	}
	public String tostring(){
		return "{"+x+","+y+")"
	}
}

class program {
	public static void main(String[] args) {
		Point point[] = new Point[8];
		Arrays.fill(point , new Point(0,0));
		point[7] = new Point(1,2);
		for(Point p:point){
			System.out.println(p[i]);
		}
	}
}