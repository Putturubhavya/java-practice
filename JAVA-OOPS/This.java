// this keyword refers to the instance variable only

// public class This {
// String n;

// This(String n) {
// this.n = n;

// }

// void display() {
// System.out.println("this is about this keyword, " + n);
// }

// public static void main(String[] args) {
// This n = new This("bhavya");
// n.display();

// }
// }

// this can be used to invoke current class method(implicitly)
// public class This {

// void display() {
// this.display1();
// System.out.println("hii");

// }

// void display1() {
// System.out.println("this is about this keyword");
// }

// public static void main(String[] args) {
// This n = new This();
// n.display();

// }
// }

// this can be used to invoke current class constructor

// public class This {

// This() {
// System.out.println("hii");
// }

// This(int x) {
// this();
// System.out.println(x);

// }

// public static void main(String[] args) {
// This n = new This(10);

// }
// }
// this can be passed as an argument in the method call

// public class This {

// void s(This obj) {
// System.out.println("invoked");

// }

// void m() {
// s(this);
// }

// public static void main(String[] args) {
// This obj = new This();
// obj.m();

// }

// }

// this can be used as an argument in the constructor call
// class c {
// This ob;

// c(This ob) {
// this.ob = ob;

// }

// void display() {
// System.out.println(ob.data);
// }
// }

// public class This {

// int data = 100;

// This() {
// c ch = new c(this);
// ch.display();

// }

// public static void main(String[] args) {
// This ob = new This();
// }
// }

//this can be used to return the current class instance from the method
class B {
    B getB() {
        return this;
    }

    void display() {
        System.out.println("ello");
    }
}

public class This {
    public static void main(String[] args) {
        new B().getB().display();
    }
}