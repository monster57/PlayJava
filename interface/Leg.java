class Leg implements Drawable{
	private int numberOftoes;
	public Leg(int numberOftoes){
		this.numberOftoes = numberOftoes;
	}
	@Override
	public void draw(){
		System.out.println("Dewaing leg of "+numberOftoes+"fingers");
	}
 }