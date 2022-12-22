import java.io.*;
import java.util.StringTokenizer;

public class Test605 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int T = Integer.parseInt(br.readLine());
        System.out.println(canPlaceFlowers(arr, T));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n){
        if(flowerbed.length == 0 || n <= 0){
            return true;
        }
        int len = flowerbed.length;
        for (int i = 0; i < len; i++) {
            int p;
            int q;
            if (i == 0) {
                p = 0;
            } else {
                p = flowerbed[i - 1];
            }
            if(i == len - 1){
                q = 0;
            } else {
                q = flowerbed[i + 1];
            }
            if (p == 0 && q == 0) {
                flowerbed[i] = 1;
                n--;
            }
            if (n <= 0) {
                return true;
            }
        }
        return false;
    }
}
