package CASE;

import java.util.Scanner;

public class case2_07 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("请输入第一个和尚的身高:");
        int a=sc.nextInt();
        System.out.println("请输入第二个和尚的身高:");
        int b=sc.nextInt();
        System.out.println("请输入第三个和尚的身高:");
        int c=sc.nextInt();
        int higher = a > b ? a : b;
        int max = (higher > c) ? higher : c;
        System.out.println("最高身高为："+max);
    }
    }
