public class patterns {
    public static void main(String[] args) {
        int num=4;

        pattern9(num);
    }
    static void pattern1(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    static void pattern2(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    static void pattern3(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    static void pattern4(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i;j++){
                System.out.print(j+1+" ");
            }
            System.out.println("");
        }
    }
    static void pattern5(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1+" ");
            }
            System.out.println("");
        }
    }
    static void pattern6(int num){
        for(int i=0;i<2*num;i++){
           if(i<num){
               for(int j=0;j<=i;j++){
                   System.out.print("* ");
               }
           }else{
               for(int j=0;j<2*num-i-1;j++){
                   System.out.print("* ");
               }
           }
            System.out.println("");
        }
    }
    static void pattern7(int num){

        for(int i=0;i<2*num;i++){

            int totalcols=i>num?2*num-i:i;
            int spaces=num-totalcols;
            for(int m=0;m<spaces;m++){
                System.out.print(" ");
            }
            for (int j=0;j<totalcols;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    static void pattern8(int num){
        for(int i=1;i<=num;i++){
            for(int n=0;n<num-i;n++){
                System.out.print(" ");
            }
            for(int m=i;m>=1;m--){
                System.out.print(m);
            }
            for (int col=2;col<=i;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern9(int num){
        int o=num;
        int n=2*num;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                int min=o-Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(min+1+ " ");
            }
            System.out.println();
        }
    }
}
