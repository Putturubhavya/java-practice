import java.util.*;

public class Students {
    int rollno;
    String name;
    String course;
    double marks;

    void setDetails(int r, String n, String c, double m) {
        rollno = r;
        name = n;
        course = c;
        marks = m;
    }

    void display() {
        System.out.println("Roll no : " + rollno);
        System.out.println("Name : " + name);
        System.out.println("Course : " + course);
        System.out.println("Marks : " + marks);
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of studens :");
        int n = sc.nextInt();
        sc.nextLine();
        Students[] student = new Students[n];
        for (int i = 0; i < n; i++) {
            student[i] = new Students();// create object
            System.out.println("Enter the details of student " + (i + 1));
            System.out.println("Roll no : ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.println("Name : ");
            String name = sc.nextLine();
            System.out.println("Course : ");
            String course = sc.nextLine();
            System.out.println("Marks : ");
            double marks = sc.nextDouble();
            sc.nextLine();
            student[i].setDetails(roll, name, course, marks);
        }
        System.out.println("\n---Student Records---");
        for (int i = 0; i < n; i++) {
            student[i].display();
        }
        sc.close();

    }
}
