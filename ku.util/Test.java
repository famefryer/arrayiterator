package ku.util;

public class Test {
	public static int factorial(int n){
		if (n==0)return 1;
		
		else return factorial(n-1)*n;
	}
	public static void main(String[] args){
		
		System.out.print(factorial(4));
		
	}
}
