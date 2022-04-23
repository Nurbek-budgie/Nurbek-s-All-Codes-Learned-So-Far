import java.util.Scanner;

public class SimpleMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is 2 + 2");
        System.out.print("a: ");
        int a = input.nextInt();
        System.out.print("b: ");
        int b = input.nextInt();
        int sum = a + b;

        if (sum == 4) {
            System.out.println("YAY YOU GOT IT RIGHT!");
        } else {
            System.out.println("SORRY TRY AGAIN");
        }
    }
}
