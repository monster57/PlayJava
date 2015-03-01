class Sence{
	public static void main(String[] args) {
		Sofa royal = new Sofa("Leather" , "Red");
		Ball tennisBall = new Ball(5 , "Green");
		Ball basketBall = new Ball(15 , "Brown");
		Person gaurav = new Person("Gaurav");
	
		int numberOFSecondTOAnimate = 60;
		Drawable objects[] = new Drawable[4];

		objects[0] = royal;
		objects[1] = tennisBall;
		objects[2] = basketBall;
		objects[3] = gaurav;

		for(int i = 0;i<numberOFSecondTOAnimate;i++){
			for(Drawable object:objects){		
				object.draw();
			}
			System.out.println("-----------"+i+"----------");
		}

	}
}