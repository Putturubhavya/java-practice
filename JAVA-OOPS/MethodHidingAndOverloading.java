class animal {
    static void run1() {// method hiding
        System.out.println("h--animal is running");
    }

    void run2() {// methos overloading
        System.out.println("o--animal is running");
    }
}

class dog extends animal {
    static void run1() {// method hiding//static polymorphism//compile time//early binding
        System.out.println("h--dog is running");
    }

    void run2() {// methos overloading//dynamic polymorphism//run time//late binding
        System.out.println("o--dog is running");
    }
}

public class MethodHidingAndOverloading {
    public static void main(String[] args) {
        animal a = new dog();// runtime object // a:reference variable
        a.run1();
        a.run2();

    }
}
