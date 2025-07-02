
// public class CallbyValAndRef {
//     int a;
//     int b;

//     static void add( s, int t) {
//         s = 10;
//         System.out.println("Result:" + (s + t));
//     }

//     public static void main(String[] args) {
//         CallbyValAndRef obj = new CallbyValAndRef();
//         obj.a = 2;
//         obj.b = 3;
//         System.out.println("Before:" + (obj.a + obj.b));
//         add(obj.a, obj.b);
//         System.out.println("After:" + (obj.a + obj.b));
//     }
// }

public class CallbyValAndRef {
    int a;
    int b;

    static void add(CallbyValAndRef op, CallbyValAndRef op1) {
        op.a = 10;
        System.out.println("Result:" + (op.a + op.b));
    }

    public static void main(String[] args) {
        CallbyValAndRef op = new CallbyValAndRef();
        CallbyValAndRef op1 = new CallbyValAndRef();
        op.a = 2;
        op.b = 3;
        System.out.println("Before:" + (op.a + op.b));
        add(op, op);
        System.out.println("After:" + (op.a + op.b));
    }
}
