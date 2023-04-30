public class Lowercase {
    public static void main(String[] args) {

        // to lower case
        String name = "Mohammed Sohail";
        System.out.println(name.toLowerCase());

        // to add underscore between spaces
        String name2 = "Mohammed Sohail";
        System.out.println(name.replace(" ", "_"));

        // add name in between message
        String name3 = "Sohail";
        String letter = "Dear " + name3 + " Thanks a Lot";
        System.out.println(letter);

        // to find spaces double or triple
        // for double
        String name4 = "  Mohammed Sohail";
        System.out.println(name4.startsWith("  "));
        // for triple
        String name5 = "  Mohammed Sohail";
        System.out.println(name5.startsWith("  "));

        String name6 = "Escape Me \n\t\'\\Mohammed Sohail\'";
        System.out.println(name6);



    }
}
