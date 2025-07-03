//super() can be used to invoke immediate class method
// class device {
//     void display() {
//         System.out.println("im an electronic device");
//     }
// }

// class tv extends device {
//     void display() {
//         System.out.println("im a tv");
//         super.display();
//     }
// }

// public class Super {
//     public static void main(String[] args) {
//         tv t = new tv();
//         t.display();
//     }
// }

//super() can be used to invoke immediate class variable

// class device {
//     String n = "bhavya";

//     void display() {
//         System.out.println(n);
//     }
// }

// class tv extends device {
//     String n = "bhuman";

//     void display() {
//         System.out.println(super.n);
//         System.out.println(n);
//         super.display();
//     }
// }

// public class Super {
//     public static void main(String[] args) {
//         tv t = new tv();
//         t.display();
//     }
// }
//super() can be used to invoke immediate class constructor
// constructor call must be the first statement in constructor

class device {

    device() {
        System.out.println("im a device");
    }
}

class tv extends device {
    tv() {
        super();
        System.out.println("im a tv");
    }
}

public class Super {
    public static void main(String[] args) {
        tv t = new tv();
    }
}
