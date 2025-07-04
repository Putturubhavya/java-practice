package pkg2;

import pkg1.AccessModifiers;

public class AccessModifiers1 extends AccessModifiers {
    public static void main(String[] args) {
        AccessModifiers1 b = new AccessModifiers1();
        b.show();               // ✅ inherited method
        System.out.println(b.x); // ✅ inherited variable
    }
}

