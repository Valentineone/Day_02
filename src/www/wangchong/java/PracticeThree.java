package www.wangchong.java;
/*
 3.一个斐波那契数列是由数字1、1、2、3、5、8、13、21、34等等组成的，其中每一个数字(从第三个数字起)都是
         前两个数字的和。创建一个方法，接受一个整数参数，并显示从第一个元素开始总共由该参数指定的个数所构成的
         所有斐波那契数字。例如，如果运行 java Fibonacci 5(Fibonacci为类名)，那么输出应该是1、1、2、3、5。
*/

import java.util.Scanner;

public class PracticeThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i <= n; i++) {
            System.out.println(Fibonacci(i));
        }

    }
    public static int Fibonacci(int n) {
        if(n <= 2) {
            return 1;
        }else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}
