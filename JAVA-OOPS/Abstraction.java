abstract class parts {
    String n;

    parts(String n) {
        this.n = n;
    }

    abstract void function();

    void f() {
        System.out.println(n);
    }

}

class brakes extends parts {
    brakes(String n) {
        super(n);

    }

    void function() {
        System.out.println("car will be halted ");
    }
}

class accelerator extends parts {
    accelerator(String n) {
        super(n);

    }

    void function() {
        System.out.println("car will be accelerated ");
    }
}

class gear extends parts {
    int ge;

    gear(String n, int ge) {
        super(n);
        this.ge = ge;

    }

    void function() {
        System.out.println("car will be stopped " + ge);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        brakes b = new brakes("brakes");
        b.function();
        b.f();
        accelerator a = new accelerator("accelerator");
        a.function();
        a.f();
        gear g = new gear("gear", 7);
        g.function();
        g.f();

    }
}
