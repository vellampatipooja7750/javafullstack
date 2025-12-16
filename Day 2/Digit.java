import java.util.Scanner;
public class Digit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        int sum = 0;

        while(n !=0) {
            n = n / 10;
            sum++;
        }
        System.out.println("Sum of digits n" + sum);
    }
}
