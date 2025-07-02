
public class MethodOverloading {
    static int add(int a, int b) {
        return a + b;
    }

    static float add(int a, float b) {
        return a + b;
    }

    static double add(double a, int b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(add(2, 3.5f));
        System.out.println(add(2.5, 3, 4.5));
    }

}
