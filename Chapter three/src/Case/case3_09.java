package Case;

import java.util.Scanner;

public class case3_09 {
    public static void main(String[] args) {
        System.out.println("请输入要查看第n个数中的n值");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=1,c=1,d=0;
        for(int e=3;e<=a;e++){
            d=c;
            c=b+c;
            b=d;
        }
        System.out.println(c);
    }
}