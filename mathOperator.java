import java.util.Scanner;

class mathOperator{
	public static void main(String[] args) {
		Scanner monster = new Scanner(System.in);
		int num1, num2 , add;
		System.out.println("Enter the first number");
		num1 = monster.nextInt();
		System.out.println("Enter the second number");
		num2 = monster.nextInt();
		if(num1>6){
			add = num1+num2;
		}		
		else{
			add = num1 % num2;
		}
		System.out.println(add);
	}
}

class increamentOperator{
	public static void main(String[] args) {
		Scanner monster = new Scanner(System.in);
		int i;
		for(i=0;i<5;i++){
			System.out.print("\n");
			System.out.println(i);
		}
	}
}