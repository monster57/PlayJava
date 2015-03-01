import java.util.Scanner;

class calculator{
	public static void main(String[] args) {
		Scanner monster  = new Scanner(System.in);
		int fnum , snum, answer ,option;
		System.out.println("Enter first number");
		fnum = monster.nextInt();
		System.out.println("Enter second number");
		snum = monster.nextInt();
		System.out.println("Enter 1 for add , 2 for subtract , 3 for multiply  , 4 for divition");
		option = monster.nextInt();
		switch(option){
			case 1: answer  = fnum+snum;
					System.out.print("the result of the addition");
					System.out.println(answer);
					break;
			case 2: answer = fnum - snum;
					System.out.print("the result of the substraction");
					System.out.println(answer);
					break;
			case 3: answer = fnum * snum;
					System.out.print("the result of the multiplication");
					System.out.println(answer);	
					break;
			case 4: answer = fnum / snum;
					System.out.print("the result of the divition`");
					System.out.println(answer);
					break;
			default: System.out.println("option is not available");
		}
	}
}