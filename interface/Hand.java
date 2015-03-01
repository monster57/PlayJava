class Hand implements Drawable{
	private int numberOfFingers;
	public Hand(int numberOfFingers){
		this.numberOfFingers = numberOfFingers;
	}
	@Override
	public void draw(){
		System.out.println("Dewaing hand of "+numberOfFingers+"fingers");
	}
 }