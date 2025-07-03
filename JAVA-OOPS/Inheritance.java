//single inheritance
// class animal {
//     void printA() {
//         System.out.println("animal is running");
//     }
// }

// class dog extends animal {
//     void printD() {
//         System.out.println("dog is running");
//     }
// }

// public class Inheritance {
//     public static void main(String[] args) {
//         dog d = new dog();
//         d.printA();
//         d.printD();
//     }

// }

//multilevel inheritance

// class animal {
//     void printA() {
//         System.out.println("animal is running");
//     }
// }

// class dog extends animal {
//     void printD() {
//         System.out.println("dog is running");
//     }
// }

// class puppy extends dog {
//     void printP() {
//         System.out.println("puppy is running");
//     }
// }

// public class Inheritance {
//     public static void main(String[] args) {
//         puppy p = new puppy();
//         p.printA();
//         p.printD();
//         p.printP();
//     }

// }

// hierarchical inheritance
class animal {
    void printA() {
        System.out.println("animal is running");
    }
}

class dog extends animal {
    void printD() {
        System.out.println("dog is running");
    }
}

class cat extends animal {
    void printC() {
        System.out.println("cat is running");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        cat c = new cat();
        c.printA();
        c.printC();
        dog d = new dog();
        d.printA();
        d.printD();

    }

}