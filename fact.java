import java.util.ArrayList;

public class fact {
    public static void main(String[] args) {
        int num=20;
        fact(num);
    }
    static void fact(int num){
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i==0){
                if(num/i==i){
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " ");
                    l.add(num/i);
                }
            }
        }
        for (int i=l.size()-1;i>=0;i--){
            System.out.print(l.get(i) + " ");
        }
    }
}
