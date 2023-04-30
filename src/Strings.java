import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        int a = 6;
        float b = 5.6454f;
        char c =  'Q';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name");
        String name = sc.nextLine();
        System.out.printf("The value of integer is %d and value of " +
                "float is %f The value of char is %c and The value of String is %s"
                , a,b,c,name);
    }
}

