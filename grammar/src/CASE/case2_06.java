package CASE;

public class case2_06 {
    public static void main(String[] args){
        int a=150;
        int b=210;
        int c=165;
        int tempheight = (a > b) ? a : b;
        int max = (tempheight > c) ? tempheight : c;
        System.out.println("最高身高为："+max);
    }
}
