
import java.util.Scanner;

public class HelloWorld{
	public static void main(String[] args){
		System.out.println("I like Java");
		doubleCalculate();
	}
	public static void doubleCalculate(){
		int n=0;
		System.out.println("Insert one number greater than 10\n");
		
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			System.out.println("double =  " + n*2);
			
	}
		
	
}
