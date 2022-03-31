package Case;

import java.util.Scanner;

public class case3_01 {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个整数");
        int x = sc.nextInt();
        if (x % 2 == 0){
            System.out.println("为偶数");
        }else{
            System.out.println("为奇数");
        }
        System.out.println("结束");

    }
}
