import java.util.*;
public class MaxScoreAfterSplittingString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            int ones = (int) str.chars().filter(character -> character == '1').count();
            int zeros = 0;
            int i = 0;
            int max = 0;
            while(i<str.length()-1){
                if(str.charAt(i) == '0'){
                    zeros++;
                }else {
                    ones--;
                }
                max = Math.max(max, zeros+ones);
                i++;
            }
            // System.out.println("Max score we can get from string is %d".formatted(max));
            System.out.println(max);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            // TODO: handle exception
        }        
    }
}