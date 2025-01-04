import java.util.Scanner;
public class UniqueLength3PalindromicSubsequences {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            int []first = new int[26];
            int []last = new int[26];
            int res = 0;
            for (int i = 0; i < 26; i++) {
                first[i] = -1;
                last[i] = -1;
            }
            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i) - 'a';
                if (first[c] == -1) {
                    first[c] = i;
                }
                last[c] = i;
            }
            for(int i =0;i<26;i++) {
                if(first[i]!=-1 && first[i]!= last[i]) {
                    res += str.substring(first[i]+1, last[i]).chars().distinct().count();
                }
            }
            System.out.println(res);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}