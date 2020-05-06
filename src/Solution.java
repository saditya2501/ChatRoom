import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Character[] S= {'h', 'e', 'l', 'l', 'o'};
        int index = 0;
        char req = S[index];
        for (char c : str.toCharArray())
        {
            if (c == req && index == 4)
            {
                System.out.println("YES");
                return;
            }
            else if (c == req)
            {
                index++;
                req = S[index];
            }
        }
        System.out.println("NO");
    }
}