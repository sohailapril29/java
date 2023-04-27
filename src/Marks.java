import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter Your English Marks");
        float a = scan1.nextFloat();
        System.out.println("Enter Your maths Marks");
        float b = scan1.nextFloat();
        System.out.println("Enter Your science Marks");
        float c = scan1.nextFloat();
        System.out.println("Enter Your social Marks");
        float d = scan1.nextFloat();
        System.out.println("Enter Your hindi Marks");
        float e = scan1.nextFloat();
        System.out.println("Enter The Total Marks");
        float divide_by = scan1.nextFloat();
        float total = a + b + c + d + e;
        float divide_by2 = divide_by * 5;
        float final_total = total/divide_by2;
        float percent = final_total * 100;
        System.out.println("Your Marks Percentage is " + percent);
    }
}
