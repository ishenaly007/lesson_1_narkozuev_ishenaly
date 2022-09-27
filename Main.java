import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String iAmStrong;
        final int NUM = 15;
        String word = "i'm a best";
        iAmStrong = word + NUM;
        if (NUM < 0) {
            System.out.println("You saved a negative number!");
        } else if (NUM > 0) {
            System.out.println("You saved a positive number!");
        } else {
            System.out.println("You saved zero!");
        }
        System.out.println(iAmStrong);
        System.out.println(iAmStrong + NUM + word);
        Scanner klass=new Scanner(System.in);
        String name,answer;
        System.out.println("Enter your name: ");
        name = klass.next();
        System.out.println("Hello " + name + "!");
    }
}