import java.util.Scanner;

public class PrintCharacterTriangle {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
            int number = Integer.parseInt(console.nextLine()); // input number


        for( int i = 1 ; i < number ; i++ ){ // print first part of the triangle + middle part
            for (int j = 0; j < i; j++) {
                System.out.print( (char) (j+97) + " "); // using character number from ASCII table
            }
            System.out.println();
        }

        for (int i = number; i >0 ; i--) { // print second part of the triangle
            for (int j = 0; j < i; j++) {
                System.out.print( (char) (j+97) + " ");
            }
            System.out.println();
        }
    }
}
