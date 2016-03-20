import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("Enter N = ");
        int N = Integer.parseInt(console.nextLine()); // input number N
        int sum = 0;

        for( int i = 1 ; i <= N ; i++ ){ // sum 1 to N

            sum += i; // sum = sum + i
        }

        System.out.println("sum from 1 to N is: " + sum);
    }
}

