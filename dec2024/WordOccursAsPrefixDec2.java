import java.util.*;
public class WordOccursAsPrefixDec2 {

    public static void Solution(String []arr,String prefix) {
        for (var str : arr) {
            if(str.startsWith(prefix)) {
                System.out.println("Word %s starts with prefix %s".formatted(str, prefix));
                return;
            }
        }
        System.out.println("Word starting with prefix %s doesn't exist!".formatted(prefix));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        String prefix = sc.nextLine();
        String []arr = words.split(" ");
        Solution(arr, prefix);
        sc.close();
    }
}