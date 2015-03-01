class ifStatement{
	public static void main(String[] args) {
		int test = 6;
		if(test == 9){
			System.out.println("yes");
		}else{
			System.out.println("this is else");
		}
	}
}

class MultiTest{
	public static void main(String[] args) {
		int boy  = 21;
		int girl = 22;
		if(boy>10 && girl <20){
			System.out.println("you can enter");
		}else{
			System.out.println("you can not enter");
		}
	}
}

class switchStatement{
	public static void main(String[] args) {
		int age  = 3;
		switch(age){
			case 1:System.out.println("you can crawl");
					break;
			case 2: System.out.println("you can talk");
					break;
			case 3: System.out.println("you can get in trouble");
					break;
			default:System.out.println("I dont know how old are you");
		}

	}
}

class WhileStatement{
	public static void main(String[] args) {
		int counter =0;
		while(counter<10){
			System.out.println(counter);
			counter++;
		}
	}
}