import java.util.*;
public class FirstCompletelyPaintedRoworColumn {
    static class Pair{
        int first;
        int second;
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public static int findFirstCompletelyPaintedRoworColumn(int n, int m, int []arr, int [][]matrix){
        Map<Integer, Pair> map = new HashMap<>();
        Map<Integer,Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int value = matrix[i][j];
                map.put(value, new Pair(i, j));
                freq.put(i+1, freq.getOrDefault(i+1, 0)+1);
                freq.put(-j-1, freq.getOrDefault(-j-1, 0)+1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            Pair p = map.get(arr[i]);
            int first = p.first;
            int second = p.second;
            freq.put(first+1, freq.get(first+1)-1);
            freq.put(-second-1, freq.get(-second-1)-1);
            if(freq.get(first+1) == 0 || freq.get(-second-1) == 0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int []arr = new int[n*m];
            for (int i = 0; i < n*m; i++) {
                arr[i] = sc.nextInt();
            }
            int [][]matrix = new int[n][m];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            int result = findFirstCompletelyPaintedRoworColumn(n, m, arr, matrix);
            System.out.println(result);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}