import java.util.Scanner;

public class P1002 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int mx = s.nextInt();
        int my = s.nextInt();
        long[][] f = new long[x + 1][y + 1];
        for(int i = 0 ; i <= x; i ++){
            for(int j = 0 ; j <= y ; j ++){
                f[i][j] = -1;
            }
        }
        f[0][1] = 1;
        f[1][0] = 1;
        f[mx][my] = 0;
        if(check(mx - 2, my + 1, x, y))
            f[mx - 2][my + 1] = 0;
        if(check(mx - 1, my + 2, x, y))
            f[mx - 1][my + 2] = 0;
        if(check(mx + 1, my + 2, x, y))
            f[mx + 1][my + 2] = 0;
        if(check(mx + 2, my + 1, x, y))
            f[mx + 2][my + 1] = 0;
        if(check(mx + 2, my - 1, x, y))
            f[mx + 2][my - 1] = 0;
        if(check(mx + 1, my - 2, x, y))
            f[mx + 1][my - 2] = 0;
        if(check(mx - 1, my - 2, x, y))
            f[mx - 1][my - 2] = 0;
        if(check(mx - 2, my - 1, x, y))
            f[mx - 2][my - 1] = 0;
        for(int i = 0 ; i <= x ; i ++){
            for(int j = 0 ; j <= y ; j ++){
                if(f[i][j] == -1)
                    f[i][j] = (j > 0 ? f[i][j - 1] : 0) + (i > 0 ? f[i - 1][j] : 0);
            }
        }
        System.out.println(f[x][y]);
    }
    private static boolean check(int x, int y, int maxX, int maxY){
        if(x >= 0 && x <= maxX && y >= 0 && y <= maxY)
            return true;
        return false;
    }
}
