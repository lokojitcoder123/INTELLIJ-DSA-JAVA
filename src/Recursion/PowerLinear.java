package Recursion;

import java.util.Scanner;

public class PowerLinear {
    public static int power(int a, int b) { //TC = 0(b)
        if (b == 0) return 1;
        return a * power(a, b - 1);
    }

    public static int power2(int a, int b) { //TC = O(logb)
        if (b == 0) return 1;
        int ans = power2(a, b / 2);
        if (b%2==0) return ans * ans;
        else return ans * ans * a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int a = sc.nextInt();
        System.out.println("Enter n: ");
        int b = sc.nextInt();
        System.out.println(a + "raised to the power" + b +" is : " +power2(a,b));
    }
}
