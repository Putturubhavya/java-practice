interface printable {
    int a = 20;

    void print();// abstract method

}

interface showable {
    void show();// abstract method

}

public class Interface implements printable, showable {
    public void print() {
        System.out.println("print");
    }

    public void show() {
        System.out.println("show");
    }

    public static void main(String[] args) {
        Interface t = new Interface();
        t.print();
        t.show();
        // t.a = 99;
        System.out.println(t.a);
    }
}
