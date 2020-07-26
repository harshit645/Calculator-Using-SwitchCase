package conditionalStatments;
import java.util.Scanner; //Scanner is a class

public class SwitchCaseCalciProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);//first object of class Scanner
		Scanner sc2=new Scanner(System.in);//second object of class Scanner
		
		System.out.println("Enter the value of first operand");
		int a=sc.nextInt();
		System.out.println("Enter the value of second operand");
		int b=sc.nextInt();
		
		System.out.println("Enter the operation which you want to perform");
		char operator=sc2.nextLine().charAt(0);//take the first index value of string only
		
		int result=0;
		
		switch(operator) {
		
		case '+':
			result=a+b;
			System.out.println("the result of selected operation is "+result);
			break;
			
		case '-':
			result=a-b;
			System.out.println("the result of selected operation is "+result);
			break;
			
		case '*':
			result=a*b;
			System.out.println("the result of selected operation is "+result);
			break;
			
		case '/':
			result=a/b;
			System.out.println("the result of selected operation is "+result);
			break;
			
		default:
			System.out.println("you have entered wrong operation");
		}
		

	}

}
