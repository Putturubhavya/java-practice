
import java.util.Scanner;

public class EqualPointinaStringBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int open = 0;
        int close = 0;
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (s.charAt(j) == '(') {
                    open++;
                }
                // System.out.println("open:" + open);
            }
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(j) == ')') {
                    close++;
                }
                // System.out.println("close:" + close);
            }
            System.out.println(open + " " + close + " " + i);
            if (open == close) {
                System.out.println(i + 1);
                found = true;
                break;
            }
            open = 0;
            close = 0;

        }
        if (!found) {
            System.out.println("-1");
        }
    }
}
