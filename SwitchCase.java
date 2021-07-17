import java.util.Scanner;
public class SwitchCase {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter two numbers!!");
		System.out.println("Please enter the first number: ");
		int x = scanner.nextInt();
		System.out.println("Please enter the second number: ");
		int y = scanner.nextInt();
		
		System.out.println("----Choose one operation to be performed -----");
		System.out.println("1. ADDITION");
		System.out.println("2. SUBTRACTION");
		System.out.println("3. MULTIPLICATION");
		System.out.println("4. DIVISION");
		
		System.out.println("Please enter your choice: ");
		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1:
			int sum = x+y;
			System.out.println(sum);
			break;
		case 2:
			int sub = x-y;
			System.out.println(sub);
			break;
		case 3:
			int mul = x*y;
			System.out.println(mul);
			break;
		case 4:
			int div = x/y;
			System.out.println(div);
			break;
		default:
			System.out.println("Please enter the valid choice!!");
			break;
		}
	}

}
