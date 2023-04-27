import java.util.Scanner;
public class Kilometer2Meter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter To Convert Km To M");
        long l1 = sc.nextLong();
        long convert = l1 * 1000;
        System.out.println("It's " + convert + " Meters");
    }
}
