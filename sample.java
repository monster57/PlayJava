interface Shape {
		public int perimeter();
		public int area();
		public boolean fewerSidesThan(int n);
	
}
class Rectangle{
	private final int l , b;
	public Rectangle(int l , int b){
		this.l = l;
		this.b = b;
	}
	// public int perimeter(){
	// 	return 2*(l+b);
	// }
	public int area(){
		return l*b;
	}
	public boolean fewerSidesThan(int n){
		return n>4;
	}
	public double diagonal(){
		return Math.sqrt(l*l+b*b);
	}

}

class Circle{
	private int r;
	public Circle(int r){
		this.r  = r;
	}
	public int perimeter(){
		return 3*2*r;
	}
	public int area(){
		return 3*r*r;
	}
	public boolean fewerSidesThan(int n){
		return n>2;
	}
	
}

class Shapes{
	public static void main(String[] args) {
		Rectangle r =  new Rectangle(2,3);
		Circle c = new Circle(2);
		Shapes[]  shapes= {r,c};
		for (Shapes shapes:shapes ) {
			System.out.println(shapes.area());			
		}
	}
}