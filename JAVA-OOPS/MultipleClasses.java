class outer {
    void print() {
        System.out.println("im outer");
    }
}

public class MultipleClasses {
    void print1() {
        System.out.println("im not nested");
    }

    public static void main(String[] args) {
        MultipleClasses m = new MultipleClasses();// we should create object for each class in multiple classes
        outer n = new outer();
        m.print1();
        n.print();
    }
}
