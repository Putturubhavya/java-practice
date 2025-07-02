
public class Constructor {
    int a;
    String b;

    Constructor() {// default // no argument constructor

    }

    Constructor(int c, String d) {// parameterized constructor//argument
        a = c;
        b = d;

    }

    public static void main(String[] args) {
        Constructor c = new Constructor(50, "bhavya");
        System.out.println(c.a + c.b);

    }
}
