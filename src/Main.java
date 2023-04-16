//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("1.B");
        System.out.println("2.B");
        System.out.println("3.D");
        System.out.println("4.B");
        System.out.println("5.D");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        text(n);
        String s = scanner.nextLine();
        reverseString(s);
        int num = scanner.nextInt();
        isPalindrome(num);
        ShuiXianHua();
    }

    public static void text(int n) {
        for(int i = 0; i < n; ++i) {
            int k;
            for(k = n - i - 1; k >= 0; --k) {
                System.out.print(" ");
            }

            for(k = 1; k <= 1 + 2 * i; ++k) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void reverseString(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        char[] charArray = new char[len];

        for(int i = 0; i < len; ++i) {
            charArray[i] = chars[len - i - 1];
        }

        s = String.valueOf(charArray);
        System.out.println(s);
    }

    public static void isPalindrome(int num) {
        int num1 = 0;

        int temp;
        int num2;
        for(num2 = num; num != 0; num1 = num1 * 10 + temp) {
            temp = num % 10;
            num /= 10;
        }

        if (num1 == num2) {
            System.out.println("是的");
        } else {
            System.out.println("不是");
        }

    }

    public static void ShuiXianHua() {
        for(int i = 100; i <= 999; ++i) {
            int x = i % 10;
            int y = i / 10 % 10;
            int z = i / 100;
            if (i == z * z * z + y * y * y) {
                System.out.println(i);
            }
        }

    }
}
