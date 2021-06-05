import java.util.Scanner;
/*
Java int 是32位的，根据题目输入、输出范围不会溢出，直接起飞就好
 */
public class P1001 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(a + b);
    }
}
