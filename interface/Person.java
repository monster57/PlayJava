class Person implements Drawable{
	private String name;
	private Drawable parts[];

	public Person(String name){
		this.name = name;
		parts = new Drawable[2];
		parts[0] = new Hand(5);
		parts[1] = new Leg(5);
	}
	@Override
	public void draw(){
		System.out.println("Drawing person"+name);
		for(Drawable part:parts){
			part.draw();
		}
	}
}