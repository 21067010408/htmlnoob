package Case;

import java.util.Scanner;

public class case3_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i,n,j;
        for (i=1;i<=a;i++) {
            for (n=1;n<=a-i;n++) {
                System.out.print(" ");
            }
            for (j=1;j<=2*i-1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


