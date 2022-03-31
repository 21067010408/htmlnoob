package Case;

import java.util.Scanner;

public class case3_03 {
    public static void main(String[] args) {
        System.out.println("开始");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月份");
        int number = sc.nextInt();
        switch (number) {
            case 3:
            case 4:
            case 5:
                System.out.println("春");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬");
                break;
            default:
                System.out.println("结束");
        }

    }
}


