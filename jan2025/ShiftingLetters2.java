import java.util.*;
public class ShiftingLetters2 {
    public static String Solution(String str, int [][]queries) {
        int n = str.length();
        int []prefix = new int[n+1];
        for(var q:queries) {
            int l = q[0];
            int r = q[1];
            int val = q[2];
            if(val == 0) {
                prefix[l]--;
                prefix[r+1]++;
            }else {
                prefix[l]++;
                prefix[r+1]--;
            }
        }
        for (int i = 1; i <= n; i++) {
            prefix[i] += prefix[i-1];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int c = str.charAt(i) - 'a';
            int shift = prefix[i];
            int newChar = (c + shift) % 26;
            sb.append((char)(newChar + 'a'));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            int n = sc.nextInt();
            int [][]queries = new int[n][3];
            for (int i = 0; i < n; i++) {
                queries[i][0] = sc.nextInt();
                queries[i][1] = sc.nextInt();
                queries[i][2] = sc.nextInt();
            }
            System.out.println(Solution(str, queries));
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
}
/**
 * 
 * 
 * Example 1:

Input: s = "abc", shifts = [[0,1,0],[1,2,1],[0,2,1]]
Output: "ace"
Explanation: Firstly, shift the characters from index 0 to index 1 backward. Now s = "zac".
Secondly, shift the characters from index 1 to index 2 forward. Now s = "zbd".
Finally, shift the characters from index 0 to index 2 forward. Now s = "ace".
Example 2:

Input: s = "dztz", shifts = [[0,0,0],[1,1,1]]
Output: "catz"
Explanation: Firstly, shift the characters from index 0 to index 0 backward. Now s = "cztz".
Finally, shift the characters from index 1 to index 1 forward. Now s = "catz".
 


 */