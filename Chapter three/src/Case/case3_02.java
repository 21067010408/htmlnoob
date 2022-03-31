package Case;

import java.util.Scanner;

public class case3_02 {
    public static void main(String[] args) {
        System.out.println("请输入小明的考试成绩：");
        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();
        if(score>=95){
            System.out.println("100元");
        }
        else if(score>=90){
            System.out.println("周末游");
        }
        else if(score>=80){
            System.out.println("衣服");
        }
        else if(score<80){
            System.out.println("无奖励");
        }
        System.out.println("结束");
    }
}
