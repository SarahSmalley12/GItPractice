import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scn.next();
        System.out.printf("Hello %s", name);
    }
}
