package InputTest;
import java.util.*;
public class InputTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = sc.nextLine();
        System.out.println("How old are you? ");
        int age = sc.nextInt();
        System.out.println("Hello," + name + ". Next year, you'll be " + (age + 1));
    }
}
