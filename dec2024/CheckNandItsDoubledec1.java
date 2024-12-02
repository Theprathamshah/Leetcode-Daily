import java.util.*;
public class CheckNandItsDoubledec1{
    public static boolean checkNAndItsDoubleSolver(int []arr) {
        Set<Integer>set = new HashSet<>();
        for(var ele: arr) {
            if(ele%2==0) {
                if(set.contains(ele*2) || set.contains(ele/2)) {
                    return true;
                }
            }
            set.add(ele);
        }
        return false;
    }
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int []arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            if(checkNAndItsDoubleSolver(arr)) {
                System.out.println("Number and it's double exist");
            }else {
                System.out.println("Number and it's double doesn't exist");
            }
        }
    }
}