import java.util.Scanner;
 class multiClass{
 	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
 		tuna tunaObj = new tuna();
 		System.out.println("Enter name of first girlfreind here:");
 		String temp = input.nextLine();
 		tunaObj.setName(temp);
 		tunaObj.saying(); 
 	}
 }