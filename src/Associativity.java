public class Associativity {
    public static void main(String[] args) {
        // for x-y/2
        int x = 12;
        int y = 6;
        int c = (x-y)/2;
        System.out.println("for x-y/2 is " + c);
        // for b*b -4ae/2a
        int a = 5;
        int b = 1;
        int e = 4;
        int s = b*b - (4*a*e)/(2*a);
        System.out.println("b*b -4ae/2a is " + s);
        // for v*v -u*u
        int u = 5;
        int v = 4;
        int w = v*v- u*u;
        System.out.println("for v*v -u*u is " + w);
        // for z * f -g
        int z  = 2;
        int f = 5;
        int g = 4;
        int h = z*f -g;
        System.out.println("for z * f -g is" + h);
    }
}
