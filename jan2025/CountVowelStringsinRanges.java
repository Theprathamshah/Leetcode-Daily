import java.util.*;
public class CountVowelStringsinRanges {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            List<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String input = sc.nextLine();
                list.add(input);
            }
            list.forEach(ele->{
                System.out.println(ele);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}