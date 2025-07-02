import java.util.Scanner;

public class MinMax {
    static void print(int a, int b) {// parameters //formal parameters
        if (a > b) {
            System.out.println(a + "is max");
        } else {
            System.out.println(b + "is max");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MinMax obj = new MinMax();
        System.out.println("enter two no's:");
        int c = sc.nextInt();
        int d = sc.nextInt();
        print(c, d);// arguments //actual parameters

    }

}
