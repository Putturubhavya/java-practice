import java.util.Scanner;

public class MinDistanceBetweenWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        String word1 = sc.next();
        String word2 = sc.next();
        int index1 = -1;
        int index2 = -1;
        int mindist = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                index1 = i;
            } else if (words[i].equals(word2)) {
                index2 = i;
            }
            if (index1 != -1 && index2 != -1) {
                mindist = Math.min(mindist, Math.abs(index1 - index2));
            }
        }
        System.out.println(mindist);
    }

}
