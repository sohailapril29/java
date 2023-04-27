import java.util.Scanner;
public class Greetuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Hello " + name + "Have A Good Day");
    }
}
