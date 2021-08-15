import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        prime(num);


    }
    static  void prime(int num){
        if(num<=1){
            System.out.println("Number is neither prime nor composite");
            return;
        }
        int c=2;

        if(num==4){
            System.out.println("Its not a prime number");
            return;
        }else{
            while (c*c<num){
                if(num%c==0){
                    System.out.println("not a prime number");
                    return;
                }
                c++;
            }
        }
        System.out.println("prime number");

    }
}

