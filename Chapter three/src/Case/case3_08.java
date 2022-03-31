package Case;

public class case3_08 {
    public static void main(String[] args) {
        System.out.println("输入水仙花的总数: ");
        for(int i=100;i<1000;i++){
            int a=i%10;
            int b=i/10%10;
            int c=i/100%10;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }

        }

    }
}