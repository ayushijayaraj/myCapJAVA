import java.util.Scanner;
public class PrimeNumber {
	public static void main(String args[])
    {
        int num, i, count=0;
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
        num = sc.nextInt();
        boolean isPrime = true;
		
        for(i=2; i<num; i++)
        {
            if(num%i == 0)
            {
                isPrime = false;;
                break;
            }
        }
        if(isPrime)
        {
            System.out.print(num + " is a Prime Number");
        }
        else
        {
            System.out.print(num + " not a Prime Number");
        }
    }

}
