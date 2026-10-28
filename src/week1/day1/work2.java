package week1.day1;

import java.util.Scanner;

public class work2 {
    public static int isPrime(int n) {
        if (n <= 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        for (int i = 3;i * i <= n;i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int flag = isPrime(num);
        if (flag == 1) {
            System.out.println(num + "是素数");
        } else if (flag == 0) {
            System.out.println(num + "不是素数");
        }
    }
}
