class Sofa implements Drawable {
	private String material;
	private String color;
	public Sofa(String material , String color){
		this.material = material;
		this.color = color;
	}
	@Override
	public void draw(){
		System.out.println("Sofa Material"+ material);
		System.out.println("Sofa color"+ color);

	}
}