package week1.day1;

import java.util.Random;
import java.util.Scanner;

public class work3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int target = rand.nextInt(100) + 1;
        int count = 0;
        int guess;

        System.out.println("===== 猜数字游戏 =====");
        System.out.println("规则：系统随机生成 1~100 的整数，你来猜！");

        while (true) {
            guess = sc.nextInt();
            if (guess < target) {
                System.out.println("小了");
                count++;
            } else if (guess > target) {
                System.out.println("大了");
                count++;
            } else {
                System.out.println("猜到了");
                break;
            }
        }
        System.out.println("共用" + count + "次猜对");
    }
}
