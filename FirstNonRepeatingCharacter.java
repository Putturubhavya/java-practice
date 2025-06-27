import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        boolean found = false;
        for (char c : s.toCharArray()) {
            int count = 0;
            for (char d : s.toCharArray()) {
                if (c == d) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(c);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("$");
        }

    }
}
