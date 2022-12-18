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
        boolean answer = true;
        if (flowerbed[0] == 0 && flowerbed[1] == 1) {

        }
        for (int i = 1; i < flowerbed.length - 1; i++) {
            if(flowerbed[i] == flowerbed[i - 1] && flowerbed[i] == flowerbed[i + 1]){
                if (flowerbed[i] == 0){
                    n--;
                    flowerbed[i] = 1;
                }
            }
        }
        if (n != 0) {
            answer = false;
        }
        return answer;
    }
}
