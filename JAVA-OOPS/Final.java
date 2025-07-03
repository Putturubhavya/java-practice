final class F {
    void print() {// methods and classes also cant override and cant be extended using final
        System.out.println("hii bhavya");
    }

}

public class Final extends F {// final can be used as variable , class, method.final variable cannot be
                              // modified.
    void print() {
        System.out.println("hii");
    }

    public static void main(String[] args) {
        F f = new Final();
        f.print();
    }

}
