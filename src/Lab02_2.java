import java.util.Scanner;

public class Lab02_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input your number: ");
        double number = sc.nextDouble();

        if((number % 2) == 0) {
            System.out.println("The number is an even number");
        } else {
            System.out.println("The number is an odd number");
        }
    }
}
