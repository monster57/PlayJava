class addition{
 	public int add(int a , int b) {
 		return a+b;
 	}
}
class dividation{
	int num1 ,num2;
	public int div(int n1 , int n2){
		num1 = n1;
		num2 = n2;
		return 0;
	}
}
class result{
	public static void main(String[] args) {
		int result, div_result;
		addition thus = new addition();
		result = thus.add(2,3);
		dividation show = new dividation();
		div_result = show.div(6,5);
		System.out.println(result);
		System.out.println(div_result);

	}
}