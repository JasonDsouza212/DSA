import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        permi("","abc");
        System.out.println(permiarr("","abc"));
        System.out.println(permut("","abc"));
    }
    static void permi(String a,String b){
        if(b.isEmpty()){
            System.out.println(a);
            return;
        }
        char ch=b.charAt(0);
        for(int i=0;i<=a.length();i++){
            String f=a.substring(0,i);
            String s=a.substring(i,a.length());
            permi(f+ch+s,b.substring(1));
        }
    }
    static ArrayList<String> permiarr(String a, String b){
        if(b.isEmpty()){
            ArrayList<String> s=new ArrayList<>();
            s.add(a);
            return s;
        }
        char ch=b.charAt(0);
        ArrayList <String> ans=new ArrayList<>();
        for(int i=0;i<=a.length();i++){
            String f=a.substring(0,i);
            String s=a.substring(i,a.length());
            ans.addAll(permiarr(f+ch+s,b.substring(1)));
        }
        return ans;
    }
    static int permut(String a,String b){
        if(b.isEmpty()){
            return 1;
        }
        char ch=b.charAt(0);
        int count=0;
        for(int i=0;i<=a.length();i++){
            String l=a.substring(0,i);
            String r=a.substring(i,a.length());
            count=count+permut(l+ch+r,b.substring(1));
        }
        return count;
    }
}
