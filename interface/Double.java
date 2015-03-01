interface  known{
	public void print();
}

interface unknown{
	public void print();

}


class plane implements known, unknown{
	private int a;
	private int b;
	public plane(int a , int b){
		this.a = a;
		this.b = b;
	}

	public void print(){
		System.out.println("this is this ");
	}
}


class car implements known , unknown{
	private int a;
	private int b;
	public car(int a , int b){
		this.a = a;
		this.b = b;
	}

	public void print(){
		System.out.println("this is it ");
	}
}


class all{
	public static void main(String[] args) {
		known[] one = {
			new car(1,2) , new plane(2,3)
		};
		unknown[] two = {
			new car(1,2) , new plane(2,3)
		};
		for(known a:one){
			a.print();
		}
		for(unknown b:two){
			b.print();
		}
	}
}