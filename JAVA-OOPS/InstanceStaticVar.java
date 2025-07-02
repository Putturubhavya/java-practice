
public class InstanceStaticVar {
    int a = 10;// instance//need for object creation//not be intialized
    static int b = 20;// static//class variable//no need for object creation//not be initialized

    public void print() {
        System.out.println(a);// in non static method we wont call with object
    }

    public static void main(String[] args) {
        InstanceStaticVar obj = new InstanceStaticVar();
        InstanceStaticVar obj1 = new InstanceStaticVar();
        System.out.println(obj.a);// using objects name
        System.out.println(obj1.a);
        System.out.println(b);// directly
        System.out.println(obj.b);// using reference var
        obj.print();
        obj1.print();
        obj.a = 100;
        obj1.a = 100;
        obj.b = 200;
        System.out.println(obj.a);
        System.out.println(obj1.a);
        System.out.println(obj.b);
        System.out.println(InstanceStaticVar.b);// usin class name
    }

}
