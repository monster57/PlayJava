class Ball implements Drawable{
		private int size;
		private String color;
		public Ball(int size , String color){
			this.size =size;
			this.color = color;
		}
		@Override
		public void draw(){
		System.out.println("Ball Size "+size);
		System.out.println("Ball color "+color);

	}

}