import java.util.Scanner;

public class P1003 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int total = s.nextInt();
        int[][] d = new int[total][4];
        for(int i = 0 ; i < total ; i ++){
            d[i][0] = s.nextInt();
            d[i][1] = s.nextInt();
            d[i][2] = s.nextInt();
            d[i][3] = s.nextInt();
        }
        int dx = s.nextInt();
        int dy = s.nextInt();
        for(int i = d.length - 1 ; i >=0 ; i --){
            if(dx <= d[i][0] + d[i][2] && dx >= d[i][0] && dy <= d[i][1] + d[i][3] && dy >= d[i][1]){
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(-1);
    }
}
