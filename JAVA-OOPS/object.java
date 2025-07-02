
public class object {
    static int wheels = 2;
    String color = " ";

    static void braking() {
        System.out.println("The bike halts");
    }// static method

    void mileage(int s) {
        System.out.println("The mileage is" + s + "kmph");
    }// non static method//instance method

    public static void main(String args[]) {

        object duke = new object();
        object mt = new object();
        object r15 = new object();
        System.out.println("No.of wheels" + duke.wheels);
        System.out.println("No.of wheels" + mt.wheels);
        System.out.println("No.of wheels" + r15.wheels);
        duke.color = "orange";
        mt.color = "black";
        r15.color = "ash";
        System.out.println(duke.color);
        System.out.println(mt.color);
        System.out.println(r15.color);
        duke.braking();
        mt.braking();
        r15.braking();
        duke.mileage(40);
        mt.mileage(30);
        r15.mileage(45);
    }
}
