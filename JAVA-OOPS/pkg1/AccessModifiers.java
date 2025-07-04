//public access modifier: accessible from anywhere
// public class AccessModifiers {
//     public int x = 10;

//     public void show() {
//         System.out.println("tha value is " + x);
//     }

//     public static void main(String[] args) {

//     }

// }

// class A {
//     public static void main(String[] args) {
//         AccessModifiers a = new AccessModifiers();
//         a.show();
//         System.out.println(a.x);
//     }
// }

//private:accessible witthin the same class, not accessible from outside or subclass

// public class AccessModifiers {
//     private int x = 10;

//     private void show() {
//         System.out.println("tha value is " + x);
//     }

//     public static void main(String[] args) {
//         AccessModifiers a = new AccessModifiers();
//         a.show();
//         System.out.println(a.x);
//     }

// }
//default:accessible within the same package
// class AccessModifiers {
//     int x = 10;

//     void show() {
//         System.out.println("tha value is " + x);
//     }

// }

// class A {
//     public static void main(String[] args) {
//         AccessModifiers a = new AccessModifiers();
//         a.show();
//         System.out.println(a.x);
//     }
// }
//protected:same package
// class AccessModifiers {
//     protected int x = 10;

//     protected void show() {
//         System.out.println("tha value is " + x);
//     }

// }

// class A {
//     public static void main(String[] args) {
//         AccessModifiers a = new AccessModifiers();
//         a.show();
//         System.out.println(a.x);
//     }
// }
//protected:different package but only through subclass
package pkg1;

public class AccessModifiers {
    protected int x = 100;

    
    protected void show() {
        System.out.println("Protected method from A");
    }
}

