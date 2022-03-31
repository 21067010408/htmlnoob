package Case;

public class case3_11 {
    public static void main(String[] args) {
        int a=0;
        loop:for (int b=1;b<=8;b++) {
            for (int c = 1; c <= 8; c++) {
                a++;
                if (b == 2 && c == 5) {
                    break loop;
                }
                System.out.println(b + "排" + c + "列" + a);
            }
        }
    }

}
