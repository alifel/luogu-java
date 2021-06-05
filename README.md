#洛谷题库解析JAVA版
大约20年前，我是一个菜鸟oier，现在还是时常手痒痒，所以还是来刷刷题。相关算法都用JAVA实现，每题一个文件，文件名为洛谷对应的题号，后面跟*Plus*代表娱乐算法，后面跟*Top*代表最优算法。
> 注意：洛谷提交时，对应算法实现需要把类名修改为 **Main** 

例如：
```
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
```
需要修改为：
```
import java.util.Scanner;
/*
Java int 是32位的，根据题目输入、输出范围不会溢出，直接起飞就好
*/
public class Main {
public static void main(String args[]){
Scanner s = new Scanner(System.in);
int a = s.nextInt();
int b = s.nextInt();
System.out.println(a + b);
}
}
```