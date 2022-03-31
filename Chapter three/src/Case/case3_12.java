package Case;

public class case3_12 {
    public static void main(String[] args) {
        System.out.println("票座信息");

        for(int i=1;i<=4;i++){
            for (int j=1;j<=10;j++){
                if(j==1 || j==10){
                    System.out.print(" !");
                    continue;
                }
                else{
                    System.out.print(" A");
                }
            }
            System.out.println();

        }
    }
}
