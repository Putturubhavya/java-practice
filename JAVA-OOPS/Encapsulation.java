public class Encapsulation {
    private String name;
    private int age;

    public String getName() {
        return name;

    }

    public void setName(String n) {
        this.name = n;

    }

    public int getAge() {
        return age;

    }

    public void setAge(int n) {
        this.age = n;

    }

    public static void main(String[] args) {

    }
}

class z {
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setName("Bhavya");
        e.setAge(19);
        System.out.println(e.getName());
        System.out.println(e.getAge());
    }
}
