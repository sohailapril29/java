import java.util.Scanner;
public class Conditionals {
        /*
        public static void main(String[] args) {
        System.out.println("Question 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Frist Subject Marks");
        int a = sc.nextInt();
        System.out.println("Enter Second Subject Marks");
        int b = sc.nextInt();
        System.out.println("Enter Third Subject Marks");
        int c = sc.nextInt();
        System.out.println("How many marks each paper is");
        int howManyMarks = sc.nextInt();
        int totalMarks = (a + b + c);
        int addThree = 3 * howManyMarks;
        float finalsMarks = (float) (totalMarks) /(addThree);
        float marks = (int) (finalsMarks * 100);switch ((int) marks){
            case 30:
                System.out.println("You are fail because your percentage is " + marks);
            case 40:
                System.out.println("Your are pass because your percentage is " + marks);
                break;
            default:
                System.out.println("You are below 40% because your percentage is " + marks + "% and your are failed");
        }
    }
    */

/*
            public static void main(String[] args) {
            System.out.println("Question 3");
            Scanner sc = new Scanner(System.in);
            System.out.println("What is Your Salary");
            int salary = sc.nextInt();
            if(salary < 250000) {
                System.out.println("No need to pay Tax");
            } else if (salary < 500000) {
                System.out.println("You have to pay 5%");
            } else if (salary > 500000 && salary < 1000000) {
                System.out.println("You have to pay 20%");
            } else if (salary >= 1000000) {
                System.out.println("You have to pay 20%");
            }
            System.out.println("ThankYou ❤️❤️❤️❤️❤️");
        }
*/
/*
    public static void main(String[] args) {
        System.out.println("Question 4");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Week Number 😍");
        int weekNumber = sc.nextInt();
        switch (weekNumber) {
            case 1:
                System.out.println("Today Is Monday 😍");
                break;
            case 2:
                System.out.println("Today Is Tuesday 😍");
                break;
            case 3:
                System.out.println("Today Is Wednesday 😍");
                break;
            case 4:
                System.out.println("Today Is Thrusday 😍");
                break;
            case 5:
                System.out.println("Today Is Friday 😍");
                break;
            case 6:
                System.out.println("Today Is Saturaday 😍");
                break;
            case 7:
                System.out.println("Today Is Sunday 😍");
                break;
        }
            System.out.println("Have A Nice Day😍");

    }
    */
/*
    public static void main(String[] args) {
        System.out.println("Question 5");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Year");
        int year;
        year = sc.nextInt();
        if(year % 4 ==0 && year % 100 == 0 && year % 400 ==0) {
            System.out.println("It is leep year ");
        } else {
            System.out.println("Its not a leap year");
        }
    }
*/

        public static void main(String[] args) {
            System.out.println("Question 6");
            Scanner sc6 = new Scanner(System.in);
            System.out.println("Enter The Type Of URL");
            String findUrl = sc6.nextLine();
            if (findUrl.endsWith(".com")) {
                System.out.println("Your are using Commerical Website");
            } else if (findUrl.endsWith(".org")) {
                System.out.println("It is a organization website");
            } else if (findUrl.endsWith(".in")) {
                System.out.println("You are using indian website");
            } else {
                System.out.println("You are using different website");
            }
        }

}
