import java.util.Scanner;

public class MinDeletionToMakeStringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int i = 0, j = n - 1;
        int count = 0;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                count += 1;
            }
            i++;
            j--;
        }
        System.out.println(count);
    }
}
